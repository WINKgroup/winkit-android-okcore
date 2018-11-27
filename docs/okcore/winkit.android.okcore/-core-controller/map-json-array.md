[okcore](../../index.md) / [winkit.android.okcore](../index.md) / [CoreController](index.md) / [mapJsonArray](./map-json-array.md)

# mapJsonArray

`protected fun <T> mapJsonArray(jsonArray: `[`JSONArray`](https://developer.android.com/reference/org/json/JSONArray.html)`, callback: (json: `[`JSONObject`](https://developer.android.com/reference/org/json/JSONObject.html)`) -> `[`T`](map-json-array.md#T)`): `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`T`](map-json-array.md#T)`>`

Util's method to map a [JSONArray](https://developer.android.com/reference/org/json/JSONArray.html) to a model class list in a simple way

``` kotlin
val result = ArrayList<T>()
for (i in 0..(jsonArray.length() - 1)) {
    result.add(callback(jsonArray.getJSONObject(i)))
}
return result
```

### Parameters

`jsonArray` - to map

`callback` - tha mapper function

**Return**
the parsed list

