package validation;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import junit.framework.Assert;

public class StaticBodyValidation {

	
	@Test
	
	public void StaticBValidation()
	
	{
		
		Response res=
				when()
				.get("http://localhost:8084/projects");
				String actid=res.jsonPath().get("[2].projectId");
				Assert.assertEquals(actid, "TY_PROJ_1003");
				
	}
}
