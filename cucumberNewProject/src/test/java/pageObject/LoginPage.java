package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public WebDriver driver;
	
	public LoginPage(WebDriver rdriver)
	{
		driver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(id="Email")
	WebElement txtEmail;
	
	@FindBy(id="Password")
	WebElement txtPassword;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement btnLogin;
	
	@FindBy(linkText="Logout")
	WebElement lnkLogout;
	
	public void setUserName(String email)
	{
		txtEmail.clear();
		txtEmail.sendKeys(email);
		
	}
	
	public void setPassoerd(String password)
	{
		txtPassword.clear();
		txtPassword.sendKeys(password);
	}
	
	public void clickLoginBtn()
	{
		btnLogin.click();
	}
	public void clcikLogout()
	{
		lnkLogout.click();	
	}

}
