package com.crm.vtiger.TestCases;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import com.vtiger.Generic.ExcelUtility;

public class AddingData {

	public static void main(String[] args) throws Throwable, InvalidFormatException, IOException, Throwable
	{
		//ArrayList<integer>al= new ArrayList<integer>();
		 
		ExcelUtility ed=new ExcelUtility();
		Map<String, Integer> hp=new HashMap<String, Integer>();
		for(int i=0; i<=ed.getLastRow("sheet1");i++)
		{
			String names= ed.readdatafromexcel("sheet1", i, 0);
					int value2 = ed.readNumericdatafromExcel("sheet1", i, 1);
					
					hp.put(names, null);
			
		}
		System.out.println(hp);
		
	}
}
