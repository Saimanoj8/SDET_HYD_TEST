package com.crm.vtiger.TestCases;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import com.vtiger.Generic.ExcelUtility;

public class ReadData_ExcelUtil {

	public static void main(String[] args) throws Throwable, InvalidFormatException, IOException, Throwable {
		ExcelUtility eut=new ExcelUtility();
		for(int i=0; i<=eut.getLastRow("sheet1");i++)
		{
          int value=eut.readNumericdatafromExcel("Sheet1", i, 1);
        		  String names=eut.readdatafromexcel("Sheet1", i, 0);
        		  if(value>=15000)
        		  {
        			  System.out.println(names);
        		  }
	}

}
}
