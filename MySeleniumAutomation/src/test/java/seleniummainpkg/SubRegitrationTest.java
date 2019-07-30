package seleniummainpkg;

import org.testng.Assert;
import org.testng.annotations.Test;

import seleniummainpagepkg.SubRegistration_Page;

public class SubRegitrationTest extends HospitalBaseTest {

//@Test(dependsOnMethods="logintest")	
@Test 
public void mySubRegitration () throws InterruptedException	{
	
SubRegistration_Page.using(driver).setPhonenumber("8982269820")
								.setAddress("75 classon street")
								.setEmail("nazim234@gmail.com")
								.setCcode("America")
								.setRelation("Brother")
								.setmadNameloc("sayra")
								.setpatIdentityloc("driver licence")
								.setpIdPfloc("1520345")
								.setnationalityloc("Indian")
								.setisMlcloc("yes")
								.seteduCationloc("MCA")
								.setDate()
								.setOCCUPATIONloc("Self Employeed")
								.setBloodGrouploc(2)
								.setCITIZENSHIPloc("American")
								.setSC_PROOFloc("yes")
								.setADDRESS2loc("75 bayview av")
								.setZiploc("77291");
								
								
Assert.assertEquals(SubRegistration_Page.pagetitle(), "Permanent Registration");
								
Thread.sleep(10000);
}
	
	
	
	
}
