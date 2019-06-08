package webdriverMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginTest {
	
	WebDriver driver=null;
	
	@BeforeSuite
	public void setUp(){
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\main\\resources\\executables\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	}
	
	
	@Test
	public void gmailLogin() throws InterruptedException{		
		
		driver.get("https://gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys("gurukohliopp@gmail.com");
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Mskohli@2");
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		Thread.sleep(3000);
		//Testing Changes Again
			
	} 	
	
	@AfterSuite
	public void tearDown()
	{
		driver.quit();
	}

}
