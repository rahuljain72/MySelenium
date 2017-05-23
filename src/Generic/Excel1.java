package Generic;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel1 {
	
	public static String getCellData(String path,String sheet,int r,int c) 
	{
		String v="";
	try {
		Workbook wb=WorkbookFactory.create(new File("F:\\Selenium\\Oxygen\\TMO\\data"));
		v=wb.getSheet(sheet).getRow(r).getCell(c).toString();
		}
	catch(Exception e) {
		
	}
	return v;
	}
	public static int getRowCount(String path,String sheet) {
		int rc=0;
		try {
			Workbook wb=WorkbookFactory.create(new File("F:\\Selenium\\Oxygen\\TMO\\data"));
			rc=wb.getSheet(sheet).getLastRowNum();
			
		}
		catch(Exception e) {
			
		}
		return rc;
	}
	

}
