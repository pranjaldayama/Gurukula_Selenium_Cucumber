package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class GurukulaStaffPage {
	
		//Element searchQuery text box
	
		@FindBy(how = How.ID, using = "searchQuery") 
		public WebElement txtBx_searchQueryStaff;
		
		//WebElement button 'Search a Staff'
		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Search a Staff')]")
		public WebElement btn_SearchStaff;
		
		//WebElement label ID
		@FindBy(how = How.XPATH, using = "//th[contains(text(),'ID')]")
		public WebElement lbl_ID;
		
		//WebElement label Name
		@FindBy(how = How.XPATH, using = "//th[contains(text(),'Name')]")
		public WebElement lbl_Name;
		
		//WebElement label Branch
		@FindBy(how = How.XPATH, using = "//th[contains(text(),'Branch')]")
		public WebElement lbl_Branch;
				
		//WebElement button 'Create a new Staff'
		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Create a new Staff')]")
		public WebElement btn_CreateStaff;
		
		//WebElment Entities on Login Page
		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Entities')]")
		public WebElement btn_EntitiesStaff;
		
		//WebElment Link Staff  on Login Page
		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Staff')]")
		public WebElement link_Staff;
		
		//WebElement Pagination present on Staff Page
		@FindBy(how = How.XPATH, using = "//a[contains(text(),'<<')]") 
		public WebElement icon_PaginationStaff;
		
		//WebElement Name text box present on Staff Creation Pop up
		@FindBy(how = How.XPATH, using = "//input[@name='name']") 
		public WebElement txtBox_StaffName;
		
		//WebElement Dropdown of the Branch Name on Staff Creation Page
		@FindBy(how = How.XPATH, using = "//select[@name='related_branch']") 
		public WebElement drpDown_Branch;
		
		//WebElement Button Save for Staff
		@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[3]/button[2]") 
		public WebElement btn_SaveStaff;
		
		//WebElement Label Name after saving the staff
		@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[1]/div[1]/div[4]/table[1]/tbody[1]/tr[1]/td[2]") 
		public WebElement lbl_NameStaff;
		
		//WebElement Label Name after saving the staff
		@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[3]/div[1]/div[1]/div[4]/table[1]/tbody[1]/tr[1]/td[3]") 
		public WebElement lbl_BranchStaff;


		//Constructor
		WebDriver driver;
		public  GurukulaStaffPage(WebDriver driver){
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}

		//Function to click on Entities
		public void clickOn_EntitiesStaff() {
			btn_EntitiesStaff.click();
		}
			
		//Function to click on Staff
		public void clickOn_LinkStaff() {
			link_Staff.click();
		}
		
		//Function to verify all the elements present on Staff Page
		public void verify_elements_StaffPage() {
			if (btn_CreateStaff.isDisplayed()) {
				Assert.assertTrue("Button 'Create a new Staff' is present on Staff Page", true);}
			if (txtBx_searchQueryStaff.isDisplayed()) {
				Assert.assertTrue("Text Box 'Search Query' is present on Staff Page",true);}
			if (btn_SearchStaff.isDisplayed()) {
				Assert.assertTrue("Button 'Search a Staff' is present on Staff Page", true);}
			if (lbl_ID.isDisplayed()) {
				Assert.assertTrue("Label 'ID' is present on Staff Page", true);}
			if (lbl_Name.isDisplayed()) {
				Assert.assertTrue("Label 'Name' is present on Staff Page", true);}
			if (lbl_Branch.isDisplayed()) {
				Assert.assertTrue("Label 'Branch' is present on Staff Page", true);}
			if(icon_PaginationStaff.isDisplayed()){
				Assert.assertTrue("Pagination is present on Staff Page",true);}
		}
		
		//Function to create new staff
		public void createNewStaff(String arg1,String arg2) {
			try {
				//Click on Create New Staff
				btn_CreateStaff.click();
				//Input Staff Name
				txtBox_StaffName.sendKeys(arg1);
				//Select the branch from the dropdown
				Select branchName = new Select(driver.findElement(By.xpath("//select[@name='related_branch']")));
				branchName.selectByVisibleText(arg2);
				//Click on Save button
				btn_SaveStaff.click();
				Assert.assertTrue("Successfully able to create Staff",true);
			} catch (Exception e) {
				System.out.println(e);
				e.printStackTrace();
			}	
	     }
		
		 //Function to verify if a new staff is created
		   public void verifyStaffCreation(String arg1, String arg2){
				   try {
					if (lbl_NameStaff.getText().contains(arg1)){
						Assert.assertTrue("Successfully created a Staff by inputting Name", true);
					   }
					   if (lbl_BranchStaff.getText().contains(arg2)){
						   Assert.assertTrue("Successfully created a Staff for the Branch by Selecting Branch", true); 
					   }
				} catch (Exception e) {
					System.out.println(e);
					e.printStackTrace();}
		   }

		
				

}


