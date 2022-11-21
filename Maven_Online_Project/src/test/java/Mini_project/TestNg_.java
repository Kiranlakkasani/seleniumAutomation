package Mini_project;

import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestNg_ {
  
	public static WebDriver driver;

  @Test(priority = 0)
  public void Test1() {
	  
	  WebDriverManager.chromedriver();
	  driver=new ChromeDriver();  
  }
  @Test(priority = 1)
  public void linktext() {
	  driver.get("https://testpages.herokuapp.com/basic_html_form.html");
  }
  
  @Test(priority = 2)
  public void userName() {
	 WebElement user=driver.findElement(By.xpath("//*[@name='username']"));
	 user.sendKeys("kiran_chowdary");
  }
   
  @Test(priority = 3)
  public void Test2() {
	  System.out.println(" program was completed");
  }
}

