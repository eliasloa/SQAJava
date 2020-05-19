package com.newtours.login.pages;

import static org.junit.Assert.assertThat;

import org.hamcrest.Matchers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("http://newtours.demoaut.com/")

public class InicioDeSesionPageObject extends PageObject{
	
	By txtUserId = By.name("userName");
	By txtPassword= By.name("password");
	By btblogin= By.name("login");
	By msgLogin= By.linkText("SIGN-OFF");
	By msgLoginF= By.linkText("SIGN-ON");
	
	public void escribirUsuario (String usuario) {	
		getDriver().findElement(txtUserId).sendKeys(usuario);
	}
	
	public void escribirClave (String clave) {
		getDriver().findElement(txtPassword).sendKeys(clave);
		}
		
		public void clickEnLogin () {
			
			getDriver().findElement(btblogin).click();
				
		}
		
		public String validarAlertaExitoso() {
			
			return getDriver().findElement(msgLogin).getText();
			
		}
		
		public String validarAlertaFallido() {
			
			return getDriver().findElement(msgLoginF).getText();
			
		}

	

}
