package com.kttkpm.movieservice.until.common;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kttkpm.movieservice.dto.CoreErrorApp;
import com.kttkpm.movieservice.dto.MessEntity;
import com.kttkpm.movieservice.dto.ResponseEntity;
import org.apache.log4j.Logger;
import org.apache.tomcat.util.net.openssl.ciphers.Authentication;

import javax.persistence.Tuple;
import java.util.*;
import java.util.concurrent.ExecutorService;

//import static jdk.xml.internal.SecuritySupport.getResourceBundle;

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

    public static Object responseToClient(Authentication req, Object itemObject) {
        ResponseEntity responseEntity = new ResponseEntity();
        CoreErrorApp errorApp;
        if (itemObject == null) {
            errorApp = CoreErrorApp.DATAEMTY;
        } else {
            errorApp = CoreErrorApp.SUCCESS;
            responseEntity.setData(itemObject);
        }

        MessEntity itemEntity = new MessEntity();
        itemEntity.setCode(errorApp.getCode());
        itemEntity.setDescription(errorApp.getDescription());
        responseEntity.setMess(itemEntity);
        return responseEntity;
    }

    public static Object responseToClient(Object itemObject) {
        ResponseEntity responseEntity = new ResponseEntity();
        CoreErrorApp errorApp;
        if (itemObject == null) {
            errorApp = CoreErrorApp.DATAEMTY;
        } else {
            errorApp = CoreErrorApp.SUCCESS;
            responseEntity.setData(itemObject);
        }

        MessEntity itemEntity = new MessEntity();
        itemEntity.setCode(errorApp.getCode());
        itemEntity.setDescription(errorApp.getDescription());
        responseEntity.setMess(itemEntity);
        return responseEntity;
    }

    public static Object responseToClient(CoreErrorApp errorApp, Object itemObject) {
        ResponseEntity responseEntity = new ResponseEntity();
        if (itemObject != null) {
            responseEntity.setData(itemObject);
        }

        MessEntity itemEntity = new MessEntity();
        itemEntity.setCode(errorApp.getCode());
        itemEntity.setDescription(errorApp.getDescription());
        responseEntity.setMess(itemEntity);
        return responseEntity;
    }
}
