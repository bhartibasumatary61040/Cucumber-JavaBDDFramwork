package pagefactory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class LoginPage_PF {
	
	
	@FindBy(id="username")
	@CacheLookup
	WebElement txt_username;
	
	@FindBy(id="password")
	WebElement txt_password;
	
	@FindBy(id="submit")
	WebElement txt_login;

	WebDriver driver;
	
	public LoginPage_PF(WebDriver driver) {
		this.driver = driver;
		
		
		//AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 30);
		PageFactory.initElements( new AjaxElementLocatorFactory(driver, 30), this);
		
	}
	public void enterUsername(String username ) {
		txt_username.sendKeys();
	}
	
	public void enterPassword(String password) {
		
		txt_password.sendKeys(password);
	}
	
	public void clickOnLogin() {
		txt_login.click();
	}

}
