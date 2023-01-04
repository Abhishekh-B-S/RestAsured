package practicePackage;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import com.google.common.io.Files;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ResponseInJSON {
	
	@Test
	public void byteArray() throws IOException {
		
		JSONObject js=new JSONObject();
		js.put("username", "admin");
		js.put("password", "password123");
		
		RequestSpecification req = RestAssured.given();
		req.contentType(ContentType.JSON);
		req.baseUri("https://restful-booker.herokuapp.com/auth");
		req.body(js);
		
		Response resp = req.post();
		byte[] asbytearray = resp.asByteArray();
		
		File targetforbyte=new File("src/main/resources/targetFileByte.json");
		Files.write(asbytearray, targetforbyte);
		
	}
	
	@Test
	public void asStringMethod() throws IOException {
		
		JSONObject js=new JSONObject();
		js.put("username", "admin");
		js.put("password", "password123");
		RequestSpecification req = RestAssured.given();
		req.contentType(ContentType.JSON);
		req.baseUri("https://restful-booker.herokuapp.com/auth");
		req.body(js);
		
		Response resp = req.post();
		
		String typeStr = resp.asString();
		byte[] asByte = typeStr.getBytes();
		File bytearray=new File("src/main/resources/targetFileString.json");
		Files.write(asByte, bytearray);
		
		
	}
	@Test
	public void asInputStream() throws IOException {
		
		JSONObject js=new JSONObject();
		js.put("username", "admin");
		js.put("password", "password123");
		RequestSpecification req = RestAssured.given();
		req.contentType(ContentType.JSON);
		req.baseUri("https://restful-booker.herokuapp.com/auth");
		req.body(js);
		
		Response resp = req.post();
		
		InputStream typeStream = resp.asInputStream();
		byte[] reapbyte=new byte[typeStream.available()];
		typeStream.read(reapbyte);
		File bytearray=new File("src/main/resources/targetFileStream.json");
		Files.write(reapbyte, bytearray);
	

}
}
