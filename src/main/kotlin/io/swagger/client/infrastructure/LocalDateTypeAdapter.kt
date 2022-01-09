package io.swagger.client.infrastructure

import com.google.gson.TypeAdapter
import com.google.gson.stream.JsonReader
import org.joda.time.format.ISODateTimeFormat
import kotlin.Throws
import com.google.gson.stream.JsonToken
import com.google.gson.stream.JsonWriter
import org.joda.time.LocalDate
import java.io.IOException

/**
 * Gson TypeAdapter for Joda LocalDate type
 */
class LocalDateTypeAdapter : TypeAdapter<LocalDate?>() {
    private val formatter = ISODateTimeFormat.date()
    @Throws(IOException::class)
    override fun write(out: JsonWriter, date: LocalDate?) {
        if (date == null) {
            out.nullValue()
        } else {
            out.value(formatter.print(date))
        }
    }

    @Throws(IOException::class)
    override fun read(`in`: JsonReader): LocalDate? {
        return when (`in`.peek()) {
            JsonToken.NULL -> {
                `in`.nextNull()
                null
            }
            else -> {
                val date = `in`.nextString()
                formatter.parseLocalDate(date)
            }
        }
    }
}