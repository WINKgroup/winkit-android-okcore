[okcore](../../index.md) / [winkit.android.okcore.uielements](../index.md) / [CoreActivity](./index.md)

# CoreActivity

`open class CoreActivity : AppCompatActivity, `[`CoreUi`](../-core-ui/index.md)

The [AppCompatActivity](#) that implements [CoreUi](../-core-ui/index.md) interface.
Cancel all ui requests on [onDestroy](on-destroy.md) event

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `CoreActivity()`<br>The [AppCompatActivity](#) that implements [CoreUi](../-core-ui/index.md) interface. Cancel all ui requests on [onDestroy](on-destroy.md) event |

### Functions

| Name | Summary |
|---|---|
| [getCoreClient](get-core-client.md) | `open fun getCoreClient(): `[`CoreClient`](../../winkit.android.okcore.rest/-core-client/index.md) |
| [onDestroy](on-destroy.md) | `open fun onDestroy(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [runOnUi](run-on-ui.md) | `open fun runOnUi(runnable: `[`Runnable`](https://developer.android.com/reference/java/lang/Runnable.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
