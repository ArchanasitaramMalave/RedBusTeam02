package GoRestComments;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class UpdateEmail {
	
	
		
		@Test
		public void updateEmail() {
			RestAssured.baseURI = "https://gorest.in";
			RequestSpecification request = RestAssured.given();
									header("Authorization","Bearer 6955b1ef1e7f298ddc8e4ab3d35d3b90510c8921aa85ee61df5cf316648a67cc");
			Response response = request.body("{\"{\"id\":\"1986\",\"user_id\":\"4027\",\"title\":\"Dedico tibi animi vulariter deficio aegrotatio ipsum cicuta asperiores tego sit.\",\"due_on\":\"2022-07-06T00:00:00.000+05:30\",\"status\":\"pending\"}\"}").put("/public/v2/todos/1980");
	     // Retrieve the body of the Response
	        ResponseBody body = response.getBody();
	        //Response in raw format
	        System.out.println("Response Body is: " + body.asString());
	       
	        //Response in pretty format
	        System.out.println("Response=>" + response.prettyPrint());
	        
	        
	        Assert.assertEquals(403,response.getStatusCode());
	        System.out.println("The status code is :"+response.getStatusCode());
		}

		private void header(String string, String string2) {
			// TODO Auto-generated method stub
			
		}

}