package serializationAndDeserialization;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import pojoClassForSerializationAndDeserialization.EmpDetails;

public class SerializationOfEmpDetails {

	
	
	@Test
	public void serialization() throws Throwable, Throwable, Throwable
	{
		EmpDetails obj=new EmpDetails("Abhishek","TY316", "Email@Com","9999999999","Bangalore");
		
		//create object for object mapper
		ObjectMapper ob=new ObjectMapper();
		
		//Write the value for json file
		ob.writeValue(new File("./empdetails.json"), obj);
	}
}
