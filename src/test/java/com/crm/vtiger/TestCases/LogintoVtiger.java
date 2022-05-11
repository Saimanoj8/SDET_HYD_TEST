package com.crm.vtiger.TestCases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.vtiger.Generic.ExcelUtility;

public class LogintoVtiger {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http:localhost:8888");
		
		ExcelUtility ed= new ExcelUtility();
		String un=ed.readdatafromexcel("Sheet2", 0, 0);
		
		int
		pwd=ed.readNumericdatafromExcel("Sheet2", 1, 0);
		System.out.println(un);
		System.out.println(pwd);
		int intval=(int) Math.round(pwd);
		System.out.println(intval);
		
		String pwd2= Integer.toString(intval);
		System.out.println(pwd2);
		
//		int pwd=ed.readNumericdatafromExcel("sheet2", 1, 0);
//		String password= Integer.toString(pwd);
		
		
		driver.findElement(By.name("user_name")).sendKeys(un);
		driver.findElement(By.name("user_password")).sendKeys(pwd2);
	}
	
}
