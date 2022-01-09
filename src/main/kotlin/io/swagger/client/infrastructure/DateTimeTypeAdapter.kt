package io.swagger.client.infrastructure

import com.google.gson.TypeAdapter
import com.google.gson.stream.JsonReader
import org.joda.time.format.ISODateTimeFormat
import kotlin.Throws
import com.google.gson.stream.JsonToken
import com.google.gson.stream.JsonWriter
import org.joda.time.DateTime
import java.io.IOException

/**
 * Gson TypeAdapter for Joda DateTime type
 */
class DateTimeTypeAdapter : TypeAdapter<DateTime?>() {
    private val formatter = ISODateTimeFormat.dateTime()
    @Throws(IOException::class)
    override fun write(out: JsonWriter, date: DateTime?) {
        if (date == null) {
            out.nullValue()
        } else {
            out.value(formatter.print(date))
        }
    }

    @Throws(IOException::class)
    override fun read(`in`: JsonReader): DateTime? {
        return when (`in`.peek()) {
            JsonToken.NULL -> {
                `in`.nextNull()
                null
            }
            else -> {
                val date = `in`.nextString()
                formatter.parseDateTime(date)
            }
        }
    }
}