package stepDefinitions;
import java.util.List;

import org.openqa.selenium.WebDriver;

import com.cucumber.listener.Reporter;

import cucumber.TestContext;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import managers.FileReaderManager;
import pageObjects.LogInPage;
import  selenium.Wait;
import testData.LoginDetails;


public class LogIn_TestStepDefinition {
	 TestContext testContext;
	 LogInPage loginPage;
	WebDriver driver=null;
	
	
	public LogIn_TestStepDefinition(TestContext context) {
		//for webdrivermanager and pageobjectmanager
		testContext = context;
		loginPage = testContext.getPageObjectManager().getLogInPage();		
	  }

	
	
	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
		//Wait.untilPageLoadComplete(driver);
		System.out.println("User Successfully Home Page........!!!");
		//Reporter.addStepLog("User Successfully Home Page........!!!");
	}

	@When("^User Navigate to LogIn Page$")
	public void user_Navigate_to_LogIn_Page() throws Throwable {
	   System.out.println("Navigating to home Page...............!!!");
	   //Reporter.addStepLog("User Successfully  Navigate to LogIn Page........!!!");
	}

	
	@When("^User enters UserName and Password$")
	public void user_enters_UserName_and_Password() throws Throwable {	    
		//loginPage.LoginIn_HomePage("Admin", "admin123");
		List<LoginDetails> logindetails = FileReaderManager.getInstance().getJsonReader().getLoginDetailsData();
		for(LoginDetails login : logindetails) {	 
			String uname=login.username;
			String pwd=login.password;
			loginPage.LoginIn_HomePage(uname, pwd);
		
		}
		//Reporter.addStepLog("User Successfully enters UserName and Password.......!!!");
		
	}


	@Then("^Message displayed Login Successfully$")
	public void message_displayed_Login_Successfully() throws Throwable {
		  System.out.println("Closing loginPage..............!!!");
		 // Reporter.addStepLog(" Login Successfully........!!!");
	}

	

}


