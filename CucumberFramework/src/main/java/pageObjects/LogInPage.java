package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import dataProvider.ConfigFileReader;
import testData.LoginDetails;

public class LogInPage
{
WebDriver driver;
ConfigFileReader configFileReader;
	public LogInPage(WebDriver driver) {
		 PageFactory.initElements(driver, this);
		 configFileReader= new ConfigFileReader();
	}
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"txtUsername\"]") 
	 private WebElement txtbx_username;
	 
	 @FindBy(how = How.XPATH, using = "//*[@id=\"txtPassword\"]") 
	 private WebElement txtbx_pwd;
	 
	 @FindBy(how = How.XPATH, using = "//*[@id=\"btnLogin\"]") 
	 private WebElement bt_login;
	 
	 
	 public void LoginIn_HomePage(String username, String password) {
		 
		
		 try {
			txtbx_username.sendKeys(username);
			Thread.sleep(2000);
			txtbx_pwd.sendKeys(password);
			Thread.sleep(2000);
			bt_login.click();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 
	 }
	
	

}
