package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.path.json.JsonPath;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import java.io.File;
import java.util.LinkedHashMap;
import java.util.List;

public class FiltersPractise {

    @Test
    public void filterResponseContent(){
        JsonPath path=new JsonPath(new File(System.getProperty("user.dir")+"/src/test/resources/Books.json"));
        List<Object> list = path.getList("store.book.findAll{it.category=='fiction'}");
        Object o = path.get("store.book.find{it.author=='Evelyn Waugh'}");
        System.out.println(o);
        System.out.println(list);
    }
}
