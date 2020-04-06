package utilities;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Pageutility {

	public static void handlesleep(int time){
		try
		{
			Thread.sleep(time);
			
		}
		catch(InterruptedException e)
		{
			//TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static WebElement isElementLoaded(WebDriver driver,WebElement elementToBeLoaded,int Time)
	{
		WebDriverWait wait=new WebDriverWait(driver,Time);
		WebElement element=wait.until(ExpectedConditions.visibilityOf(elementToBeLoaded));
		return element;
	}
	
	public static WebElement waitforElementTobeClickable(WebDriver driver,WebElement elementToBeLoaded,int Time)
	{
		WebDriverWait wait=new WebDriverWait(driver,Time);
		WebElement element=wait.until(ExpectedConditions.elementToBeClickable(elementToBeLoaded));
		return element;
	}
	
	

}
