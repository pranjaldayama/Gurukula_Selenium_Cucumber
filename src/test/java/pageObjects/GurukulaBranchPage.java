package pageObjects;

import java.util.concurrent.TimeUnit;

import junit.framework.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class GurukulaBranchPage {
	
		//Element searchQuery text box
		@FindBy(how = How.ID, using = "searchQuery") 
		public WebElement txtBx_searchQuery;
		
		//WebElement button 'Search a Branch'
		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Search a Branch')]")
		public WebElement btn_SearchBranch;
		
		//WebElement label ID
		@FindBy(how = How.XPATH, using = "//th[contains(text(),'ID')]")
		public WebElement lbl_ID;
		
		//WebElement label ID
		@FindBy(how = How.ID, using = "myBranchLabel")
		public WebElement lbl_CreateEditBranch;
		
		//WebElement label Name
		@FindBy(how = How.XPATH, using = "//th[contains(text(),'Name')]")
		public WebElement lbl_Name;
		
		//WebElement label Code
		@FindBy(how = How.XPATH, using = "//th[contains(text(),'Code')]")
		public WebElement lbl_Code;
				
		//WebElement 'Create a new Branch'
		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Create a new Branch')]")
		//@FindBy(how = How.CSS, using = "//button[class='btn btn-primary']")
		public WebElement btn_CreateBranch;
		
		//WebElment Entities on Login Page
		@FindBy(how = How.XPATH, using = "//span[@translate='global.menu.entities.main']")
		public WebElement btn_Entities;
		
		//WebElment Link Branch  on Login Page
		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Branch')]")
		public WebElement lnk_Branch;
		
		//WebElement Pagination present on Branch Page
		@FindBy(how = How.XPATH, using = "//a[contains(text(),'<<')]") 
		public WebElement icon_PaginationBranch;
		
		//WebElement input text box 'ID' on Create New Branch Pop up
		@FindBy(how = How.XPATH, using = "//input[contains(@name,'id')]")
		public WebElement txbBox_ID;
		
		//WebElement input text box 'Name' on Create New Branch Pop up
		@FindBy(how = How.XPATH, using = "//input[contains(@name,'name')]")
		public WebElement txbBox_Name;
		
		//WebElement input text box 'Code' on Create New Branch Pop up
		@FindBy(how = How.XPATH, using = "//input[contains(@name,'code')]")
		public WebElement txbBox_Code;
		
		//WebElement button Save on Create New Branch pop up
		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Save')]")
		public WebElement btn_Save;
		
		//WebElement Button View to view the branch record added
		@FindBy(how = How.XPATH, using = "//html/body/div[3]/div[1]/div/div[4]/table/tbody/tr/td[4]/button[1]/span[2]")
		public WebElement btn_View;	
		
		//Label Name after creating a Branch
		@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[1]/div[1]/div[4]/table[1]/tbody[1]/tr[1]/td[2]")
		public WebElement lbl_NameValue;
		
		//Branch View Text box read value : Code
		@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[1]/div[1]/div[4]/table[1]/tbody[1]/tr[1]/td[3]")
		public WebElement lbl_CodeValue;
		
		//Delete Branch Button ID : 1
		@FindBy(how = How.XPATH, using = "//tbody//tr[1]//td[4]//button[3]")
		public WebElement btn_DeleteBranch1;
		
		//Delete Branch Button ID : 2
		@FindBy(how = How.XPATH, using = "//tbody//tr[2]//td[4]//button[3]")
		public WebElement btn_DeleteBranch2;
		
		//Delete Branch Button ID : 3
		@FindBy(how = How.XPATH, using = "//tbody//tr[3]//td[4]//button[3]")
		public WebElement btn_DeleteBranch3;
		
		//Text filed error message for Branch Name
		@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[2]/div[1]/p[4]")
		public WebElement errMsg_BranchName;
		
		//Text filed error message for Branch Name
		@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[3]/div[1]/p[4]")
		public WebElement errMsg_CodeName;
		
		//Cancel Button
		@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[3]/button[1]")
		public WebElement btn_Cancel;
		
		//Delete Confirm Button
		@FindBy(how = How.XPATH, using = "//form[@name='deleteForm']//button[@type='submit']")
		public WebElement btn_ConfirmDelete;
		
		//Constructor
		WebDriver driver;
		public  GurukulaBranchPage(WebDriver driver){
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		//Function to click on Entities
		public void clickOn_Entities() {
			btn_Entities.click();
		}
		//Function to click on Link Branch
		public void clickOn_Branch() {
			lnk_Branch.click();
		}
		//Function to verify all the elements present on Branch Page
		@SuppressWarnings("deprecation")
		public void verify_elements_BranchPage() {
			try {
				if (btn_CreateBranch.isDisplayed()) {
					Assert.assertTrue("Button 'Create New Branch' is present on Branch Page", true);}
				if (txtBx_searchQuery.isDisplayed()) {
					Assert.assertTrue("Text Box 'Search Query' is present on Branch Page", true);}
				if (btn_SearchBranch.isDisplayed()) {
					Assert.assertTrue("Button 'Search a Branch' is present on Branch Page", true);}
				if (lbl_ID.isDisplayed()) {
					Assert.assertTrue("Label 'ID' is present on Branch Page", true);}
				if (lbl_Name.isDisplayed()) {
					Assert.assertTrue("Label 'Name' is present on Branch Page",true);}
				if (lbl_Code.isDisplayed()) {
					Assert.assertTrue("Label 'Code' is present on Branch Page", true);}
			} catch (Exception e) {
   				 System.out.println(e);
			     e.printStackTrace();
			}
		}
		
		//Function to create a New Branch
		public void clickOnCreateNewBranch(){
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			btn_CreateBranch.click();
		}
		
		//Function to create a New Branch and Save
	   public void createNewBranch(String arg1, String arg2){
		   try {
			   //Input Name and Code of Branch and Save
			   txbBox_Name.sendKeys(arg1);
			   txbBox_Code.sendKeys(arg2);
			   btn_Save.click();
			   Assert.assertTrue("Successfully created a Branch by inputting Name and Code", true);
		    } catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();}
	   }
	   
	 //Function to verify if a new Branch is created
	   public void verifyBranchCreation(String arg1, String arg2){
			   try {
				if (lbl_NameValue.getText().contains(arg1)){
					Assert.assertTrue("Successfully created a Branch by inputting Name", true);
				   }
				   if (lbl_CodeValue.getText().contains(arg2)){
					   Assert.assertTrue("Successfully created a Branch by inputting Code", true); 
				   }
			} catch (Exception e) {
				System.out.println(e);
				e.printStackTrace();}
	   }
	   
	 //Function to delete a branch created
	   public void deleteBranch(){
		   try {
			   //Delete the Branches Created
			   btn_DeleteBranch1.click();
			   btn_ConfirmDelete.submit(); 
			   Assert.assertTrue("Successfully deleted all the branches created", true);
		    } catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();}
	   }
	   
	   //Function to verify text field validations for Name and Code
	   public void verifyTextFieldValdiations(String arg1){
	   if (arg1.contentEquals("FAILURE")){
			if (errMsg_BranchName.isDisplayed() || errMsg_CodeName.isDisplayed()){
				//Click Cancel
				btn_Cancel.click();
				Assert.assertTrue("Field Validations are in place for Branch Name and Code", true);
				}
			}
			if(arg1.contentEquals("SUCCESS")){
				if (!(errMsg_BranchName.isDisplayed()) || !(errMsg_CodeName.isDisplayed())){
					//Click Save on Success
					btn_Save.click();
					Assert.assertTrue("Field Validations are in place for Branch Name and Code", true);
					}
			}
	   }
	   
	   
}
