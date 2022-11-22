package services;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class GetUserApiRequest {
    private static final String USERS_API_ENDPOINT = "https://api.github.com/users/";

    private String user;
    private Response response;

    public GetUserApiRequest user(String user) {
        this.user = user;
        return this;
    }

    public GetUserApiRequest sendRequest() {
        this.response = get(USERS_API_ENDPOINT + user);
        return this;
    }

    public int getStatusCode() {
        return response.getStatusCode();
    }

    public String getUserLogin() {
        return getResponseAsJson().getString("login");
    }

    public String getUserName() {
        return getResponseAsJson().getString("name");
    }

    private JsonPath getResponseAsJson() {
        return response.jsonPath();
    }


}
