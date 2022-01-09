package io.swagger.client.utils

import java.nio.charset.StandardCharsets
import java.util.*

object Base64Util {
    fun toBase64(input: String): String {
        return Base64.getEncoder().encodeToString(input.toByteArray())
    }

    fun fromBase64(base64: String?): String {
        return String(Base64.getDecoder().decode(base64), StandardCharsets.UTF_8)
    }
}