package assignment.week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProjectSpecificMethods_SN {

	
		public ChromeDriver driver;//declaring
		
		public static String incidentnumber;
		@BeforeMethod
		public void beforeMethod() throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			//defining 
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://dev109771.service-now.com/login.do?user_name=admin&sys_action=sysverb_login&user_password=syoXyOu8VF6S");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.findElement(By.id("user_name")).sendKeys("admin");
			driver.findElement(By.id("user_password")).sendKeys("Test@123");
			driver.findElement(By.xpath("//button[text()='Log in']")).click();
			driver.findElement(By.id("filter")).sendKeys("incident");
			Thread.sleep(2000);

		}
//@AfterMethod
//public void afterMethod() {
//driver.close();

//}
}