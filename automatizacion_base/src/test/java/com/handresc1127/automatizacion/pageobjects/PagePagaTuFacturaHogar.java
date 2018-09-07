package com.handresc1127.automatizacion.pageobjects;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;

import com.handresc1127.automatizacion.utilities.actionsUtil;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.indracompany.com/")
public class PagePagaTuFacturaHogar extends PageObject{
	public By btnMovil=By.xpath("//*[@id='block-tigo-theme-content']/div/div[1]/div/div/div[2]/p");
	public By btnHogar=By.xpath("//*[@id='block-tigo-theme-content']/div/div[1]/div/div/div[1]/p");
	public By listTipoDocumento=By.id("edit-document-type");
	public By txtNumeroDocumento=By.id("edit-document");
	public By txtCorreoElectronico=By.xpath("//*[@id='content_right_forms_unified']/div/div/label");
	public By linkTerminosyCondiciones=By.id("tyc_Fijo");
	public By btnConsultar=By.id("edit-consult--2");
	public By lbMsgErrorDoc=By.xpath("//*[@id='content_left_forms_unified']/div[1]/span");
	private By objetoToAction;
	

	public void irAlSitio(String webSite) {
		actionsUtil.goToWebSide(getDriver(), webSite);
	}

	public void clicEn(String opcionPagaTuFactura) {
		switch(opcionPagaTuFactura) {
		case "HOGAR":
			setObjetoToCliked(btnHogar);
			break;
		case "MOVIL":
			setObjetoToCliked(btnMovil);
			break;
		}
		actionsUtil.clic(getDriver(), objetoToAction);
	}

	public By getObjetoToCliked() {
		return objetoToAction;
	}

	public void setObjetoToCliked(By objetoToCliked) {
		this.objetoToAction = objetoToCliked;
	}

	public void seleccionar(String tipoDocumento) {
		actionsUtil.selectContains(getDriver(), listTipoDocumento, tipoDocumento);
	}

	public void ingresar(String objeto, String txtIngresado) {
		switch(actionsUtil.textoMinusculasSinEspacios(objeto)) {
		case "numerodedocumento":
			setObjetoToCliked(txtNumeroDocumento);
			break;
		case "correoelectronico":
			setObjetoToCliked(txtCorreoElectronico);
			break;
		default: assertTrue(false);
		}
		actionsUtil.setTextFieldSlowly(getDriver(), objetoToAction, txtIngresado);
	}

	public void compararTxt(String objeto, String valorEsperado) {
		switch(actionsUtil.textoMinusculasSinEspacios(objeto)) {
		case "numerodedocumento":
			setObjetoToCliked(txtNumeroDocumento);
			break;
			
		case "labelerrordocumento":
			setObjetoToCliked(lbMsgErrorDoc);
			break;
		default: assertTrue(false);
		}
		actionsUtil.compareText(getDriver(), objetoToAction, valorEsperado);
	}

	public void compararAtributo(String objeto, String atributo, String valorEsperado) {
		switch(actionsUtil.textoMinusculasSinEspacios(objeto)) {
		case "numerodedocumento":
			setObjetoToCliked(txtNumeroDocumento);
			break;

		case "labelerrordocumento":
			setObjetoToCliked(lbMsgErrorDoc);
			break;
		default: assertTrue(false);
		}
		actionsUtil.compareAtributo(getDriver(), objetoToAction, atributo, valorEsperado);
	}


	
	
}
