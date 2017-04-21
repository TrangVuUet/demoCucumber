package cucumberID.demoCucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class LoginFail {
	
	WebDriver driver;

	@Given("^User go to Facebook$")
	public void user_go_to_Facebook() throws Throwable {
		System.setProperty("webdriver.gecko.driver", "C:/Program Files/geckodriver/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.navigate().to("https://www.facebook.com/");
		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@When("^I enter username as \"([^\"]*)\"$")
	public void i_enter_username_as(String userName) throws Throwable {
		driver.findElement(By.id("email")).sendKeys("userName");
	}

	@When("^I enter password as \"([^\"]*)\"$")
	public void i_enter_password_as(String password) throws Throwable {
		driver.findElement(By.id("pass")).sendKeys("password");
	}
	
	
}
