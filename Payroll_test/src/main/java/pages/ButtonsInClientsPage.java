package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ButtonsInClientsPage {
	WebDriver driver;

	public ButtonsInClientsPage(WebDriver driver)
		{
			this.driver = driver;
			PageFactory.initElements(driver, this);

		}
	@FindBy(xpath="//button[@type='submit']")
	WebElement search;
	@FindBy(xpath="//button[@type='reset']")
	WebElement reset;
	
	public boolean isCheckSearchButtonisDisplayed()
	{
		return search.isDisplayed();
	}
	public boolean isCheckResetButtonisDisplayed()
	{
		return reset.isDisplayed();
	}
	

}
