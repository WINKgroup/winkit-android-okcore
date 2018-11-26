package winkit.android.okcore

import winkit.android.okcore.uielements.CoreUi
import java.lang.IllegalArgumentException
import kotlin.jvm.internal.FunctionReference
import kotlin.reflect.KFunction

/**
 * Class to make multiple requests from [CoreController]
 *
 * @param requests the list of [CoreControllerRequest] to execute
 */

class MultipleCoreRequests (private vararg val requests: CoreControllerRequest<*>){

    /**
     * If true, call the [allFinishedCallback] at the first error occurrence.
     */
    public var finishOnFirstError = false

    private var finishCount = 0
    private var isInError = false
    private var allFinishedCallback :((allSuccess: Boolean) -> Unit)? = null

    /**
     * Launch all requests in the same time.
     *
     * @param onAllFinish listener.
     */
    fun start (onAllFinish: ((allSuccess: Boolean) -> Unit)? ){
        allFinishedCallback = onAllFinish

        for (request in requests) {
            request.execute { success ->
                finishCount ++
                if (!success) isInError = true

                if((finishOnFirstError && isInError) || finishCount == requests.size) {
                    allFinishedCallback?.invoke(!isInError)
                    allFinishedCallback = null
                }
            }
        }
    }

    /**
     * Class representation a [CoreController] request
     *
     * @param <T> result type class
     * @param method The [CoreController] method
     * @param params The method's parameters over the [ParsedCallback]
     */
    class CoreControllerRequest <T> (private val method: KFunction<*>, private vararg val params: Any) {

        /**
         * The request <T> result
         */
        var result: T? = null
            private set

        /**
         * The request error message
         */
        var errorMessage: String? = null
            private set

        private val view: CoreUi

        init {

            if(params.size != method.parameters.size - 1) {
                throw IllegalArgumentException("Please pass the correct params for method ${method.name}")
            }

            for(param in params) {
                if(param::class != method.parameters[params.indexOf(param)].type.classifier) {
                    throw IllegalArgumentException("Please pass the correct params for method ${method.name}")
                }
            }

            if(method.parameters[params.size].type.classifier != ParsedCallback::class){
                throw IllegalArgumentException("Please ${method.name}'s last parameter should be a winkit.android.okcore.ParsedCallback<T>")
            }

            if(method !is FunctionReference || method.boundReceiver !is CoreController<*>) {
                throw IllegalArgumentException("Please ${method.name} will be provided from a winkit.android.okcore.CoreController instance")
            }

            view = (method.boundReceiver as CoreController<*>).view
        }

        /**
         * Execute the method passing the provided parameters
         *
         * @param onFinish Callback
         */
        fun execute (onFinish: (success: Boolean) -> Unit) {
            method.call(*params, object: ParsedCallback<T>(view) {
                override fun onResponse(response: T?) {
                    result = response
                    onFinish(true)
                }

                override fun onFailure(s: String) {
                    errorMessage = s
                    onFinish(false)
                }

            })
        }



    }
}
