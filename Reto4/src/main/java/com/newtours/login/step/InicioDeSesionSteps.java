package com.newtours.login.step;

import com.newtours.login.pages.InicioDeSesionPageObject;

import net.thucydides.core.annotations.Step;

public class InicioDeSesionSteps {
	
	InicioDeSesionPageObject inicioDeSesionPOM = new InicioDeSesionPageObject();

	
	@Step
	public void abrirAplicacionNewTours() {
		
		inicioDeSesionPOM.open();
		
	}
	
	@Step
	public void escribirUsuario(String usuario) {
	
		inicioDeSesionPOM.escribirUsuario(usuario);
		
	}
	
	@Step
	public void escribirClave(String clave) {
		
		inicioDeSesionPOM.escribirClave(clave);
		
	}
	
	@Step("Aqui hice click en login")
	public void clickEnLogin() {
		
		inicioDeSesionPOM.clickEnLogin();
		
	}
	
	@Step("Se revisa el SIGN-OFF")
	public String validarAlertaExitoso() {
		
		return inicioDeSesionPOM.validarAlertaExitoso();
	}
	
	@Step("Se revisa el SIGN-ON")
	public String validarAlertaFallido() {
		
		return inicioDeSesionPOM.validarAlertaFallido();
	}
	
	

}
