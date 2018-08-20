package stepDefinitions;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import dataProvider.ConfigFileReader;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import pageObjects.GurukulaBranchPage;
import pageObjects.GurukulaLoginPage;

@RunWith(Cucumber.class)
public class CreateNewBranchStepDef {
WebDriver  driver;
CommonFunctions comFuncs;

	@When("^clicks on create new Branch button and enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void clicks_on_create_new_Branch_button_and_enters_and(String arg1, String arg2) throws Throwable {
		GurukulaBranchPage branchPg = new GurukulaBranchPage(CommonFunctions.driver);
		//Click on Create New Branch Button
		branchPg.clickOnCreateNewBranch();
		//Create New Branch
		branchPg.createNewBranch(arg1, arg2);
	}

	@Then("^user should be able to create a new Branch with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_should_be_able_to_create_a_new_Branch_with_and(String arg1, String arg2) throws Throwable {
		GurukulaBranchPage branchPg = new GurukulaBranchPage(CommonFunctions.driver);
		//Verify the branch creation
		branchPg.verifyBranchCreation(arg1,arg2);
		//Close Browser
		 CommonFunctions comFuncs = new CommonFunctions(CommonFunctions.driver);
		 comFuncs.closeBrowser();
	}
}
