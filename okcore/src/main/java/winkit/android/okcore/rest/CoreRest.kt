package winkit.android.okcore.rest

import okhttp3.Callback
import okhttp3.Headers
import okhttp3.Request
import okhttp3.RequestBody

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

    protected fun request (url: String) : Request.Builder {
        val defaultHeaders = getDefaultHeaders()
        val builder = Request.Builder()
        builder.url(baseUrl + url)
        defaultHeaders?.keys?.forEach {
            builder.addHeader(it, defaultHeaders.getValue(it))
        }
        return builder
    }

    class CoreRequest (val callback: Callback): Request.Builder() {

        override fun post(body: RequestBody): CoreRequest { super.post(body); return this }

        override fun get(): Request.Builder { super.get(); return this }

        override fun delete(): Request.Builder { super.delete(); return this }

        override fun delete(body: RequestBody?): Request.Builder { super.delete(body); return this }

        override fun patch(body: RequestBody): Request.Builder { super.patch(body); return this }

        override fun put(body: RequestBody): Request.Builder { super.put(body); return this }

        override fun head(): Request.Builder { super.head(); return this }

        override fun addHeader(name: String, value: String): CoreRequest { super.addHeader(name, value); return this}

        override fun header(name: String, value: String): CoreRequest { super.header(name, value); return this }

        override fun headers(headers: Headers): CoreRequest { super.headers(headers); return this }

        override fun removeHeader(name: String): CoreRequest { super.removeHeader(name); return this }
    }

    protected abstract fun getDefaultHeaders () : HashMap<String, String>?

}