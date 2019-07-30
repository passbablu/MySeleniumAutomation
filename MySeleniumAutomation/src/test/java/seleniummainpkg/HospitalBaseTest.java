package seleniummainpkg;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.xml.XmlTest;

import seleniummainpagepkg.Login_Page;

public class HospitalBaseTest {

	public WebDriver driver;
	
	@BeforeClass
	public void openBrowser() {
		
		String basepath = System.getProperty("user.dir");
		String chormebrowser = basepath + "\\utilities\\chromedriver.exe";
		File fl = new File(chormebrowser);
		System.setProperty("webdriver.chrome.driver", fl.getAbsolutePath());
		driver = new ChromeDriver();
		driver.get("http://selenium4testing.com/hms/");
		driver.manage().window().maximize();
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	@AfterClass
	public void browserQuit(){
		driver.quit();
		System.out.println("Browser is quit");
	}
	

	
	@AfterMethod 	
	public void takeScreenShotForTest(ITestResult result){ 		
		if(ITestResult.FAILURE == result.getStatus()){ 			
			TakesScreenshot ts = (TakesScreenshot)driver; 		
			File source = ts.getScreenshotAs(OutputType.FILE); 			
			try { 				
		   FileUtils.copyFile(source, new File("./Screenshots/ " 
			  + result.getName()+ "_"+System.currentTimeMillis() + ".png")); 				 			}
			catch (IOException e) { e.printStackTrace(); } 		
			} 	
		} 	
	@BeforeMethod
	public void hospitalBeforMethod(XmlTest config)	{
		
		Login_Page.using(driver)
					.setUsername(config.getParameter("username"))
					.setPassword(config.getParameter("password"))
					.clickLogin();
		Login_Page.using(driver)
					.clickRegistationlink();
		
		
	}
	
}
	
	

