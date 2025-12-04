package StepsForHooks;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.*;

public class HooksDemoSteps {
	
	WebDriver driver = null;
	
	@Before("@smoke")
	public void browserSetup() {
		
		System.out.println("=== I am insite browser setup==========");
		driver = new ChromeDriver();
		
		
		 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
    	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	 driver.manage().window().maximize();
	}
	@Before(order=0)
	public void setup2() {
		System.out.println("    I am inside setup2 \n");
	}
	
	@After(order=1)
	public void teardown() {
		System.out.println(" I am inside teardown");
		driver.close();
		driver.quit();
	}
	
	@After(order=2)
	public void teardown2() {
		System.out.println(" I am inside teardown 2 ");
	}
	@BeforeStep
	 public  void beforeStep() {
		 System.out.println(" I am inside before steps");
	 }
	@AfterStep
	 public void afterSteps() {
		 System.out.println(" I am inside after steps");
	 }
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
	   
	}
	@When("user enters valid username and password")
	public void user_enters_valid_username_and_password() {
	  
	}
	@And("clicks on login button")
	public void clicks_on_login_button() {
	   
	}
	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
	 
	}

}
