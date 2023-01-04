package crudOperationWithBDD;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class TeamsizeInStringValue {
	
	@Test
	public void createdByEmpty()
	{
		JSONObject json=new JSONObject();
		json.put("CreatedBy", "Abhi");
		json.put("projectName", "RmgHrm097");
		json.put("status","on-going");
		json.put("teamSize", "Ten");
		
		
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
