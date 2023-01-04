package crudOperationWithBDD;

import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import com.aventstack.extentreports.gherkin.model.Then;

import generic_Utility.Java_Utility;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class AddProject {
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
		.contentType(ContentType.JSON)
		
	.when()
		.post("/addProject")
	
	.then()
		.assertThat()
			.contentType(ContentType.JSON)
			.statusCode(201)
			.statusLine("HTTP/1.1 201 ")
			.body("msg", Matchers.equalToIgnoringCase("Successfully Added"))
			.log().body();
			
			
		
	}

}
