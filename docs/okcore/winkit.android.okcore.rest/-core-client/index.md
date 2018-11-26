[okcore](../../index.md) / [winkit.android.okcore.rest](../index.md) / [CoreClient](./index.md)

# CoreClient

`class CoreClient : OkHttpClient`

Wrapper class that contains all request connected to a [CoreUi](#) (generic ui element)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `CoreClient()`<br>Wrapper class that contains all request connected to a [CoreUi](#) (generic ui element) |

### Functions

| Name | Summary |
|---|---|
| [cancelAll](cancel-all.md) | `fun cancelAll(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Cancel all enqueued requests |
| [enqueue](enqueue.md) | `fun enqueue(request: `[`CoreRequest`](../-core-rest/-core-request/index.md)`, callback: Callback, viewLife: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Add a new request to the queue |
| [execute](execute.md) | `fun execute(request: `[`CoreRequest`](../-core-rest/-core-request/index.md)`): Response`<br>Execute a request in a sync way |
| [onViewDestroy](on-view-destroy.md) | `fun onViewDestroy(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
