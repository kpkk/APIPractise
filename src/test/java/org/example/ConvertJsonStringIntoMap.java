package org.example;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

public class ConvertJsonStringIntoMap {

    @Test
    public void test() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        File file = new File("./src/test/resources/user.json");
        HashMap<String, String> map = new HashMap<>();
        TypeReference<HashMap<String,String>> typeReference = new TypeReference<HashMap<String,String>>() {};
        HashMap<String, String> stringStringHashMap = mapper.readValue(file, typeReference);
        stringStringHashMap.put("profession","engineer");
        String s = mapper.writeValueAsString(stringStringHashMap);
        System.out.println(stringStringHashMap);
        System.out.println(s);


    }
}
