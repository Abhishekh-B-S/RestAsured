package generic_Utility;

import io.restassured.response.Response;

public class RestAssuredLibrary {
	
	
	
	public String getJsonData(Response res, String path) {
		
		String data = res.jsonPath().get(path);
		return data;
	}

}
