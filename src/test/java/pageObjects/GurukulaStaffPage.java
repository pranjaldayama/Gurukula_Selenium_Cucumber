package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

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
		@FindBy(how = How.LINK_TEXT, using = "#") 
		public WebElement icon_PaginationStaff;
	
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
		
		//Function to verify all the elements present on Branch Page
		public void verify_elements_StaffPage() {
			
			if (btn_CreateStaff.isDisplayed()) {
				System.out.println("Button 'Create a new Staff' is present on Staff Page");
			}
			
			if (txtBx_searchQueryStaff.isDisplayed()) {
				System.out.println("Text Box 'Search Query' is present on Staff Page");
			}
			
			if (btn_SearchStaff.isDisplayed()) {
				System.out.println("Button 'Search a Staff' is present on Staff Page");
			}
			
			if (lbl_ID.isDisplayed()) {
				System.out.println("Label 'ID' is present on Staff Page");
			}
			
			if (lbl_Name.isDisplayed()) {
				System.out.println("Label 'Name' is present on Staff Page");
			}
			
			if (lbl_Branch.isDisplayed()) {
				System.out.println("Label 'Branch' is present on Staff Page");
			}
			
			if(icon_PaginationStaff.isDisplayed()){
				System.out.println("Pagination is present on Staff Page");
			}
			
		}
}
