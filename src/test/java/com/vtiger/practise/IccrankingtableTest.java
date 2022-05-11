package com.vtiger.practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class IccrankingtableTest {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.icc-cricket.com/");
		driver.findElement(By.xpath("//a[@class=\"mobile-banner__close js-mobile-banner-close\"]")).click();
		Actions a=new Actions(driver);
		
		WebElement add = driver.findElement(By.xpath("(//*[name()='svg' and @class=\"icon\"])[15]"));
		a.moveToElement(add).perform();
		driver.findElement(By.xpath("(//a[text()='Team Rankings'])[1]")).click();
	//	WebElement add2 = d.findElement(By.xpath("//table[@class='table']/tbody/tr[last()]"));
		List<WebElement> add2 = driver.findElements(By.xpath("//table[@class='table']/tbody/tr[*]"));
//		Point loc = add2.getLocation();
//		System.out.println(add2.getText());
//		System.out.println(loc);
//		JavascriptExecutor jse=(JavascriptExecutor)d;
//		jse.executeScript("window.scrollBy"+loc);
		for(int i=0;i<add2.size();i++)
		{
			System.out.println(add2.get(i).getText());
		}
		

	}

}
