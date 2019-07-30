package seleniummainpagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Serch_Registration_page extends Login_Page{

	public Serch_Registration_page(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public static Serch_Registration_page using (WebDriver driver) {
		return new Serch_Registration_page(driver);
	}
	@FindBy(how= How.XPATH, using= "//*[@id=\"navigation\"]/li[1]/ul/li[3]/a")
	private WebElement NavLoc;

	public void clickNav() {
	this.NavLoc.click();
}
}