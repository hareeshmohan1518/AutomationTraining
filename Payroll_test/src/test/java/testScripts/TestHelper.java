package testScripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class TestHelper {
  public  WebDriver driver;
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hareesh\\Desktop\\Chrome\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.qabible.in/payrollapp/site/login");
	  		
  }
  @AfterMethod
  public void afterMethod() {
  }

}
