package testScripts;


import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pages.ButtonsInClientsPage;
import pages.ClientsDetailsVerification;
import pages.ClientsPageSearchFieldsVerification;

import pages.Clientspage;
import pages.Homepage;
import pages.Loginpage;
import pages.LogoutAndSettings;
import pages.Resetclientspage;
import pages.SearchClientpage;
import pages.ViewAndEditPage;
import utilities.Pageutility;

public class RegressionTest extends TestHelper{
  //@Test
  public void verifyValidLogin() {
	  Loginpage login=new Loginpage(driver);
	  login.login("hareesh1518","1q2w3e4r");
	  
	  //Assertion
  }
  
//@Test
  public void verifyHomepageLoaded()
  {
	  Loginpage login=new Loginpage(driver);                    
	  login.login("hareesh1518","1q2w3e4r");     
	  Homepage home=new Homepage(driver);              
	 // dashboard.getTextOfWelcomeText();
	  Assert.assertEquals(home.getTextOfWelcomeText(),"PAYROLL APPLICATION");
	 // System.out.println("HomePage verified succesfully");

  }
  //@Test
  public void verifyClickOnSettingsAndValidLogout()
  {
	  Loginpage login=new Loginpage(driver);
	  login.login("hareesh1518","1q2w3e4r");                               // Two diff classes neede one for settings and one for logout
	  LogoutAndSettings verify=new  LogoutAndSettings(driver);
	  verify.clickonSettings();
	  Assert.assertTrue( verify.isCheckSettingsLinkDisplayed());
	  verify.verifyLogout();
	  
  }
  
 @Test
  public void verifySearchFieldsOfClientspage()
  {
	  Loginpage login=new Loginpage(driver);
	  login.login("hareesh1518","1q2w3e4r");
	  
	  Clientspage clients=new Clientspage(driver);
      clients.ClickClientsLinkEnabled();
      
      ClientsPageSearchFieldsVerification verify=new  ClientsPageSearchFieldsVerification(driver);
      
      Assert.assertTrue( verify.isCheckClientIdSearchFieldisEnabled());
      System.out.println("ClientName field is in the clientspage");
      Assert.assertTrue(verify.isCheckClientNameSearchFieldisEnabled());
      System.out.println("ClientId field is in the clientspage");
      
      
   }
  //@Test
  public void verifyListOfClientsDetails()
  {
	  Loginpage login=new Loginpage(driver);
	  login.login("hareesh1518","1q2w3e4r");
	  
	  Clientspage clients=new Clientspage(driver);
      clients.ClickClientsLinkEnabled();
      
      ClientsDetailsVerification list=new ClientsDetailsVerification(driver);
      list.listOfClientDetails();
      
  }
//@Test
  public void verifyClientsLinkDisplayed()
  {
	  Loginpage login=new Loginpage(driver);
	  login.login("hareesh1518","1q2w3e4r");
	  Clientspage clients=new Clientspage(driver);
      clients.ClickClientsLinkEnabled();
	  Assert.assertTrue(clients.isCheckClientslinkDisplayed());
  
  }
  @Test
  public void verifyButtonsIsDisplayed()
  {
	  Loginpage login=new Loginpage(driver);
	  login.login("hareesh1518","1q2w3e4r");
	  Clientspage clients=new Clientspage(driver);
      clients.ClickClientsLinkEnabled();
      ButtonsInClientsPage buttons=new ButtonsInClientsPage(driver);
      Assert.assertTrue(buttons.isCheckSearchButtonisDisplayed());
      Assert.assertTrue(buttons.isCheckResetButtonisDisplayed());
      }
 // @Test
  public void verifySearchClient()
  {
	  Loginpage login=new Loginpage(driver);
	  login.login("hareesh1518","1q2w3e4r");
	  
	
	  
	  Clientspage clients=new Clientspage(driver);
	  
	  SearchClientpage search=new SearchClientpage(driver);
	  search.Searchclient("Middleton Grove", "3");
  }
  //@Test
  public void verifyResetClientSearch()
  {
	  Loginpage login=new Loginpage(driver);
	  login.login("hareesh1518","1q2w3e4r");
	  
	  Clientspage clients=new Clientspage(driver);
	  clients.ClickClientsLinkEnabled();
	  
	  SearchClientpage search=new SearchClientpage(driver);
	  search.Searchclient("Middleton Grove", "3");
	  
	  Resetclientspage resetsearch=new Resetclientspage(driver);
			  resetsearch.resetclientssearch();
  }
 // @Test
  public void verifyEditAndViewinClientspage()
  {
	  Loginpage login=new Loginpage(driver);
	  login.login("hareesh1518","1q2w3e4r");
	  
	  Clientspage clients=new Clientspage(driver);
	  clients.ClickClientsLinkEnabled();
	  
	  ViewAndEditPage update= new ViewAndEditPage(driver);
	  update.viewClientDetails();
	//  update.editClientDetails();
  }
  
}
