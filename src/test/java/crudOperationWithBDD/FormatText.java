package crudOperationWithBDD;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import generic_Utility.Java_Utility;
import io.restassured.http.ContentType;

public class FormatText {
	
	@Test
	public void add() {
		Java_Utility rn=new Java_Utility();
		int rnn = rn.getRandomNumber();
	JSONObject json=new JSONObject();
	json.put("createdBy", "Manoj");
	json.put("projectName", "BBDHRM"+rnn);
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
//			.contentType(ContentType.XML)
		.statusCode(500)
		//.statusLine("HTTP/1.1 500 ")
			.log().all();
			
			
		
	}

}
