package io.swagger.client.utils

import io.swagger.client.utils.Base64Util

object AuthorizationUtil {
    fun getAuthorization(clientId: String, secret: String): String {
        return "Basic " + Base64Util.toBase64("$clientId:$secret")
    }
}