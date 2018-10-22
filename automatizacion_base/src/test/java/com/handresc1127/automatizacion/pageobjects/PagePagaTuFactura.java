package com.handresc1127.automatizacion.pageobjects;

import java.util.Dictionary;

import org.openqa.selenium.By;

import com.handresc1127.automatizacion.negocio.BussinesUtil;
import com.handresc1127.automatizacion.utilities.ActionsUtil;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://transaccionesco-uat.tigocloud.net/servicios/facturas")
public class PagePagaTuFactura extends PageObject {
	
	Dictionary<String, By> objetos;
	/*
	PagePagaTuFactura(){
		ObjetosPagaTuFactura x = new ObjetosPagaTuFactura();
		objetos=x.getDictionary();
	}
	/*

	/**
	 * Elmentos de la seccion Movil
	 */
	By txtTuLineaTigo = By.id("edit-candidate-number");
	By txtCorreoElectronicoM = By.id("edit-email");
	By lbMsgErrorCorreo = By.xpath("//*[@id='content_right_forms_unified']/div/div[1]/span");
	By lbMsgErrorCelular = By.xpath("//*[@id='content_left_forms_unified']/div/div[1]/span");
	By btnConsultarM = By.id("edit-consult");
	By txtMsisdn = By.id("edit-candidate-number");
	By txtCorreo = By.id("edit-email");
	//By msgFactura = By.xpath("//*[@id='alert_main']/div/p");
	By lbMsgError = By.xpath("//*[@id='alert_main' and @style='display: block;']");
	By lbTituloFacturasMovil = By.id("title-init");
	

	/**
	 * Elmentos de la seccion Medio de Pago Tarjeta Crédito
	 */
	By linkTarjetaCredito = By.id("payment-method-type-label-credit-payu");
	By txtNumerodetarjeta = By.id("edit-cardnumber");
    By icoTarjeta = By.xpath("//*[@id=\'ico_card\']");
	By txtCVV = By.id("edit-cvc");
	By txtNumeroCuotas = By.id("edit-cardnumber-quota");
	By listFechaVencimientoMM = By.id("edit-buyer-card-month-expiration");
	By listFechaVencimientoAA = By.id("edit-buyer-card-year-expiration");
	By txtNombre = By.id("edit-ccname");
	By listTipo = By.id("edit-buyer-document-type");
	By txtNumerodedocumento = By.id("edit-buyer-document");
	By btnAutorizarTc = By.xpath("//*[@id='edit-authorized']/div/div/label[1]");
	By btnPagar = By.id("edit-submit");
	By lbMsgErrorTC= By.xpath("//*[@id='image-credit_card']//*[contains(@class,'error')]");

	/**
	 * Elmentos de la seccion Medio de Pago Tarjeta Débito
	 */

	By linkDebitoBancarioPSE = By.xpath("//*[@id='payment-method-type-label-debit-payu' and @class='tigoune-card-header']");
	By listBanco = By.id("edit-bank");
	By listTipodepersona = By.id("edit-buyer-type-person");
	By txtNombresyapellidos = By.id("edit-buyer-name");
	By listTipod = By.id("edit-buyer-document-type--2");
	By txtNumerodedocumentoD = By.id("edit-buyer-document--2");
	By btnPagard = By.id("edit-submit--2");

	/**
	 * Elmentos de la seccion pago por PSE
	 */
	By btnIralBanco = By.id("btnSeguir");
	By btnDebugP = By.id("btnDebug");
	By txtProcessDate = By.id("txtBankProcessDate");
	By txtauthorizaID = By.id("txtAuthorizationID");
	By btnReturn = By.id("btnReturnToPPE");
	
	By btnCancelarTC = By.id("edit-cancel");
	By btnCancelarPSE= By.id("edit-cancel--2");
	By btnCancelarNequi= By.id("tigoune-nequi-button-cancel");
	

	/**
	 * Elementos de la seccion Hogar
	 */
	By btnMovil = By.xpath("//*[@id='block-tigo-theme-content']/div/div[1]/div/div/div[2]/p");
	By btnHogar = By.xpath("//*[@id='block-tigo-theme-content']/div/div[1]/div/div/div[1]/p");
	By btnConsultarH = By.id("edit-consult--2");
	By txtCorreoElectronicoH = By.id("edit-email-fijo");
	By txtNumeroDocumento = By.id("edit-document");
	By listTipoDocumento = By.id("edit-document-type");
	By linkTerminosyCondiciones = By.id("tyc_Fijo");
	By listFacturasPendientes = By.xpath("//*[@id='content_list_invoices']");
	By txtemailpse = By.id("PNEMail");
	By lbMsgErrorCorreoH = By.xpath("//*[@id=\'content_right_forms_unified\']/div/span");

