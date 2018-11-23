package winkit.android.okcore.uielements

import android.app.IntentService
import winkit.android.okcore.rest.CoreClient

abstract class CoreIntentService(name: String): IntentService(name), CoreUi {

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