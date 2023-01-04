package validation;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.util.concurrent.TimeUnit;

public class ResponseTimeValidation {
	
	
	@Test
	public void timeValidation()
	{
		
				when()
				.get("http://localhost:8084/projects")
				.then()
				.assertThat()
				.time(Matchers.lessThan(2000L),TimeUnit.MILLISECONDS);
		
				
				
	}

}
