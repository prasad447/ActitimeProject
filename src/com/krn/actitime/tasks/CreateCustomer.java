package com.krn.actitime.tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.testng.annotations.Test;

import com.krn.actitime.testbase.BaseClass;

public class CreateCustomer extends BaseClass{
	
	
@Test
  public void testCreateCustomer() {
	
	    String cc= lib.getExcelData("CreateCustomer", 1, 0);
	     String   desc=lib.getExcelData("CreateCustomer", 1, 1);
		
		 
	    cc.clickOnTask(driver);
		
		driver.findElement(By.xpath("//div[@class='addNewButton']")).click();
		 
		driver.findElement(By.xpath("//div[text()='New Customer']")).click();
		
		driver.findElement(By.xpath("(//input[@placeholder='Enter Customer Name'])[2]")).sendKeys(cc);
		
		driver.findElement(By.xpath("//textarea[@placeholder='Enter Customer Description']")).sendKeys(desc);
		
		driver.findElement(By.xpath("//div[text()='Create Customer']")).click();
	
	
	
	
		
		
		
		
		
  }

}