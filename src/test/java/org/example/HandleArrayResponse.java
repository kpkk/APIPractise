package org.example;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import entity.BrowserProps;
import io.restassured.path.json.JsonPath;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import javax.jws.Oneway;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public class HandleArrayResponse {

    @Test
    public void test() throws IOException {
        ObjectMapper mapper=new ObjectMapper();
        List<BrowserProps> browserProps = mapper.readValue(new File("./src/test/resources/browserStack.json"), new TypeReference<List<BrowserProps>>() {});
        System.out.println(browserProps);
        for (int i=0;i<browserProps.size();i++){
            System.out.println(browserProps.get(i).getBrowser());
        }
    }

    @Test
    public void test1() throws IOException {
        JsonArray object=new JsonArray();
       ObjectMapper mapper=new ObjectMapper();
        JSONObject object1=new JSONObject();


       JsonPath path=new JsonPath(new File("./src/test/resources/browserStack.json"));
        List<Object> browser = path.getList("browser");
        System.out.println(browser);

        JsonArray jsonArray = mapper.readValue(new File("./src/test/resources/browserStack.json"), new TypeReference<JsonArray>() {
        });
        for (int i=0;i<jsonArray.size();i++){
            JsonObject asJsonObject = jsonArray.get(i).getAsJsonObject();
            System.out.println(asJsonObject.get("browser"));


        }

    }
}
