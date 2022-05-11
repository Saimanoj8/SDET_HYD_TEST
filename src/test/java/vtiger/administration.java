package vtiger;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class administration {

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
        driver.findElement(By.xpath("//a[text()='edit']")).click();
        Thread.sleep(2000);
        WebElement wb=driver.findElement(By.xpath("//input[@name='accountname']"));
        wb.click();
        wb.clear();
        Thread.sleep(2000);
        wb.sendKeys("Zenq Technologies");
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])[1]")).click();
        Thread.sleep(2000);
        String val=driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
        
//        String val=driver.findElement(By.xpath("//span[text()='[ ACC1 ] Zenq Technologies -  Organization Information']")).getText();
               System.out.println(val);
               if(val.contains("Zenq"))
               {
            	   System.out.println("verified sucessfully");
               }
               else
               {
            	   System.out.println("not verified sucessfully");
               }
        WebElement ele=driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
        
        Actions ac=new Actions(driver);
        ac.moveToElement(ele).perform();
        Thread.sleep(2000);
 //       driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
   //     Thread.sleep(2000);
   //     driver.quit();

	}

}
