
package OrangeHRM;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgDemo {

	WebDriver driver;
	public static Logger logger=(Logger)LogManager.getLogger(TestNgDemo.class);
	
	@BeforeTest
	public void launchApp()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Soujanya\\eclipse-workspace\\Selenium_Demo\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		logger.info("Browser opened successfully");
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		logger.info("page opened successfully");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	@Test
	public void login()
	{
		driver.findElement(By.name("username")).sendKeys("Admin");
		logger.info("username inserted successfully");
		driver.findElement(By.name("password")).sendKeys("admin123");
		logger.info("password inserted successfully");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		logger.info("login successfully");
		
	}
		
	@Test(enabled = false)
	public void loginStatus()
	{
		String actualUrl=driver.getCurrentUrl();
		String expectedUrl="https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList";
		if(actualUrl.contains(expectedUrl))
		{
			System.out.println("login successful");
		}
		else
		{
			System.out.println("login unsuccessful");
		}
	}
	@Test(enabled = false)
	public void logout()
	{
		driver.findElement(By.xpath("//div[@class='oxd-topbar-header-userarea']/ul/li/span/img")).click();
		driver.findElement(By.linkText("Logout")).click();
	}
	
	@AfterTest
	public void close()
	{
		driver.close();
		logger.info("driver closed");
	}

}
