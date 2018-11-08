package winkit.android.okcore.example

import org.json.JSONObject

class Developer(json: JSONObject) {

    val name = json.getString("name")?: ""

}