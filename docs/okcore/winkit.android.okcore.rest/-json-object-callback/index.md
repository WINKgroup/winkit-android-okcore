[okcore](../../index.md) / [winkit.android.okcore.rest](../index.md) / [JsonObjectCallback](./index.md)

# JsonObjectCallback

`abstract class JsonObjectCallback : Callback`

### Types

| Name | Summary |
|---|---|
| [Secure](-secure/index.md) | `abstract class Secure<T> : `[`JsonObjectCallback`](./index.md) |

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `JsonObjectCallback()` |

### Functions

| Name | Summary |
|---|---|
| [onFailure](on-failure.md) | `fun onFailure(call: Call?, e: `[`IOException`](https://developer.android.com/reference/java/io/IOException.html)`?): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>`abstract fun onFailure(e: `[`Exception`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html)`?): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [onResponse](on-response.md) | `fun onResponse(call: Call?, response: Response?): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>`abstract fun onResponse(json: `[`JSONObject`](https://developer.android.com/reference/org/json/JSONObject.html)`?): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |

### Companion Object Functions

| Name | Summary |
|---|---|
| [parseSync](parse-sync.md) | `fun parseSync(response: Response?): `[`JSONObject`](https://developer.android.com/reference/org/json/JSONObject.html)`?` |

### Inheritors

| Name | Summary |
|---|---|
| [Secure](-secure/index.md) | `abstract class Secure<T> : `[`JsonObjectCallback`](./index.md) |
