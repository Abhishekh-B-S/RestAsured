package pojoClassForSerializationAndDeserialization;

public class EmpDetailsWithObj {
	

	String Empname;
	String EmpId;
	String Email;
	String Phone;
	String Adress;
	Object EmpSpouseDetails;
	public EmpDetailsWithObj(String empname, String empId, String email, String phone, String adress,
			Object empSpouseDetails) {
		super();
		Empname = empname;
		EmpId = empId;
		Email = email;
		Phone = phone;
		Adress = adress;
		EmpSpouseDetails = empSpouseDetails;
	}
	
	public EmpDetailsWithObj() {
		
	}
	public String getEmpname() {
		return Empname;
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
	public Object getEmpSpouseDetails() {
		return EmpSpouseDetails;
	}
	public void setEmpSpouseDetails(Object empSpouseDetails) {
		EmpSpouseDetails = empSpouseDetails;
	}

	
	
}
