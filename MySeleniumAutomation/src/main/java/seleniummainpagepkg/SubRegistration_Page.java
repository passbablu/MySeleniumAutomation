package seleniummainpagepkg;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class SubRegistration_Page extends BasePage {

	public SubRegistration_Page(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	} 

	public static SubRegistration_Page using (WebDriver driver) {
		return new SubRegistration_Page(driver);
	}
	
	@FindBy(how= How.NAME, using= "ADDRESS1")
	private WebElement addressLoc;
	
	public SubRegistration_Page setAddress (String address) {
	this.addressLoc.sendKeys(address);
	return this;
	}
	@FindBy (how= How.NAME,using = "MOBILE_NO") 
	private WebElement phoneloc;
	
	public SubRegistration_Page setPhonenumber(String phone) {
	this.phoneloc.sendKeys(phone);	
	return this;	
	}
	@FindBy (how= How.NAME,using = "EMAIL_ID") 
	private WebElement emailloc;
	
	public SubRegistration_Page setEmail(String email) {
	this.emailloc.sendKeys(email);	
	return this;	
	}
	@FindBy (how= How.NAME,using = "COUNTRY_CODE") 
	private WebElement cCodeloc;
	
	public SubRegistration_Page setCcode(String ccode) {
	this.cCodeloc.sendKeys(ccode);	
	return this;	
	}	
	@FindBy (how= How.NAME,using = "RELATION") 
	private WebElement relaTionloc;
	
	public SubRegistration_Page setRelation (String rcode) {
	Select mt=new Select (relaTionloc);
	mt.selectByIndex(1);
	return this;	
	}
	@FindBy (how= How.NAME,using = "MOTHER_NAME") 
	private WebElement madNameloc;
	
	public SubRegistration_Page setmadNameloc(String madName) {
	this.madNameloc.sendKeys(madName);
	return this;	
	}
	@FindBy (how= How.NAME,using = "PAT_IDENTITY") 
	private WebElement patIdentityloc;
	
	public SubRegistration_Page setpatIdentityloc(String pId) {
	Select sl=new Select(patIdentityloc);
	sl.selectByIndex(3);
	return this;	
	}
	@FindBy (how= How.XPATH,using = "//*[@id='form1']/div[1]/table/tbody/tr[4]/td[4]/input") 
	private WebElement pIdPfloc;
	
	public SubRegistration_Page setpIdPfloc(String pIdpF) {
	this.pIdPfloc.sendKeys(pIdpF);
	return this;	
	}
	@FindBy (how= How.NAME,using = "NATIONALITY") 
	private WebElement naTionaLityloc;
	
	public SubRegistration_Page setnationalityloc(String nationality) {
		
	Select 	lm = new Select(naTionaLityloc);
	lm.selectByIndex(1);
	return this;	
	}
	@FindBy (how= How.NAME,using = "IS_MLC") 
	private WebElement isMlcloc;
	
	public SubRegistration_Page setisMlcloc(String ismlc) {
	Select is=new Select (isMlcloc);
	is.selectByIndex(2);
	return this;	
	}
	@FindBy (how = How.NAME, using="EDUCATION")
	private WebElement eduCationloc ;
	public SubRegistration_Page seteduCationloc (String EDUCATION ) {
	this.eduCationloc.sendKeys(EDUCATION);
	return this;
	}
	@FindBy (how = How.XPATH,using = "//*[@id='form1']/div[1]/table/tbody/tr[6]/td[2]/input")
	private WebElement dateLoc ;
	public SubRegistration_Page setDate () {
	LocalDate date = LocalDate.now(); 		
	String myxx = date.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));	
	this.dateLoc.sendKeys(myxx);
	return this;
	}
	@FindBy (how=How.NAME,using="OCCUPATION")
	private WebElement OCCUPATIONloc;
	public SubRegistration_Page setOCCUPATIONloc (String opt) {
		Select op=new Select (OCCUPATIONloc);
		op.selectByVisibleText(opt);
		return this;
	}
	@FindBy (how=How.XPATH,using="//*[@id='form1']/div[1]/table/tbody/tr[10]/td[4]/select")
	private WebElement BloodGrouploc;
	public SubRegistration_Page setBloodGrouploc (int bgl) {
		Select bg=new Select (BloodGrouploc);
		bg.selectByIndex(bgl);
		return this;
	}
	@FindBy (how=How.NAME,using="CITIZENSHIP") 
	private WebElement CITIZENSHIPloc;
	public SubRegistration_Page setCITIZENSHIPloc (String ctz) {
		Select ct=new Select (CITIZENSHIPloc);
		ct.selectByValue(ctz);
		return this;
	}
	@FindBy (how=How.NAME,using="SC_PROOF")
	private WebElement SC_PROOFloc;
	public SubRegistration_Page setSC_PROOFloc (String scp) {
		Select ss=new Select(SC_PROOFloc);
		ss.selectByIndex(2);
		return this;
	}
	@FindBy (how=How.NAME,using="ADDRESS2")
	private WebElement ADDRESS2loc;
	public SubRegistration_Page setADDRESS2loc (String address) {
		this.ADDRESS2loc.sendKeys(address);
		return this;	
	}
	@FindBy (how=How.NAME,using="ZIP")
	private WebElement Ziploc;
	public SubRegistration_Page setZiploc (String zip) {
		this.Ziploc.sendKeys(zip);
		return this;
	}
public static String myDatetime(LocalDate date){
date = LocalDate.of(date.getYear(), date.getMonth(), date.getDayOfMonth());
return date.withMonth(1).format(DateTimeFormatter.ofPattern("MM/dd/yy"));	
}
	
public static String pagetitle()	{
	
    String rtitle = driver.getTitle();
    System.out.println("title of the page"+ rtitle);
	return rtitle;
}
	
	
	
	
}









