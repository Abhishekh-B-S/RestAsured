package validation;

import org.apache.commons.lang3.RandomStringUtils;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class ResponseHeaderValidation {
	@Test
	public void responseHeadValidation()
	{
		String rn = RandomStringUtils.randomAlphabetic(2);
		JSONObject js=new JSONObject();
		js.put("createdBy", "Abhi");
		js.put("projectName", "Viv"+rn);
		js.put("status", "completed");
		js.put("teamSize", 5);
		
		given()
			.body(js)
			.contentType(ContentType.JSON)
		.when()
			.post("http://localhost:8084/addProject")
		.then()
		.assertThat()
			.statusCode(201)
			.contentType(ContentType.JSON)
			.log().all()
			.statusLine("HTTP/1.1 201 ");
		
		
		
			
	}

}
