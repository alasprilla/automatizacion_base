package com.handresc1127.automatizacion.objectsmap;

import java.util.Calendar;
import java.util.HashMap;

import com.handresc1127.automatizacion.utilities.ActionsUtil;

public final class DatosNegocio {
	
	private DatosNegocio() {
	    throw new IllegalStateException("Utility class");
	  }
	
	private static final HashMap<String, String> datosDelNegocio = new HashMap<>();
	
	static {
		Calendar now = Calendar.getInstance();
		dataPut("paginapagodefacturas", ActionsUtil.getProperty("baseURL1"));
		dataPut("paginapaquetes", ActionsUtil.getProperty("baseURL1"));
		dataPut("paginamicuentatigo", ActionsUtil.getProperty("baseURL2"));
		dataPut("movil_msisdnconfacturas", "3043878232");
		dataPut("movil_msisdnsinfacturas", "3003588240");
		dataPut("hogar_numdocumentoconfacturas", "552716");
		dataPut("hogar_numdocumentosinfacturas", "71770656");
		dataPut("msisdncondeuda", "3008911502");
		dataPut("msisdnsindeuda", "3008812932");
		dataPut("thismm()", String.valueOf(now.get(Calendar.MONTH) + 1));
		dataPut("thisyyyy()", String.valueOf(now.get(Calendar.YEAR)));
		now.add(Calendar.MONTH, 1);
		dataPut("nextmm()", String.valueOf(now.get(Calendar.MONTH) + 1));
		now = Calendar.getInstance();
		now.add(Calendar.YEAR, 1);
		dataPut("nextyyyy()", String.valueOf(now.get(Calendar.YEAR)));
	}
	
	public static String dataGet(String keyData) {
		String retorno = datosDelNegocio.get(ActionsUtil.textoMinusculasSinEspacios(keyData));
		if (retorno == null)
			retorno = keyData;
		return retorno;
	}

	public static void dataPut(String key, String value){
		datosDelNegocio.put(ActionsUtil.textoMinusculasSinEspacios(key),value);
	}
	
}
