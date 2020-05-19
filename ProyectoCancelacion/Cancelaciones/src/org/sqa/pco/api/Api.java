package org.sqa.pco.api;

import java.util.TreeMap;

import org.apache.oltu.oauth2.common.exception.OAuthProblemException;
import org.apache.oltu.oauth2.common.exception.OAuthSystemException;
import org.sqa.pco.constantes.Constantes;
import org.sqa.pco.utilidades.Utilidades;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Api {

	public TreeMap<String, String> api(TreeMap<String, String> datos)
			throws OAuthSystemException, OAuthProblemException {
		Utilidades utilidades = new Utilidades();
		Autenticacion autenticacion = new Autenticacion();
		Response response = null;
		TreeMap<String, String> respuestaApi = new TreeMap<>();
		String token = autenticacion.generacionToken().getMensaje();
		String base = "https://apinp.puntoscolombia.com:8443/pos-management/v1/transactions";
		//String base = "https://api.puntoscolombia.com:8443/pos-management/v1/transactions";
		String json = "{\"transactionIdentifier\":{\"terminalId\":\"" + datos.get("terminalId")
				+ "\",\"transactionId\":\"" + datos.get("transactionId") + "\",\"cashierId\":\"" + datos.get("cashierIdO")
				+ "\",\"locationCode\":\"" + datos.get("locationCode") + "\",\"transactionDate\":\""
				+ datos.get("transactionDate") + "\",\"nut\":\"" + datos.get("nut") + "\"},\"partnerCode\":\""
				+ datos.get("partherCodeO") + "\",\"originalTransactionIdentifier\":{\"terminalId\":\""
				+ datos.get("terminalIdO") + "\",\"transactionId\":\"" + datos.get("transactionIdO")
				+ "\",\"cashierId\":\"" + datos.get("cashierIdO") + "\",\"locationCode\":\""
				+ datos.get("locationCodeO") + "\",\"transactionDate\":\"" + datos.get("transactionDateO")
				+ "\",\"nut\":\"" + datos.get("nutO") + "\"}}";
		RestAssured.baseURI = base;
		RestAssured.keyStore(utilidades.leerArchivo(Constantes.RUTACERTIFICADO).getMensaje(),
				utilidades.leerArchivo(Constantes.CLAVECERTIFICADO).getMensaje());
		RestAssured.trustStore(utilidades.leerArchivo(Constantes.RUTACACERTSJAVA).getMensaje(),
				utilidades.leerArchivo(Constantes.CLAVECACERTSJAVA).getMensaje());
		RequestSpecification request = RestAssured.given().auth().oauth2(token);
		request.body(json);
		request.header("ca-channel", "L");
		response = request.request(Method.POST, "/cancel");
		long tiempo = response.getTime();
		JsonPath respuestaJson = response.jsonPath();
		
		try {
			/**
			 * Captura y procesamiento de respuesta.
			 */
			Object mainBalance = respuestaJson.get("mainBalance");
			Object balances = respuestaJson.get("balances");
			Object approbationNumber = respuestaJson.get("approbationNumber");
			Object errorCode = respuestaJson.get("errorCode");
			Object errorMsg = respuestaJson.get("errorMsg");
			Object resultCode = respuestaJson.get("resultCode");
			Object resultMsg = respuestaJson.get("resultMsg");
			if (mainBalance != null) {
				respuestaApi.put("mainBalance", mainBalance.toString());
				respuestaApi.put("balances", balances.toString());
				respuestaApi.put("approbationNumber", approbationNumber.toString());
				respuestaApi.put("balances", balances.toString());
				respuestaApi.put("codigo", Integer.toString(0));
				respuestaApi.put("tiempo", Long.toString(tiempo));
				return respuestaApi;
			} else {
				if (resultCode != null) {
					respuestaApi.put("codigo", Integer.toString(2));
					respuestaApi.put("resultCode", resultCode.toString());
					respuestaApi.put("resultMsg", resultMsg.toString());
					respuestaApi.put("tiempo", Long.toString(tiempo));
					return respuestaApi;
				} else {
					respuestaApi.put("codigo", Integer.toString(1));
					respuestaApi.put("errorCode", errorCode.toString());
					respuestaApi.put("errorMsg", errorMsg.toString());
					respuestaApi.put("tiempo", Long.toString(tiempo));
					return respuestaApi;
				}
			}
		} catch (Exception e) {
			respuestaApi.put("codigo", Integer.toString(1));
			System.out.println("codigo: "+respuestaApi);
			respuestaApi.put("mensaje", "No se pudieron extraer los elementos del Json");
			return respuestaApi;
		}
	}

}
