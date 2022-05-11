package dtt.practise;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class ReaddatafromExcel {

	@Test
	public void readdatafromexcel() throws Throwable
	{
		FileInputStream fis=new FileInputStream("./data./Commondata.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
	    Sheet s=wb.getSheet("Sheet1");
	    Row R=s.getRow(0);
	    Cell c=R.getCell(1);
	    String S=c.getStringCellValue();
	    System.out.println(S);
	    
	}
	
}
