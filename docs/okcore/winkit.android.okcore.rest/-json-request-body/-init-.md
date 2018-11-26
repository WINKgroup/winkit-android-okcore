[okcore](../../index.md) / [winkit.android.okcore.rest](../index.md) / [JsonRequestBody](index.md) / [&lt;init&gt;](./-init-.md)

# &lt;init&gt;

`JsonRequestBody()`

Class to improve the jsonBody code as a request param.

example without [JsonRequestBody](index.md)

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

example with [JsonRequestBody](index.md)

```
val body = JsonRequestBody
    .put("name", name)
    .put("surname", surname)
request.post(body)
```

