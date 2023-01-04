package crudOperationWithBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class UpdateProjectdetails {
	
	@Test
	public void updateDetails()
	{
		
		JSONObject json=new JSONObject();
		json.put("createdBy", "ArunKumar");
		json.put("projectName", "BDDHRM!");
		json.put("status","completed");
		json.put("teamSize", 15);
		 baseURI="http://localhost";
		port=8084;
		
		given()
		.body(json)
		.contentType(ContentType.JSON)
		.when()
		.put("/projects/TY_PROJ_1815")
		.then()
		.assertThat().contentType(ContentType.JSON).statusCode(200)
		.log().all();
		
		
		
	}

}
