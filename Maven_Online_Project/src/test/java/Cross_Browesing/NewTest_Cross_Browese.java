package Cross_Browesing;

import org.testng.annotations.Test;



import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;




public class NewTest_Cross_Browese {
	public  WebDriver driver;
	 
	
	@Parameters("browser")
	
  @Test(priority = 0)
  public void setUp(String browser) {
	switch (browser) {
	case "chrome":
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		break;
		
	case "edge":
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		break;
		
		default:
			System.out.println("user enter the invalid browser");
		break;
	}
	driver.manage().window().maximize();
			
	
		
  }
	@Parameters("url")
	@Test(priority = 1)
	public void openUrl(String url) throws InterruptedException {
		Thread.sleep(3000);
		driver.get(url);
	    driver.findElement(By.name("q")).sendKeys("kiran");
	}
	
  
}
