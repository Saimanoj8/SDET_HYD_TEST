package vtiger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Industrytype {

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
	        driver.findElement(By.xpath("//a[@href='index.php?module=Accounts&action=index']")).click();
	        driver.findElement(By.xpath("(//a[text()='Zenq Technologies'])[2]")).click();
           driver.findElement(By.xpath("(//input[@name='Edit'])[1]")).click();
           WebElement ddar=driver.findElement(By.name("industry"));
           ddar.click();
           Select sal=new Select(ddar);
           sal.selectByIndex(9);
           Thread.sleep(5000);
           if(sal.isMultiple())
           {
        	   System.out.println("it is multiple dropdown");
           }
           else
           {
        	   System.out.println("it is a single select dropdown");
           }
           driver.findElement(By.name("button")).click();
           Thread.sleep(2000);
           driver.quit();

	}

}
