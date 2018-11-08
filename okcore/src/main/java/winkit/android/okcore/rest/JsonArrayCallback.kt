package winkit.android.okcore.rest

import okhttp3.Call
import okhttp3.Callback
import okhttp3.Response
import org.json.JSONArray
import org.json.JSONException
import winkit.android.okcore.ParsedCallback
import java.io.IOException

abstract class JsonArrayCallback: Callback {

    final override fun onResponse(call: Call?, response: Response?) {
        try {
            val jsonString = response?.body()?.string()
            if (jsonString != null) onResponse(JSONArray(jsonString))
            else onResponse(null)
        } catch (ex: JSONException) {
            onFailure(ex)
        }
    }

    final override fun onFailure(call: Call?, e: IOException?) {
        onFailure(e)
    }

    abstract fun onResponse(json: JSONArray?)

    abstract fun onFailure(e: Exception?)

    abstract class DefaultFailure(private val callback: ParsedCallback<*>) : JsonArrayCallback () {
        override fun onFailure(e: Exception?) {
            callback.failure(e)
        }
    }
}