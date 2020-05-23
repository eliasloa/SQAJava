package com.newtours.bookfligtht.pruebas.pageobjects;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://newtours.demoaut.com/")
public class RegisterPageObject extends PageObject {
	
	
	By linkRegistro = By.linkText("REGISTER");
	By txtFirtsName = By.name("firstName");
	By txtLastName = By.name("lastName");
	By txtPhone = By.name("phone");
	By txtEmail= By.id("userName");
	By txtDireccion = By.name("address1");
	By txtCity = By.name("city");
	By txtState = By.name("state");
	By txtCountry= By.name("country");
	By txtEmailNom = By.name("email");
	By txtPassword = By.name("password");
	By txtConfirmarPass = By.name("confirmPassword");
	By btbSubmit= By.name("register");
	By msgLogin= By.xpath("//a[contains(text(),'SIGN-OFF')]");
	
	//Se crean Getter and Setter en Source
	
	public By getMsRegistro() {
		return linkRegistro;
	}
	public By getTxtFirtsName() {
		return txtFirtsName;
	}
	public By getTxtLastName() {
		return txtLastName;
	}
	public By getTxtPhone() {
		return txtPhone;
	}
	public By getTxtEmail() {
		return txtEmail;
	}
	public By getTxtDireccion() {
		return txtDireccion;
	}
	public By getTxtCity() {
		return txtCity;
	}
	public By getTxtState() {
		return txtState;
	}
	public By getTxtCountry() {
		return txtCountry;
	}
	public By getTxtEmailNom() {
		return txtEmailNom;
	}
	public By getTxtPassword() {
		return txtPassword;
	}
	public By getTxtConfirmarPass() {
		return txtConfirmarPass;
	}
	public By getBtbSubmit() {
		return btbSubmit;
	}
	public By getMsgLogin() {
		return msgLogin;
	}

}
