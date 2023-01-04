package validation;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class DynamicBodyValidation {
	
	@Test
	public void BodyValidation()
	{
		
				when()
				.get("http://localhost:8084/projects")
				.then()
				.log().body()
				.assertThat().body("projectName",Matchers.hasItems("HRM4482","kl13786","Dec2585"));
				
		
				
	}

}
