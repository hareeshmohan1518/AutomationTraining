package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Pageutility;

public class Clientspage extends Pageutility {
	WebDriver driver;
	
	public Clientspage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	
	@FindBy(xpath="//a[text()='Clients']")
	WebElement clientButton;
	
	@FindBy(xpath="//a[@href='/payrollapp/client/index']")
	WebElement clientsTab;

	
	
	
	
	
	public void ClickClientsLinkEnabled()
	{
		Pageutility.handlesleep(3000);
		clientButton.click();
	}
	public boolean isCheckClientslinkDisplayed()
	{
		Pageutility.waitforElementTobeClickable(driver, clientButton, 3000);
		/* String a=clientsTab.getText();
		 System.out.println(a);*/
	/*	if(clientsTab.isEnabled())
		{
			String b="Yes";
			System.out.println("Clients tab is opened&verified succesfully");
		}
		else
		{
			String b="No";
			System.out.println("Not verified");
		}
		*/
		return clientButton.isDisplayed();
		
	}
	
	
	
	
	
	
	
}
