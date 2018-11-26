package winkit.android.okcore.uielements

import winkit.android.okcore.rest.CoreClient

/**
 * Interface that define a ui object that can create requests and manage the call lifecycle
 */
public interface CoreUi {

    fun getCoreClient () : CoreClient
    fun runOnUi (runnable: Runnable)
}