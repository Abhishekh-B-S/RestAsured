package differentWaysToPost;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class CreateProjectUsingJsonFile {
	
	
	@Test
	public void addProject()
	{
		File fi = new File("./src/test/resources/New Text Document.json");
		
		given()
		.body(fi)
		.contentType(ContentType.JSON)
		.when()
		.post("http://localhost:8084/addProject")
		.then()
		.assertThat()
		.statusCode(201)
		.log().all();
		
		
		
	}

}
