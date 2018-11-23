package winkit.android.okcore.example

import winkit.android.okcore.rest.CoreRest
import winkit.android.okcore.rest.JsonArrayCallback
import winkit.android.okcore.rest.JsonObjectCallback
import winkit.android.okcore.rest.JsonRequestBody

class MockyRest: CoreRest("http://www.mocky.io/v2/") {

    override fun getDefaultHeaders(): HashMap<String, String>? = null

    fun getAllDevs (callback: JsonArrayCallback): CoreRequest = request("592572c21200005100686f0b", callback)

    fun postDev (name: String, surname: String, callback: JsonObjectCallback): CoreRequest {
        val body = JsonRequestBody
                .put("name", name)
                .put("surname", surname)

        return request("user", callback).post(body)
    }
}