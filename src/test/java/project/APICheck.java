package project;

import io.restassured.response.Response;
import org.junit.Test;
import project.api.APIController;
import project.api.APIRequest;

public class APICheck {
    APIController apiController = new APIController();

    @Test
    public void getAPI(){
        Response response = apiController.getAPI();
        response.getBody().prettyPrint();
    }
    @Test
    public void postAPI(){
        APIRequest apiRequest = new APIRequest();

        apiRequest.setTitle("recommendation");
        apiRequest.setBody("motorcycle");
        apiRequest.setUserId(12);

        Response response = apiController.createAPI(apiRequest);

        response.getBody().prettyPrint();

        System.out.println(response.statusCode());
    }
}
