package io.swagger.client.utils;

public class AuthorizationUtil {

    public static String getAuthorization(String clientId, String secret) {
        return "Basic " + Base64Util.toBase64(clientId + ":" + secret);
    }

}
