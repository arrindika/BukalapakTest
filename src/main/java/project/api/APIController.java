package project.api;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class APIController {

    public Response createAPI(APIRequest apiRequest){
        Response response = RestAssured
                .given()
                .baseUri("https://jsonplaceholder.typicode.com")
                .log()
                .all()
                .header("Content-type", "application/json")
                .header("Accept", "*/*")
                .body(apiRequest)
                .post("/posts");
        return response;
    }
    public Response getAPI() {
        Response getAPI = RestAssured
                .given()
                .baseUri("https://jsonplaceholder.typicode.com")
                .basePath("/posts")
                .get("1");
        return getAPI;
    }
}
