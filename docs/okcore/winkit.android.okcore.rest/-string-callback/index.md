[okcore](../../index.md) / [winkit.android.okcore.rest](../index.md) / [StringCallback](./index.md)

# StringCallback

`abstract class StringCallback : Callback`

### Types

| Name | Summary |
|---|---|
| [Secure](-secure/index.md) | `abstract class Secure<T> : `[`StringCallback`](./index.md) |

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `StringCallback()` |

### Functions

| Name | Summary |
|---|---|
| [onFailure](on-failure.md) | `fun onFailure(call: Call?, e: `[`IOException`](https://developer.android.com/reference/java/io/IOException.html)`?): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>`abstract fun onFailure(e: `[`Exception`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html)`?): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [onResponse](on-response.md) | `fun onResponse(call: Call?, response: Response?): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>`abstract fun onResponse(response: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |

### Companion Object Functions

| Name | Summary |
|---|---|
| [parseSync](parse-sync.md) | `fun parseSync(response: Response?): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |

### Inheritors

| Name | Summary |
|---|---|
| [Secure](-secure/index.md) | `abstract class Secure<T> : `[`StringCallback`](./index.md) |
