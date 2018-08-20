package stepDefinitions;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import pageObjects.GurukulaBranchPage;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
public class DeleteBranchStepDef {
	WebDriver  driver;
	CommonFunctions comFuncs;
	
	@Then("^user should be able to delete a new branch created")
	public void user_should_be_able_to_delete_a_new_branch_created()throws Throwable {
		GurukulaBranchPage branchPg = new GurukulaBranchPage(CommonFunctions.driver);
		branchPg.deleteBranch();
		//Close Browser
		 CommonFunctions comFuncs = new CommonFunctions(CommonFunctions.driver);
		 comFuncs.closeBrowser();
	}

}
