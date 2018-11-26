[okcore](../../index.md) / [winkit.android.okcore](../index.md) / [CoreController](./index.md)

# CoreController

`open class CoreController<T : `[`CoreRest`](../../winkit.android.okcore.rest/-core-rest/index.md)`>`

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `CoreController(view: `[`CoreUi`](../../winkit.android.okcore.uielements/-core-ui/index.md)`, rest: `[`T`](index.md#T)`)` |

### Properties

| Name | Summary |
|---|---|
| [rest](rest.md) | `val rest: `[`T`](index.md#T) |
| [view](view.md) | `val view: `[`CoreUi`](../../winkit.android.okcore.uielements/-core-ui/index.md) |

### Functions

| Name | Summary |
|---|---|
| [enqueue](enqueue.md) | `fun enqueue(viewLife: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`, request: `[`CoreRequest`](../../winkit.android.okcore.rest/-core-rest/-core-request/index.md)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [executeJsonArray](execute-json-array.md) | `fun executeJsonArray(request: `[`CoreRequest`](../../winkit.android.okcore.rest/-core-rest/-core-request/index.md)`): `[`JSONArray`](https://developer.android.com/reference/org/json/JSONArray.html)`?` |
| [executeJsonObject](execute-json-object.md) | `fun executeJsonObject(request: `[`CoreRequest`](../../winkit.android.okcore.rest/-core-rest/-core-request/index.md)`): `[`JSONObject`](https://developer.android.com/reference/org/json/JSONObject.html)`?` |
| [executeString](execute-string.md) | `fun executeString(request: `[`CoreRequest`](../../winkit.android.okcore.rest/-core-rest/-core-request/index.md)`): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [mapJsonArray](map-json-array.md) | `fun <T> mapJsonArray(jsonArray: `[`JSONArray`](https://developer.android.com/reference/org/json/JSONArray.html)`, callback: (json: `[`JSONObject`](https://developer.android.com/reference/org/json/JSONObject.html)`) -> `[`T`](map-json-array.md#T)`): `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`T`](map-json-array.md#T)`>` |
