[okcore](../../index.md) / [winkit.android.okcore.rest](../index.md) / [CoreRest](./index.md)

# CoreRest

`abstract class CoreRest`

Class to extends to create an API class mapping for a baseUrl

### Parameters

`baseUrl` - The server base address

### Types

| Name | Summary |
|---|---|
| [CoreRequest](-core-request/index.md) | `class CoreRequest : Builder`<br>Okhttp [Request.Builder](#) wrapper |

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `CoreRest(baseUrl: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`)`<br>Class to extends to create an API class mapping for a baseUrl |

### Functions

| Name | Summary |
|---|---|
| [getDefaultHeaders](get-default-headers.md) | `abstract fun getDefaultHeaders(): `[`HashMap`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-hash-map/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>?`<br>To define the defaults call's headers to the current hostname |
| [request](request.md) | `fun request(url: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, callback: Callback): `[`CoreRequest`](-core-request/index.md)<br>Create a [CoreRequest](-core-request/index.md) instance`fun request(url: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): Builder`<br>Create a [Request.Builder](#) instance, use this method for synchronous calls |
