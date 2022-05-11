package com.vtiger.Generic;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestData {
	@Test
	

	public void getFirstName() throws Throwable
	{
		
		  WebDriverManager.chromedriver().setup();
	        WebDriver driver=new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("http://localhost:8888");
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//input[@id='submitButton']")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//a[text()='Opportunities']")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
	       
	        Thread.sleep(2000);
	        WebElement ele =driver.findElement(By.name("potentialname"));
	        ele.click();
	         
	        /**
	         * @author bharath reddy
	         * Return String FirstName
	         */
	       	       
	        Faker f=new Faker();
	        ele.sendKeys(f.name().fullName());
	       
	        
	       
	        Thread.sleep(2000);
	        driver.findElement(By.name("assigntype")).click();
	        Thread.sleep(1000);
	        driver.findElement(By.xpath("//img[@src='themes/softed/images/select.gif']")).click();
	        Thread.sleep(2000);
	     Set<String> all=driver.getWindowHandles();
	
	     
	     Iterator<String> iterator=all.iterator();
	        String parentwindow= iterator.next();
	        System.out.println("parent window title"+" "+driver.getTitle());
	        String childwindow= iterator.next();
	        System.out.println("child window title"+" "+driver.getTitle());
	        driver.switchTo().window(childwindow);
	       
	   WebElement pop=driver.findElement(By.xpath("//input[@id='search_txt']"));
			   pop.click();
	          driver.findElement(By.xpath("//a[text()='Zenq Technologies']")).click();
	          Thread.sleep(2000);
	  
	          
	          driver.switchTo().window(parentwindow);
	          
	          driver.quit();
	          
        
	}
	}



