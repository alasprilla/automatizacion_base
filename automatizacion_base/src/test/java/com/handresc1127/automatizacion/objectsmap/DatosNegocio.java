package com.handresc1127.automatizacion.objectsmap;

import java.util.Calendar;

import com.handresc1127.automatizacion.pageobjects.PageDefault;
import com.handresc1127.automatizacion.utilities.ActionsUtil;

public class DatosNegocio {
	public DatosNegocio(){
		Calendar now = Calendar.getInstance();
		PageDefault.dataPut("paginapagodefacturas", ActionsUtil.getProperty("baseURL1"));
		PageDefault.dataPut("paginamicuentatigo", ActionsUtil.getProperty("baseURL2"));
		PageDefault.dataPut("movil_msisdnconfacturas", "3043878232");
		PageDefault.dataPut("movil_msisdnsinfacturas", "3003588240");
		PageDefault.dataPut("hogar_numdocumentoconfacturas", "70507173");
		PageDefault.dataPut("hogar_numdocumentosinfacturas", "71770656");
		PageDefault.dataPut("thismm()", String.valueOf(now.get(Calendar.MONTH) + 1));
		PageDefault.dataPut("thisyyyy()", String.valueOf(now.get(Calendar.YEAR)));
		now.add(Calendar.MONTH, 1);
		PageDefault.dataPut("nextmm()", String.valueOf(now.get(Calendar.MONTH) + 1));
		now = Calendar.getInstance();
		now.add(Calendar.YEAR, 1);
		PageDefault.dataPut("nextyyyy()", String.valueOf(now.get(Calendar.YEAR)));
	}
	

}
