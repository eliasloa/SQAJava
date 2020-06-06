package org.petstore.swagger.pruebas.stepdefinitions;

import java.util.List;

import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.petstore.swagger.pruebas.models.Usuario;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.rest.SerenityRest;

public class CrearUsuarioStepsDefinitions {
	
	@Cuando("^Elias envia la siguiente operacion al servicio  \"([^\"]*)\"$")
	public void eliasEnviaLaSiguienteOperacionAlServicio(String url, List<Usuario> listaUsuario) {
		String cuerpo="{\r\n" + 
				"  \"id\": "+listaUsuario.get(0).getIdUsuario()+",\r\n" + 
				"  \"username\": \""+listaUsuario.get(0).getUsername()+"\",\r\n" + 
				"  \"firstName\": \""+listaUsuario.get(0).getFirstName()+"\",\r\n" + 
				"  \"lastName\": \""+listaUsuario.get(0).getLastName()+"\",\r\n" + 
				"  \"email\": \""+listaUsuario.get(0).getEmail()+"\",\r\n" + 
				"  \"password\": \""+listaUsuario.get(0).getPassword()+"\",\r\n" + 
				"  \"phone\": \""+listaUsuario.get(0).getPhone()+"\",\r\n" + 
				"  \"userStatus\": "+listaUsuario.get(0).getUserStatus()+"\r\n" + 
				"}";
		
		SerenityRest.given().body(cuerpo).baseUri(url).header("Content-Type","application/json").post();
	
	}
	
	@Entonces("^valida que el codigo de estatus sea (\\d+)$")
	public void validaQueElCodigoDeEstatusSea(int status) {
		SerenityRest.lastResponse().then().statusCode(status);
	}
	
	@Entonces("^valida que el contenido del  \"([^\"]*)\" sea (\\d+)$")
	public void validaQueElContenidoDelSea(String code, int resultadoEsperado) {
		 //System.out.println(SerenityRest.lastResponse().then().body("type", Matchers.equalToIgnoringCase("unknown")));
		 SerenityRest.lastResponse().then().body(code, Matchers.equalTo(resultadoEsperado));
		
	}
	

	@Entonces("^valida el contenido del  \"([^\"]*)\" sea \"([^\"]*)\"$")
	public void validaElContenidoDelSea(String type, String resultadoEsperado) {
		SerenityRest.lastResponse().then().body(type, Matchers.equalTo(resultadoEsperado));
	}

	
	
	@Entonces("^valida que el contenido del  \"([^\"]*)\" sea \"([^\"]*)\"$")
	public void validaQueElContenidoDelSea(String message, String resultadoEsperado) {
		
		SerenityRest.lastResponse().then().body(message, Matchers.equalTo(resultadoEsperado));
	}

	

}

