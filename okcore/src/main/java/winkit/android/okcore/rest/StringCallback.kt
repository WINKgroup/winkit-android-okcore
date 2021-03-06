package winkit.android.okcore.rest

import okhttp3.Call
import okhttp3.Callback
import okhttp3.Response
import winkit.android.okcore.ParsedCallback
import java.io.IOException


abstract class StringCallback: Callback {

    companion object {
        fun parseSync (response: Response?): String? {
            return response?.body()?.string()
        }
    }

    final override fun onResponse(call: Call?, response: Response?) {
        onResponse(StringCallback.parseSync(response))
    }

    final override fun onFailure(call: Call?, e: IOException?) {
        onFailure(e)
    }

    abstract fun onResponse(response: String?)

    abstract fun onFailure(e: Exception?)

    abstract class Secure<T> (private val callback: ParsedCallback<T>): StringCallback () {

        override fun onResponse(response: String?) {
            if(response == null) callback.response(null)
            else callback.response(onSecureResponse(response))
        }

        abstract fun onSecureResponse(response: String): T?

        override fun onFailure(e: Exception?) {
            callback.failure(e)
        }
    }
}