	/**
	 * Elementos comunes Movil / Hogar
	 */
	By lbMsgErrorDoc = By.xpath("//*[@id='content_left_forms_unified']/div[1]/span");

	/**
	 * Resumen de la transacción
	 */
	By btnPrimerPagoTotal = By.xpath("(//*[@id='content_list_invoices']//*[contains(@id,'btn')])[1]");
	By lbTituloResumenTransaccion = By.id("title-detail");
	//*****
	By lbTitulo = By.xpath("//*[@id='block-tigo-theme-page-title']/div/h1");
	//****
	By lbFormaPagoSeleccionada = By.xpath("//*[@class='tigoune-card actived']");
	By lbFormasDePago= By.xpath("//*[@id='payment_method']/div");
	
	By lbNumeroDelProducto = By.id("product-number");
	By lbFechaLimitePago = By.xpath(
			"//*[@id=\"block-tigo-theme-content\"]/div/div[2]/div/div[2]/div[3]/div[1]/div/table/tbody/tr[2]/td/div");
	By lbReferentePago = By.xpath(
			"//*[@id=\"block-tigo-theme-content\"]/div/div[2]/div/div[2]/div[3]/div[2]/div/table/tbody/tr[2]/td/div");
	By lbNumeroContrato = By.xpath(
			"//*[@id=\"block-tigo-theme-content\"]/div/div[2]/div/div[2]/div[3]/div[3]/div/table/tbody/tr[2]/td/div");
	By lbPeriodoFacturacion = By.xpath(
			"//*[@id=\"block-tigo-theme-content\"]/div/div[2]/div/div[2]/div[3]/div[3]/div/table/tbody/tr[2]/td/div");
	By lbValorPagar = By.xpath("//*[@id=\"block-tigo-theme-content\"]/div/div[2]/div/div[2]/div[4]/div[2]");

	By objetoToAction;
	String texto = "";
	

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
		
		ObjetosPagaTuFactura x = new ObjetosPagaTuFactura();
		String nombreObjeto = (ActionsUtil.textoMinusculasSinEspacios(opcion));
		By byObjeto = x.getObjetoPagaTuFactura(nombreObjeto);
		setObjetoToCliked(byObjeto);	

<<<<<<< HEAD
		case "fechalimitedepago":
			setObjetoToCliked(lbFechaLimitePago);
			break;
		case "referentedepago":
			setObjetoToCliked(lbReferentePago);
			break;

		case "numerodecontrato":
			setObjetoToCliked(lbNumeroContrato);
			break;
		case "periododefacturacion":
			setObjetoToCliked(lbPeriodoFacturacion);
			break;	
		case "valorapagar":
			setObjetoToCliked(lbValorPagar);
			break;
		case "cancelarnequi":
			setObjetoToCliked(btnCancelarNequi);
			break;
		case "cancelarpse":
			setObjetoToCliked(btnCancelarPSE);
			break;
		case "cancelartc":
			setObjetoToCliked(btnCancelarTC);
			break;
		case "msgerrortc":
			setObjetoToCliked(lbMsgErrorTC);
			break;
		case "formapagoseleccionada":
			setObjetoToCliked(lbFormaPagoSeleccionada);
			break;
		case "formasdepago":
			setObjetoToCliked(lbFormasDePago);
			break;
		case "numerocuotas":
			setObjetoToCliked(txtNumeroCuotas);
			break;
		case "titulofacturasmoviles":
			setObjetoToCliked(lbTituloFacturasMovil);
			break;
	
		case "titlepage-title":
			setObjetoToCliked(By.id("block-tigo-theme-page-title"));
			break;
		case "draggable":
			setObjetoToCliked(By.xpath("//*[contains(@class,'draggable')]"));
			break;
		case "droppable":
			setObjetoToCliked(By.xpath("//*[contains(@class,'droppable')]"));
			break;
		case "balon":
			setObjetoToCliked(By.id("ball"));
			break;
			
			
		default:
			assertEquals("El objeto no ha sido mapeado", ActionsUtil.textoMinusculasSinEspacios(opcion));
		}
