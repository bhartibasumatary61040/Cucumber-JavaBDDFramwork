//package StepDefinitions;
//
//import java.time.Duration;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.en.*;
//
//public class LoginDemoSteps {
//	   WebDriver driver = null;
//	    
//		@Given("browser is open")
//		public void browser_is_open() {
//			System.out.println("Inside Step- browser is open ");
//			
////			String projectPath=System.getProperty("user.dir");
////			System.out.println("Project path is : " +projectPath);
//		 driver = new ChromeDriver();
//		 
//		 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
//		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//	
//
//	    
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//		driver.navigate().to("https://practicetestautomation.com/practice-test-login/");
//	   
//	}
//
//	@When("^user enters (.*) and (.*)$")
//	public void user_enters_username_and_password(String username, String password) throws InterruptedException {
//		
//	   driver.findElement(By.id("username")).sendKeys("username");
//	   driver.findElement(By.id("password")).sendKeys(password);
//	     Thread.sleep(2000);  }
//	
//	@And("user clicks on login")
//	public void user_clicks_on_login() {
//		driver.findElement(By.id("submit")).click();
//	   
//	}
//
//	@Then("user is navigated to the home page")
//	public void user_is_navigated_to_the_home_page() {
//		driver.findElement(By.xpath("//a[text()=\"Log out\"]")).isDisplayed();
//		
//		
//		driver.close();
//		driver.quit();
//	  
//	}
//
//}
