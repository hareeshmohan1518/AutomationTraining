package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Pageutility;

public class Resetclientspage {
	WebDriver driver;
	public Resetclientspage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath="//button[@type='reset']")
	WebElement reset;
	
	public void resetclientssearch()
	{
		
		Pageutility.isElementLoaded(driver, reset, 3000);
		//Pageutility.handlesleep(3000);
		reset.click();
	}
	

}
