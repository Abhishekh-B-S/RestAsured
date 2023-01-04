package authentication;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class Auth2Test {
	
	
	@Test
	public void authAuthentication() {
		
		Response res=
				given()
				.formParam("client_id", "Testing Application01")
				.formParam("client_secret", "5b5817e253d9bce2547174ecf5c07abd")
				.formParam("grant_type", "client_credentials")
				.formParam("redirect_uri", "http://zeno.com")
				.formParam("code", "authorization_code")
			
				
				.when()
				.post("http://coop.apps.symfonycasts.com/token");
		System.out.println(res);
	String token = res.jsonPath().get("access_token");
	System.out.println(token);
	given()
	.auth().oauth2(token)
	.pathParam("USER_ID", 4155)
	.when()
	.post("http://coop.apps.symfonycasts.com/api/{USER_ID}/eggs-count")
	.then().log().all();
	
	when()
	.post("http://coop.apps.symfonycasts.com/token");
	String token1=res.jsonPath().get("access_token");
	System.out.println(token1);
	given()
	.auth().oauth2(token1)
	.pathParam("USER_ID", 4155)
	.when()
	.post("http://coop.apps.symfonycasts.com/api/{USER_ID}/chickens-feed")
	.then().log().all();
	
	
	
	
	
	
	
				
				
	}

}
