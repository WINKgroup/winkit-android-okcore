package winkit.android.okcore.rest

import okhttp3.MediaType
import okhttp3.RequestBody
import okhttp3.internal.Util
import okio.BufferedSink
import org.json.JSONArray
import org.json.JSONObject

abstract class JsonRequestBody: RequestBody() {

    protected abstract fun body (): String

    companion object {
        fun put (key: String, value: Any) = JSONObjectBody().put(key, value)
        fun put (value: Any) = JSONArrayBody().put(value)
    }

    override fun writeTo(sink: BufferedSink) {
        sink.write(body().toByteArray(Util.UTF_8))
    }

    override fun contentType(): MediaType? = MediaType.parse("application/json; charset=utf-8")

    class JSONObjectBody: JsonRequestBody () {
        override fun body(): String = json.toString()
        private val json = JSONObject()

        fun put (key: String, value: Any): JSONObjectBody {
            json.putOpt(key, value)
            return this
        }
    }

    class JSONArrayBody: JsonRequestBody () {
        override fun body(): String = json.toString()
        private val json = JSONArray()

        fun put (value: Any): JSONArrayBody {
            json.put(value)
            return this
        }
    }
}