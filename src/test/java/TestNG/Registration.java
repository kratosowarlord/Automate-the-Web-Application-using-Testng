package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Registration {
 
	String driverPath="E:\\CoreJava_Phase5\\Phase5\\chromedriver.exe";
	public WebDriver driver;
	
  @Test
  public void f() {
	  driver.manage().window().maximize();
		driver.get("https://www.browserstack.com/users/sign_up");
		
		driver.findElement(By.id("user_full_name")).sendKeys("Karan");
		
		driver.findElement(By.id("user_email_login")).sendKeys("demotesti345@gmail.com");
		
		driver.findElement(By.id("user_password")).sendKeys("demo@12345");
		
		driver.findElement(By.id("tnc_checkbox")).click();
		
		driver.findElement(By.name("commit")).click();
		
		driver.findElement(By.name("commit")).click();
		
//		driver.findElement(By.id("user_submit")).click();
			
		
	
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "E:\\CoreJava_Phase5\\Phase5\\chromedriver.exe");
	  
	  driver = new ChromeDriver();
  
  }
	
	 @AfterTest
	  public void afterTest() {
		 System.out.println("After test is running");
	  }
}
