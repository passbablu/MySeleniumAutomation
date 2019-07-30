 package seleniummainpkg;

import org.testng.annotations.Test;

import seleniummainpagepkg.Login_Page;
import seleniummainpagepkg.Registation_Page;
import seleniummainpagepkg.Serch_Registration_page;

public class My_login_Test extends HospitalBaseTest {

	

@Test
public void myRegistationTest () {
	
	Registation_Page.using(driver)
	.selectPatientCat()
	.setFirstname("humayun");

	
}
@Test	
public void settingname () throws InterruptedException {
	Registation_Page.using(driver)
			.setmidlename("Khandaker")
			.setAge("26");
	

	
}
	


	
	
}
