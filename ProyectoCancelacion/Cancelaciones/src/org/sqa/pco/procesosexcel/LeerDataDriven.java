package org.sqa.pco.procesosexcel;

import java.io.File;
import java.io.FileInputStream;
import java.util.TreeMap;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.sqa.pco.api.Api;
import org.sqa.pco.constantes.Constantes;
import org.sqa.pco.utilidades.Utilidades;

public class LeerDataDriven {
	Utilidades utilidades = new Utilidades();
	String rutaArchivo = utilidades.leerArchivo(Constantes.RUTAARCHIVO).getMensaje();

	public void leerDataDriven() {
		Api api = new Api();
		ModificarDataDriven modificarDataDriven = new ModificarDataDriven();
		TreeMap<String, String> datos = new TreeMap<>();
		TreeMap<String, String> respuesta = new TreeMap<>();
		try {
			File ruta = new File(rutaArchivo);
			FileInputStream archivo = new FileInputStream(ruta);
			@SuppressWarnings("resource")
			XSSFWorkbook libroTrabajo = new XSSFWorkbook(archivo);
			XSSFSheet hoja = libroTrabajo.getSheetAt(0);
			int uf = hoja.getLastRowNum();
			for (int i = 1; i <= uf; i++) {
				//if (hoja.getRow(i).getCell(0).getNumericCellValue() != 0) {
				if (!hoja.getRow(i).getCell(0).getStringCellValue().equals(null) || !hoja.getRow(i).getCell(0).getStringCellValue().equals(" ")) {

					//int terminalId = (int) hoja.getRow(i).getCell(0).getNumericCellValue();
					System.out.println("terminalId");
					String terminalId = hoja.getRow(i).getCell(0).getStringCellValue();
					System.out.println("terminalId"+terminalId);
					String transactionId =  hoja.getRow(i).getCell(1).getStringCellValue();
					System.out.println("transactionId"+transactionId);
					String locationCode = hoja.getRow(i).getCell(2).getStringCellValue();
					System.out.println("locationCode"+locationCode);
					String transactionDate = hoja.getRow(i).getCell(3).getStringCellValue();
					System.out.println("transactionDate"+transactionDate);
					String nut = hoja.getRow(i).getCell(4).getStringCellValue();
					System.out.println("nut"+nut);
					String terminalIdO = hoja.getRow(i).getCell(6).getStringCellValue();
					System.out.println("terminalIdO"+terminalIdO);
					String transactionIdO = hoja.getRow(i).getCell(7).getStringCellValue();
					System.out.println("transactionIdO"+transactionIdO);
					String cashierIdO = hoja.getRow(i).getCell(8).getStringCellValue();
					System.out.println("cashierIdO"+cashierIdO);
					String locationCodeO = hoja.getRow(i).getCell(9).getStringCellValue();
					System.out.println("locationCodeO"+locationCodeO);
					String transactionDateO = hoja.getRow(i).getCell(10).getStringCellValue();
					System.out.println("transactionDateO"+transactionDateO);
					String nutO = hoja.getRow(i).getCell(11).getStringCellValue();
					System.out.println("nutO"+nutO);
					String partherCodeO = hoja.getRow(i).getCell(12).getStringCellValue();
					System.out.println("partherCodeO"+partherCodeO);
					datos.put("terminalId", terminalId.trim());
					datos.put("transactionId", transactionId.trim());
					datos.put("locationCode", locationCode.trim());
					datos.put("transactionDate", transactionDate.trim());
					datos.put("nut", nut.trim());
					datos.put("terminalIdO", terminalIdO.trim());
					datos.put("transactionIdO", transactionIdO.trim());
					datos.put("cashierIdO", cashierIdO.trim());
					datos.put("locationCodeO", locationCodeO.trim());
					datos.put("transactionDateO", transactionDateO.trim());
					datos.put("nutO", nutO.trim());
					datos.put("partherCodeO", partherCodeO.trim());
					respuesta = api.api(datos);
					modificarDataDriven.modificarDataDriven(rutaArchivo, i, respuesta);
				} else {
					break;
				}
			}
			System.out.println("Proceso finalizado con exito!");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
