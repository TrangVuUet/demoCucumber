package cucumberID.demoCucumber;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {

	WebDriver driver;

	@Given("^User navigates to Facebook$")
	public void user_navigates_to_Facebook() throws Throwable {
		System.setProperty("webdriver.gecko.driver", "C:/Program Files/geckodriver/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.navigate().to("https://www.facebook.com/");
		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@When("^I enter username as firstUser$")
	public void i_enter_username_as_firstUser() throws Throwable {
		driver.findElement(By.id("email")).sendKeys("firstUser");
	}

	@When("^I enter username as secondUser$")
	public void i_enter_username_as_secondUser() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("email")).sendKeys("secondUser");
	}

	@When("^I enter password as password$")
	public void i_enter_password_as_password() throws Throwable {
		driver.findElement(By.id("pass")).sendKeys("password");
	}

	@When("^I click Login button$")
	public void i_click_Login_button() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath(".//input[@type='submit']")).click();
	}

	@Then("^Login should fail$")
	public void login_should_fail() throws Throwable {
		System.out.println("Login failed");
		driver.quit();
	}

	@Then("^Relogin option should be available$")
	public void relogin_option_should_be_available() throws Throwable {
		if (driver.getCurrentUrl().equalsIgnoreCase("https://www.facebook.com/login.php?login_attempt=1&lwv=110")) {
			System.out.println("Test Pass");
		} else {
			System.out.println("Test Failed");
		}
		// driver.quit();
	}

}
