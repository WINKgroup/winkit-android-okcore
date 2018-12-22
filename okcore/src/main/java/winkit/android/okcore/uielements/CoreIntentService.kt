package winkit.android.okcore.uielements

import android.app.IntentService
import android.content.Context
import android.support.v4.app.Fragment
import winkit.android.okcore.rest.CoreClient

/**
 * The [CoreIntentService] that implements [CoreUi] interface.
 * Cancel all ui requests on [onDestroy] event
 */
abstract class CoreIntentService(name: String): IntentService(name), CoreUi {

    override val uiContext: Context
        get() = this

    private var client: CoreClient = CoreClient()

    override fun getCoreClient(): CoreClient = client

    override fun onDestroy() {
        super.onDestroy()
        client.onViewDestroy()
    }

    override fun runOnUi (runnable: Runnable) {
        runnable.run()
    }
}