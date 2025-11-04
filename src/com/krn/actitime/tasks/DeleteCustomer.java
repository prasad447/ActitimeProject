package com.krn.actitime.tasks;


import java.time.Duration;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.krn.actitime.testbase.BaseClass;

public class DeleteCustomer extends BaseClass {
	
	
	 
	@Test
	  public void TestDeleteCustomer() throws TimeoutException, InterruptedException {
		
		  String dc=lib.getExcelData("deleteCustomer", 1, 0);
		
		driver.findElement(By.xpath("//div[text()='Tasks']")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@placeholder='Quick search by name ...' and  @maxlength='255']")).sendKeys(dc);
		
		
		//WebDriverWait wait = new WebDriverWait(driver,30);
	   //   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[text()='prasad'])[1]/../../..//div[@class='editButton']")));
		
		
		
		
		driver.findElement(By.xpath("//span[contains(text(),"+dc+")]/../../..//div[@class='editButton']")).click(); 
		                               
		
   
		
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("(//div[text()='ACTIONS'])[1]")).click();
		
		Thread.sleep(5000);
	
		
		driver.findElement(By.xpath("(//div[text()='Delete'])[2]")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//span[text()='Delete permanently']")).click();
		
		
		
			
	  }
	
   
	}

