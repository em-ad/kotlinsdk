package io.swagger.client.utils

object ValidationUtil {
    fun ValidateInput(input: String?): Boolean {
        return !(input == null || input.isEmpty())
    }
}