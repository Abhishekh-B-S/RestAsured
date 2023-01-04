package authentication;

import static  io.restassured.RestAssured.*;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import pojoClassForSerializationAndDeserialization.AddProject;

public class BasicAuthPr {
	
	@Test
	public void authPreemptive()
	{
		String rn = RandomStringUtils.randomAlphabetic(2);
		AddProject ad=new AddProject("Authentication", "Digestive"+rn, "On-gooing", 5);
		given()
		.body(ad).contentType(ContentType.JSON)
		.auth().preemptive().basic("rmgyantra","rmgy@9999")
		.when()
		.post("http://localhost:8084/addProject")
		.then()
		.log().all();
	}

}
