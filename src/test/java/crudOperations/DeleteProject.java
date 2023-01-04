package crudOperations;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DeleteProject {
	
	@Test
	public void deletePro()
	{
		Response resp = RestAssured.delete("http://localhost:8084/projects/TY_PROJ_1810");
		
		System.out.println(resp.getStatusCode());
		
		resp.then().assertThat().statusCode(204);
		
	}

}
