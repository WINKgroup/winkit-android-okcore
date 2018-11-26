package winkit.android.okcore.example

import org.json.JSONArray
import org.json.JSONObject
import winkit.android.okcore.CoreController
import winkit.android.okcore.ParsedCallback
import winkit.android.okcore.rest.JsonArrayCallback
import winkit.android.okcore.rest.JsonObjectCallback
import winkit.android.okcore.uielements.CoreUi

class DevController (view: CoreUi): CoreController<MockyRest>(view, MockyRest()) {

    fun getAll(callback: ParsedCallback<List<Developer>>) {
        enqueue(true, rest.getAllDevs(object: JsonArrayCallback.Secure<List<Developer>>(callback) {
            override fun onSecureResponse(json: JSONArray): List<Developer> = mapJsonArray(json) { json -> Developer(json) }
        }))
    }

    fun create(name: String, surname: String, callback: ParsedCallback<Developer>) {
        enqueue(true, rest.postDev(name, surname, object :JsonObjectCallback.Secure<Developer>(callback) {
            override fun onSecureResponse(json: JSONObject): Developer? = Developer(json)
        }))
    }
}