package winkit.android.okcore

import winkit.android.okcore.rest.CoreRest
import winkit.android.okcore.uielements.CoreUi

open class CoreController <T: CoreRest> {

    val view: CoreUi
    val rest: T

    constructor(view: CoreUi, rest: T) {
        this.view = view
        this.rest = rest
    }

    protected fun enqueue (viewLife: Boolean, request: CoreRest.CoreRequest) {
        view.getCoreClient().enqueue(request, request.callback, viewLife)
    }
}