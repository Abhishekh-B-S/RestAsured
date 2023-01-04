package pojoClassForSerializationAndDeserialization;

public class EmpDetailsArray {
	
	String Empname;
	String EmpId;
	String[] Email;
	long [] Phone;
	String Adress;
	public EmpDetailsArray(String empname, String empId, String[] email, long[] phone, String adress) {
		super();
		Empname = empname;
		EmpId = empId;
		Email = email;
		Phone = phone;
		Adress = adress;
	}
	
	public EmpDetailsArray()
	{
		
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
	public String[] getEmail() {
		return Email;
	}
	public void setEmail(String[] email) {
		Email = email;
	}
	public long[] getPhone() {
		return Phone;
	}
	public void setPhone(long[] phone) {
		Phone = phone;
	}
	public String getAdress() {
		return Adress;
	}
	public void setAdress(String adress) {
		Adress = adress;
	}
	
	

}
