package com.vtiger.practise;


import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkart_AddCart {

	public static void main(String[] args) throws Throwable
	{
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	WebElement flip=driver.findElement(By.name("q"));
	flip.click();
	flip.sendKeys("iphone 13 pro max");
	driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	driver.findElement(By.xpath("//div[text()='APPLE iPhone 13 Pro Max (Alpine Green, 512 GB)']")).click();
	Set<String> text=driver.getWindowHandles();
	for(String wh:text)
	{
		String title=driver.switchTo().window(wh).getTitle();
		if(title.contains("APPLE"))
		{
			String adcart= driver.findElement(By.xpath("//div[text()='₹1,59,900']")).getText();
			System.out.println(adcart);
			break;
		}
	}
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
	
	
	WebElement element1 = driver.findElement(By.xpath("//button[text()='+']"));
    Point loc = element1.getLocation();
	
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("window.scrollBy"+loc);
	driver.findElement(By.xpath("(//button[@class='_23FHuj'])[2]")).click();
	Thread.sleep(2000);
	String cost =driver.findElement(By.xpath("//span[@class='_2-ut7f _1WpvJ7']")).getText();
	System.out.println("Total cost is"+" "+cost);
	
	
	
	}
	
}
