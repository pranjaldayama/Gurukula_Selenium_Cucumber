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
	WebDriver  driver;
	CommonFunctions comFuncs;
	
	@Given("^user is on gurukula welcome page$")
	public void user_is_on_gurukula_welcome_page() throws Throwable {
        CommonFunctions comFuncs = new CommonFunctions(CommonFunctions.driver);
		comFuncs.openBrowser();
	}

	@When("^user navigates to login page$")
	public void user_navigates_to_login_page() throws Throwable {
		GurukulaLoginPage grklogin = new GurukulaLoginPage(CommonFunctions.driver);
		grklogin.clickOn_LoginLink();
	}
	
	@When("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String arg1, String arg2) throws Throwable {
		GurukulaLoginPage grklogin = new GurukulaLoginPage(CommonFunctions.driver);
		grklogin.enter_Username(arg1);
		grklogin.enter_Password(arg2);
	}
	
	@When("^user clicks on Authenticate button$")
	public void user_clicks_on_Authenticate_button() throws Throwable {
		GurukulaLoginPage grklogin = new GurukulaLoginPage(CommonFunctions.driver);
		grklogin.clickOn_Authenticate();
	}

	@Then("^success or failure message should be displayed and user should be able to successfully logged out of the application$")
	public void success_or_failure_message_should_be_displayed_and_user_should_be_able_to_successfully_logged_out_of_the_application() throws Throwable {
		CommonFunctions comFuncs = new CommonFunctions(CommonFunctions.driver);
		GurukulaLoginPage grklogin = new GurukulaLoginPage(CommonFunctions.driver);
		grklogin.verify_LoginSuccessFailure();
		comFuncs.closeBrowser();
		
	}


	}

