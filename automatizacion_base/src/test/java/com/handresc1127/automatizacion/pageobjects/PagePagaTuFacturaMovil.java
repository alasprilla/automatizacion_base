package com.handresc1127.automatizacion.pageobjects;

import org.openqa.selenium.By;

import com.handresc1127.automatizacion.utilities.actionsUtil;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.google.com.co/")
public class PagePagaTuFacturaMovil extends PageObject{
	
	public By txtTuLineaTigo=By.id("edit-candidate-number");
	public By txtCorreoElectronico=By.id("edit-email");

	
	
	public void irPagina(String url) {
		actionsUtil.goToWebSide(getDriver(), url);
	}

	public void clicTuLineaTigo() {
		actionsUtil.clic(getDriver(), txtTuLineaTigo);
	}

	public void escribirMsisdn(String msisdn) {
		actionsUtil.setTextFieldSlowly(getDriver(), txtTuLineaTigo, msisdn);
	}

}
