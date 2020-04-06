package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Pageutility;

public class ClientsDetailsVerification {
WebDriver driver;

public ClientsDetailsVerification(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath="//*[@id=\"w1\"]/table/thead/tr/th")
	List<WebElement>c;
	@FindBy(xpath="//*[@id=\"w1\"]/table/tbody/tr")
	List<WebElement>r;
	
	public void listOfClientDetails()
	{
		int column=c.size();
		System.out.println(column);      
		Pageutility.handlesleep(3000);
		int row=r.size();
		System.out.println(row);
		
		for(int i=0;i<row;i++)
		{
			List<WebElement>currentrow=r.get(i).findElements(By.tagName("td"));
			
			for(int j=0;j<column;j++)
			{
				String text=currentrow.get(j).getText();
				System.out.println(text);
			}
			System.out.println();
			System.out.println("------------------------------------");
		}
	}

}




