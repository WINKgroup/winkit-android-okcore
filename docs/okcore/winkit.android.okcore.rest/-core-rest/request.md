[okcore](../../index.md) / [winkit.android.okcore.rest](../index.md) / [CoreRest](index.md) / [request](./request.md)

# request

`protected fun request(url: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, callback: Callback): `[`CoreRequest`](-core-request/index.md)

Create a [CoreRequest](-core-request/index.md) instance

### Parameters

`url` - api (will be concatenate to [baseUrl](#))

`callback` - request (one of [JsonObjectCallback](../-json-object-callback/index.md), [JsonArrayCallback](../-json-array-callback/index.md), [StringCallback](../-string-callback/index.md))`protected fun request(url: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): Builder`

Create a [Request.Builder](#) instance, use this method for synchronous calls

### Parameters

`url` - api (will be concatenate to [baseUrl](#))