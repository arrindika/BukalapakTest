package project;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Test;

public class APICheck {
    @Test
    public void getEmployee(){
        Response responsePikachu = RestAssured
                .given()
                .baseUri("https://jsonplaceholder.typicode.com")
                .basePath("/posts")
                .get("1");

        //responsePikachu.prettyPrint();
        responsePikachu.getContentType();
    }
}
