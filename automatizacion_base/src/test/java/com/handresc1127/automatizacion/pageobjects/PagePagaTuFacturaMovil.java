package com.handresc1127.automatizacion.pageobjects;

import com.handresc1127.automatizacion.utilities.actionsUtil;

import net.serenitybdd.core.pages.PageObject;

public class PagePagaTuFacturaMovil extends PageObject{
	
	
	public void irAlaPagina() {
		actionsUtil.goToWebSide(getDriver(), "https://transaccionesco-uat.tigocloud.net/servicios/factura-movil");
	}



}
