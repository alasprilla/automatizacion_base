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
	public By txtCorreoElectronico = By.xpath("//*[@id='edit-email']");
	public By msgErrorCorreoElectronico = By.xpath("//*[@id='content_right_forms_unified']/div/div[1]/span");
	public By lbMsgErrorCelular = By.xpath("//*[@id='content_left_forms_unified']/div/div[1]/span");
	public By btnConsultar = By.id("edit-consult");
	public By txtMsisdn = By.id("edit-candidate-number");
	public By btnConfirmar = By.id("edit-consult");
	public By txtCorreo = By.id("edit-email");
	public By objeto = By.xpath("//*[@id='alert_main']/div/p");
	public By lbMsgError = By.id("alert_main");
	
	/**
	 * Elementos de la seccion Hogar
	 */
	public By btnMovil = By.xpath("//*[@id='block-tigo-theme-content']/div/div[1]/div/div/div[2]/p");
	public By btnHogar = By.xpath("//*[@id='block-tigo-theme-content']/div/div[1]/div/div/div[1]/p");
	public By listTipoDocumento = By.id("edit-document-type");
	public By txtNumeroDocumento = By.id("edit-document");
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

	

	

	public void escribir(String objeto, String texto) {

		switch (objeto) {

		case "Tu línea Tigo":
			setObjetoToCliked(txtTuLineaTigo);
			break;
		case "Correo electrónico":
			setObjetoToCliked(txtCorreoElectronico);
			break;
		case "Consultar":
			setObjetoToCliked(btnConsultar);
			break;
		}

		this.msisdn = texto;
		actionsUtil.setTextFieldSlowly(getDriver(), objetoToAction, texto);
	}

	public void mensaje(String msgError) {
		actionsUtil.compareText(getDriver(), msgErrorCorreoElectronico, msgError);
	}

	public void mensajeC(String msgErrorCel) {
		actionsUtil.compareText(getDriver(), lbMsgErrorCelular, msgErrorCel);
	}

	public void colorTextoMensaje(String atributo, String valorEsperado) {
		actionsUtil.compareAtributo(getDriver(), msgErrorCorreoElectronico, atributo, valorEsperado);
	}

	public void botonInabilitado(String objeto, String atributo, String valorEsperado) {
		setObjetoToCliked(btnConsultar);
		actionsUtil.compareAtributo(getDriver(), objetoToAction, atributo, valorEsperado);
		actionsUtil.generarTab(1);
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
			setObjetoToCliked(btnConsultar);
			break;

		case "labelfacturas":
			setObjetoToCliked(lbMsgError);
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

	public void clic(String objeto) {
		sharedObjet(objeto);
		actionsUtil.clic(getDriver(), getObjetoToCliked());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void seleccionar(String tipoDocumento) {
		actionsUtil.selectContains(getDriver(), listTipoDocumento, tipoDocumento);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void escribirCelular(String numcelular) {
		actionsUtil.setTextFieldSlowly(getDriver(), txtMsisdn, numcelular);
		actionsUtil.generarTab(1);
	}

	

	public void escribirCorreo(String correo) {
		actionsUtil.setTextFieldSlowly(getDriver(), txtCorreo, correo);
		actionsUtil.generarEnter(1);
	}

	public void presionBotonConfirmar() {
		actionsUtil.clic(getDriver(), btnConfirmar);
	}

	public void compararMensaje(String txtmensaje) {

		actionsUtil.compareText(getDriver(), objeto, txtmensaje);
	}

	public void compararAtributo(String atributo, String valorEsperado) {
		setObjetoToCliked(lbMsgError);
		actionsUtil.compareAtributo(getDriver(), objetoToAction, atributo, valorEsperado);
	}

	public void presionarTecla(String tecla) {
		actionsUtil.presionarTeclaRobot(tecla);
	}

	public void compararTextoInicial() {

		String textoInicial = msisdn;
		actionsUtil.clic(getDriver(), objetoToAction);
		String textoFinal = actionsUtil.getTextAttribute(getDriver(), objetoToAction);

		actionsUtil.validateMSISDNIni(textoInicial, textoFinal);

	}

	public void compararTextoFinal() {

		String textoInicial = msisdn;
		actionsUtil.clic(getDriver(), objetoToAction);
		String textoFinal = actionsUtil.getTextAttribute(getDriver(), objetoToAction);

		actionsUtil.validateMSISDNFin(textoInicial, textoFinal);
	}

	
	
	
	
	
	//******** HOGAR
	
	
	

	

	public void ingresar(String objeto, String txtIngresado) {
		sharedObjet(objeto);

		actionsUtil.setTextFieldSlowly(getDriver(), objetoToAction, txtIngresado);
		actionsUtil.clicParent(getDriver(), objetoToAction);
	}

	public void compararTxt(String objeto, String valorEsperado) {
		sharedObjet(objeto);
		actionsUtil.compareText(getDriver(), objetoToAction, valorEsperado);
	}

	public void compararAtributo(String objeto, String atributo, String valorEsperado) {
		sharedObjet(objeto);
		actionsUtil.compareAtributo(getDriver(), objetoToAction, atributo, valorEsperado);
	}

	

	public void tieneHijos(String objeto) {
		sharedObjet(objeto);
		actionsUtil.getTableDiv(getDriver(), objetoToAction);
	}

	
}
