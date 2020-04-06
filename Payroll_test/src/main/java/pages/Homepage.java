package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Pageutility;

public class Homepage extends Pageutility{
	WebDriver driver;
	public Homepage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	
	//@FindBy(xpath="//a[@href='/payrollapp/site/index']")
	//WebElement home;
	@FindBy(xpath="//h1[text()='Payroll Application']")
	WebElement text;
	
	

	
	
	public String getTextOfWelcomeText()
	{
		Pageutility.handlesleep(3000);
	
		String s=text.getText();
		System.out.println(s);
	/*	String a="PAYROLL APPLICATION";
		System.out.println(a);*/
		Pageutility.waitforElementTobeClickable(driver, text, 3000);
		return s;
		
		
	
	
		  
		
		
		
	}
	
	
	
	

}
