package differentWaysToPost;

import org.apache.commons.lang3.RandomStringUtils;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.HashMap;

public class CreatedProjectUsingHashMap {
	
	@Test
	public void addProject()
	{
		String rnn = RandomStringUtils.randomAlphabetic(2);
		HashMap hp=new HashMap();
		
		hp.put("createdBy", "Manoj");
		hp.put("projectName", "BBDHRM"+rnn);
		hp.put("status","on-going");
		hp.put("teamSize", 10);
		
		baseURI="http://localhost";
		port=8084;
		
		given()
		.body(hp)
		.contentType(ContentType.JSON)
		.when()
		.post("/addProject")
		.then()
		.assertThat()
		.statusCode(201)
		.log().all();
	}

}
