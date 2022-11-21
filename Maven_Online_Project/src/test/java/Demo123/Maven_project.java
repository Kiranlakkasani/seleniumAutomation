package Demo123;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Maven_project {
	
	public static WebDriver driver;
	
	@BeforeTest
	public void  setUp () {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
	}
		@Test (priority = 1)
		public void test1() throws InterruptedException {
			driver.get("https://www.google.com/");
			Thread.sleep(3000);
		}
		@Test(priority = 2)
		public void test2() {
			driver.navigate().to("https://www.facebook.com/");
			driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']")).sendKeys("kiran_chowdary");
		}
	   @SuppressWarnings("unlikely-arg-type")
	@Test(priority = 3)
	   public void test3() throws InterruptedException {
		   
		  
	  	 driver.switchTo().newWindow(WindowType.TAB);
			driver.navigate().to("https://monster.com/");
			
			String parant = driver.getWindowHandle();
			System.out.println(parant);
			
			driver.findElement(By.xpath("//a[@class='semi-bold reg-btn block uprcse']")).click();
			Thread.sleep(5000);
		driver.findElement(By.id("googleSignIn")).click();
		
		Set<String>allWindows=driver.getWindowHandles();
			System.out.println(allWindows.size());   
			for (String str : allWindows) {
				System.out.println(str);
				if(!parant.equals(allWindows)){
					driver.switchTo().window(str);
				
					
					
					
				}
			
			}
			
			driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf'and@name='identifier']")).sendKeys("123");
			
	   }
	   
	   @AfterTest
	public void tearDown() {
		driver.quit();
		}
	}


	
	
	


