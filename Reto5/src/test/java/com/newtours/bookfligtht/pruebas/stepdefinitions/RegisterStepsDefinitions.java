package com.newtours.bookfligtht.pruebas.stepdefinitions;

import java.util.List;

import com.newtours.bookfligtht.pruebas.models.Register;
import com.newtours.bookfligtht.pruebas.steps.RegisterSteps;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class RegisterStepsDefinitions {
	
	
	@Steps
	RegisterSteps RegisterSteps;
	
	@Dado("^que estoy en la pagina de NewTours$")
	public void queEstoyEnLaPaginaDeNewTours() {
		
		RegisterSteps.abrirNavegadorEnNewTours();

	}

	@Cuando("^registro mis credenciales$")
	public void registroMisCredenciales(List<Register> listRegister) {
		
		RegisterSteps.clickEnRegistro();
		RegisterSteps.escribirFirtsName(listRegister.get(0).getNombre());
		RegisterSteps.escribirLastName(listRegister.get(0).getApellido());
		RegisterSteps.escribirPhone(listRegister.get(0).getPhone());
		RegisterSteps.escribirEmail(listRegister.get(0).getEmail());
		RegisterSteps.escribirDireccion(listRegister.get(0).getAddress());
		RegisterSteps.escribirCity(listRegister.get(0).getCity());
		RegisterSteps.escribirState(listRegister.get(0).getState());
		RegisterSteps.escribirCountry(listRegister.get(0).getCountry());
		RegisterSteps.escribirUserEmail(listRegister.get(0).getUsername());
		RegisterSteps.escribirPassword(listRegister.get(0).getPassword());
		RegisterSteps.escribirConfirmPassword(listRegister.get(0).getConfirmarpassword());
		RegisterSteps.clickEnSubmit();
	}

	@Entonces("^valido el registro correcto \"([^\"]*)\"$")
	public void validoElRegistroCorrecto(String textoEsperado) {
	
		RegisterSteps.validarTextExitoso(textoEsperado);
		
	}

}
