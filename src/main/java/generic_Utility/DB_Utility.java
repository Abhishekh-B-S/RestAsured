package generic_Utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;



public class DB_Utility {
	/**
	 * @author ABHISHEK
	 * This Method is used to connect to the data base
	 */
	Connection con=null;
	public void connectToDBRest() throws Throwable
	{
		Driver driver=new Driver();
		DriverManager.registerDriver(driver);
		 con = DriverManager.getConnection(I_Path.dbURL,I_Path.dbUN,I_Path.dbPWD);		
	}
	/**This method is used to Execute and validate query
	 * @author ABHISHEK
	 * @param query
	 * @param columnIndex
	 * @param expdata
	 * @param data
	 * @return
	 * @throws Throwable
	 */
	public String executeQueryAndgetData(String query, int columnIndex, String expdata) throws Throwable {
		
		
		boolean flag=false;
		ResultSet result=con.createStatement().executeQuery(query);
		while(result.next())
		{
		
			if (result.getString(columnIndex).equalsIgnoreCase(expdata))
			{
				flag=true;
				break;
			}
		}
		if(flag)
		{
			System.out.println("-------->data verified");
			return expdata;
		}
		else
		{
			System.out.println("------->data not verified");
			return"";
		}
	}
	/**
	 * This method is used to disconnect from the data base
	 * @author ABHISHEK
	 * @throws Throwable
	 */
	public void closeConnectionDB() throws Throwable
	{
		con.close();
	}
	
	
}
