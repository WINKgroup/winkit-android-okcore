package winkit.android.okcore.rest

import okhttp3.Callback
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.Response

/**
 * Wrapper class that contains all request connected to a [CoreUi] (generic ui element)
 */
class CoreClient : OkHttpClient() {

    private val VIEW_LIFE = "VIEW_LIFE"

    /**
     * Add a new request to the queue
     *
     * @param request The request to add
     * @param callback The request's callback
     * @param viewLife true if the request will be cancelled on view destroy
     */
    fun enqueue (request: CoreRest.CoreRequest, callback: Callback, viewLife: Boolean) {
        if (viewLife) {
            request.tag(VIEW_LIFE)
        }
        this.newCall(request.build()).enqueue(callback)
    }

    /**
     * Execute a request in a sync way
     *
     * @param request The request to execute
     */
    fun execute (request: CoreRest.CoreRequest): Response = newCall(request.build()).execute()

    fun onViewDestroy () {
        dispatcher().queuedCalls().forEach {
            if(VIEW_LIFE === it.request().tag())
                it.cancel()
        }
    }

    /**
     * Cancel all enqueued requests
     */
    fun cancelAll () {
        dispatcher().cancelAll()
    }
}