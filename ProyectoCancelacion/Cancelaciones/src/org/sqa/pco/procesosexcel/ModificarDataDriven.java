package org.sqa.pco.procesosexcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFColor;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ModificarDataDriven {

	public void modificarDataDriven(String rutaArchivo, int i, TreeMap<String, String> datos) {
		XSSFRow fila;
		File ruta = new File(rutaArchivo);
		FileInputStream archivo = null;
		try {
			archivo = new FileInputStream(ruta);
		} catch (FileNotFoundException e1) {
			System.err.println(e1);
		}
		XSSFWorkbook libroTrabajo = null;
		try {
			libroTrabajo = new XSSFWorkbook(archivo);
		} catch (IOException e1) {
			System.err.println(e1);
		}
		XSSFSheet hoja;
		XSSFFont font = libroTrabajo.createFont();
		hoja = libroTrabajo.getSheetAt(0);
		XSSFCellStyle estilo = libroTrabajo.createCellStyle();
		Cell campo;
		fila = hoja.getRow(i);
		switch (Integer.parseInt(datos.get("codigo"))) {
		case 0:
			estilo.setFillForegroundColor(new XSSFColor(new java.awt.Color(118, 181, 49)));
			estilo.setFillPattern(FillPatternType.SOLID_FOREGROUND);
			estilo.setAlignment(HorizontalAlignment.CENTER);
			estilo.setVerticalAlignment(VerticalAlignment.CENTER);
			estilo.setBorderBottom(BorderStyle.THIN);
			estilo.setBorderRight(BorderStyle.THIN);
			font = libroTrabajo.createFont();
			font.setBold(true);
			font.setColor(IndexedColors.BLACK.index);
			estilo.setFont(font);
			hoja.getRow(i).getCell(0).setCellStyle(estilo);
			hoja.getRow(i).getCell(1).setCellStyle(estilo);
			hoja.getRow(i).getCell(2).setCellStyle(estilo);
			hoja.getRow(i).getCell(3).setCellStyle(estilo);
			hoja.getRow(i).getCell(4).setCellStyle(estilo);
			campo = fila.createCell(5);
			hoja.getRow(i).getCell(5).setCellStyle(estilo);
			hoja.getRow(i).getCell(6).setCellStyle(estilo);
			hoja.getRow(i).getCell(7).setCellStyle(estilo);
			hoja.getRow(i).getCell(8).setCellStyle(estilo);
			hoja.getRow(i).getCell(9).setCellStyle(estilo);
			hoja.getRow(i).getCell(10).setCellStyle(estilo);
			hoja.getRow(i).getCell(11).setCellStyle(estilo);
			hoja.getRow(i).getCell(12).setCellStyle(estilo);
			campo = fila.createCell(13);
			campo.setCellValue(datos.get("tiempo"));
			break;
		case 1:
			estilo.setFillForegroundColor(new XSSFColor(new java.awt.Color(255, 255, 0)));
			estilo.setFillPattern(FillPatternType.SOLID_FOREGROUND);
			font = libroTrabajo.createFont();
			font.setColor(IndexedColors.BLACK.index);
			estilo.setFont(font);
			hoja.getRow(i).getCell(0).setCellStyle(estilo);
			hoja.getRow(i).getCell(1).setCellStyle(estilo);
			hoja.getRow(i).getCell(2).setCellStyle(estilo);
			hoja.getRow(i).getCell(3).setCellStyle(estilo);
			hoja.getRow(i).getCell(4).setCellStyle(estilo);
			campo = fila.createCell(5);
			hoja.getRow(i).getCell(5).setCellStyle(estilo);
			hoja.getRow(i).getCell(6).setCellStyle(estilo);
			hoja.getRow(i).getCell(7).setCellStyle(estilo);
			hoja.getRow(i).getCell(8).setCellStyle(estilo);
			hoja.getRow(i).getCell(9).setCellStyle(estilo);
			hoja.getRow(i).getCell(10).setCellStyle(estilo);
			hoja.getRow(i).getCell(11).setCellStyle(estilo);
			hoja.getRow(i).getCell(12).setCellStyle(estilo);
			campo = fila.createCell(13);
			campo.setCellValue(datos.get("tiempo"));
			campo = fila.createCell(14);
			campo.setCellValue(datos.get("errorCode") + " : " + datos.get("errorMsg"));
			break;

		case 2:
			estilo.setFillForegroundColor(new XSSFColor(new java.awt.Color(83, 141, 213)));
			estilo.setFillPattern(FillPatternType.SOLID_FOREGROUND);
			estilo.setAlignment(HorizontalAlignment.CENTER);
			estilo.setVerticalAlignment(VerticalAlignment.CENTER);
			estilo.setBorderBottom(BorderStyle.THIN);
			estilo.setBorderRight(BorderStyle.THIN);
			font = libroTrabajo.createFont();
			font.setBold(true);
			font.setColor(IndexedColors.BLACK.index);
			estilo.setFont(font);
			hoja.getRow(i).getCell(0).setCellStyle(estilo);
			hoja.getRow(i).getCell(1).setCellStyle(estilo);
			hoja.getRow(i).getCell(2).setCellStyle(estilo);
			hoja.getRow(i).getCell(3).setCellStyle(estilo);
			hoja.getRow(i).getCell(4).setCellStyle(estilo);
			campo = fila.createCell(5);
			hoja.getRow(i).getCell(5).setCellStyle(estilo);
			hoja.getRow(i).getCell(6).setCellStyle(estilo);
			hoja.getRow(i).getCell(7).setCellStyle(estilo);
			hoja.getRow(i).getCell(8).setCellStyle(estilo);
			hoja.getRow(i).getCell(9).setCellStyle(estilo);
			hoja.getRow(i).getCell(10).setCellStyle(estilo);
			hoja.getRow(i).getCell(11).setCellStyle(estilo);
			hoja.getRow(i).getCell(12).setCellStyle(estilo);
			campo = fila.createCell(13);
			campo.setCellValue(datos.get("tiempo"));
			campo = fila.createCell(14);
			campo.setCellValue(datos.get("resultCode") + " : " + datos.get("resultMsg"));
			break;
		default:
			break;
		}

		FileOutputStream archivoOut = null;
		try {
			archivoOut = new FileOutputStream(ruta);
		} catch (FileNotFoundException e) {
			System.err.println(e);
		}
		try {
			libroTrabajo.write(archivoOut);
		} catch (IOException e) {
			System.err.println(e);
		}
		try {
			archivoOut.flush();
		} catch (IOException e) {
			System.err.println(e);
		}
		try {
			archivoOut.close();
		} catch (IOException e) {
			System.err.println(e);
		}

	}

}
