package com.demoguru.demoaut.bank.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import junit.framework.Assert;

public class BorrarDemoGuru {
	
	WebDriver driver;
	//By opcDeleteCustomer = By.xpath("//a[@href='deleteCustomerInput.php']"); 	
	By opcDeleteCustomer = By.xpath("//div[3]/div/ul/li[4]/a"); 
	By txtCustomerId = By.name("cusid"); 	
	By btnSubmitDelete = By.name("AccSubmit");
	By keyEneter = By.xpath("//table/tbody/tr/td");
	
	
	public BorrarDemoGuru (WebDriver driver) {
		
		this.driver = driver;
		
	}
	
	public void btnnEliminarUsuario() {
		PorfavorEspere();
		driver.findElement(opcDeleteCustomer).click();
		}

		public void ingresaCustomerId(String CustomerId) {
		PorfavorEspere();
		driver.findElement(txtCustomerId).sendKeys(CustomerId);
		}

		public void btnnDelete() {
		PorfavorEspere();
		driver.findElement(btnSubmitDelete).click();
		}


		public void PorfavorEspere() {
		try {
		Thread.sleep(3000);
		} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		}
		
		public void ValidateDeleteSuccesfull(String dateA,String dateB) {
			Assert.assertEquals(dateA, dateB);
		}


}
