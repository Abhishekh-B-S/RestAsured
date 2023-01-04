package crudOperations;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class UpdateProject {
	
	
	@Test
	public void updateProjectdetails() {
		
		JSONObject jo=new JSONObject();
		jo.put("createdBy", "Mohan");
		jo.put("projectName", "HRMRMG");
		jo.put("ststus", "completed");
		jo.put("teamSize", 11);
		
		RequestSpecification req = RestAssured.given();
		req.body(jo);
		req.contentType(ContentType.JSON);
		Response resp = req.put("http://localhost:8084/projects/TY_PROJ_863");
		System.out.println(resp.getContentType());
		System.out.println(resp.getStatusCode());
		System.out.println(resp.getStatusLine());
		System.out.println(resp.getBody());
		
		System.out.println(resp.xmlPath());
		
		resp.then().log().all();
	}

}
