package GoRestToDO;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class CreateUser {
	@Test
	public void createUser() {
		RestAssured.baseURI ="https://gorest.co.in/";
		RequestSpecification request = RestAssured.given()										
										.header("Authorization","Bearer 6955b1ef1e7f298ddc8e4ab3d35d3b90510c8921aa85ee61df5cf316648a67cc");
		Response response = request.body("{\"{\"id\":\"1980\",\"user_id\":\"4027\",\"title\":\"Dedico tibi animi vulariter deficio aegrotatio ipsum cicuta asperiores tego sit.\",\"due_on\":\"2022-07-06T00:00:00.000+05:30\",\"status\":\"pending\"}\"}").put("/public/v2/todos");
	    
	 // Retrieve the body of the Response
	    ResponseBody body = response.getBody();
	    //Response in raw format
	    System.out.println("Response Body is: " + body.asString());
	    JsonPath jsonPathEvaluator = response.jsonPath();
	    System.out.println("The use_id is : " + jsonPathEvaluator.get("id"));
	    
	    System.out.println("Status received => " + response.getStatusLine());
		//Response in pretty format
		System.out.println("Response=>" + response.prettyPrint());
		// Assert that correct status code is returned.
          int statusCode = response.getStatusCode();
          Assert.assertEquals(statusCode /* actual value */, 200   /* expected value */, "Successful");
         
		 //Assert Status line
          String statusLine = response.getStatusLine();
          Assert.assertEquals(statusLine /* actual value */, "HTTP/1.1 200 OK"   /*expected value */, "Correct status code returned");
}

	private Object given() {
		// TODO Auto-generated method stub
		return null;
	}

	}