package flipcart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipcart1 {
	
	WebDriver driver;
	  @BeforeTest
	  public void open() throws InterruptedException {
		 WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://flipkart.com/");
		  Thread.sleep(3000);
	  }  
		  @Test
		  public void login() throws InterruptedException {
		  
		  Thread.sleep(3000);
		  

			Actions act=new Actions(driver);
			WebElement id=driver.findElement(By.xpath("//INPUT[@CLASS='_2IX_2- VJZDxU']"));
			act.moveToElement(id).build().perform();
			
		  driver.findElement(By.className("_2IX_2- VJZDxU")).sendKeys("palsammahi@gmail.com");
		  driver.findElement(By.xpath("//input[@type='password']")).sendKeys("MAHI123#");
		  driver.findElement(By.className("_2KpZ6l _2HKlqd _3AWRsL")).click();
		  }  
		  
		 @AfterTest
		 public void tearDown() {
			 //driver.close();
		 }
	  }



	

