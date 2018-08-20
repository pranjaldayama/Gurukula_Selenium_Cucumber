package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import pageObjects.GurukulaBranchPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
public class CreateBranchTextFieldValidationsStepDef {
	WebDriver  driver;
	CommonFunctions comFuncs;
	
	@Given("^user creates new branch with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_creates_new_branch_with_and(String arg1, String arg2) throws Throwable {
		GurukulaBranchPage branchPg = new GurukulaBranchPage(CommonFunctions.driver);
		//Click on Create New Branch Button
		branchPg.clickOnCreateNewBranch();
		//Create New Branch
		branchPg.txbBox_Name.sendKeys(arg1);
		branchPg.txbBox_Code.sendKeys(arg2);
		CommonFunctions.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
	
	}

	@Then("^the text field validations should be in place as per the \"([^\"]*)\"$")
	public void the_text_field_validations_should_be_in_place_as_per_the(String arg1) throws Throwable {
		GurukulaBranchPage branchPg = new GurukulaBranchPage(CommonFunctions.driver);
		//Call the function to verify the text field validations
		CommonFunctions.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		branchPg.verifyTextFieldValdiations(arg1);
		//Close Browser
		 CommonFunctions comFuncs = new CommonFunctions(CommonFunctions.driver);
		 comFuncs.closeBrowser();
	}


}
