package serializationAndDeserialization;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import pojoClassForSerializationAndDeserialization.EmpDetailsWithObj;
import pojoClassForSerializationAndDeserialization.EmpSpouseDetails;

public class SpouseSerialization {

	@Test
	public void getDetailsEmpAndSpouse() throws JsonGenerationException, Throwable, Throwable
	{
		long [] number= {754832651l, 4223418132564l};
		EmpSpouseDetails emps=new EmpSpouseDetails("Absgnd", "Ass@com", number, "Bangalore");
		EmpDetailsWithObj obj=new EmpDetailsWithObj("Abhishek","TY316", "abhi@com", "7894561232","Bangalore", emps);
		
		ObjectMapper obj1=new ObjectMapper();
		obj1.writeValue(new File("./empdetailswithspouse.json"), obj);
	}
}
