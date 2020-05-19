package com.newtours.login.step;

import com.newtours.login.pages.RegistroDeSesionPageObject;

import net.thucydides.core.annotations.Step;

public class InicioDeRegistroSteps {
	
	RegistroDeSesionPageObject inicioDeRegistroPOM = new RegistroDeSesionPageObject();
	
	@Step
	public void abrirAplicacionNewTours() {
		
		inicioDeRegistroPOM.open();
	}
	
	@Step("Hace click en Registro")
	public void clickEnRegistro() {
		
		inicioDeRegistroPOM.clickEnRegistro();
	}
	
	@Step
	public void escribirNombre(String nombre) {
		
		inicioDeRegistroPOM.escribirNombre(nombre);
	}
	
	@Step
	public void escribirApellido(String apellido) {
		
		inicioDeRegistroPOM.escribirApellido(apellido);
	}
	
	@Step
	public void escribirPhone(String phone) {
		
		inicioDeRegistroPOM.escribirPhone(phone);
	}
	
	@Step
	public void escribirEmail(String email) {
		
		inicioDeRegistroPOM.escribirEmail(email);
	}
	
	@Step
	public void escribirDireccion(String direccion) {
		
		inicioDeRegistroPOM.escribirDireccion(direccion);
	}
	
	@Step
	public void escribirCity(String city) {
		
		inicioDeRegistroPOM.escribirCity(city);
	}
	
	@Step
	public void escribirState(String state) {
		
		inicioDeRegistroPOM.escribirState(state);
	}
	
	@Step
	public void escribirEmailNom(String username) {
		
		inicioDeRegistroPOM.escribirEmailNom(username);
	}
	
	@Step
	public void escribirPassword(String password) {
		
		inicioDeRegistroPOM.escribirPassword(password);
	}
	
	@Step
	public void escribirConfirmarPass(String confirmar) {
		
		inicioDeRegistroPOM.escribirConfirmarPass(confirmar);
	}
	
	@Step
	public void escribirPais(String country) {
		
		inicioDeRegistroPOM.escribirPais(country);
	}
	
	
	@Step("Hace click en Registrar")
	public void clickEnRegister() {
		
		inicioDeRegistroPOM.clickEnRegister();
	}
	
	@Step("Se revisa el SIGN-OFF")
	public String validarAlertaExitoso() {
		
		return inicioDeRegistroPOM.validarAlertaExitoso();
	}
	

}
