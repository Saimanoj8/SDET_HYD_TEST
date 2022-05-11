package com.crm.vtiger.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.vtiger.Generic.ReaddatafromProperties;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadPropertiesFile_Test {

	public static void main(String[] args) throws Throwable {

		ReaddatafromProperties red=new ReaddatafromProperties();
		WebDriver driver = null;
		String Browse=red.readdatafromproperties("browser");
		if(Browse.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		
		else if(Browse.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		
		else
		{
			System.out.println("no browser is selected");
		}
		driver.get(red.readdatafromproperties("url"));
		driver.findElement(By.name("user_name")).sendKeys(red.readdatafromproperties("username"));
		driver.findElement(By.name("user_password")).sendKeys(red.readdatafromproperties("password"));
		
		{
			
		}
		
	}

}
