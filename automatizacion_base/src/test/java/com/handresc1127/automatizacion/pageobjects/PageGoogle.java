package com.handresc1127.automatizacion.pageobjects;

import org.openqa.selenium.By;

import com.handresc1127.automatizacion.utilities.actionsUtil;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.indracompany.com/")
public class PageGoogle extends PageObject{
	public By txtSharedFirstPage= By.id("lst-ib");
	public By btnBuscarConGoogle= By.xpath("//*[@id='sbtc']/div[2]/div[2]/div[1]/div/ul/li[11]/div/span[1]/span/input");
	public By btnMeSientoConSuarte= By.name("btnI");
	

	//##################### FUNCIONES #####################
	
	public void ingresarAlSitio(String sitioWeb) {
		actionsUtil.goToWebSide(getDriver(), sitioWeb);
	}


	public void ingresarBusquedaInicial(String fraseBuscada) {
		actionsUtil.setTextField(getDriver(), txtSharedFirstPage, fraseBuscada);
	}


	public void mostarResultados(String resultados) {
		System.out.println("Resultados");
	}


	public void presionarBtnBuscar() {
		actionsUtil.clic(getDriver(), btnBuscarConGoogle);
	}
}
