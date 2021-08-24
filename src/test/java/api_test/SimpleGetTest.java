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

public class SimpleGetTest {
    public static final Logger LOGGER = LogManager.getLogger(SimpleGetTest.class);

    @Test
    public void getAllUsers(){
        LOGGER.info("----------------API Test: Read(Get) All Users");

        //Specify the base URL or endpoint of the REST API
        RestAssured.baseURI = "https://reqres.in/api/users";

        //get the requestpecification of the request that you want to send to the server
        RequestSpecification httpRequest = RestAssured.given();

        //make a request to the server and this will return the response
        Response response = httpRequest.request(Method.GET);
        LOGGER.debug(response.getBody().asString());

        //validating the response status code
        Assert.assertEquals(response.getStatusCode(),200);

        //get the json path object instance from the response
        JsonPath jsonPath = response.jsonPath();
        List<String> list = jsonPath.get("data.email");

        //validating the specified email exist in the response body
        String emailId = "george.bluth@reqres.in";
        boolean emailExist = list.contains(emailId);
        Assert.assertTrue(emailExist,emailId + "does not exist");

        LOGGER.info("----------------End Test: Read(Get) All Users");

    }
}
