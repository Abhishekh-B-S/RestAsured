package serializationAndDeserialization;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import pojoClassForSerializationAndDeserialization.EmpDetailsWithObj;

public class SpouseDeserialization {
	
	@Test
	public void getempandspdetails() throws JsonParseException, JsonProcessingException, Throwable
	{
		ObjectMapper obj=new ObjectMapper();
		EmpDetailsWithObj emp = obj.readValue(new File("./empdetailswithspouse.json"), EmpDetailsWithObj.class);
		
		System.out.println(emp.getEmpname());
		System.out.println(emp.getEmpSpouseDetails());
		System.out.println(emp.getClass());
	}

}
