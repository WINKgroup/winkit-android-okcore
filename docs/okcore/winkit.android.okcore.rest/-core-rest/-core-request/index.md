[okcore](../../../index.md) / [winkit.android.okcore.rest](../../index.md) / [CoreRest](../index.md) / [CoreRequest](./index.md)

# CoreRequest

`class CoreRequest : Builder`

Okhttp [Request.Builder](#) wrapper

### Parameters

`callback` - The request callback (one of [JsonObjectCallback](../../-json-object-callback/index.md), [JsonArrayCallback](../../-json-array-callback/index.md), [StringCallback](../../-string-callback/index.md))

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `CoreRequest(callback: Callback)`<br>Okhttp [Request.Builder](#) wrapper |

### Properties

| Name | Summary |
|---|---|
| [callback](callback.md) | `val callback: Callback`<br>The request callback (one of [JsonObjectCallback](../../-json-object-callback/index.md), [JsonArrayCallback](../../-json-array-callback/index.md), [StringCallback](../../-string-callback/index.md)) |

### Functions

| Name | Summary |
|---|---|
| [addHeader](add-header.md) | `fun addHeader(name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, value: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`CoreRequest`](./index.md) |
| [delete](delete.md) | `fun delete(): Builder`<br>`fun delete(body: RequestBody?): Builder` |
| [get](get.md) | `fun get(): Builder` |
| [head](head.md) | `fun head(): Builder` |
| [header](header.md) | `fun header(name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, value: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`CoreRequest`](./index.md) |
| [headers](headers.md) | `fun headers(headers: Headers): `[`CoreRequest`](./index.md) |
| [patch](patch.md) | `fun patch(body: RequestBody): Builder` |
| [post](post.md) | `fun post(body: RequestBody): `[`CoreRequest`](./index.md) |
| [put](put.md) | `fun put(body: RequestBody): Builder` |
| [removeHeader](remove-header.md) | `fun removeHeader(name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`CoreRequest`](./index.md) |
