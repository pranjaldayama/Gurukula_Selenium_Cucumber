package pageObjects;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class GurukulaLoginPage {

	//Object login link on Login Page
	@FindBy(how = How.LINK_TEXT, using = "login") 
	public WebElement lnk_Login;
	
	//Element Username text box on Login Page
	@FindBy(how = How.ID, using = "username") 
	public WebElement txtBx_Username;
	
	//Element Password text box on Login Page
	@FindBy(how = How.ID, using = "password") 
	public WebElement txtBx_Password;
	
	//Element button Authenticate
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Authenticate')]")
	public WebElement btn_Authenticate;
	
	//Label text Welcome to Gurukula!
	@FindBy(how = How.XPATH, using = "//h1[contains(text(),'Welcome to Gurukula!')]")
	public WebElement txt_Welcome;
	
	//WebElment Account on Login Page
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Account')]")
	public WebElement btn_Account;
	
	//WebElment Log Out on Login Page
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Log out')]")
	public WebElement btn_LogOut;	
	
	//Constructor
	WebDriver driver;
	public  GurukulaLoginPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	 //Function to click on login link
		public void clickOn_LoginLink() {
			lnk_Login.click();
		}
	
	//Function to open browser
	public void openBrowser(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://192.168.178.17:8080");
	}
	
	//Function to enter Username
	public void enter_Username(String arg1) {
		txtBx_Username.sendKeys(arg1);
	}	
		
	//Function to enter Password
	public void enter_Password(String arg2) {
		txtBx_Password.sendKeys(arg2);
	}		
	
	//Function to click on button - Authenticate
	public void clickOn_Authenticate(){
		btn_Authenticate.click();
	}
	
	//Function to verify the Welcome message
		public void verify_WelcomeMessage(){
			if (txt_Welcome.isDisplayed()) {
				Assert.assertEquals("Welcome to Gurukula!", txt_Welcome.getText());
				System.out.print("Successfully logged in Gurukula");
			} else{
				System.out.print("Failed to login Gurukula");
			}
		}
		
	//Function to click on Account on Login Page
	public void clickOn_Account(){
			btn_Account.click();
		}
		
	//Function to click on Logout Btn on Login Page
	 public void clickOn_LogOut(){
		 btn_LogOut.click();
		}
	 
	//Function to close browser
		public void closeBrowser(){
			driver.close();
		}
		
		
}
