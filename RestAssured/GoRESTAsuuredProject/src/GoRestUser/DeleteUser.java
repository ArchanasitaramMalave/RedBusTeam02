package GoRestUser;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class DeleteUser {
	
	@Test
	public void deleteuser() {
		RestAssured.baseURI = "https://gorest.co.in";
		RequestSpecification request = RestAssured.given();
									
        Response response = request.delete("/public/v2/users/8");
        
     // Retrieve the body of the Response
        ResponseBody body = response.getBody();
        //Response in raw format
        System.out.println("Response Body is: " + body.asString());
        
        
        
        Assert.assertEquals(401,response.getStatusCode());
        System.out.println("The status code is"+ response.getStatusCode());
	}



}