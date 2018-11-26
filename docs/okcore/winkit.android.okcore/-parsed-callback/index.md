[okcore](../../index.md) / [winkit.android.okcore](../index.md) / [ParsedCallback](./index.md)

# ParsedCallback

`abstract class ParsedCallback<R>`

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `ParsedCallback(view: `[`CoreUi`](../../winkit.android.okcore.uielements/-core-ui/index.md)`)` |

### Properties

| Name | Summary |
|---|---|
| [view](view.md) | `val view: `[`CoreUi`](../../winkit.android.okcore.uielements/-core-ui/index.md) |

### Functions

| Name | Summary |
|---|---|
| [failure](failure.md) | `fun failure(error: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>`fun failure(error: `[`Exception`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html)`?): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [onFailure](on-failure.md) | `abstract fun onFailure(s: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [onResponse](on-response.md) | `abstract fun onResponse(response: `[`R`](index.md#R)`?): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [response](response.md) | `fun response(response: `[`R`](index.md#R)`?): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
