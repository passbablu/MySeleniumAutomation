package seleniummainpkg;

import org.testng.annotations.Test;

import seleniummainpagepkg.Login_Page;
import seleniummainpagepkg.Serch_Registration_page;

public class Scr_RegTest extends HospitalBaseTest{
	
	
	@Test
	public void Serch_Registrationtest() throws InterruptedException {
	
		Login_Page.using(driver).clickRegistationlink();
		Serch_Registration_page.using(driver).clickNav();
		
		Thread.sleep(10000);
	}

}
