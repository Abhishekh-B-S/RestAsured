package crudOperationWithBDD;

import static io.restassured.RestAssured.*;


import org.hamcrest.Matchers;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import generic_Utility.Java_Utility;
import io.restassured.http.ContentType;

public class DeleteMethodWrongID {
	
	
	@Test
	public void add() { 		
	
	baseURI = "http://localhost";
	port = 8084;
	
	 
		
	when()
		.delete("/projects/TY_PROJ_204")
	
	.then()
		.assertThat()
//			.contentType(ContentType.JSON)
//			.statusCode(204)
//			.statusLine("HTTP/1.1 204 ")
			
			.log().body();
			
			
		// 500 no value present 
	}

}
