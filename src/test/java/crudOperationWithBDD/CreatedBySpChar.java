package crudOperationWithBDD;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import org.apache.commons.lang3.RandomStringUtils;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class CreatedBySpChar {
	
	@Test
	public void spChar() {
		
		String rn = RandomStringUtils.randomAlphabetic(3);
	JSONObject json=new JSONObject();
	json.put("CreatedBy", "!@#$%");
	json.put("projectName", "RmgHrm"+rn);
	json.put("status","on-going");
	json.put("teamSize", 10);
	
	
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
			.statusCode(201)
			.statusLine("HTTP/1.1 201 ")
			.log().all();
			

}
}