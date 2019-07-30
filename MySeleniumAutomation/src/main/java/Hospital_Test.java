import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Hospital_Test {
public static void main(String[] args) {
	WebDriver driver = BaseChrome.getdriver();
	driver.navigate().to("http://selenium4testing.com/hms/");
	
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.findElement(By.name("username")).sendKeys("admin");
	
	driver.findElement(By.name("password")).sendKeys("admin");
	driver.findElement(By.name("submit")).click();
	driver.findElement(By.xpath("//*[@id='navigation']/li[1]/a")).click();
	
	driver.close();
	
}
}
