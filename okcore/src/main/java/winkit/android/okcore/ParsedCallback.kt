package winkit.android.okcore

import winkit.android.okcore.uielements.CoreUi

abstract class ParsedCallback<R> (val view: CoreUi){

    protected abstract fun onResponse (response: R?)
    protected abstract fun onFailure (s: String)

    fun response (response: R?){
        view.runOnUi(Runnable { onResponse(response) })
    }

    fun failure (error: String) {
        view.runOnUi(Runnable { onFailure(error) })
    }

    fun failure (error: Exception?) {
        failure(error?.localizedMessage ?:"Generic error")
    }
}