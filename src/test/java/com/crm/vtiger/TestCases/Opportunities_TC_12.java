package com.crm.vtiger.TestCases;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Opportunities_TC_12 {

	public static void main(String[] args) throws Throwable {
		 System.setProperty("webdriver.chrome.driver", "F:\\KCSM\\Autotesting\\Drivers\\chromedriver.exe");
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
	        
	       WebElement mov=driver.findElement(By.xpath("//a[text()='Opportunities']"));
	       Actions ac=new Actions(driver);
	       ac.moveToElement(mov).perform();
	       mov.click(); 
	        driver.findElement(By.xpath("//a[text()='Opportunities']")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
	        Thread.sleep(2000);
	        WebElement ele =driver.findElement(By.name("potentialname"));
	        ele.click();
	        ele.sendKeys("Testcase_13");
	        Thread.sleep(2000);
	        driver.findElement(By.name("assigntype")).click();
	        Thread.sleep(1000);
	        driver.findElement(By.xpath("//img[@src='themes/softed/images/select.gif']")).click();
	        Thread.sleep(2000);
	     Set<String> all=driver.getWindowHandles();
	     Iterator<String> iterator=all.iterator();
	        String parentwindow= iterator.next();
	        System.out.println("parent window tile"+" "+driver.getTitle());
	        String childwindow= iterator.next();
	        System.out.println("child window tile"+" "+driver.getTitle());
	        driver.switchTo().window(childwindow);
	       
	        
	        
	   WebElement pop=driver.findElement(By.xpath("//input[@id='search_txt']"));
			   pop.click();
	          driver.findElement(By.xpath("//a[text()='Zenq Technologies']")).click();
	          Thread.sleep(2000);
	          driver.switchTo().window(parentwindow);
		         
	          driver.findElement(By.xpath("//input[@value='T' and @value='T']")).click();
	          Thread.sleep(2000);
	          WebElement dir=driver.findElement(By.name("assigned_group_id"));
	          dir.click();
	          Select sal=new Select(dir);
	          sal.selectByIndex(2);
	          
	          driver.findElement(By.xpath("//input[@class='crmbutton small save']")).click();
	          String tex=driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
	          System.out.println(tex);
	          if(tex.contains("Opportunity"))
	          {
	        	  System.out.println("verified");
	          }
	          else
	          {
	        	  System.out.println("not verified");
	          }
	    //      driver.quit();
	    

	}

}
