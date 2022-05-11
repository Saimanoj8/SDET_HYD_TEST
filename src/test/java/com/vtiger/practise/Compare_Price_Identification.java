package com.vtiger.practise;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Compare_Price_Identification {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		WebElement flip=driver.findElement(By.name("q"));
		flip.click();
		flip.sendKeys("REDMI Note 10 Pro (Dark Night, 128GB)(6 GB RAM)");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	    String	Flip_Price = driver.findElement(By.xpath("(//div[@class='_30jeq3 _1_WHN1'])[1]")).getText();		
     	System.out.println(Flip_Price);
	    driver.quit();
	
	    WebDriverManager.chromedriver().setup();
		WebDriver driver1=new ChromeDriver();
		driver1.get("https://www.amazon.com/");
//		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver1.manage().window().maximize();
		driver1.findElement(By.xpath("(//span[@class='a-button-inner'])[1]")).click();
	WebElement	search =driver1.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	search.click();
	search.sendKeys("REDMI Note 10 Pro (Dark Night, 128GB)(6 GB RAM)");
	Thread.sleep(2000);
	driver1.findElement(By.id("nav-search-submit-button")).click();
	
	

	
	

	}

}
