package generic_Utility;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class RestBAseClass  {
	
	public DB_Utility dlib=new DB_Utility();
	public Excel_Utility elib=new Excel_Utility();
	public Java_Utility jlib=new Java_Utility();
	public RestAssuredLibrary rlib=new RestAssuredLibrary();
	public RequestSpecification requestSpec;
	public ResponseSpecification respSpec;
	
	
	
	@BeforeClass
	public void bsConfig() throws Throwable
	{
		dlib.connectToDBRest();
		
		RequestSpecBuilder builder=new RequestSpecBuilder();
		builder.setBaseUri("http://localhost");
		builder.setPort(8084);
		builder.setContentType(ContentType.JSON);
		requestSpec=builder.build();
	}
	
	@AfterClass
	public void  asConfif() throws Throwable
	{
		dlib.closeConnectionDB();
//		ResponseSpecBuilder resp=new ResponseSpecBuilder();
//		respSpec=resp.expectContentType(ContentType.JSON).build();
		
	}

}
