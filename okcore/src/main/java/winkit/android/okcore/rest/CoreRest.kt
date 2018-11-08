package winkit.android.okcore.rest

import okhttp3.Callback
import okhttp3.Request

abstract class CoreRest (private val baseUrl: String) {

    protected fun request (url: String, callback: Callback) : CoreRequest {
        val defaultHeaders = getDefaultHeaders()
        val builder = CoreRequest(callback)
        builder.url(baseUrl + url)
        defaultHeaders?.keys?.forEach {
            builder.addHeader(it, defaultHeaders.getValue(it))
        }
        return builder
    }

    class CoreRequest (val callback: Callback): Request.Builder()

    protected abstract fun getDefaultHeaders () : HashMap<String, String>?

}