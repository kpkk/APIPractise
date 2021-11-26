package org.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.fge.jsonschema.main.JsonSchema;
import org.json.simple.JSONArray;
import org.omg.CORBA.MARSHAL;
import org.testng.annotations.Test;

import javax.management.ObjectName;
import java.text.SimpleDateFormat;
import java.util.Date;

public class jsonComparisions {

    public String json1="{\n" +
            "    \"name\":\"Test Api Automation\",\n" +
            "    \"gender\":\"Female\", \n" +
            "    \"email\":\"fschfs@omg1.com\", \n" +
            "    \"status\":\"Active\"\n" +
            "}\n";

    public String json2="{\n" +
            "    \"name\":\"Test Api Automation\",\n" +
            "    \"email\":\"fschfs@omg1.com\", \n" +
            "    \"status\":\"Active\",\n" +
            "    \"gender\":\"Female\"\n" +
            "}\n";

    @Test
    public void compareJsons() throws JsonProcessingException {
        ObjectMapper mapper=new ObjectMapper();
        JsonNode jsonNode = mapper.readTree(json1);
        JsonNode jsonNode2 = mapper.readTree(json2);
        boolean equals = jsonNode.equals(jsonNode2);
        System.out.println(equals);

    }
}
