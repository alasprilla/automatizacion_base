package com.handresc1127.automatizacion.pageobjects;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import com.handresc1127.automatizacion.utilities.actionsUtil;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.indracompany.com/")
public class PagePagaTuFacturaHogar extends PageObject {
	public By btnMovil = By.xpath("//*[@id='block-tigo-theme-content']/div/div[1]/div/div/div[2]/p");
	public By btnHogar = By.xpath("//*[@id='block-tigo-theme-content']/div/div[1]/div/div/div[1]/p");
	public By listTipoDocumento = By.id("edit-document-type");
	public By txtNumeroDocumento = By.id("edit-document");
	public By txtCorreoElectronico = By.xpath("//*[@id='content_right_forms_unified']/div/div/label");
	public By linkTerminosyCondiciones = By.id("tyc_Fijo");
	public By btnConsultar = By.id("edit-consult--2");
	public By lbMsgErrorDoc = By.xpath("//*[@id='content_left_forms_unified']/div[1]/span");
	public By lbFacturasPendientes = By.id("alert_main");
	public By listFacturasPendientes = By.xpath("//*[@id='content_list_invoices']");
	private By objetoToAction;

	public By getObjetoToCliked() {
		return objetoToAction;
	}

	public void setObjetoToCliked(By objetoToCliked) {
		this.objetoToAction = objetoToCliked;
	}

	public void sharedObjet(String objeto) {
		switch (actionsUtil.textoMinusculasSinEspacios(objeto)) {
		case "hogar":
			setObjetoToCliked(btnHogar);
			break;
		case "movil":
			setObjetoToCliked(btnMovil);
			break;
		case "numerodedocumento":
			setObjetoToCliked(txtNumeroDocumento);
			break;

		case "labelerrordocumento":
			setObjetoToCliked(lbMsgErrorDoc);
			break;

		case "consultar":
			setObjetoToCliked(btnConsultar);
			break;

		case "labelfacturas":
			setObjetoToCliked(lbFacturasPendientes);
			break;

		case "listfacturas":
			setObjetoToCliked(listFacturasPendientes);
			break;

		case "correoelectronico":
			setObjetoToCliked(txtCorreoElectronico);
			break;
		default:
			assertEquals(null, objeto);
		}
	}

	public void irAlSitio(String webSite) {
		actionsUtil.goToWebSide(getDriver(), webSite);
	}

	public void clicEn(String opcionPagaTuFactura) {
		sharedObjet(opcionPagaTuFactura);
		actionsUtil.clic(getDriver(), objetoToAction);
	}

	public void seleccionar(String tipoDocumento) {
		actionsUtil.selectContains(getDriver(), listTipoDocumento, tipoDocumento);
	}

	public void ingresar(String objeto, String txtIngresado) {
		boolean isCorreo = false;
		sharedObjet(objeto);
		if (objeto.toLowerCase().contains("correo"))
			isCorreo = true;
		if (isCorreo) {
			actionsUtil.setTextActions(getDriver(), objetoToAction, txtIngresado);
		} else {
			actionsUtil.setTextFieldSlowly(getDriver(), objetoToAction, txtIngresado);
		}
	}

	public void compararTxt(String objeto, String valorEsperado) {
		sharedObjet(objeto);
		actionsUtil.compareText(getDriver(), objetoToAction, valorEsperado);
	}

	public void compararAtributo(String objeto, String atributo, String valorEsperado) {
		sharedObjet(objeto);
		actionsUtil.compareAtributo(getDriver(), objetoToAction, atributo, valorEsperado);
	}

	public void clic(String objeto) {
		sharedObjet(objeto);
		actionsUtil.clic(getDriver(), objetoToAction);
	}

	public void tieneHijos(String objeto) {
		sharedObjet(objeto);
		actionsUtil.getTableDiv(getDriver(), objetoToAction);
	}

}
