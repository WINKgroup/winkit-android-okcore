package winkit.android.okcore.uielements

import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import winkit.android.okcore.rest.CoreClient

/**
 * The [Fragment] that implements [CoreUi] interface.
 * Cancel all ui requests on [onDestroy] event
 */
class CoreFragment: Fragment(), CoreUi {

    private var client: CoreClient = CoreClient()

    override fun getCoreClient(): CoreClient = client

    override fun onDestroy() {
        super.onDestroy()
        client.onViewDestroy()
    }

    override fun runOnUi (runnable: Runnable) {
        activity?.runOnUiThread(runnable)
    }

}