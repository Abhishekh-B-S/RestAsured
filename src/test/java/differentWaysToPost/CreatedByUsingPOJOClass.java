package differentWaysToPost;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import pojoClassForSerializationAndDeserialization.AddProject;

public class CreatedByUsingPOJOClass {
	
	@Test
	public void addProject()
	{
		AddProject add=new AddProject("Abhishekh", "QWERTY", "Planning", 10);
		
		given()
		.body(add)
		.contentType(ContentType.JSON)
		.when()
		.post("http://localhost:8084/addProject")
		.then()
		.assertThat()
		.statusCode(201)
		.contentType(ContentType.JSON)
		.log().all();
		
		
	}

}
