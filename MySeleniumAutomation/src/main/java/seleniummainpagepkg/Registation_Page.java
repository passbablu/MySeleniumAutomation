package seleniummainpagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class Registation_Page extends BasePage {

	public Registation_Page(WebDriver driver) {
		super(driver);
		
	}
	public static Registation_Page using (WebDriver driver) {
		return new Registation_Page(driver);
	}
	
	@FindBy(how= How.NAME, using= "PATIENT_CAT")
	private WebElement patientcatLoc;

	public Registation_Page selectPatientCat() {
	Select fl = new Select(this.patientcatLoc);
	fl.selectByIndex(1);
	return this;
		
	}	

	@FindBy(how= How.NAME, using= "PNT_NAMExx")
	private WebElement firstNameLoc;
	
	@FindBy(how= How.NAME, using= "MIDDLE_NAME")
	private WebElement middleNameLoc;
	
	public Registation_Page setFirstname (String fname) {
	this.firstNameLoc.sendKeys(fname);
	return this;		
	}
	public Registation_Page setmidlename (String mname) {
	this.middleNameLoc.sendKeys(mname);
	return this;	
	}
	
	@FindBy(how= How.NAME, using= "LAST_NAME")
	private WebElement lastNameLoc;
	
	public Registation_Page setLastname (String lastname) {
	this.lastNameLoc.sendKeys(lastname);
	return this;		
	}
	
	@FindBy(how= How.NAME, using= "AGE")
	private WebElement ageLoc;
	
	public Registation_Page setAge (String age) {
	this.ageLoc.sendKeys(age);
	return this;		
	}
	
}
