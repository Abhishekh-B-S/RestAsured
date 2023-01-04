package pojoClassForSerializationAndDeserialization;

public class EmpDetails {
	
	String Empname;
	String EmpId;
	String Email;
	String Phone;
	String Adress;
	
	public EmpDetails(String empname, String empId, String email, String phone, String adress) {
		super();
		Empname = empname;
		EmpId = empId;
		Email = email;
		Phone = phone;
		Adress = adress;
	}
	public String getEmpname() {
		return Empname;
	}
	
	// to fetch details in deserialization we have to create a empty constructor
	public EmpDetails()
	{
		
	}
	public void setEmpname(String empname) {
		Empname = empname;
	}
	public String getEmpId() {
		return EmpId;
	}
	public void setEmpId(String empId) {
		EmpId = empId;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	public String getAdress() {
		return Adress;
	}
	public void setAdress(String adress) {
		Adress = adress;
	}
	
	

}
