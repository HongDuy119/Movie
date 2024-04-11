package com.kttkpm.movieservice.until.common;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.log4j.Logger;

import javax.persistence.Tuple;
import java.util.*;
import java.util.concurrent.ExecutorService;

import static jdk.xml.internal.SecuritySupport.getResourceBundle;

public class FunctionCommon {

    private static final Logger LOGGER = Logger.getLogger(FunctionCommon.class);
    private static final ResourceBundle RESOURCE_BUNDLE = getResourceBundle();
    private static ExecutorService executorService;

    public static String CONFIGFILEPROPERTIES = "application";

    private static ResourceBundle getResourceBundle() {
        try {
            return ResourceBundle.getBundle(CONFIGFILEPROPERTIES);
        } catch (Exception var1) {
            LOGGER.error("Loi! getResourceBundle: " + var1.getMessage());
            return null;
        }
    }
    public static String getPropertiesValue(String key) {
        return RESOURCE_BUNDLE.containsKey(key) ? RESOURCE_BUNDLE.getString(key) : "";
    }

    public static List<?> convertToEntity(List<Tuple> input, Class<?> dtoClass) {
        List<Object> arrayList = new ArrayList();
        input.stream().forEach((tuple) -> {
            Map<String, Object> temp = new HashMap();
            tuple.getElements().stream().forEach((tupleElement) -> {
                Object value = tuple.get(tupleElement.getAlias());
                temp.put(tupleElement.getAlias().toLowerCase(), value);
            });
            ObjectMapper map = new ObjectMapper();
            map.configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true);
            map.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

            try {
                String mapToString = map.writeValueAsString(temp);
                arrayList.add(map.readValue(mapToString, dtoClass));
            } catch (JsonProcessingException var6) {
                throw new RuntimeException(var6.getMessage());
            }
        });
        return arrayList;
    }
}