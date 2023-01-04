package validation;

import static io.restassured.RestAssured.*;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class StatusLineValidation {
	
	@Test
	public void validationStatusLine()
	{
		Response res= 
				given()
				.get("http://localhost:8084/projects");
		String line = res.getStatusLine();
		int code = res.getStatusCode();
		
		Assert.assertEquals(line, "HTTP/1.1 200 ");
		Assert.assertEquals(code, 200);
				
	}

}
