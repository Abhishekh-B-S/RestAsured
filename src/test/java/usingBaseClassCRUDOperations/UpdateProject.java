package usingBaseClassCRUDOperations;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;

import generic_Utility.I_Path;
import generic_Utility.RestBAseClass;

import static io.restassured.RestAssured.*;
import pojoClassForSerializationAndDeserialization.AddProject;

public class UpdateProject extends RestBAseClass {
	
	@Test
	public void put_Method() {
		
		String rn = RandomStringUtils.randomAlphabetic(2);
		AddProject add=new AddProject("Manoj", "MotoNEo"+rn,"On Going", 1);
		
		given()
		.spec(requestSpec)
		.body(add)
		.pathParam("pid","TY_PROJ_3009")
		.when()
		.put(I_Path.UpdateProject+"{pid}")
		.then().statusCode(200)
		.log().all();
		
		
		
	}

}
