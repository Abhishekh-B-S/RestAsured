package pojoClassForSerializationAndDeserialization;

public class EmpSpouseDetails {
	
	String Empname;
	String Email;
	long[] Phone;
	String Adress;
	public EmpSpouseDetails(String empname, String email, long[] phone, String adress) {
		super();
		Empname = empname;
		Email = email;
		Phone = phone;
		Adress = adress;
	}
	public String getEmpname() {
		return Empname;
	}
	public void setEmpname(String empname) {
		Empname = empname;
	}
	
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
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
