package winkit.android.okcore.uielements

import android.support.v4.app.Fragment
import winkit.android.okcore.rest.CoreClient

class CoreFragment: Fragment(), CoreUi {

    private var client: CoreClient = CoreClient()

    override fun getCoreClient(): CoreClient = client

    override fun onDetach() {
        super.onDetach()
        client.onViewDestroy()
    }

    override fun runOnUi (runnable: Runnable) {
        activity?.runOnUiThread(runnable)
    }

}