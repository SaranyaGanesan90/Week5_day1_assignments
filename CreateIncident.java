package assignment.week5.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class CreateIncident extends ProjectSpecificMethods_SN {
	
	@Test
	public void runTC001() {
		

		
		driver.findElement(By.xpath("(//div[text()='Create New'])[1]")).click();
		WebElement frameElement = driver.findElement(By.name("gsft_main"));
		frameElement.click();
		driver.switchTo().frame(frameElement);
	driver.findElement(By.xpath("(//span[@class='icon icon-search'])[1]")).click();
	Set<String> windowHandles = driver.getWindowHandles();
	List<String> windowHandlesList=new ArrayList<String>(windowHandles);
	driver.switchTo().window(windowHandlesList.get(1));
	driver.findElement(By.linkText("System Administrator")).click();
	driver.switchTo().window(windowHandlesList.get(0));
	
	  WebElement frameElement1 = driver.findElement(By.name("gsft_main"));
		frameElement1.click();
		driver.switchTo().frame(frameElement1);
		driver.findElement(By.xpath("(//input[@id='incident.short_description'])[1]")).sendKeys("Hi this is a new incident");

	String attribute = driver.findElement(By.xpath("//input[@name='incident.number']")).getAttribute("Value");
	 
	  System.out.println(attribute);
	  
//	System.out.println("Incident number:"+ incidentnumber.getAttribute("incident"));
driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();

driver.findElement(By.xpath("(//input[@class='form-control'])[1]")).sendKeys(attribute,Keys.ENTER);
	
	  incidentnumber=driver.findElement(By.xpath("//a[@class='linked formlink']")).getText();
	  System.out.println("The Incident number1 is:"+incidentnumber);
	  if(attribute.equals(incidentnumber)) {
	  System.out.println("The incident number is Created"); } else {
	  System.out.println("The incident number is not Created"); }
	 
	
	}
	

}
