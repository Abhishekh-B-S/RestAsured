package crudOperationWithBDD;


import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class PutWithPartialData {
	
	@Test

	public void urlEndpoint() {
	JSONObject json=new JSONObject();
	json.put("createdBy", "Manoj");
	json.put("projectName", "BBDHRM7820");
	json.put("status","planning");
	json.put("teamSize", 10);
	
	
	baseURI = "http://localhost";
	port =8084;
	
	
	  given()
		.body(json)
		.contentType(ContentType.JSON)
		
	.when()
		.put("/projects/TY_PROJ_2030")
	
	.then()
		.assertThat()
			.contentType(ContentType.JSON)
			.statusCode(200)
			.statusLine("HTTP/1.1 200 ")
			.log().all();
			

}



}
