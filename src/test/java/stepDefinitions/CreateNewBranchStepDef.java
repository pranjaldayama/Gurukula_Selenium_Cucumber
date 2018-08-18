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
//CommonFunctions comFuncs;
//ConfigFileReader configFileReader;
	
	
	@Given("^Login using credentials \"([^\"]*)\" and \"([^\"]*)\"$")
	public void login_using_credentials_and(String arg1, String arg2) throws Throwable {
		//CommonFunctions cm = new CommonFunctions(driver);
		//cm.openBrowser();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Pranjal\\Desktop\\chrome_driver\\chromerdriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://192.168.178.26:8080");
        GurukulaLoginPage grklogin = new GurukulaLoginPage(CommonFunctions.driver);
		grklogin.clickOn_LoginLink();
		grklogin.enter_Username(arg1);
		grklogin.enter_Password(arg2);
		grklogin.clickOn_Authenticate();
	}

	@When("^User navigates to Branch Page and clicks on button Create New Branch$")
	public void user_navigates_to_Branch_Page_and_clicks_on_button_Create_New_Branch() throws Throwable {
		CommonFunctions cm = new CommonFunctions(driver);
		GurukulaBranchPage branchPg = new GurukulaBranchPage(CommonFunctions.driver);
		branchPg.clickOn_Entities();
		branchPg.clickOn_Branch();
		branchPg.clickOnCreateNewBranch();
	}
	
	@When("^a new popup is displayed where user enters branchDetails$")
	public void a_new_popup_is_displayed_where_user_enters_branchDetails(DataTable arg1) throws Throwable {
		CommonFunctions cm = new CommonFunctions(driver);
		GurukulaBranchPage branchPg = new GurukulaBranchPage(CommonFunctions.driver);
				//Write the code to handle Data Table
				for (Map<String, String> data : arg1.asMaps(String.class, String.class)) {
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					//Input Name of branch
					branchPg.txbBox_Name.sendKeys(data.get("Name"));
					//Input Code of branch
					branchPg.txbBox_Code.sendKeys(data.get("Code"));
					//Click on Save button
					branchPg.btn_Save.click();
					driver.switchTo().defaultContent();
					}	
	}
	
	@Then("^view the branch record added to the Branches page$")
	public void view_the_branch_record_added_to_the_Branches_page(DataTable arg1) throws Throwable {
		CommonFunctions cm = new CommonFunctions(driver);
		GurukulaBranchPage branchPg = new GurukulaBranchPage(CommonFunctions.driver);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.switchTo().defaultContent();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		branchPg.btn_CreateBranch.click();
		for (Map<String, String> data : arg1.asMaps(String.class, String.class)) {
			if (branchPg.lbl_NameValue.getText()== data.get("Name")){
				System.out.println("Successfully displayed Name");
			}
		}
		cm.closeBrowser();
	}
	

	

	
}
