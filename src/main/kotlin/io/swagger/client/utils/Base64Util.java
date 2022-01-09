package io.swagger.client.utils;

import java.util.Base64;
import java.nio.charset.StandardCharsets;

public class Base64Util {

    public static String toBase64(String input) {
        return Base64.getEncoder().encodeToString(input.getBytes());
    }

    public static String fromBase64(String base64) {
        return new String(Base64.getDecoder().decode(base64), StandardCharsets.UTF_8);
    }
}
