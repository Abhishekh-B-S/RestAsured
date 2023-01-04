package validation;

import static io.restassured.RestAssured.*;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;



public class ResponseBodyValiation {
	
	
	@Test
	public void responsebodyValidation()
	{
		
		Response res= 
				when()
				.get("http://localhost:8084/projects")
				
				.then()
				.statusCode(200)
				.extract().response();
		String st=res.asString();
		Assert.assertEquals(st.contains("Abhi"),true);
				
				
		
		

}
}
