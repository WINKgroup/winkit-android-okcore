package winkit.android.okcore

import okhttp3.Response
import org.json.JSONArray
import org.json.JSONObject
import winkit.android.okcore.rest.CoreRest
import winkit.android.okcore.rest.JsonArrayCallback
import winkit.android.okcore.rest.JsonObjectCallback
import winkit.android.okcore.rest.StringCallback
import winkit.android.okcore.uielements.CoreUi

/**
 * Extends this class to create the Model-controllers.
 *
 * @param <T: [CoreRest]> The class that the controller will use as restClient
 */
open class CoreController <T: CoreRest> {

    val view: CoreUi
    val rest: T

    /**
     * Primary constructor
     *
     * @param view The ui component to bind for all requests
     * @param rest The ::class for the CoreRest class (to instantiate it)
     */
    constructor(view: CoreUi, rest: T) {
        this.view = view
        this.rest = rest
    }

    /**
     * Add a request to the client
     *
     * @param viewLife if true joins the request's life with the view's life (cancel the request on view's destroy)
     * @param request to send
     */
    protected fun enqueue (viewLife: Boolean, request: CoreRest.CoreRequest) =
        view.getCoreClient().enqueue(request, request.callback, viewLife)

    /**
     * Execute on the current thread the request that return a [JSONObject]
     *
     * @param request to send
     * @return the result [JSONObject]
     */
    protected fun executeJsonObject (request: CoreRest.CoreRequest): JSONObject? {
        val response = view.getCoreClient().execute(request)
        return JsonObjectCallback.parseSync(response)
    }

    /**
     * Execute on the current thread the request that return a [JSONArray]
     *
     * @param request to send
     * @return the result [JSONArray]
     */
    protected fun executeJsonArray (request: CoreRest.CoreRequest): JSONArray? {
        val response = view.getCoreClient().execute(request)
        return JsonArrayCallback.parseSync(response)

    }

    /**
     * Execute on the current thread the request that return a [String]
     *
     * @param request to send
     * @return the result [String]
     */
    protected fun executeString (request: CoreRest.CoreRequest): String? {
        val response = view.getCoreClient().execute(request)
        return StringCallback.parseSync(response)
    }

    /**
     * Util's method to map a [JSONArray] to a model class list in a simple way
     *
     * example: `val parsedList: List<Model> = mapJsonArray(jsonArray, { json -> Model(json) }`
     *
     * @param jsonArray to map
     * @param callback tha mapper function
     * @return the parsed list
     */
    protected fun <T> mapJsonArray (jsonArray: JSONArray, callback: (json: JSONObject) -> T): List<T> {
        val result = ArrayList<T>()
        for (i in 0..(jsonArray.length() - 1)) {
            result.add(callback(jsonArray.getJSONObject(i)))
        }
        return result
    }
}