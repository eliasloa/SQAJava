package org.sqa.pco.utilidades;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.sqa.pco.dto.Respuesta;

public class Utilidades {
	
	public Respuesta leerArchivo(String valor) {
		Respuesta respuesta = new Respuesta();
		try {
			Properties config = new Properties();
			config.load(new FileInputStream("C:\\ConfiguracionPruebas\\Cancelaciones.config"));
			String dato = config.getProperty(valor);
			respuesta.setCodigo(0);
			respuesta.setMensaje(dato);
			return respuesta;
		} catch (IOException e) {
			System.err.println(e);
			respuesta.setCodigo(1);
			respuesta.setMensaje(null);
			return respuesta;
		}
	}
}
