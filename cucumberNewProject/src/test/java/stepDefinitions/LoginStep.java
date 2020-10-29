package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.LoginPage;

public class LoginStep {
	LoginPage lp;
	public WebDriver driver;
	
	@Before
	public void setUp()
	{
		System.out.println("I am inside Before setUp");
		  System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers/chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
	}
	@Given("User launch the browser")
	public void user_launch_the_browser() {
		
	  lp=new LoginPage(driver);
	 
	}

	@When("user open the url {string}")
	public void user_open_the_url(String url) {
	   driver.get(url); 
	   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@When("user pass the username as (.*) and password as (.*)$")
	public void user_pass_the_username_as_and_password_as(String email, String password) throws InterruptedException {
	/*	driver.findElement(By.id("Email")).clear();
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).clear();
		driver.findElement(By.id("Password")).sendKeys(password);*/
		
		
	   lp.setUserName(email);
	   lp.setPassoerd(password);
		Thread.sleep(2000);
	}

	@When("user will click on login button")
	public void user_will_click_on_login_button() {
		//driver.findElement(By.xpath("//input[@type='submit']")).click();
	    lp.clickLoginBtn();
	}

	@Then("user will go to home page")
	public void user_will_go_to_home_page() throws InterruptedException {
		//driver.findElement(By.linkText("Logout")).click();
	    lp.clcikLogout();
	    Thread.sleep(5000);
	}
	
	@Then("Close browser")
	public void closeBrowser()
	{		
		driver.close();		
	}
	@After
	public void tearDown()
	{
		driver.quit();
		System.out.println("I am inside aftr ");	
	}

}
