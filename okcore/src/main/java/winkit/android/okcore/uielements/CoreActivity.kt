package winkit.android.okcore.uielements

import android.content.Context
import android.support.v7.app.AppCompatActivity
import winkit.android.okcore.rest.CoreClient

/**
 * The [AppCompatActivity] that implements [CoreUi] interface.
 * Cancel all ui requests on [onDestroy] event
 */
open class CoreActivity: AppCompatActivity(), CoreUi {

    override val uiContext: Context
        get() = this

    private var client: CoreClient = CoreClient()

    override fun getCoreClient(): CoreClient = client

    override fun onDestroy() {
        super.onDestroy()
        client.onViewDestroy()
    }

    override fun runOnUi (runnable: Runnable) {
        runOnUiThread(runnable)
    }
}