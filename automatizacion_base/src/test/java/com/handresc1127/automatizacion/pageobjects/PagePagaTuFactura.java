package com.handresc1127.automatizacion.pageobjects;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import com.handresc1127.automatizacion.utilities.actionsUtil;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.google.com.co/")
public class PagePagaTuFactura extends PageObject {

	/**
	 * Elmentos de la seccion Movil
	 */
	public By txtTuLineaTigo = By.id("edit-candidate-number");
	public By txtCorreoElectronicoM = By.xpath("//*[@id='edit-email']");
	public By msgErrorCorreoElectronico = By.xpath("//*[@id='content_right_forms_unified']/div/div[1]/span");
	public By lbMsgErrorCelular = By.xpath("//*[@id='content_left_forms_unified']/div/div[1]/span");
	public By btnConsultarM = By.id("edit-consult");
	public By txtMsisdn = By.id("edit-candidate-number");
	//public By btnConfirmar = By.id("edit-consult");
	public By txtCorreo = By.id("edit-email");
	public By objeto = By.xpath("//*[@id='alert_main']/div/p");
	public By lbMsgError = By.id("alert_main");
	
	/**
	 * Elementos de la seccion Hogar
	 */
	public By btnMovil = By.xpath("//*[@id='block-tigo-theme-content']/div/div[1]/div/div/div[2]/p");
	public By btnHogar = By.xpath("//*[@id='block-tigo-theme-content']/div/div[1]/div/div/div[1]/p");
	public By btnConsultarH = By.id("edit-consult--2");
	public By txtCorreoElectronicoH = By.id("edit-email-fijo");
	public By txtNumeroDocumento = By.id("edit-document");
	public By listTipoDocumento = By.id("edit-document-type");
	public By linkTerminosyCondiciones = By.id("tyc_Fijo");
	public By listFacturasPendientes = By.xpath("//*[@id='content_list_invoices']");
	
	/**
	 * Elementos comunes Movil / Hogar
	 */
	public By lbMsgErrorDoc = By.xpath("//*[@id='content_left_forms_unified']/div[1]/span");
	
	private By objetoToAction;
	private String msisdn = "";

	
	public void irPagina(String url) {
		actionsUtil.goToWebSide(getDriver(), url);
	}
	
	public By getObjetoToCliked() {
		return objetoToAction;
	}

	public void setObjetoToCliked(By objetoToCliked) {
		this.objetoToAction = objetoToCliked;
	}

	public void sharedObjet(String opcion) {
		
		switch (actionsUtil.textoMinusculasSinEspacios(opcion)) {
		case "hogar":
			setObjetoToCliked(btnHogar);
			break;
		case "movil":
			setObjetoToCliked(btnMovil);
			break;
		case "numerodedocumento":
			setObjetoToCliked(txtNumeroDocumento);
			break;
		case "tulineatigo":
			setObjetoToCliked(txtTuLineaTigo);
			break;
		case "labelerrordocumento":
			setObjetoToCliked(lbMsgErrorDoc);
			break;

		case "labelerrorcelular":
			setObjetoToCliked(lbMsgErrorCelular);
			break;

		case "consultar":
			
			if (actionsUtil.existsElement(getDriver(), btnConsultarH)) {
				setObjetoToCliked(btnConsultarH);
			} else {
				setObjetoToCliked(btnConsultarM);
			}
			
			break;

		case "labelfacturas":
			setObjetoToCliked(lbMsgError);
			break;

		case "listfacturas":
			setObjetoToCliked(listFacturasPendientes);
			break;

		case "correoelectronico":
			
			if (actionsUtil.existsElement(getDriver(), txtCorreoElectronicoH)) {
				setObjetoToCliked(txtCorreoElectronicoH);
			}else {
				setObjetoToCliked(txtCorreoElectronicoM);
			}
			
			break;
		
		default:
			assertEquals(null, objeto);
		}
	}

	public void clic(String objeto) {
		sharedObjet(objeto);
		actionsUtil.clic(getDriver(), getObjetoToCliked());
	}

	
	public void tieneHijos(String objeto) {
		sharedObjet(objeto);
		actionsUtil.getTableDiv(getDriver(), objetoToAction);
	}
	

	public void presionarTecla(String tecla) {
		actionsUtil.presionarTeclaRobot(tecla);
	}

	public void compararTextoInicial() {

		String textoInicial = msisdn;
		actionsUtil.clic(getDriver(), getObjetoToCliked());
		String textoFinal = actionsUtil.getTextAttribute(getDriver(), getObjetoToCliked());

		actionsUtil.validateMSISDNIni(textoInicial, textoFinal);

	}

	public void compararTextoFinal() {

		String textoInicial = msisdn;
		actionsUtil.clic(getDriver(), getObjetoToCliked());
		String textoFinal = actionsUtil.getTextAttribute(getDriver(), getObjetoToCliked());

		actionsUtil.validateMSISDNFin(textoInicial, textoFinal);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public void escribir(String objeto, String texto) {
		
		sharedObjet(objeto);
		this.msisdn = texto;
		actionsUtil.setTextFieldSlowly(getDriver(), getObjetoToCliked(), texto);
		
		//actionsUtil.clicParent(getDriver(), getObjetoToCliked());
	}
	
	public void compararTxt(String objeto, String valorEsperado) {
		
		if (objeto != null ) {
			sharedObjet(objeto);
			actionsUtil.compareText(getDriver(), getObjetoToCliked(), valorEsperado);
		} else {
			sharedObjet(objeto);
			actionsUtil.compareText(getDriver(), this.objeto, valorEsperado);
		}
		
	}
	
	public void compararAtributo(String objeto, String atributo, String valorEsperado) {

		if (objeto != null) {
			sharedObjet(objeto);
			actionsUtil.compareAtributo(getDriver(), getObjetoToCliked(), atributo, valorEsperado);
		} else {
			sharedObjet(objeto);
			actionsUtil.compareText(getDriver(), this.objeto, valorEsperado);
		}
	}
	
	
	
	
	
	
	
	
	
	
	

	/*	
	public void compararMensaje(String txtmensaje) {
		actionsUtil.compareText(getDriver(), objeto, txtmensaje);
	}
	*/

	
	
	
	
	
	
	/*public void compararAtributo(String atributo, String valorEsperado) {
		setObjetoToCliked(lbMsgError);
		actionsUtil.compareAtributo(getDriver(), objetoToAction, atributo, valorEsperado);
	}
	
	public void colorTextoMensaje(String atributo, String valorEsperado) {
		actionsUtil.compareAtributo(getDriver(), msgErrorCorreoElectronico, atributo, valorEsperado);
	}*/
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public void presionBotonConfirmar() {
		actionsUtil.clic(getDriver(), btnConsultarM);
	}

	

	public void seleccionar(String tipoDocumento) {
		actionsUtil.selectContains(getDriver(), listTipoDocumento, tipoDocumento);
	}
	
	public void botonInabilitado(String objeto, String atributo, String valorEsperado) {
		setObjetoToCliked(btnConsultarM);
		actionsUtil.compareAtributo(getDriver(), objetoToAction, atributo, valorEsperado);
		actionsUtil.generarTab(1);
	}
	
	
	
	

	

	
}
