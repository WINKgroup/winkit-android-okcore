[okcore](../../../index.md) / [winkit.android.okcore.rest](../../index.md) / [JsonObjectCallback](../index.md) / [Secure](./index.md)

# Secure

`abstract class Secure<T> : `[`JsonObjectCallback`](../index.md)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `Secure(callback: `[`ParsedCallback`](../../../winkit.android.okcore/-parsed-callback/index.md)`<`[`T`](index.md#T)`>)` |

### Functions

| Name | Summary |
|---|---|
| [onFailure](on-failure.md) | `open fun onFailure(e: `[`Exception`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html)`?): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [onResponse](on-response.md) | `fun onResponse(json: `[`JSONObject`](https://developer.android.com/reference/org/json/JSONObject.html)`?): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [onSecureResponse](on-secure-response.md) | `abstract fun onSecureResponse(json: `[`JSONObject`](https://developer.android.com/reference/org/json/JSONObject.html)`): `[`T`](index.md#T)`?` |

### Inherited Functions

| Name | Summary |
|---|---|
| [onFailure](../on-failure.md) | `fun onFailure(call: Call?, e: `[`IOException`](https://developer.android.com/reference/java/io/IOException.html)`?): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [onResponse](../on-response.md) | `fun onResponse(call: Call?, response: Response?): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
