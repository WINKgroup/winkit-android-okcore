[okcore](../../index.md) / [winkit.android.okcore](../index.md) / [CoreController](index.md) / [enqueue](./enqueue.md)

# enqueue

`protected fun enqueue(viewLife: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`, request: `[`CoreRequest`](../../winkit.android.okcore.rest/-core-rest/-core-request/index.md)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Add a request to the client

### Parameters

`viewLife` - if true joins the request's life with the view's life (cancel the request on view's destroy)

`request` - to send