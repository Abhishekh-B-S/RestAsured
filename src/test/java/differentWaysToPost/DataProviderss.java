package differentWaysToPost;





import static io.restassured.RestAssured.*;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import pojoClassForSerializationAndDeserialization.AddProject;



public class DataProviderss {
	
	

	@Test(dataProvider = "Abhishek")
	public void addProject(String createdBy,String projectName, String status, int teamSize)
	{
		AddProject ap=new AddProject(createdBy, projectName,status,teamSize);
		
		given()
		.body(ap)
		.contentType(ContentType.JSON)
		.when()
		.post("http://localhost:8084/addProject")
		.then()
		.assertThat()
		.statusCode(201)
		.log().all();
		
	}
		@DataProvider(name="Abhishek")
		public Object[][] dataProvideProject()	
		{
			Object[][] obj=new Object[2][4];
					
			obj[0][0]="Abhi";
			obj[0][1]="TYSS88";
			obj[0][2]="Created";
			obj[0][3]=5;
			obj[1][0]="Manoj";
			obj[1][1]="RMG-5";
			obj[1][2]="Created";
			obj[1][3]=12;
			
			return obj;
			
		}
		
		
	}



	

