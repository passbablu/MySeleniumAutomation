package seleniummainpagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.How;

public class Login_Page extends BasePage {

	public Login_Page(WebDriver driver) {
		super(driver);
		}

	public static Login_Page using (WebDriver driver) {
		return new Login_Page(driver);
	}
	@FindBy(how= How.NAME, using= "username")
	private WebElement usernameLoc;

	public Login_Page setUsername(String uname) {
	this.usernameLoc.sendKeys(uname);
	return this;	
		
	}
	@FindBy(how= How.NAME, using= "password")
	private WebElement passwordLoc;

	public Login_Page setPassword(String uwd) {
	this.passwordLoc.sendKeys(uwd);
	return this;	
	}
	@FindBy(how= How.NAME, using= "submit")
	private WebElement submitLoc;

	public void clickLogin() {
	this.submitLoc.click();
		
	}	
	
//	@FindBy(how= How.NAME, using= "Reset")
//	private WebElement resetLoc;
//
//	public void clickreset() {
//	this.resetLoc.click();
//	
//	
//}
	@FindBy(how= How.XPATH, using= "//*[@id='navigation']/li[1]/a")
	private WebElement registatiolinLoc;

	public void clickRegistationlink() {
	this.registatiolinLoc.click();
		
	}	

	
	
	
}


	


