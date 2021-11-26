package org.example;


import io.restassured.RestAssured;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class JsonparserExample {

    @Test
    public void test1() throws IOException, ParseException {
        JSONParser parser=new JSONParser();
        JSONObject parse =(JSONObject) parser.parse(new FileReader("./src/test/resources/user.json"));
        String name = (String)parse.get("name");
        System.out.println(name);
        String s = parse.toJSONString();
        System.out.println(parse.containsKey("name"));
        Object put = parse.put("profession", "engineer");
        System.out.println(s);
    }
}