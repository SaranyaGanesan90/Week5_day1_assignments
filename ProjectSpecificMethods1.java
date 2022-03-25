package assignment.week5.day1;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProjectSpecificMethods1 {

	
		public ChromeDriver driver;//declaring
		@BeforeMethod
		public void beforeMethod() {
			WebDriverManager.chromedriver().setup();
			//defining 
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://leaftaps.com/opentaps/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		}
	
	@AfterMethod
public void afterMethod() {
	driver.close();

	}

}
