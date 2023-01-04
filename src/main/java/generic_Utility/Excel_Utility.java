package generic_Utility;



import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Test;
import org.testng.annotations.DataProvider;



public class Excel_Utility {
	
	
	
	@Test
	@DataProvider
	public Object[][] readMultipleData(String Sheetname) throws Throwable
	{
		FileInputStream fi = new FileInputStream("./src/test/resources/TestData.xlsx");
		Workbook wb = WorkbookFactory.create(fi);
		Sheet sh = wb.getSheet(Sheetname);
		int lastrow = sh.getLastRowNum()+1;
		int lastcell = sh.getRow(0).getLastCellNum();
		Object[][] obj=new Object[lastrow][lastcell];
		for (int i=0; i<lastrow; i++)
		{
			for(int j=0; j<lastcell; j++)
			{
				obj[i][j]=sh.getRow(i).getCell(j).getStringCellValue();
			}
		}
		return obj;
		

}
}
