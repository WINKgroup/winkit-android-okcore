package winkit.android.okcore.example

import winkit.android.okcore.rest.CoreRest
import winkit.android.okcore.rest.JsonArrayCallback

class MockyRest: CoreRest("http://www.mocky.io/v2/") {

    override fun getDefaultHeaders(): HashMap<String, String>? = null

    fun getAllDevs (callback: JsonArrayCallback): CoreRequest = request("592572c21200005100686f0b", callback)
}