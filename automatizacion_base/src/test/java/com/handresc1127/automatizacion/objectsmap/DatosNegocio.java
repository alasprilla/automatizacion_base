package com.handresc1127.automatizacion.objectsmap;

import java.util.Calendar;
import java.util.HashMap;

import com.handresc1127.automatizacion.utilities.ActionsUtil;

public final class DatosNegocio {
	
	
	private static final HashMap<String, String> datosDelNegocio = new HashMap<String, String>();
	static {
		Calendar now = Calendar.getInstance();
		dataPut("paginapagodefacturas", ActionsUtil.getProperty("baseURL1"));
		dataPut("paginamicuentatigo", ActionsUtil.getProperty("baseURL2"));
		dataPut("movil_msisdnconfacturas", "3043878232");
		dataPut("movil_msisdnsinfacturas", "3003588240");
		dataPut("hogar_numdocumentoconfacturas", "70507173");
		dataPut("hogar_numdocumentosinfacturas", "71770656");
		dataPut("thismm()", String.valueOf(now.get(Calendar.MONTH) + 1));
		dataPut("thisyyyy()", String.valueOf(now.get(Calendar.YEAR)));
		now.add(Calendar.MONTH, 1);
		dataPut("nextmm()", String.valueOf(now.get(Calendar.MONTH) + 1));
		now = Calendar.getInstance();
		now.add(Calendar.YEAR, 1);
		dataPut("nextyyyy()", String.valueOf(now.get(Calendar.YEAR)));
	};
	
	public static String dataGet(String keyData) {
		String retorno = datosDelNegocio.get(ActionsUtil.textoMinusculasSinEspacios(keyData));
		if (retorno == null)
			retorno = keyData;
		return retorno;
	}

	public static void dataPut(String key, String value){
		datosDelNegocio.put(key, value);
		System.out.println(datosDelNegocio);
	}
	
//	public DatosNegocio(){
//		Calendar now = Calendar.getInstance();
//		PageDefault.dataPut("paginapagodefacturas", ActionsUtil.getProperty("baseURL1"));
//		PageDefault.dataPut("paginamicuentatigo", ActionsUtil.getProperty("baseURL2"));
//		PageDefault.dataPut("movil_msisdnconfacturas", "3043878232");
//		PageDefault.dataPut("movil_msisdnsinfacturas", "3003588240");
//		PageDefault.dataPut("hogar_numdocumentoconfacturas", "70507173");
//		PageDefault.dataPut("hogar_numdocumentosinfacturas", "71770656");
//		PageDefault.dataPut("thismm()", String.valueOf(now.get(Calendar.MONTH) + 1));
//		PageDefault.dataPut("thisyyyy()", String.valueOf(now.get(Calendar.YEAR)));
//		now.add(Calendar.MONTH, 1);
//		PageDefault.dataPut("nextmm()", String.valueOf(now.get(Calendar.MONTH) + 1));
//		now = Calendar.getInstance();
//		now.add(Calendar.YEAR, 1);
//		PageDefault.dataPut("nextyyyy()", String.valueOf(now.get(Calendar.YEAR)));
//	}
	

}
