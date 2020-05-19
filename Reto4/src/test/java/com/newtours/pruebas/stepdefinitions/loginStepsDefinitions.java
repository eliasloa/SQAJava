package com.newtours.pruebas.stepdefinitions;

import static org.junit.Assert.assertThat;

import java.util.List;

import org.hamcrest.Matchers;

import com.newtours.login.models.Usuario;
import com.newtours.login.step.InicioDeSesionSteps;

import cucumber.api.java.ast.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class loginStepsDefinitions {
	
	
	@Steps
	InicioDeSesionSteps inicioDeSesionSteps;
	
	@Dado("^que estoy en la pagina de inicio de NewTours$")
	public void queEstoyEnLaPaginaDeInicioDeNewTours() {
		
		inicioDeSesionSteps.abrirAplicacionNewTours();

	}


	@Cuando("^ingreso mis credenciales$")
	public void ingresoMisCredenciales(List<Usuario> listaUsuario) {
		inicioDeSesionSteps.escribirUsuario(listaUsuario.get(0).getUsuario());
		inicioDeSesionSteps.escribirClave(listaUsuario.get(0).getClave());
		inicioDeSesionSteps.clickEnLogin();

	}

	@Entonces("^valido el ingreso correcto$")
	public void validoElIngresoCorrecto() {
		
		assertThat(inicioDeSesionSteps.validarAlertaExitoso(), Matchers.is("SIGN-OFF"));

	}

	@Entonces("^valido el error de ingreso$")
	public void validoElErrorDeIngreso() {
		
		assertThat(inicioDeSesionSteps.validarAlertaFallido(), Matchers.is("SIGN-ON"));

	}



}
