package practicePackage;

import java.io.File;

import org.testng.annotations.Test;



import static io.restassured.RestAssured.*;

public class Multipart {
	
	@Test
	public void addFile()
	
	{
		File file=new File("C:\\Users\\ABHISHEK\\Desktop\\TY\\HRM\\New folder\\Screenshot (1).png");
		
		given()
		.multiPart("file",file,"multipart/form-data")
		.post("https://the-internet.herokuapp.com/upload")
		.thenReturn()
		.then()
		.log().all();
		
		
		
		
	}

}
