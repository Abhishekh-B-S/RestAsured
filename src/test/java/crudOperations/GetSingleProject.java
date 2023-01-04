package crudOperations;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class GetSingleProject {
	
	@Test
	public void getTheProjectdetails()
	{
		
		
		Response response = RestAssured.get("http://localhost:8084/projects/TY_PROJ_863");
		
		System.out.println(response.getStatusCode());
		
		response.then().contentType(ContentType.JSON);
		response.then().log().all();
		response.then().assertThat().statusCode(200);
		
		
		
	}

}
