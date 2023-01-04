package authentication;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import pojoClassForSerializationAndDeserialization.AddProject;

import static io.restassured.RestAssured.*;

public class BAsicAuthDi {
	@Test
	public void authDigest()
	{
		String rn = RandomStringUtils.randomAlphabetic(2);
		AddProject ad=new AddProject("Authentication", "Digestive"+rn, "On-gooing", 5);
		given()
		.body(ad).contentType(ContentType.JSON)
		.auth().digest("rmgyantra","rmgy@9999")
		.when()
		.post("http://localhost:8084/addProject")
		.then()
		.log().all();
	}

}
