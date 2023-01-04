package end_To_End;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import generic_Utility.I_Path;
import generic_Utility.RestBAseClass;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import pojoClassForSerializationAndDeserialization.AddProject;

public class Post_Method extends RestBAseClass {
	
	
	
	@Test
	public void addProj() throws Throwable
	{
	
		String rn = RandomStringUtils.randomAlphabetic(2);
		AddProject pojo=new AddProject("Abhi","Project1232"+rn,"Completed", 5);
		Response res = given()
				.spec(requestSpec)
		.body(pojo)
		.when()
		.post(I_Path.addProject);
		
		String expData = rlib.getJsonData(res, "projectId");
		System.out.println(expData);
		
		String query = "select * from project";
		String actData = dlib.executeQueryAndgetData(query, 1, expData);
		
		System.out.println(actData);
		Assert.assertEquals(actData, expData);
		res.then().log().all();
		
		
	}

}
