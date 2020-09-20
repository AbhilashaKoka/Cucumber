package managers;

import org.openqa.selenium.WebDriver;

import pageObjects.LogInPage;


//in the case of multiple-step definition files, we will be creating an object of Pages again and again
public class PageObjectManager {
	private WebDriver driver;
	private LogInPage loginPage;
	
	public PageObjectManager(WebDriver driver) {

		this.driver = driver;

	}
	public LogInPage getLogInPage(){

		return (loginPage == null) ? loginPage = new LogInPage(driver) : loginPage;

	}

}
