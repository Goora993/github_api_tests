package tests;

import org.junit.jupiter.api.Test;
import services.GetUserApiRequest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


public class GetUserApiTest {

    private final static String EXISTING_USER = "octocat";
    private final static String NOT_EXISTING_USER = "!@#notFound@#$";

    @Test
    public void successfulRequestReturns200() {
        int statusCode = new GetUserApiRequest()
                .user(EXISTING_USER)
                .sendRequest()
                .getStatusCode();

        assertThat(statusCode, equalTo(200));
    }

    @Test
    public void notFoundRequestReturns404() {
        int statusCode = new GetUserApiRequest()
                .user(NOT_EXISTING_USER)
                .sendRequest()
                .getStatusCode();

        assertThat(statusCode, equalTo(404));
    }

    @Test
    public void requestedUserHasCorrectName() {
        String expectedUserName = "The Octocat";

        String actualUserName = new GetUserApiRequest()
                .user(EXISTING_USER)
                .sendRequest()
                .getUserName();

        assertThat(actualUserName, equalTo(expectedUserName));
    }

    @Test
    public void requestedUserHasCorrectLogin() {
        String expectedUserLogin = "octocat";

        String actualUserLogin = new GetUserApiRequest()
                .user(EXISTING_USER)
                .sendRequest()
                .getUserLogin();

        assertThat(actualUserLogin, equalTo(expectedUserLogin));
    }


}
