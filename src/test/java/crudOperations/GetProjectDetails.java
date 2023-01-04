package crudOperations;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetProjectDetails {
	
	@Test
	public void getTheProjectdetails()
	{
		
		
		Response response = RestAssured.get("http://localhost:8084/projects");
		
		System.out.println(response.getStatusCode());
		
		response.then().contentType(ContentType.JSON);
		response.then().log().all();
		
		
	}

}
