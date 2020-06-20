package com.idepo.frontwebservice.util;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtil {

    public static Object jsonToObject(String jsonString, Class className) {
        Object result = null;
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

            result = objectMapper.readValue(jsonString, className);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
