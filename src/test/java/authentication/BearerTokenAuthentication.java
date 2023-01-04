package authentication;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class BearerTokenAuthentication {
	
	
	@Test
	public void loginToAppWithToken()
	{
		JSONObject js=new JSONObject();
		js.put("name","SampleRepoFromRestApi1");
		given()
		.body(js)
		.contentType(ContentType.JSON)
		.auth().oauth2("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")
		.when()
		.post("https://api.github.com/user/repos")
		.then()
		.log().all();
		given()
		.when()
		.get("https://api.github.com/users/Abhishekh-B-S/repos")
		.then()
		.log().all();
		
	}

}
