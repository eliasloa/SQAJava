package com.demoguru.demoaut.bank.pages;

import static org.junit.Assert.assertThat;

import org.hamcrest.Matchers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistroDemoGuru {
	
	WebDriver driver;
	//By btnNewCustomer=By.xpath("//a[@href='addcustomerpage.php']");
	By btnNewCustomer= By.xpath("//div[3]/div/ul/li[2]/a");
	By txtCustomerName=By.name("name");
	By txtGenderMale=By.xpath("//input[@value='m']");
	By txtGenderFemale=By.xpath("//input[@value='f']");
	By txtDateOfBirth=By.name("dob");
	By txtAddress=By.name("addr");
	By txtCity=By.name("city");
	By txtState=By.name("state");
	By txtPin=By.name("pinno");
	By txtMobileNumber=By.name("telephoneno");
	By txtEmail=By.name("emailid");
	By txtPassword=By.name("password");
	By btnSubmit=By.name("sub");
	By lblCustomerReg=By.xpath("//p[@class='heading3']");
	
	public RegistroDemoGuru(WebDriver driver) {
		this.driver=driver;
	}
	

	public void clickEnNewCustomer() {
	
		driver.findElement(btnNewCustomer).click();
		
	}
	
	
	public void escribirCustomerName(String customer) {
		driver.findElement(txtCustomerName).sendKeys(customer);
	}
	
	public void escribirGenero(String genero) {
		if(genero.equals("Male")) {
			driver.findElement(txtGenderMale).click();
		}
		if(genero.equals("Female")) {
			driver.findElement(txtGenderFemale).click();
		}
	}
	
	public void escribirFecha(String date) {
		driver.findElement(txtDateOfBirth).sendKeys(date);
	}
	
	public void escribirDireccion(String address) {
		driver.findElement(txtAddress).sendKeys(address);
	}
	
	public void escribirCiudad(String city) {
		driver.findElement(txtCity).sendKeys(city);
	}
	
	public void escribirEstado(String state) {
		driver.findElement(txtState).sendKeys(state);
	}
   
	public void escribirPostal(String pin) {
		driver.findElement(txtPin).sendKeys(pin);
	}
	
	public void escribirCelular(String mobile) {
		driver.findElement(txtMobileNumber).sendKeys(mobile);
	}
	
	public void escribirEmail(String email) {
		driver.findElement(txtEmail).sendKeys(email);
	}
	
	public void escribirPassword(String password) {
		driver.findElement(txtPassword).sendKeys(password);
	}
	
	public void clickEnSubmit() {
		
			driver.findElement(btnSubmit).click();
	}
	
	public void validarPresenciaCustomer() {
			assertThat(driver.findElement(lblCustomerReg).isDisplayed(), Matchers.is(true));
		}
	
}