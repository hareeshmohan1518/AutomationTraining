package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchClientpage {
	
	WebDriver driver;
	public SearchClientpage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath="//input[@id='clientsearch-client_name']")
	WebElement clientName;
	@FindBy(xpath="//input[@id='clientsearch-id']")
	WebElement clientId;
	@FindBy(xpath="//button[@type='submit']")
	WebElement search;
	
	
	public void Searchclient(String clientname,String clientid)
	{
		clientName.sendKeys(clientname);
		clientId.sendKeys(clientid);
		search.click();
		
	}
	
	
	

}
