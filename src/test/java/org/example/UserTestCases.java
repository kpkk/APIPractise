package org.example;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.apache.commons.lang3.RandomStringUtils;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import java.io.*;
import java.lang.reflect.Type;
import java.util.HashMap;


public class UserTestCases {

    public static HashMap<String, String>map=new HashMap<>();
    public RequestEntity request=new RequestEntity();

    @BeforeSuite
    public void setUp(){
        RestAssured.baseURI = "https://gorest.co.in";
        map.put("Authorization","Bearer abc6873022444258af9b83e819278302ee529da099c0c779fafc2e454b3ee784");
        map.put("content-type","application/json");
    }

    @Test
    public void createUser() throws IOException {
        Response response = RestAssured.given().log().all()
                .headers(map)
                .and()
                .body(constructPayload())
                .when()
                .post("public-api/users")
                .then()
                .log().all()
                .extract()
                .response();
        response.prettyPrint();
        Assert.assertEquals(response.getStatusCode(),200);
        System.out.println(response.body().toString());
        response.getHeaders();
        JsonPath jsonPath = response.jsonPath();
        String name= jsonPath.get("data.name");
        System.out.println(name);

    }

    @Test
    public void createUserPojo() throws IOException {
        Type type=new TypeReference<ResponseEntity>(){}.getType();
        ResponseEntity response = RestAssured.given().log().all()
                .headers(map)
                .and()
                .body(constructPayload())
                .when()
                .post("public-api/users")
                .then()
                .log().all()
                .extract()
                .response().as(type);
        Assert.assertEquals(response.getData().getName(),"API");


    }
    public RequestEntity constructPayload() throws IOException {
        ObjectMapper mapper=new ObjectMapper();
        RequestEntity requestEntity = mapper.readValue(new File(System.getProperty("user.dir")+"/src/test/resources/user.json"), RequestEntity.class);
        requestEntity.setName("API");
        requestEntity.setGender("Male");
        requestEntity.setEmail("abakdb"+ RandomStringUtils.randomAlphabetic(3) +"@mail.com");
        requestEntity.setStatus("active");
        String s = mapper.writeValueAsString(requestEntity);
        return requestEntity;

    }

    @Test
    public void schemaValidation(){
        JsonSchemaValidator.matchesJsonSchemaInClasspath(System.getProperty("user.dir")+"/src/test/java/schema.json");

    }
    }


