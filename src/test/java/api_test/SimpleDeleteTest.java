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

import java.util.List;

public class SimpleDeleteTest {
    public static final Logger LOGGER = LogManager.getLogger(SimpleDeleteTest.class);

    @Test
    public void deleteSingleUser(){
        LOGGER.info("----------------API Test: Delete Users");

        //Specify the base URL or endpoint of the REST API
        RestAssured.baseURI = "https://reqres.in/api/users";

        //get the requestpecification of the request that you want to send to the server
        RequestSpecification httpRequest = RestAssured.given();

        //make a request to the server and this will return the response
        String id = "2";
        Response response = httpRequest.request(Method.DELETE,id);


        //validating the response status code
        Assert.assertEquals(response.getStatusCode(),204);


        LOGGER.info("----------------End Test: Delete User");

    }
}
