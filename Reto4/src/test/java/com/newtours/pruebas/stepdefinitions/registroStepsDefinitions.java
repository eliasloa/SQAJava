package com.newtours.pruebas.stepdefinitions;

import static org.junit.Assert.assertThat;

import java.util.List;

import org.hamcrest.Matchers;

import com.newtours.login.models.Registro;
import com.newtours.login.step.InicioDeRegistroSteps;

import cucumber.api.java.ast.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class registroStepsDefinitions {
	
	@Steps
	InicioDeRegistroSteps inicioDeRegistroSteps;
	
	
	@Dado("^que estoy en la pagina de NewTours$")
	public void queEstoyEnLaPaginaDeNewTours() {
		inicioDeRegistroSteps.abrirAplicacionNewTours();
	}


	@Cuando("^registro mis credenciales$")
	public void registroMisCredenciales(List<Registro> listaRegistro) {
		inicioDeRegistroSteps.clickEnRegistro();
		inicioDeRegistroSteps.escribirNombre(listaRegistro.get(0).getNombre());
		inicioDeRegistroSteps.escribirApellido(listaRegistro.get(0).getApellido());
		inicioDeRegistroSteps.escribirPhone(listaRegistro.get(0).getPhone());
		inicioDeRegistroSteps.escribirEmail(listaRegistro.get(0).getEmail());
		inicioDeRegistroSteps.escribirDireccion(listaRegistro.get(0).getAddress());
		inicioDeRegistroSteps.escribirCity(listaRegistro.get(0).getCity());
		inicioDeRegistroSteps.escribirPais(listaRegistro.get(0).getCountry());
		inicioDeRegistroSteps.escribirState(listaRegistro.get(0).getState());
		inicioDeRegistroSteps.escribirEmailNom(listaRegistro.get(0).getUsername());
		inicioDeRegistroSteps.escribirPassword(listaRegistro.get(0).getPassword());
		inicioDeRegistroSteps.escribirConfirmarPass(listaRegistro.get(0).getConfirmarPassword());
		inicioDeRegistroSteps.clickEnRegister();
	}

	@Entonces("^valido el registro correcto$")
	public void validoElRegistroCorrecto() {
		
		assertThat(inicioDeRegistroSteps.validarAlertaExitoso(), Matchers.is("SIGN-OFF"));
	  
	}
	
	

}
