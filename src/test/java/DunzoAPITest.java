import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.example.RequestEntity;
import org.example.ResponseEntity;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class DunzoAPITest {

    @Test
    public void test1(){
        RestAssured.baseURI="https://gorest.co.in";

        Response response = RestAssured.given()
                .log().all()
                .headers("Authorization", "Bearer abc6873022444258af9b83e819278302ee529da099c0c779fafc2e454b3ee784")
                .header(new Header("content-Type","application/json"))
                .body(prepareRequest())
                .when()
                .post("public-api/users")
                .then()
                .log().all()
                .extract()
                .response();
        JsonPath jsonPath = response.jsonPath();
        String email = jsonPath.get("data.email");
        Assert.assertEquals(email,"");

    }
    @Test
    public void test2() throws IOException {
        RestAssured.baseURI="https://gorest.co.in";

        ResponseEntity response = RestAssured.given()
                .log().all()
                .headers("Authorization", "Bearer abc6873022444258af9b83e819278302ee529da099c0c779fafc2e454b3ee784")
                .header(new Header("content-Type", "application/json"))
                .body(generateBody())
                .when()
                .post("public-api/users")
                .then()
                .log().all()
                .extract()
                .response().as(ResponseEntity.class);
        String name=response.getData().getName();

    }

    public RequestEntity prepareRequest(){
        RequestEntity req=new RequestEntity();
        req.setName("Roger");
        req.setEmail("roger123@mail.com");
        req.setStatus("Active");
        req.setGender("male");
        return req;
    }
    public RequestEntity generateBody() throws IOException {
        File file=new File(System.getProperty("user.dir")+"/src/test/resources/user.json");
        ObjectMapper mapper=new ObjectMapper();
        RequestEntity requestEntity = mapper.readValue(file, RequestEntity.class);
        requestEntity.setEmail("mail@email.com");
        return requestEntity;
    }
}
