package RequestChaining;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import pojoClassForSerializationAndDeserialization.AddProject;

public class RequestChainingPostToDelete {
	
	
	@Test
	public void addRequest()
	{
		String rn = RandomStringUtils.randomAlphabetic(2);
		baseURI= "http://localhost";
		port = 8084;
		AddProject add=new AddProject("NameIsAi","Capturing"+rn,"On-going", 1);
		Response res=
		given()
		.body(add)
		.contentType(ContentType.JSON)
		.when()
		.post("/addProject");
		String id = res.jsonPath().get("projectId");
		AddProject add1=new AddProject("Abhish", "Captured"+rn, "Processing", 5);
		given()
		.pathParam("projectId", id)
		.body(add1)
		.contentType(ContentType.JSON)
		.when()
		.put("/projects/{projectId}")
		.then()
		.log()
		.all();		
	}

}
