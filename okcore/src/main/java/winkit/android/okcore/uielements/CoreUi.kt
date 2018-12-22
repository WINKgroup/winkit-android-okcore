package winkit.android.okcore.uielements

import android.content.Context
import winkit.android.okcore.rest.CoreClient

/**
 * Interface that define a ui object that can create requests and manage the call lifecycle
 */
public interface CoreUi {

    val uiContext: Context
    fun getCoreClient () : CoreClient
    fun runOnUi (runnable: Runnable)
}