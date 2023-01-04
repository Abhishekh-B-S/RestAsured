package usingBaseClassCRUDOperations;

import org.testng.annotations.Test;

import generic_Utility.I_Path;
import generic_Utility.RestBAseClass;

import static io.restassured.RestAssured.*;

public class Delete_Project extends RestBAseClass{
	
	@Test
	public void deleteTheProject()
	{
		given()
		.spec(requestSpec)
		.pathParam("pid", "TY_PROJ_3009")
		.when()
		.delete(I_Path.deleteproject+"{pid}")
		.then()
		.statusCode(204).log().all();
	}

}
