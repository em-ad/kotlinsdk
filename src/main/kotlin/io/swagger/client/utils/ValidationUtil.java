package io.swagger.client.utils;

public class ValidationUtil {

    public static boolean ValidateInput(String input) {
        return !(input == null || input.isEmpty());
    }

}
