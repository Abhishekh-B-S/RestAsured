package generic_Utility;

public interface I_Path {
	
	

	String dbURL="jdbc:mysql://localhost:3307/projects";
	
	String dbUN="root";
	
	String dbPWD="root";
	
	
	
	
	// End Points
	String addProject="/addProject";
	String getallProject="/projects";
	String getsingleproject="/projects/";
	String UpdateProject="/projects/";
	String deleteproject="/projects/";

}
