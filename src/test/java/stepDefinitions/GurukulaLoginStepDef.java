package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import pageObjects.GurukulaLoginPage;

@RunWith(Cucumber.class)
public class GurukulaLoginStepDef {
	
	public static WebDriver  driver;
	
	@Given("^user is on gurukula welcome page$")
	public void user_is_on_gurukula_welcome_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Pranjal\\Desktop\\chrome_driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://192.168.178.26:8080");
	}

	@When("^user navigates to login page$")
	public void user_navigates_to_login_page() throws Throwable {
		GurukulaLoginPage grklogin = new GurukulaLoginPage(driver);
		grklogin.clickOn_LoginLink();
	}
	
	@When("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		GurukulaLoginPage grklogin = new GurukulaLoginPage(driver);
		grklogin.enter_Username(arg1);
		grklogin.enter_Password(arg2);
	}

	@When("^user clicks on Authenticate button$")
	public void user_clicks_on_Authenticate_button() throws Throwable {
		GurukulaLoginPage grklogin = new GurukulaLoginPage(driver);
		grklogin.clickOn_Authenticate();
	}

	@Then("^success message is displayed$")
	public void success_message_is_displayed() throws Throwable {
		GurukulaLoginPage grklogin = new GurukulaLoginPage(driver);
		grklogin.verify_WelcomeMessage();
		//Close the browser
		driver.close();
	}
	
	@Given("^user click on logout link$")
	public void user_click_on_logout_link() throws Throwable {
		GurukulaLoginPage grklogin = new GurukulaLoginPage(driver);
		grklogin.clickOn_Account();
		grklogin.clickOn_LogOut();
	}

	@Then("^user is logged out of the system$")
	public void user_is_logged_out_of_the_system() throws Throwable {
		//Verify if user is logged out of the system
		
		//Close the browser
		driver.close();
	}

	
	
	
	}

