package usingBaseClassCRUDOperations;

import org.apache.commons.lang3.RandomStringUtils;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import generic_Utility.I_Path;
import generic_Utility.RestBAseClass;
import static io.restassured.RestAssured.*;

public class PostRequest extends RestBAseClass {
	
	
	@Test
	public void addProject() {
		String rn = RandomStringUtils.randomAlphabetic(2);
		JSONObject obj=new JSONObject();
		obj.put("createdBy", "Abhi");
		obj.put("projectName","BaseClass"+rn);
		obj.put("status", "On-Going");
		obj.put("teamSize", 5);
		
		given()
		.spec(requestSpec)
		.body(obj)
		.when()
		.post(I_Path.addProject)
		
		.then()
		.statusCode(201)
		.log().all();
		
		
		
	}

}
