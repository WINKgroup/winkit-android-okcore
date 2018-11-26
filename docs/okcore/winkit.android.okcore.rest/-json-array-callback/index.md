[okcore](../../index.md) / [winkit.android.okcore.rest](../index.md) / [JsonArrayCallback](./index.md)

# JsonArrayCallback

`abstract class JsonArrayCallback : Callback`

### Types

| Name | Summary |
|---|---|
| [Secure](-secure/index.md) | `abstract class Secure<T> : `[`JsonArrayCallback`](./index.md) |

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `JsonArrayCallback()` |

### Functions

| Name | Summary |
|---|---|
| [onFailure](on-failure.md) | `fun onFailure(call: Call?, e: `[`IOException`](https://developer.android.com/reference/java/io/IOException.html)`?): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>`abstract fun onFailure(e: `[`Exception`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html)`?): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [onResponse](on-response.md) | `fun onResponse(call: Call?, response: Response?): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>`abstract fun onResponse(json: `[`JSONArray`](https://developer.android.com/reference/org/json/JSONArray.html)`?): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |

### Companion Object Functions

| Name | Summary |
|---|---|
| [parseSync](parse-sync.md) | `fun parseSync(response: Response?): `[`JSONArray`](https://developer.android.com/reference/org/json/JSONArray.html)`?` |

### Inheritors

| Name | Summary |
|---|---|
| [Secure](-secure/index.md) | `abstract class Secure<T> : `[`JsonArrayCallback`](./index.md) |
