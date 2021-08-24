package api_test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetTestWithPathVariable {
    public static final Logger LOGGER = LogManager.getLogger(GetTestWithPathVariable.class);

    @Test
    public void getSingleUser(){
        LOGGER.info("----------------API Test: Read(Get) Single Users With Path Variable");

        //Specify the base URL or endpoint of the REST API
        RestAssured.baseURI = "https://reqres.in/api/users";

        //get the requestpecification of the request that you want to send to the server
        RequestSpecification httpRequest = RestAssured.given();

        //make a request to the server and this will return the response
        String id = "2";
        Response response = httpRequest.request(Method.GET,id);
        LOGGER.debug(response.getBody().asString());

        //validating the response status code
        Assert.assertEquals(response.getStatusCode(),200);

        //get the json path object instance from the response
        JsonPath jsonPath = response.jsonPath();

        //validating the specified email exist in the response body
        String expectedEmailId = "janet.weaver@reqres.in";
        String actualEmailId = jsonPath.getString("data.email");
        Assert.assertEquals(actualEmailId,expectedEmailId);

        LOGGER.info("----------------End Test: Read(Get) Single Users With Path Variable");
    }

    @Test
    public void attemptToGetUserWithInvalidId(){
        LOGGER.info("----------------API Test: Read(Get) Attempt to retrieve Users with invalid id");

        //Specify the base URL or endpoint of the REST API
        RestAssured.baseURI = "https://reqres.in/api/users";

        //get the requestpecification of the request that you want to send to the server
        RequestSpecification httpRequest = RestAssured.given();

        //make a request to the server and this will return the response
        String invalidId = "23";
        Response response = httpRequest.request(Method.GET,invalidId);
        LOGGER.debug(response.getBody().asString());

        //validating the response status code
        Assert.assertEquals(response.getStatusCode(),404);

        //validating the response has empty body
        JsonPath jsonPath = response.jsonPath();
        Assert.assertEquals(jsonPath.get().toString(),"{}");

        LOGGER.info("----------------End Test: Attempt to retrieve Users with invalid ide");
    }
    }

