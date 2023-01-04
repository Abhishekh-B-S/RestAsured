package crudOperationWithBDD;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class MissingEndPoint {
	@Test

	public void urlEndpoint() {
	JSONObject json=new JSONObject();
	json.put("createdBy", "Abhi");
	json.put("projectName", "RmgHrm0882");
	json.put("status","on-going");
	json.put("teamSize", 10);
	
	
	baseURI = "http://localhost";
	port = 8084;
	
	  given()
		.body(json)
		.contentType(ContentType.JSON)
		
	.when()
		.post("/addProjects")
	
	.then()
		.assertThat()
			.contentType(ContentType.JSON)
			.statusCode(404)
			.statusLine("HTTP/1.1 404 ")
			.log().all();
			

}
}
