package com.handresc1127.automatizacion.negocio;

import static org.junit.Assert.assertEquals;

import com.handresc1127.automatizacion.utilities.ActionsUtil;

public class BussinesUtil {

	public static void validateMSISDNIni(String valorInicial, String valorFinal) {

		String auxInicial = "";

		if (valorInicial.length() > 3 && valorInicial.length() <= 6) {
			auxInicial = "(" + valorInicial.substring(1, 4) + ") " + valorInicial.substring(4, valorInicial.length());
		} else if (valorInicial.length() > 6) {
			auxInicial = "(" + valorInicial.substring(1, 4) + ") " + valorInicial.substring(4, 7) + "-"
					+ valorInicial.substring(7, valorInicial.length());
		} else {
			auxInicial = "(" + valorInicial.substring(1, valorInicial.length());
		}
		assertEquals(auxInicial, valorFinal);
	}

	public static void validateMSISDNFin(String valorInicial, String valorFinal) {

		String auxFinal = "";

		if (valorInicial.length() > 3 && valorInicial.length() <= 6) {
			auxFinal = "(" + valorInicial.substring(0, 3) + ") " + valorInicial.substring(3, valorInicial.length() - 1);
		} else if (valorInicial.length() > 6) {
			auxFinal = "(" + valorInicial.substring(0, 3) + ") " + valorInicial.substring(3, 6) + "-"
					+ valorInicial.substring(6, valorInicial.length() - 1);
		} else {
			auxFinal = "(" + valorInicial.substring(0, valorInicial.length() - 1);
		}
		assertEquals(auxFinal, valorFinal);
	}

	public static void validateNumDocIni(String valorInicial, String valorFinal) {

		String auxDocFinal = "";
		auxDocFinal = valorInicial.substring(1, valorInicial.length());
		assertEquals(auxDocFinal, valorFinal);
	}

	public static void validateNumDocFin(String valorInicial, String valorFinal) {

		String auxDocFinal = "";
		auxDocFinal = valorInicial.substring(0, valorInicial.length() - 1);
		assertEquals(auxDocFinal, valorFinal);
	}

	public static void validateTCIni(String valorInicial, String valorFinal) {

		String auxInicial = "";
		String auxFinal = "";

		auxInicial = ActionsUtil.textoMinusculasSinEspacios(valorInicial.substring(1, valorInicial.length()));
		auxFinal = ActionsUtil.textoMinusculasSinEspacios(valorFinal);

		assertEquals(auxInicial, auxFinal);
	}

	public static void validateTCFin(String valorInicial, String valorFinal) {

		String auxInicial = "";
		String auxFinal = "";

		auxInicial = ActionsUtil.textoMinusculasSinEspacios(valorFinal);
		auxFinal = ActionsUtil.textoMinusculasSinEspacios(valorInicial.substring(0, valorInicial.length() - 1));

		assertEquals(auxInicial, auxFinal);
	}

}
