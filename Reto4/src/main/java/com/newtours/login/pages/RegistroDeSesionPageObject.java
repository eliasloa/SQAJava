package com.newtours.login.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("http://newtours.demoaut.com/")

public class RegistroDeSesionPageObject extends PageObject {
	
	By msRegistro = By.linkText("REGISTER");
	By txtFirtsName = By.name("firstName");
	By txtLastName = By.name("lastName");
	By txtPhone = By.name("phone");
	By txtEmail= By.id("userName");
	By txtDireccion = By.name("address1");
	By txtCity = By.name("city");
	By txtState = By.name("state");
	By txtEmailNom = By.name("email");
	By txtPassword = By.name("password");
	By txtConfirmarPass = By.name("confirmPassword");
	By btbRegister= By.name("register");
	By msgLogin= By.linkText("SIGN-OFF");
	By txtCountry= By.name("country");
	
	public void clickEnRegistro () {
		
		getDriver().findElement(msRegistro).click();		
	}
	
	public void escribirNombre(String nombre) {	
		getDriver().findElement(txtFirtsName).sendKeys(nombre);
	}
	
	public void escribirApellido(String apellido) {	
		getDriver().findElement(txtLastName).sendKeys(apellido);
	}
	
	public void escribirPhone(String phone) {	
		getDriver().findElement(txtPhone).sendKeys(phone);
	}
	
	public void escribirEmail(String email) {	
		getDriver().findElement(txtEmail).sendKeys(email);
	}
	
	public void escribirDireccion(String direccion) {	
		getDriver().findElement(txtDireccion).sendKeys(direccion);
	}
	
	public void escribirCity(String city) {	
		getDriver().findElement(txtCity).sendKeys(city);
	}
	
	public void escribirState(String state) {	
		getDriver().findElement(txtState).sendKeys(state);
	}
	
	public void escribirPais(String country) {	
		
		Select lstCountry = new Select(getDriver().findElement(txtCountry));
		lstCountry.selectByVisibleText(country);
	}
	
	
	public void escribirEmailNom(String username) {	
		getDriver().findElement(txtEmailNom).sendKeys(username);
	}
	
	public void escribirPassword(String password) {	
		getDriver().findElement(txtPassword).sendKeys(password);
	}
	
	public void escribirConfirmarPass(String confirmar) {	
		getDriver().findElement(txtConfirmarPass).sendKeys(confirmar);
	}
	
	public void clickEnRegister () {
		
		getDriver().findElement(btbRegister).click();
			
	}
	
	public String validarAlertaExitoso() {
		
		return getDriver().findElement(msgLogin).getText();
		
	}
	


}
