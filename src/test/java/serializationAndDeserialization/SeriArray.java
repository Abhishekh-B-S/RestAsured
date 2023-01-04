package serializationAndDeserialization;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import pojoClassForSerializationAndDeserialization.EmpDetailsArray;

public class SeriArray {
	
	@Test
	public void getDetailsofEmp() throws Throwable, Throwable, Throwable
	{
		String [] email= {"abhi@com","arun@com","asd@com"};
		long [] number= {78452325232l,4522152146255l,6256425625622l};
		EmpDetailsArray emp=new EmpDetailsArray("Abhishek","TY319",email,number,"Bangalore");
		
		ObjectMapper obj=new ObjectMapper();
		obj.writeValue(new File("./emparray.json"), emp);
	}

}
