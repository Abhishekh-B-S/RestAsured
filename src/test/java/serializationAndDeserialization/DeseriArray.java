package serializationAndDeserialization;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import pojoClassForSerializationAndDeserialization.EmpDetailsArray;

public class DeseriArray {
	
	@Test
	public void getdetailsEmp() throws JsonParseException, JsonMappingException, IOException
	{
		ObjectMapper obj=new ObjectMapper();
		EmpDetailsArray empdet = obj.readValue(new File("./emparray.json"),EmpDetailsArray.class);
		
		System.out.println(empdet.getEmpname());
		System.out.println(empdet.getAdress());
		
		String[] em = empdet.getEmail();
		for(int i=0; i<em.length; i++) {
			System.out.println(em[i]);
		}
		
		
	}
	

}
