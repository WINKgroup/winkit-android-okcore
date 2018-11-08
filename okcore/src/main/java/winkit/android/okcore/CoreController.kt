package winkit.android.okcore

import okhttp3.Response
import org.json.JSONArray
import org.json.JSONObject
import winkit.android.okcore.rest.CoreRest
import winkit.android.okcore.rest.JsonArrayCallback
import winkit.android.okcore.rest.JsonObjectCallback
import winkit.android.okcore.rest.StringCallback
import winkit.android.okcore.uielements.CoreUi

open class CoreController <T: CoreRest> {

    val view: CoreUi
    val rest: T

    constructor(view: CoreUi, rest: T) {
        this.view = view
        this.rest = rest
    }

    protected fun enqueue (viewLife: Boolean, request: CoreRest.CoreRequest) {
        view.getCoreClient().enqueue(request, request.callback, viewLife)
    }

    protected fun executeJsonObject (request: CoreRest.CoreRequest): JSONObject? {
        val response = view.getCoreClient().execute(request)
        return JsonObjectCallback.parseSync(response)
    }

    protected fun executeJsonArray (request: CoreRest.CoreRequest): JSONArray? {
        val response = view.getCoreClient().execute(request)
        return JsonArrayCallback.parseSync(response)

    }

    protected fun executeString (request: CoreRest.CoreRequest): String? {
        val response = view.getCoreClient().execute(request)
        return StringCallback.parseSync(response)
    }

    protected fun <T> mapJsonArray (jsonArray: JSONArray, callback: (json: JSONObject) -> T): List<T> {
        val result = ArrayList<T>()
        for (i in 0..(jsonArray.length() - 1)) {
            result.add(callback(jsonArray.getJSONObject(i)))
        }
        return result
    }
}