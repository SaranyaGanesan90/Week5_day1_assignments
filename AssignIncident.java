package assignment.week5.day1;



import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.Select;

import org.testng.annotations.Test;

public class AssignIncident extends ProjectSpecificMethods_SN {
	
	@Test
	public void runTC003() throws InterruptedException {
		driver.findElement(By.linkText("All")).click();
driver.findElement(By.xpath("(//div[text()='Incidents'])[2]")).click();
		WebElement frameElement1 = driver.findElement(By.name("gsft_main"));
		frameElement1.click();
		driver.switchTo().frame(frameElement1);
		WebElement element = driver.findElement(By.xpath("(//input[@class='form-control'])[1]"));
		//System.out.println(incidentnumber);
		Thread.sleep(2000);
		element.sendKeys(incidentnumber,Keys.ENTER);
		element.click();
		
		driver.findElement(By.xpath("(//span[@class='icon icon-search'])[5]")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> windowHandlesList=new ArrayList<String>(windowHandles);
		driver.switchTo().window(windowHandlesList.get(1));
		driver.findElement(By.linkText("App Engine Admins")).click();
		driver.switchTo().window(windowHandlesList.get(0));
		WebElement frameElement2 = driver.findElement(By.name("gsft_main"));
		frameElement2.click();
		driver.switchTo().frame(frameElement2);
		driver.findElement(By.xpath("(//button[text()='Update'])[1]")).click();
	String text = driver.findElement(By.linkText("App Engine Admins")).getText();
System.out.println("Assigned Group:"+ text);

				
	
	}
	

}
