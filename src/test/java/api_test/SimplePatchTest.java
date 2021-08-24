package api_test;

import com.github.javafaker.Faker;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SimplePatchTest {
    public static final Logger LOGGER = LogManager.getLogger(SimplePatchTest.class);
    @Test
    public void updateUserFields(){
        LOGGER.info("----------------API Test: Update(Patch) User's Single Field");

        //Specify the base URL or endpoint of the REST API
        RestAssured.baseURI = "https://reqres.in/api/users";

        //get the request specification of the request that you want to send to the server
        RequestSpecification httpRequest = RestAssured.given();

        Faker faker = new Faker();
        String position = faker.job().position();
        LOGGER.debug("User position:" + position);

        JSONObject reqBody = new JSONObject();
        reqBody.put("job", position);

        httpRequest.header("content-type", "application/json");
        httpRequest.body(reqBody.toJSONString());

        String id = "2";
        Response response = httpRequest.request(Method.PATCH, id);
        LOGGER.debug(response.getBody().asPrettyString());

        Assert.assertEquals(response.getStatusCode(),200);

        JsonPath jsonPath = response.jsonPath();
        String actualJob = jsonPath.getString("job");
        Assert.assertEquals(actualJob,position);

        LOGGER.info("----------------END Test: Update(Patch) User's Single Fields");
    }
}
