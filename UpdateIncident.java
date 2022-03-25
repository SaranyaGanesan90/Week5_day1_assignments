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

public class UpdateIncident extends ProjectSpecificMethods_SN {
	
	@Test
	public void runTC002() {
		

		driver.findElement(By.xpath("(//div[text()='Incidents'])[2]")).click();
		WebElement frameElement1 = driver.findElement(By.name("gsft_main"));
		frameElement1.click();
		driver.switchTo().frame(frameElement1);
		WebElement element = driver.findElement(By.xpath("(//input[@class='form-control'])[1]"));
		element.sendKeys(incidentnumber,Keys.ENTER);
		element.click();
		
		WebElement drop = driver.findElement(By.xpath("(//select[@role='listbox'])[1]"));
		Select dd = new Select(drop);
		dd.selectByIndex(0);
		WebElement drop1 = driver.findElement(By.xpath("(//select[@role='listbox'])[2]"));
		Select dd1 = new Select(drop1);
		dd1.selectByVisibleText("In Progress");
		driver.findElement(By.xpath("(//button[text()='Update'])[1]")).click();
		
        String text1 = driver.findElement(By.xpath("//td[@class='vt list_edit_cursor_cell']")).getText();
        System.out.println("Status:" + text1);		
	
	}
	

}
