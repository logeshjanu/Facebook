package stepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginFacebook {
	WebDriver driver;
	@Given("Launch the Browser")
	public void launch_the_browser() {
	   WebDriverManager.chromedriver().setup();
	   driver = new ChromeDriver();
	}

	@Given("Open the Facebook Application")
	public void open_the_facebook_application() {
	  driver.get("https://www.facebook.com/");
	}

	@When("Enter the valid username and password")
	public void enter_the_valid_username_and_password() {
	  
	  
	}
	@When("Enter the valid {string} and {string}")
	public void enter_the_valid_and(String user, String pass)
 {
		  WebElement username=driver.findElement(By.id("email"));
		  username.sendKeys(user);
		  WebElement password=driver.findElement(By.id("pass"));
		  password.sendKeys(pass);
		  
	}


	@When("Click the Login button")
	public void click_the_login_button() {
		WebElement login=driver.findElement(By.name("login"));
		  login.click();	}

	@Then("I validate the {string} outcomes")
	public void i_validate_the_outcomes(String msg) {
		System.out.println(msg);
	}


	@Then("Close the Browser")
	public void close_the_browser() {
	  driver.quit();
	}


}
