[okcore](../../../index.md) / [winkit.android.okcore](../../index.md) / [MultipleCoreRequests](../index.md) / [CoreControllerRequest](./index.md)

# CoreControllerRequest

`class CoreControllerRequest<T>`

Class representation a [CoreController](../../-core-controller/index.md) request

### Parameters

`method` - The [CoreController](../../-core-controller/index.md) method

`params` - The method's parameters over the [ParsedCallback](../../-parsed-callback/index.md)

**Parameters**

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `CoreControllerRequest(method: `[`KFunction`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-function/index.html)`<*>, vararg params: `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`)`<br>Class representation a [CoreController](../../-core-controller/index.md) request |

### Properties

| Name | Summary |
|---|---|
| [errorMessage](error-message.md) | `var errorMessage: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?`<br>The request error message |
| [result](result.md) | `var result: `[`T`](index.md#T)`?`<br>The request  result |

### Functions

| Name | Summary |
|---|---|
| [execute](execute.md) | `fun execute(onFinish: (success: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Execute the method passing the provided parameters |
