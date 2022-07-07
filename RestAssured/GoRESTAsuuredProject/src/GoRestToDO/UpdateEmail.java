package GoRestToDO;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class UpdateEmail
{
	@Test
	public void updateUserPat() {
		RestAssured.baseURI ="https://gorest.co.in";
		
		RequestSpecification request = RestAssured.given()										
										.header("Authorization","Bearer 6955b1ef1e7f298ddc8e4ab3d35d3b90510c8921aa85ee61df5cf316648a67cc");
		Response response = request.body("{\"{\"id\":\"1988\",\"user_id\":\"4027\",\"title\":\"Dedico tibi animi vulariter deficio aegrotatio ipsum cicuta asperiores tego sit.\",\"due_on\":\"2022-07-06T00:00:00.000+05:30\",\"status\":\"pending\"}\"}").put("/public/v2/todos/1988");
	    //Response in raw format
		ResponseBody body = response.getBody();
	    //Response in raw format
	    System.out.println("Response Body is: " + body.asString());
	    
	    System.out.println("Response=>" + response.prettyPrint()); 
	    
	    Assert.assertEquals(200,response.getStatusCode());
	    System.out.println("The status code is:" + response.getStatusCode());
	}
}

