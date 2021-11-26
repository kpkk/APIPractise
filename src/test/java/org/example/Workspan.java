package org.example;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import java.util.*;

public class Workspan {

    String city="Denver";
    HashMap<String, Object>params=new HashMap<>();
    int total_pages=0;
    int cost=200;
    HashMap<Object, Object> map=new HashMap<>();
    ArrayList<String>outletsName=new ArrayList<>();

    @BeforeSuite
    public void setUp(){
        RestAssured.baseURI="https://jsonmock.hackerrank.com";
        params.put("city",city);
    }
    @Test
    public void getTotalpages(){
        Response response = RestAssured.given().log().all()
                .queryParams(params)
                .when().get("api/food_outlets")
                .then()
                .extract().response();
        JsonPath jsonPath = response.jsonPath();
        XmlPath xmlPath = response.xmlPath();
        total_pages = jsonPath.get("total_pages");
        System.out.println(total_pages);
    }

    @Test(dependsOnMethods = {"getTotalpages"})
    public void getFoodOutletName(){
        for (int i=1;i<=total_pages;i++){
            RestAssured.baseURI="https://jsonmock.hackerrank.com";
            Response response = RestAssured.given().log().all()
                    .queryParams(params).when().get("api/food_outlets")
                    .then()
                    .extract().response();
            JsonPath jsonPath = response.jsonPath();
            List<String> names= jsonPath.getList("data.name");
            List<Integer> costs= jsonPath.getList("data.estimated_cost");
            map.put(jsonPath.get("data["+i+"].estimated_cost"),jsonPath.get("data["+i+"].name"));
        }
        System.out.println(map);
        Set<Map.Entry<Object, Object>> entries = map.entrySet();
        for (Map.Entry entry:entries){
            if((int)entry.getKey()<cost){
                outletsName.add((String)entry.getValue());
            }
        }
        System.out.println(outletsName);
    }
}
