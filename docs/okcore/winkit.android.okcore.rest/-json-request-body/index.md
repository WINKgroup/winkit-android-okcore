[okcore](../../index.md) / [winkit.android.okcore.rest](../index.md) / [JsonRequestBody](./index.md)

# JsonRequestBody

`abstract class JsonRequestBody : RequestBody`

Class to improve the jsonBody code as a request param.

example without [JsonRequestBody](./index.md)

```
val JSON = MediaType.parse("application/json; charset=utf-8")
val json = JSONObject()
try {
    json.put("name", name)
    json.put("surname", surname)
} catch (e) { ... }
val body = RequestBody.create(JSON, json.toString());
request.post(body)
```

example with [JsonRequestBody](./index.md)

```
val body = JsonRequestBody
    .put("name", name)
    .put("surname", surname)
request.post(body)
```

### Types

| Name | Summary |
|---|---|
| [JSONArrayBody](-j-s-o-n-array-body/index.md) | `class JSONArrayBody : `[`JsonRequestBody`](./index.md) |
| [JSONObjectBody](-j-s-o-n-object-body/index.md) | `class JSONObjectBody : `[`JsonRequestBody`](./index.md) |

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `JsonRequestBody()`<br>Class to improve the jsonBody code as a request param. |

### Functions

| Name | Summary |
|---|---|
| [body](body.md) | `abstract fun body(): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [contentType](content-type.md) | `open fun contentType(): MediaType?` |
| [writeTo](write-to.md) | `open fun writeTo(sink: BufferedSink): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |

### Companion Object Functions

| Name | Summary |
|---|---|
| [put](put.md) | `fun put(key: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, value: `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`): `[`JSONObjectBody`](-j-s-o-n-object-body/index.md)<br>`fun put(value: `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`): `[`JSONArrayBody`](-j-s-o-n-array-body/index.md) |

### Inheritors

| Name | Summary |
|---|---|
| [JSONArrayBody](-j-s-o-n-array-body/index.md) | `class JSONArrayBody : `[`JsonRequestBody`](./index.md) |
| [JSONObjectBody](-j-s-o-n-object-body/index.md) | `class JSONObjectBody : `[`JsonRequestBody`](./index.md) |
