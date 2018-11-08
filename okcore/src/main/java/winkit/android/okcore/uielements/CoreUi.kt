package winkit.android.okcore.uielements

import winkit.android.okcore.rest.CoreClient

interface CoreUi {

    fun getCoreClient () : CoreClient
    fun runOnUi (runnable: Runnable)
}