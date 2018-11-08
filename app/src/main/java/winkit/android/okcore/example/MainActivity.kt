package winkit.android.okcore.example

import android.os.Bundle
import android.util.Log
import winkit.android.okcore.ParsedCallback
import winkit.android.okcore.uielements.CoreActivity

class MainActivity : CoreActivity() {

    private val devController = DevController(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        devController.getAll(object: ParsedCallback<List<Developer>>(this) {
            override fun onResponse(response: List<Developer>?) {
                Log.d("Success", "$response")
            }

            override fun onFailure(s: String) {
                Log.d("Failure", s)
            }
        })
    }



}
