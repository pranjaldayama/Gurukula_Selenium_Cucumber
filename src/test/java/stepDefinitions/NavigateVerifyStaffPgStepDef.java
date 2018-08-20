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
import pageObjects.GurukulaStaffPage;


@RunWith(Cucumber.class)
public class NavigateVerifyStaffPgStepDef {

	public static WebDriver  driver;
	
	@When("^user clicks on Staff Link$")
	public void user_clicks_on_Staff_Link() throws Throwable {
		CommonFunctions comFuncs = new CommonFunctions(CommonFunctions.driver);
		GurukulaStaffPage staffPg = new GurukulaStaffPage(CommonFunctions.driver);
		staffPg.clickOn_EntitiesStaff();
		staffPg.clickOn_LinkStaff();
	}

	@Then("^user is able to navigate to Staff Page and verify all the elements are present on Staff Page$")
	public void user_is_able_to_navigate_to_Staff_Page_and_verify_all_the_elements_are_present_on_Staff_Page() throws Throwable {
		GurukulaStaffPage staffPg = new GurukulaStaffPage(CommonFunctions.driver);
		CommonFunctions comFuncs = new CommonFunctions(CommonFunctions.driver);
		staffPg.verify_elements_StaffPage();
		comFuncs.closeBrowser();
	}
	
}
