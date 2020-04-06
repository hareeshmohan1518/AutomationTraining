package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.Pageutility;

public class ViewAndEditPage {
	
	WebDriver driver;
	public ViewAndEditPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	
	
	@FindBy(xpath="//a[@href='/payrollapp/client/view?id=2']")
	WebElement view;
	
	@FindBy(xpath="//a[@href='/payrollapp/client/update?id=2']")
	WebElement edit;
	
	@FindBy(xpath="//select[@name='Client[invoice_delivery_method]']")
	WebElement invoiceDeliveryMethod ;

	
	@FindBy(xpath="//button[@type='submit']")
	WebElement save;
	
	
	
	public void viewClientDetails()
	{
		view.click();
		//Pageutility.waitforElementTobeClickable(driver, view, 3000);
		Pageutility.handlesleep(5000);
		driver.navigate().back();
		Pageutility.handlesleep(2000);
		//edit.click();
		//Pageutility.waitforElementTobeClickable(driver, edit, 3000);
		edit.click();
		//Pageutility.waitforElementTobeClickable(driver, edit, 3000);
		Pageutility.handlesleep(2000);
		Select branch1=new Select(invoiceDeliveryMethod);
		
		branch1.selectByVisibleText("Electronic");
		
		Pageutility.waitforElementTobeClickable(driver, invoiceDeliveryMethod, 2000);
		
		save.click();
		
	}
/*	public void editClientDetails()
	{
		edit.click();
		Pageutility.waitforElementTobeClickable(driver, edit, 3000);
	
	   // Select branch1=new Select(InvoiceDeliveryMethod);
		
	    //Pageutility.waitforElementTobeClickable(driver, InvoiceDeliveryMethod, 3000);
		
	    //branch1.selectByValue("Electronic");
		//Pageutility.isElementLoaded(driver,InvoiceDeliveryMethod, 2000);
		//save.click();
		
	}*/
	

}
