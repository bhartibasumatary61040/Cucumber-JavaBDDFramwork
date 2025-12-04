package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import pagefactory.HomePage_PF;
import pagefactory.LoginPage_PF;

public class LoginDemoSteps_PF {
	   WebDriver driver = null;
	   LoginPage_PF login;
	   HomePage_PF home;
	   
		@Given("browser is open")
		public void browser_is_open() {
			System.out.println("  =====I ma indise LoginDemoSteps_PF ========");
			System.out.println("Inside Step- browser is open ");
			

		 driver = new ChromeDriver();
		 
		 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	

	    
	}

	@And("user is on login page")
	public void user_is_on_login_page() {
		driver.navigate().to("https://practicetestautomation.com/practice-test-login/");
	   
	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username, String password) throws InterruptedException {
		
		login = new LoginPage_PF(driver);
		login.enterUsername(username);
		login.enterPassword(password);
		
	     Thread.sleep(2000);  }
	
	@And("user clicks on login")
	public void user_clicks_on_login() {
		login.clickOnLogin();
		
	   
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
	
		home.checkLogoutIsDisplayed();
		
		
		driver.close();
		driver.quit();
	  
	}

}
