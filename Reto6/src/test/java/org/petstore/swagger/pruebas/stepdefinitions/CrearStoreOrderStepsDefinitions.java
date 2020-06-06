package org.petstore.swagger.pruebas.stepdefinitions;

import java.util.List;

import org.hamcrest.Matchers;
import org.petstore.swagger.pruebas.models.StoreOrder;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.rest.SerenityRest;

public class CrearStoreOrderStepsDefinitions {
	
	@Cuando("^Elias envia la siguiente solicitud  a \"([^\"]*)\"$")
	public void eliasEnviaLaSiguienteSolicitudA(String url, List<StoreOrder> listaStoreOrder) {
		String cuerpo="	{\r\n" + 
				"  \"id\": "+listaStoreOrder.get(0).getIdOrder()+",\r\n" + 
				"  \"petId\": "+listaStoreOrder.get(0).getPetId()+",\r\n" + 
				"  \"quantity\": "+listaStoreOrder.get(0).getQuantity()+",\r\n" + 
				"  \"shipDate\": \""+listaStoreOrder.get(0).getShipDate()+"\",\r\n" + 
				"  \"status\": \""+listaStoreOrder.get(0).getStatus()+"\",\r\n" + 
				"  \"complete\": "+listaStoreOrder.get(0).getComplete()+"\r\n" + 
				"}";
		SerenityRest.given().body(cuerpo).baseUri(url).header("Content-Type","application/json").post();
	  
	}

	@Entonces("^se valida que el codigo de estatus sea (\\d+)$")
	public void seValidaQueElCodigoDeEstatusSea(int status) {
		SerenityRest.lastResponse().then().statusCode(status);
	}
	
	@Entonces("^valida el contenido del id  \"([^\"]*)\" sea (\\d+)$")
	public void validaElContenidoDelIdSea(String id, int resultadoEsperado) {
		SerenityRest.lastResponse().then().body(id, Matchers.equalTo(resultadoEsperado));
	}

	@Entonces("^valida el contenido del campo  \"([^\"]*)\" sea (\\d+)$")
	public void validaElContenidoDelCampoSea(String petId, int resultadoEsperado) {
		SerenityRest.lastResponse().then().body(petId, Matchers.equalTo(resultadoEsperado));
	}

	@Entonces("^valida que el contenido del item  \"([^\"]*)\" sea (\\d+)$")
	public void validaQueElContenidoDelItemSea(String quantity, int resultadoEsperado) {
		SerenityRest.lastResponse().then().body(quantity, Matchers.equalTo(resultadoEsperado));
	}

	@Entonces("^valida el contenido de la fecha  \"([^\"]*)\" sea \"([^\"]*)\"$")
	public void validaElContenidoDeLaFechaSea(String shipDate, String resultadoEsperado) {
		SerenityRest.lastResponse().then().body(shipDate, Matchers.equalTo(resultadoEsperado));
	}
	

}
