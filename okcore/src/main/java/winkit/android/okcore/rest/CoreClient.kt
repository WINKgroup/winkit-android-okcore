package winkit.android.okcore.rest

import okhttp3.Callback
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.Response

class CoreClient : OkHttpClient() {

    private val VIEW_LIFE = "VIEW_LIFE"

    fun enqueue (request: CoreRest.CoreRequest, callback: Callback, viewLife: Boolean) {
        if (viewLife) {
            request.tag(VIEW_LIFE)
        }
        this.newCall(request.build()).enqueue(callback)
    }

    fun execute (request: CoreRest.CoreRequest): Response = newCall(request.build()).execute()

    fun onViewDestroy () {
        dispatcher().queuedCalls().forEach {
            if(VIEW_LIFE === it.request().tag())
                it.cancel()
        }
    }

    fun cancelAll () {
        dispatcher().cancelAll()
    }
}