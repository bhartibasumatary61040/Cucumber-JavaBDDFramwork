package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
	 protected WebDriver driver;
	
	private By txt_username = By.id("username");
	
	private By txt_password = By.id("password");
	
	private By btn_login = By.id("submit");
	
	private By btn_logot = By.xpath("//a[text()=\"Log out\"]");
	
	
	public LoginPage(WebDriver driver) {
		
		this.driver = driver;
		
		if(!driver.getTitle().equals("Test Login")) {
			throw new IllegalStateException("This is not login page. The current page is"
					+driver.getCurrentUrl());
		}
		
		
	}
	public void enterUsername(String username) {
		
		driver.findElement(txt_username).sendKeys(username);
	}
	
	public void enterPassword(String password) {
		driver.findElement(txt_password).sendKeys(password);
		
	}
	
	public void clicklogin() {
		
		driver.findElement(btn_login).click();
	}
	
	public void checkLogoutIsDisplayed() {
		driver.findElement(btn_logot).isDisplayed();
	}
	
	public void loginValidUser(String username, String password) {
		
		driver.findElement(txt_username).sendKeys("username");
		driver.findElement(txt_password).sendKeys(password);
		driver.findElement(btn_login).click();
		
		
	}

}
