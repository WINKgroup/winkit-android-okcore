package winkit.android.okcore.uielements

import android.support.v7.app.AppCompatActivity
import winkit.android.okcore.rest.CoreClient

open class CoreActivity: AppCompatActivity(), CoreUi {

    private var client: CoreClient = CoreClient()

    override fun getCoreClient(): CoreClient = client

    override fun onDetachedFromWindow() {
        super.onDetachedFromWindow()
        client.onViewDestroy()
    }

    override fun runOnUi (runnable: Runnable) {
        runOnUiThread(runnable)
    }
}