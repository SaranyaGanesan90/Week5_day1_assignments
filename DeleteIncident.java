package assignment.week5.day1;



import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.Select;

import org.testng.annotations.Test;

public class DeleteIncident extends ProjectSpecificMethods_SN {
	
	@Test
	public void runTC004() {
		
		

		WebElement frameElement1 = driver.findElement(By.name("gsft_main"));
		frameElement1.click();
		driver.switchTo().frame(frameElement1);
	driver.findElement(By.xpath("(//input[@class='form-control'])[1]")).sendKeys(incidentnumber);
	driver.findElement(By.xpath("(//input[@class='form-control'])[1]")).sendKeys(Keys.ENTER);
		//driver.findElement(By.linkText("INC0010059")).click();
		driver.findElement(By.xpath("(//button[text()='Delete'])[1]")).click();
		driver.findElement(By.xpath("(//button[text()='Delete'])[3]")).click();
		String text = driver.findElement(By.xpath("//td[text()='No records to display']")).getText();
//	System.out.println("Deleted ID :"+ text);
	}
	

}
