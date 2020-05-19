package com.demoguru.demoaut.bank.pages;

import static org.junit.Assert.assertThat;

import org.hamcrest.Matchers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EditarDemoGuru {
	
	WebDriver driver;
	By linkEditCustomer = By.xpath("//div[3]/div/ul/li[3]/a");
	By txtCustomerId= By.name("cusid");
	By btbSubmitId= By.name("AccSubmit"); 
	By txtDireccion= By.name("addr");
	By txtCiudad = By.name("city");
	By txtState=By.name("state");
	By txtPin=By.name("pinno");
	By txtMobileNumber=By.name("telephoneno");
	By txtEmail=By.name("emailid");
	By btnSubmit=By.name("sub");
	By lblCustomerUpdate=By.xpath("//p[contains(text(),'Customer details updated Successfully!!!')]");
	
	
	
	public EditarDemoGuru (WebDriver driver) {
		
		this.driver = driver;
		
	}
	
	public void clickEnEditCustomer () {
		
		driver.findElement(linkEditCustomer).click();
			
	}
	
	public void clickEnSubmitId () {
		
		driver.findElement(btbSubmitId).click();
			
	}
	
	
	public void escribirCustomerId (String id) {
		
		driver.findElement(txtCustomerId).sendKeys(id);
			
	}
	
	public void escribirDireccion (String direccion) {
		
		driver.findElement(txtDireccion).clear();
		driver.findElement(txtDireccion).sendKeys(direccion);
			
	}
	
	public void escribirCiudad (String ciudad) {
		
		driver.findElement(txtCiudad).clear();
		driver.findElement(txtCiudad).sendKeys(ciudad);
			
	}
	
	public void escribirEstado (String estado) {
		
		driver.findElement(txtState).clear();
		driver.findElement(txtState).sendKeys(estado);
			
	}
	
	public void escribirPostal (String postal) {
		
		driver.findElement(txtPin).clear();
		driver.findElement(txtPin).sendKeys(postal);
			
	}
	
	public void escribirCelular(String mobile) {
		driver.findElement(txtMobileNumber).clear();
		driver.findElement(txtMobileNumber).sendKeys(mobile);
	}
	
	public void escribirEmail(String email) {
		driver.findElement(txtEmail).clear();
		driver.findElement(txtEmail).sendKeys(email);
	}
	
	public void clickEnSubmit() {
		
		driver.findElement(btnSubmit).click();
	}
	
	public void validateCustomerUpdate() {
		assertThat(driver.findElement(lblCustomerUpdate).isDisplayed(), Matchers.is(true));
	}
	

}