=======
	}
	
	public void sharedObjet(Dictionary<String, By> objetos,String opcion) {
		String nombreObjeto = (ActionsUtil.textoMinusculasSinEspacios(opcion));
		By byObjetos = objetos.get(nombreObjeto);
		setObjetoToCliked(byObjetos);
>>>>>>> Ecommerce
	}


	public void clic(Dictionary<String, By> objetos,String objeto) {
		sharedObjet(objetos,objeto);
		ActionsUtil.clic(getDriver(), getObjetoToCliked());
	}
	public void clic(String objeto) {
		sharedObjet(objeto);
		ActionsUtil.clic(getDriver(), getObjetoToCliked());
	}

	public void tieneHijos(Dictionary<String, By> objetos,String objeto) {
		sharedObjet(objetos,objeto);
		ActionsUtil.getTableDiv(getDriver(), getObjetoToCliked());
	}

	public void tieneHijos(String objeto) {
		sharedObjet(objeto);
		ActionsUtil.getTableDiv(getDriver(), getObjetoToCliked());
	}
	
	public void presionarTecla(String tecla) {
		ActionsUtil.presionarTecla(getDriver(), getObjetoToCliked(), tecla);
	}

	public void compararTextoInicial() {
		String textoInicial = texto;
		ActionsUtil.clic(getDriver(), getObjetoToCliked());
		String textoFinal = ActionsUtil.getTextAttribute(getDriver(), getObjetoToCliked());

		if (getObjetoToCliked().toString().substring(7, getObjetoToCliked().toString().length())
				.equals("edit-cardnumber")) {

			BussinesUtil.validateTCIni(textoInicial, textoFinal);
		} else if (getObjetoToCliked().toString().substring(7, getObjetoToCliked().toString().length())
				.equals("edit-document")) {

			BussinesUtil.validateNumDocIni(textoInicial, textoFinal);
		} else {

			BussinesUtil.validateMSISDNIni(textoInicial, textoFinal);
		}
	}

	public void compararTextoFinal() {
		String textoInicial = texto;
		ActionsUtil.clic(getDriver(), getObjetoToCliked());
		String textoFinal = ActionsUtil.getTextAttribute(getDriver(), getObjetoToCliked());
		if (getObjetoToCliked().toString().substring(7, getObjetoToCliked().toString().length())
				.equals("edit-cardnumber")) {

			BussinesUtil.validateTCFin(textoInicial, textoFinal);
		} else if (getObjetoToCliked().toString().substring(7, getObjetoToCliked().toString().length())
				.equals("edit-document")) {

			BussinesUtil.validateNumDocFin(textoInicial, textoFinal);
		} else {

			BussinesUtil.validateMSISDNFin(textoInicial, textoFinal);
		}
	}

	//Revisar esto
	public void escribirConClick(String objeto, String texto) {
		sharedObjet(objeto);
		this.texto = texto;
		ActionsUtil.setTextFieldSlowly(getDriver(), getObjetoToCliked(), texto);
		ActionsUtil.clicParent(getDriver(), getObjetoToCliked());
	}
	
	public void escribirConClick(Dictionary<String, By> objetos,String objeto, String texto) {
		sharedObjet(objetos,objeto);
		this.texto = texto;
		ActionsUtil.setTextFieldSlowly(getDriver(), getObjetoToCliked(), texto);
		ActionsUtil.clicParent(getDriver(), getObjetoToCliked());
	}

	public void escribir(Dictionary<String, By> objetos,String objeto, String texto) {
		sharedObjet(objetos,objeto);
		this.texto = texto;
		ActionsUtil.setTextFieldSlowly(getDriver(), getObjetoToCliked(), texto);
	}

	public void escribir(String objeto, String texto) {
		sharedObjet(objeto);
		this.texto = texto;
		ActionsUtil.setTextFieldSlowly(getDriver(), getObjetoToCliked(), texto);
	}
	
	public void compararTxt(Dictionary<String, By> objetos,String objeto, String valorEsperado) {
		sharedObjet(objetos,objeto);
		ActionsUtil.compareText(getDriver(), getObjetoToCliked(), valorEsperado);
	}
	
	public void compararTxt(String objeto, String valorEsperado) {
		sharedObjet(objeto);
		ActionsUtil.compareText(getDriver(), getObjetoToCliked(), valorEsperado);
	}

	public void compararAtributo(String objeto, String atributo, String valorEsperado) {
		sharedObjet(objeto);
		switch (ActionsUtil.textoMinusculasSinEspacios(valorEsperado)) {
		case "rojo":
			valorEsperado = "rgba(240, 30, 70, 1)";
			break;
		case "azul":
			valorEsperado = "rgb(0, 200, 255)";
			break;
		case "blanco":
			valorEsperado = "rgba(255, 255, 255, 1)";
			break;
		case "rojo_rgb":
			valorEsperado = "rgb(240, 30, 70)";
			break;
		case "blanco_rgb":
			valorEsperado = "rgb(255, 255, 255)";
			break;
		}
		ActionsUtil.compareAtributo(getDriver(), getObjetoToCliked(), atributo, valorEsperado);
	}
	
	public void compararAtributo(Dictionary<String, By> objetos,String objeto, String atributo, String valorEsperado) {
		sharedObjet(objetos,objeto);
		switch (ActionsUtil.textoMinusculasSinEspacios(valorEsperado)) {
		case "rojo":
			valorEsperado = "rgba(240, 30, 70, 1)";
			break;
		case "azul":
			valorEsperado = "rgb(0, 200, 255)";
			break;
		case "blanco":
			valorEsperado = "rgba(255, 255, 255, 1)";
			break;
		case "rojo_rgb":
			valorEsperado = "rgb(240, 30, 70)";
			break;
		case "blanco_rgb":
			valorEsperado = "rgb(255, 255, 255)";
			break;
		}
		ActionsUtil.compareAtributo(getDriver(), getObjetoToCliked(), atributo, valorEsperado);
	}

	public void seleccionar(String objeto, String item) {
		sharedObjet(objeto);
		ActionsUtil.selectContains(getDriver(), getObjetoToCliked(), item);
	}
	
	public void seleccionar(Dictionary<String, By> objetos,String objeto, String item) {
		sharedObjet(objetos,objeto);
		ActionsUtil.selectContains(getDriver(), getObjetoToCliked(), item);
	}

	public void validarEscribir(String objeto2, String txtIngresado) {
		if ((ActionsUtil.textoMinusculasSinEspacios(objeto2).equals("correoelectronicom"))
				|| ((ActionsUtil.textoMinusculasSinEspacios(objeto2).equals("correoelectronicoh"))
				|| (ActionsUtil.textoMinusculasSinEspacios(objeto2).equals("numerodedocumentod"))
				|| (ActionsUtil.textoMinusculasSinEspacios(objeto2).equals("numerodedocumentotc")))) {
			escribirConClick(objeto2, txtIngresado);
		} else {
			escribir(objeto2, txtIngresado);
		}
	}
	

	public void validarPagRecargada() {
		ActionsUtil.highlightElement(getDriver(), getObjetoToCliked());
	}

	public void elementoVisible(String objeto) {
		sharedObjet(objeto);
		ActionsUtil.highlightElement(getDriver(), getObjetoToCliked());
	}
	
	public void elementoVisible(Dictionary<String, By> objetos,String objeto) {
		sharedObjet(objetos,objeto);
		ActionsUtil.highlightElement(getDriver(), getObjetoToCliked());
	}

	public void compararTextoDeInicio(String objeto, String textoInicial) {
		sharedObjet(objeto);
		ActionsUtil.compareTextStart(getDriver(), getObjetoToCliked(), textoInicial);
	}

	public void compararTextoNoVacio(String objeto) {
		sharedObjet(objeto);
		ActionsUtil.compareTextNotEmpty(getDriver(), getObjetoToCliked());
	}
	
	public void hardClic(String objeto) {
		sharedObjet(objeto);
		ActionsUtil.ejecutarScript(getDriver(), "arguments[0].click();",getObjetoToCliked());
	}

	public void esperarElementos(String objeto, String condicion, int cantidad) {
		sharedObjet(objeto);
		ActionsUtil.waitForXElements(getDriver(),getObjetoToCliked(), condicion, cantidad);
	}
	
	public void esperarElementos(Dictionary<String, By> objetos,String objeto, String condicion, int cantidad) {
		sharedObjet(objetos,objeto);
		ActionsUtil.waitForXElements(getDriver(),getObjetoToCliked(), condicion, cantidad);
	}
	
	//PRUEBA INI
	public void deslizarBarra(String barra) {
		ActionsUtil.slider(getDriver(),getObjetoToCliked());
	}
	//PRUEBA FIN

	public void ArrastrarYSoltar(String objeto1, String objeto2) {
		sharedObjet(objeto1);
		By obj1=getObjetoToCliked();
		sharedObjet(objeto2);
		By obj2=getObjetoToCliked();
		ActionsUtil.dragAndDrop(getDriver(),obj1,obj2);
	}

	public void ArrastrarYSoltarXY(String objeto, String position) {
		sharedObjet(objeto);
		By byElement=getObjetoToCliked();
		String pos[]=ActionsUtil.textoMinusculasSinEspacios(position).split(",");
		int x= Integer.parseInt(pos[0]);
		int y= Integer.parseInt(pos[1]);
		ActionsUtil.dragAndDrop(getDriver(),byElement,x,y);
	}

}
