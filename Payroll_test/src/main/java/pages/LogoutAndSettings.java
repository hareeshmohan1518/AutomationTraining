package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Pageutility;

public class LogoutAndSettings extends Pageutility {
	
	WebDriver driver;
	
	public LogoutAndSettings(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath="//a[@href='/payrollapp/user']")
	WebElement settings;
	@FindBy(xpath="//a[@class='dropdown-toggle']")
	WebElement user;
	@FindBy(xpath="//a[@class='logout-btn']")
	WebElement logoutbutton;
	
	public void clickonSettings()
	{
		Pageutility.isElementLoaded(driver, settings, 3000);
		settings.click();
		Pageutility.waitforElementTobeClickable(driver, settings, 3000);
	/*	user.click();
		Pageutility.handlesleep(2000);
		logoutbutton.click();*/
		
	}
	public boolean isCheckSettingsLinkDisplayed()
	{
		return settings.isDisplayed();
		  
	}
	public void verifyLogout()
	{
		Pageutility.isElementLoaded(driver, user, 3000);
		user.click();
		Pageutility.waitforElementTobeClickable(driver, user, 3000);
		logoutbutton.click();
		Pageutility.waitforElementTobeClickable(driver, logoutbutton, 2000);
	}

}
