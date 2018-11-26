[okcore](../../index.md) / [winkit.android.okcore.rest](../index.md) / [CoreClient](index.md) / [enqueue](./enqueue.md)

# enqueue

`fun enqueue(request: `[`CoreRequest`](../-core-rest/-core-request/index.md)`, callback: Callback, viewLife: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Add a new request to the queue

### Parameters

`request` - The request to add

`callback` - The request's callback

`viewLife` - true if the request will be cancelled on view destroy