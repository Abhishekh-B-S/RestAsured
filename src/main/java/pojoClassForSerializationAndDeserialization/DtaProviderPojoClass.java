package pojoClassForSerializationAndDeserialization;

public class DtaProviderPojoClass {

	String createdBy;
	String projectName;
	String Status;
	String teamSize;
	public DtaProviderPojoClass(String createdBy, String projectName, String status, String teamSize) {
		super();
		this.createdBy = createdBy;
		this.projectName = projectName;
		Status = status;
		this.teamSize = teamSize;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public String getTeamSize() {
		return teamSize;
	}
	public void setTeamSize(String teamSize) {
		this.teamSize = teamSize;
	}
	

}
