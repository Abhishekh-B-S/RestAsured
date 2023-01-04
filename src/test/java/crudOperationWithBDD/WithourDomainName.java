package crudOperationWithBDD;


import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class WithourDomainName {
	
	@Test

	public void urlEndpoint() {
	JSONObject json=new JSONObject();
	json.put("createdBy", "Abhi");
	json.put("projectName", "RmgHrm0882");
	json.put("status","on-going");
	json.put("teamSize", 10);
	
	
	baseURI = "http://local";
	port = 8084;
	
	
	  given()
		.body(json)
		.contentType(ContentType.JSON)
		
	.when()
		.post("/addProjects")
	
	.then()
		.assertThat()
			//.contentType(ContentType.JSON)
			//.statusCode(401)
			//.statusLine("HTTP/1.1 401 ")
			.log().all();
			

}



}
