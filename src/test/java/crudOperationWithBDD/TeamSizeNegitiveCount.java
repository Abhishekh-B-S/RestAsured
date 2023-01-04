package crudOperationWithBDD;


import static io.restassured.RestAssured.*;

import org.apache.commons.lang3.RandomStringUtils;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class TeamSizeNegitiveCount {
	
	@Test
	public void createdByEmpty()
	{
		String al = RandomStringUtils.randomAlphabetic(2);
		JSONObject json=new JSONObject();
		json.put("createdBy", "Manoj");
		json.put("projectName", "HMu"+al);
		json.put("status","on-going");
		json.put("teamSize", -10);
		
		
		baseURI = "http://localhost";
		port = 8084;
		
		  given()
			.body(json)
			.contentType(ContentType.JSON)
			
		.when()
			.post("/addProject")
		
		.then()
		
		
			.assertThat()
			
				.contentType(ContentType.JSON)
				//.statusCode(201)
				//.statusLine("HTTP/1.1 201 ")
				
				.log().all();

}
}
