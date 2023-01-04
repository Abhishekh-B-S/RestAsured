package usingBaseClassCRUDOperations;

import org.testng.annotations.Test;

import generic_Utility.I_Path;
import generic_Utility.RestBAseClass;
import static io.restassured.RestAssured.*;

public class GetSingleProject extends RestBAseClass {
	
	@Test
	public void getOneParticularProject() {
		
		given()
		.spec(requestSpec)
		.pathParam("pid","TY_PROJ_3009")
		.when()
		.get(I_Path.getsingleproject+"{pid}")		
		.then().statusCode(200)
		.log()
		.all();
		
	}

}
