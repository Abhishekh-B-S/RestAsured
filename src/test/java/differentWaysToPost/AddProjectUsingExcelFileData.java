package differentWaysToPost;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import generic_Utility.Excel_Utility;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import pojoClassForSerializationAndDeserialization.DtaProviderPojoClass;

public class AddProjectUsingExcelFileData {
	
	@Test(dataProvider = "testData")
	public void addProject(String createdBy,String projectName,String status, String teamSize)
	{
		DtaProviderPojoClass adex=new DtaProviderPojoClass(createdBy,projectName, status, teamSize);
		given()
		.body(adex)
		.contentType(ContentType.JSON)
		.when()
		.post("http://localhost:8084/addProject")
		.then()
		.assertThat()
		.statusCode(201)
		.log()
		.all();
		
	}
	@DataProvider
	public Object[][] testData() throws Throwable{
		Excel_Utility excel=new Excel_Utility();
		Object[][] ob=excel.readMultipleData("Sheet2");
		return ob;
				
		
		
		
	}
}
