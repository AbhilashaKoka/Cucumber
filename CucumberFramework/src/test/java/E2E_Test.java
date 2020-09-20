
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.mortbay.jetty.security.Password;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.KeyDownAction;

import com.sun.tools.javac.util.Context.Key;

import ch.qos.logback.core.joran.action.Action;

public class E2E_Test {
	private static WebDriver driver;
	
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\10655479\\eclipse-workspace\\CucumberFramework\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		WebElement username= driver.findElement(By.xpath("//*[@id=\"txtUsername\"]"));
		WebElement password=driver.findElement(By.xpath("//*[@id=\"txtPassword\"]"));
		WebElement login=driver.findElement(By.xpath("//*[@id=\"btnLogin\"]"));
		username.sendKeys("Admin");
		password.sendKeys("admin123");
		login.click();		
		driver.quit();	
			
		}

	}

