package winkit.android.okcore.rest

import okhttp3.Call
import okhttp3.Callback
import okhttp3.Response
import org.json.JSONArray
import org.json.JSONException
import winkit.android.okcore.ParsedCallback
import java.io.IOException

abstract class JsonArrayCallback: Callback {

    companion object {
        fun parseSync (response: Response?): JSONArray? {
            val jsonString = response?.body()?.string()
            return if(jsonString != null) JSONArray(jsonString) else null
        }
    }

    final override fun onResponse(call: Call?, response: Response?) {
        try {
            onResponse(parseSync(response))
        } catch (ex: JSONException) {
            onFailure(ex)
        }
    }

    final override fun onFailure(call: Call?, e: IOException?) {
        onFailure(e)
    }

    abstract fun onResponse(json: JSONArray?)

    abstract fun onFailure(e: Exception?)

    abstract class Secure<T> (private val callback: ParsedCallback<T>) : JsonArrayCallback () {

        final override fun onResponse(json: JSONArray?) {
            if(json == null) callback.response(null)
            else callback.response(onSecureResponse(json))
        }

        abstract fun onSecureResponse(json: JSONArray): T?

        override fun onFailure(e: Exception?) {
            callback.failure(e)
        }
    }
}