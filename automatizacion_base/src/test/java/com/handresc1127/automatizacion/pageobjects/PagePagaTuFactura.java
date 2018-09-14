package com.handresc1127.automatizacion.pageobjects;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import com.handresc1127.automatizacion.utilities.ActionsUtil;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.google.com.co/")
public class PagePagaTuFactura extends PageObject {

	/**
	 * Elmentos de la seccion Movil
	 */
	public By txtTuLineaTigo = By.id("edit-candidate-number");
	public By txtCorreoElectronicoM = By.id("edit-email");
	public By msgErrorCorreoElectronico = By.xpath("//*[@id='content_right_forms_unified']/div/div[1]/span");
	public By lbMsgErrorCelular = By.xpath("//*[@id='content_left_forms_unified']/div/div[1]/span");
	public By btnConsultarM = By.id("edit-consult");
	public By txtMsisdn = By.id("edit-candidate-number");
	public By txtCorreo = By.id("edit-email");
	public By msgFactura = By.xpath("//*[@id='alert_main']/div/p");
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
	private String numdoc = "";

	public void irPagina(String url) {
		ActionsUtil.goToWebSide(getDriver(), url);
	}

	public By getObjetoToCliked() {
		return objetoToAction;
	}

	public void setObjetoToCliked(By objetoToCliked) {
		this.objetoToAction = objetoToCliked;
	}

	public void sharedObjet(String opcion) {

		switch (ActionsUtil.textoMinusculasSinEspacios(opcion)) {
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
			if (ActionsUtil.existsElement(getDriver(), btnConsultarH)) {
				setObjetoToCliked(btnConsultarH);
			}
			if (ActionsUtil.existsElement(getDriver(), btnConsultarM)) {
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
			if (ActionsUtil.existsElement(getDriver(), txtCorreoElectronicoM)) {
				setObjetoToCliked(txtCorreoElectronicoM);
			}
			if (ActionsUtil.existsElement(getDriver(), txtCorreoElectronicoH)) {
				setObjetoToCliked(txtCorreoElectronicoH);
			}
			break;
		case "mensajedeerrorcorreo":
			setObjetoToCliked(msgErrorCorreoElectronico);
			break;

		case "mensajedeerrormsisdn":
			setObjetoToCliked(lbMsgErrorCelular);
			break;
		case "mensajesinfacturas":
			setObjetoToCliked(lbMsgError);
			break;
		default:
			assertEquals(null, msgFactura);
		}
	}

	public void clic(String objeto) {
		
		sharedObjet(objeto);
		ActionsUtil.clic(getDriver(), getObjetoToCliked());
	}

	public void tieneHijos(String objeto) {
		
		sharedObjet(objeto);
		ActionsUtil.getTableDiv(getDriver(), objetoToAction);
	}

	public void presionarTecla(String tecla) {
		ActionsUtil.presionarTeclaRobot(tecla);
	}

	public void compararTextoInicial() {

		String textoInicial = msisdn;
		ActionsUtil.clic(getDriver(), getObjetoToCliked());
		String textoFinal = ActionsUtil.getTextAttribute(getDriver(), getObjetoToCliked());
		ActionsUtil.validateMSISDNIni(textoInicial, textoFinal);
	}

	public void compararTextoFinal() {

		String textoInicial = msisdn;
		ActionsUtil.clic(getDriver(), getObjetoToCliked());
		String textoFinal = ActionsUtil.getTextAttribute(getDriver(), getObjetoToCliked());
		ActionsUtil.validateMSISDNFin(textoInicial, textoFinal);
	}
	
	public void compararDocInicial() {

		String textoInicial = numdoc;
		ActionsUtil.clic(getDriver(), getObjetoToCliked());
		String textoFinal = ActionsUtil.getTextAttribute(getDriver(), getObjetoToCliked());
		ActionsUtil.validateNumDocIni(textoInicial, textoFinal);
	}

	public void compararDocFinal() {

		String textoInicial = numdoc;
		ActionsUtil.clic(getDriver(), getObjetoToCliked());
		String textoFinal = ActionsUtil.getTextAttribute(getDriver(), getObjetoToCliked());
		ActionsUtil.validateNumDocFin(textoInicial, textoFinal);
	}

	public void escribirConClick(String objeto, String texto) {

		sharedObjet(objeto);
		this.msisdn = texto;
		this.numdoc = texto;
		ActionsUtil.setTextFieldSlowly(getDriver(), getObjetoToCliked(), texto);
		ActionsUtil.clicParent(getDriver(), getObjetoToCliked());
	}

	public void escribir(String objeto, String texto) {

		sharedObjet(objeto);
		this.msisdn = texto;
		this.numdoc = texto;
		ActionsUtil.setTextFieldSlowly(getDriver(), getObjetoToCliked(), texto);
	}

	public void compararTxt(String objeto, String valorEsperado) {

		sharedObjet(objeto);
		ActionsUtil.compareText(getDriver(), getObjetoToCliked(), valorEsperado);
	}

	public void compararAtributo(String objeto, String atributo, String valorEsperado) {

		sharedObjet(objeto);
		ActionsUtil.compareAtributo(getDriver(), getObjetoToCliked(), atributo, valorEsperado);
	}

	public void presionBotonConfirmar() {
		ActionsUtil.clic(getDriver(), btnConsultarM);
	}

	public void seleccionar(String tipoDocumento) {
		ActionsUtil.selectContains(getDriver(), listTipoDocumento, tipoDocumento);
	}

	public void botonInabilitado(String objeto, String atributo, String valorEsperado) {
		
		setObjetoToCliked(btnConsultarM);
		ActionsUtil.compareAtributo(getDriver(), objetoToAction, atributo, valorEsperado);
	}

	public void validarEscribir(String objeto2, String txtIngresado) {

		if (ActionsUtil.textoMinusculasSinEspacios(objeto2).equals("correoelectronico")) {
			escribirConClick(objeto2, txtIngresado);
		} else {
			escribir(objeto2, txtIngresado);
		}
	}

	public void validarPagRecargada() {
		ActionsUtil.highlightElement(getDriver(), getObjetoToCliked());
	}

}
