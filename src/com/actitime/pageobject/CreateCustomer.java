package com.actitime.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateCustomer {
	
	      
	
	
	public void clickOnTask(WebDriver driver) {
		
		
		driver.findElement(By.xpath("//div[text()='Tasks']")).click();
	}

}
