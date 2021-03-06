package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import pageObjects.GurukulaBranchPage;
import pageObjects.GurukulaLoginPage;

@RunWith(Cucumber.class)
public class NavigateVerifyBranchPgStepDef {
	
	public static WebDriver  driver;
	
	@Given("^user is logged in to the application with username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void user_is_logged_in_to_the_application_with_username_and_password(String arg1, String arg2) throws Throwable {
		CommonFunctions comFuncs = new CommonFunctions(CommonFunctions.driver);
		comFuncs.openBrowser();
        GurukulaLoginPage grklogin = new GurukulaLoginPage(CommonFunctions.driver);
		grklogin.clickOn_LoginLink();
		grklogin.enter_Username(arg1);
		grklogin.enter_Password(arg2);
		grklogin.clickOn_Authenticate();
	}
	
	@When("^user clicks on Branch Link$")
	public void user_clicks_on_Branch_Link() throws Throwable {
		GurukulaBranchPage branchPg = new GurukulaBranchPage(CommonFunctions.driver);
		branchPg.clickOn_Entities();
		branchPg.clickOn_Branch();
	}

	@Then("^user is able to navigate to Branch Page and verify all the elements are present on Branch Page$")
	public void user_is_able_to_navigate_to_Branch_Page_and_verify_all_the_elements_are_present_on_Branch_Page() throws Throwable {
		CommonFunctions comFuncs = new CommonFunctions(CommonFunctions.driver);
		GurukulaBranchPage branchPg = new GurukulaBranchPage(CommonFunctions.driver);
		branchPg.verify_elements_BranchPage();
		comFuncs.closeBrowser();
	}

}
