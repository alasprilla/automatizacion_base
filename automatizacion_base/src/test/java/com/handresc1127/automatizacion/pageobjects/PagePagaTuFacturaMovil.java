package com.handresc1127.automatizacion.pageobjects;

import com.handresc1127.automatizacion.utilities.actionsUtil;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.google.com.co/")
public class PagePagaTuFacturaMovil extends PageObject{

	public void irPagina(String pagina) {
		actionsUtil.goToWebSide(getDriver(), "");
	}

}
