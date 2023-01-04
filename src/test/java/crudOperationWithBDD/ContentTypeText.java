package crudOperationWithBDD;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class ContentTypeText {
	
	@Test
	public void createdByEmpty()
	{
		JSONObject json=new JSONObject();
		json.put("CreatedBy", "qqqq");
		json.put("projectName", "RmgHrm09");
		json.put("status","on-going");
		json.put("teamSize", 10);
		
		
		baseURI = "http://localhost";
		port = 8084;
		
		  given()
			.body(json)
			.contentType(ContentType.TEXT)
			
		.when()
			.post("/addProject")
		
		.then()
			.assertThat()
				.contentType(ContentType.TEXT)
				//.statusCode(201)
				//.statusLine("HTTP/1.1 201 ")
				.log().all();
				
	}

}
