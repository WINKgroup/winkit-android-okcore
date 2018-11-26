[okcore](../index.md) / [winkit.android.okcore.uielements](./index.md)

## Package winkit.android.okcore.uielements

### Types

| Name | Summary |
|---|---|
| [CoreActivity](-core-activity/index.md) | `open class CoreActivity : AppCompatActivity, `[`CoreUi`](-core-ui/index.md)<br>The [AppCompatActivity](#) that implements [CoreUi](-core-ui/index.md) interface. Cancel all ui requests on [onDestroy](-core-activity/on-destroy.md) event |
| [CoreFragment](-core-fragment/index.md) | `class CoreFragment : Fragment, `[`CoreUi`](-core-ui/index.md)<br>The [Fragment](#) that implements [CoreUi](-core-ui/index.md) interface. Cancel all ui requests on [onDestroy](-core-fragment/on-destroy.md) event |
| [CoreIntentService](-core-intent-service/index.md) | `abstract class CoreIntentService : `[`IntentService`](https://developer.android.com/reference/android/app/IntentService.html)`, `[`CoreUi`](-core-ui/index.md)<br>The [CoreIntentService](-core-intent-service/index.md) that implements [CoreUi](-core-ui/index.md) interface. Cancel all ui requests on [onDestroy](-core-intent-service/on-destroy.md) event |
| [CoreUi](-core-ui/index.md) | `interface CoreUi`<br>Interface that define a ui object that can create requests and manage the call lifecycle |
