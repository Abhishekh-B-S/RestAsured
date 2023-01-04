package serializationAndDeserialization;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import pojoClassForSerializationAndDeserialization.EmpDetails;

public class DeserializationOfEmpDetails {
	
	@Test
	public void deserializationOfEmpDetails() throws JsonParseException, JsonMappingException, IOException {
	
		//Create the object for object mapper
		
		ObjectMapper ob=new ObjectMapper();
		
		//read the value from object mapper
		
		EmpDetails emp=ob.readValue(new File("./empdetails.json"), EmpDetails.class);
		
		//Fetch the value from the mapper
		System.out.println(emp.getEmpname());
		System.out.println(emp.getPhone());
	}
	



}
