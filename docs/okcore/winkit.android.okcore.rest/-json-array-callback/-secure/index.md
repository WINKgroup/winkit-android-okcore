[okcore](../../../index.md) / [winkit.android.okcore.rest](../../index.md) / [JsonArrayCallback](../index.md) / [Secure](./index.md)

# Secure

`abstract class Secure<T> : `[`JsonArrayCallback`](../index.md)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `Secure(callback: `[`ParsedCallback`](../../../winkit.android.okcore/-parsed-callback/index.md)`<`[`T`](index.md#T)`>)` |

### Functions

| Name | Summary |
|---|---|
| [onFailure](on-failure.md) | `open fun onFailure(e: `[`Exception`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html)`?): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [onResponse](on-response.md) | `fun onResponse(json: `[`JSONArray`](https://developer.android.com/reference/org/json/JSONArray.html)`?): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [onSecureResponse](on-secure-response.md) | `abstract fun onSecureResponse(json: `[`JSONArray`](https://developer.android.com/reference/org/json/JSONArray.html)`): `[`T`](index.md#T)`?` |

### Inherited Functions

| Name | Summary |
|---|---|
| [onFailure](../on-failure.md) | `fun onFailure(call: Call?, e: `[`IOException`](https://developer.android.com/reference/java/io/IOException.html)`?): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [onResponse](../on-response.md) | `fun onResponse(call: Call?, response: Response?): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
