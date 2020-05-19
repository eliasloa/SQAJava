package org.sqa.pco.api;

import org.apache.oltu.oauth2.client.OAuthClient;
import org.apache.oltu.oauth2.client.URLConnectionClient;
import org.apache.oltu.oauth2.client.request.OAuthClientRequest;
import org.apache.oltu.oauth2.client.response.OAuthJSONAccessTokenResponse;
import org.apache.oltu.oauth2.common.exception.OAuthProblemException;
import org.apache.oltu.oauth2.common.exception.OAuthSystemException;
import org.apache.oltu.oauth2.common.message.types.GrantType;
import org.sqa.pco.dto.Respuesta;
import org.sqa.pco.constantes.Constantes;
import org.sqa.pco.utilidades.Utilidades;

public class Autenticacion {

	public Respuesta generacionToken() throws OAuthSystemException, OAuthProblemException {
		Respuesta respuesta = new Respuesta();
		Utilidades utilidades = new Utilidades();
		Respuesta tokenURL = utilidades.leerArchivo(Constantes.URLTOKEN);
		OAuthClient client = new OAuthClient(new URLConnectionClient());
		Respuesta clientId = utilidades.leerArchivo(Constantes.CLIENTEID);
		Respuesta clienteSecret = utilidades.leerArchivo(Constantes.CLIENTSECRET);
		OAuthClientRequest request = null;
		/**
		 * Autenticación para la captura y procesamiento del token.
		 */
		request = OAuthClientRequest.tokenLocation(tokenURL.getMensaje()).setGrantType(GrantType.CLIENT_CREDENTIALS)
				.setClientId(clientId.getMensaje()).setClientSecret(clienteSecret.getMensaje()).buildQueryMessage();
		String token = client.accessToken(request, OAuthJSONAccessTokenResponse.class).getAccessToken();
		if (token == null) {
			respuesta.setCodigo(1);
			respuesta.setMensaje("No generó el token.");
			return respuesta;
		} else {
			respuesta.setCodigo(0);
			respuesta.setMensaje(token);
			return respuesta;
		}
	}

}
