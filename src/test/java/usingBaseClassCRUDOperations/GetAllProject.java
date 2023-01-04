package usingBaseClassCRUDOperations;

import org.testng.annotations.Test;

import generic_Utility.I_Path;
import generic_Utility.RestBAseClass;
import static io.restassured.RestAssured.*;
import pojoClassForSerializationAndDeserialization.AddProject;

public class GetAllProject extends RestBAseClass {
	
	@Test
	public void getAllProjectFrom() {
		
		given()
		.spec(requestSpec)
		.when()
		.get(I_Path.getallProject)
		.then().statusCode(200)
		.log().all();
	}

}
