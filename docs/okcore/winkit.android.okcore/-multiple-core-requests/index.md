[okcore](../../index.md) / [winkit.android.okcore](../index.md) / [MultipleCoreRequests](./index.md)

# MultipleCoreRequests

`class MultipleCoreRequests`

Class to make multiple requests from [CoreController](../-core-controller/index.md)

### Parameters

`requests` - the list of [CoreControllerRequest](-core-controller-request/index.md) to execute

### Types

| Name | Summary |
|---|---|
| [CoreControllerRequest](-core-controller-request/index.md) | `class CoreControllerRequest<T>`<br>Class representation a [CoreController](../-core-controller/index.md) request |

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `MultipleCoreRequests(vararg requests: `[`CoreControllerRequest`](-core-controller-request/index.md)`<*>)`<br>Class to make multiple requests from [CoreController](../-core-controller/index.md) |

### Properties

| Name | Summary |
|---|---|
| [finishOnFirstError](finish-on-first-error.md) | `var finishOnFirstError: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>If true, call the [allFinishedCallback](#) at the first error occurrence. |

### Functions

| Name | Summary |
|---|---|
| [start](start.md) | `fun start(onAllFinish: (allSuccess: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Launch all requests in the same time. |
