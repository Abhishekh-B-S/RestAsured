package crudOperations;

import java.util.concurrent.TimeUnit;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import generic_Utility.Java_Utility;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class AddProjectTest {
	
	@Test
	public void addProjectPostRequest() {
		
		//create json body using json simple
		Java_Utility ran=new Java_Utility();
		int rn = ran.getRandomNumber();
		JSONObject jsobj=new JSONObject();
		jsobj.put("createdBy", "Abhishek TY316");
		jsobj.put("projectName", "RmgHrm"+rn);
		jsobj.put("status","on-going");
		jsobj.put("teamSize", 10);
		
		//pre-request fro the script
		RequestSpecification reqSpec = RestAssured.given();
		reqSpec.body(jsobj);
		reqSpec.contentType(ContentType.JSON);
		//Action
		Response response = reqSpec.post("http://localhost:8084/addProject");
		//validation
		System.out.println(response.getContentType());
		System.out.println(response.getStatusCode());
		System.out.println(response.getSessionId());
		System.out.println(response.getBody());
		System.out.println(response.getStatusLine());
		System.out.println(response.jsonPath());
		System.out.println(response.xmlPath());
		System.out.println(response.htmlPath());
		response.prettyPrint();
		response.prettyPeek();
		
		
		response.then().log().all();
		
		
		
		response.then().assertThat().contentType(ContentType.JSON);
		
		
		
		
		
		
	}

}
