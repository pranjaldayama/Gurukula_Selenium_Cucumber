package stepDefinitions;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import pageObjects.GurukulaBranchPage;
import pageObjects.GurukulaStaffPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
public class CreateNewStaffStepDef {
	WebDriver  driver;
	CommonFunctions comFuncs;
	
	@When("^clicks on create new staff button and enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void clicks_on_create_new_staff_button_and_enters_and(String arg1, String arg2) throws Throwable {
		GurukulaStaffPage staffPg = new GurukulaStaffPage(CommonFunctions.driver);
		//Create Staff
		staffPg.createNewStaff(arg1, arg2);
	}

	@Then("^user should be able to create a new staff with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_should_be_able_to_create_a_new_staff_with_and(String arg1, String arg2) throws Throwable {
		//Verify if the Staff has been created
		GurukulaStaffPage staffPg = new GurukulaStaffPage(CommonFunctions.driver);
		staffPg.verifyStaffCreation(arg1, arg2);
		//Close Browser
		 CommonFunctions comFuncs = new CommonFunctions(CommonFunctions.driver);
		 comFuncs.closeBrowser();
	}

}
