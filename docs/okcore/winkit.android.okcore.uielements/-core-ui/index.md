[okcore](../../index.md) / [winkit.android.okcore.uielements](../index.md) / [CoreUi](./index.md)

# CoreUi

`interface CoreUi`

Interface that define a ui object that can create requests and manage the call lifecycle

### Functions

| Name | Summary |
|---|---|
| [getCoreClient](get-core-client.md) | `abstract fun getCoreClient(): `[`CoreClient`](../../winkit.android.okcore.rest/-core-client/index.md) |
| [runOnUi](run-on-ui.md) | `abstract fun runOnUi(runnable: `[`Runnable`](https://developer.android.com/reference/java/lang/Runnable.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |

### Inheritors

| Name | Summary |
|---|---|
| [CoreActivity](../-core-activity/index.md) | `open class CoreActivity : AppCompatActivity, `[`CoreUi`](./index.md)<br>The [AppCompatActivity](#) that implements [CoreUi](./index.md) interface. Cancel all ui requests on [onDestroy](../-core-activity/on-destroy.md) event |
| [CoreFragment](../-core-fragment/index.md) | `class CoreFragment : Fragment, `[`CoreUi`](./index.md)<br>The [Fragment](#) that implements [CoreUi](./index.md) interface. Cancel all ui requests on [onDestroy](../-core-fragment/on-destroy.md) event |
| [CoreIntentService](../-core-intent-service/index.md) | `abstract class CoreIntentService : `[`IntentService`](https://developer.android.com/reference/android/app/IntentService.html)`, `[`CoreUi`](./index.md)<br>The [CoreIntentService](../-core-intent-service/index.md) that implements [CoreUi](./index.md) interface. Cancel all ui requests on [onDestroy](../-core-intent-service/on-destroy.md) event |
