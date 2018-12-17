package com.handresc1127.automatizacion.objectsmap;

import org.openqa.selenium.By;

import com.handresc1127.automatizacion.utilities.ActionsUtil;

public class ObjetosPagaTuFactura {

	public ObjetosPagaTuFactura() {
		ActionsUtil.objetosPut("hogar", By.xpath("//*[@id='edit-radios']/div[1]/label"));
		ActionsUtil.objetosPut("movil", By.xpath("//*[@id='edit-radios']/div[2]/label"));
		ActionsUtil.objetosPut("numerodedocumento", By.id("edit-document"));
		ActionsUtil.objetosPut("tulineatigo", By.id("edit-candidate-number"));
		ActionsUtil.objetosPut("labelerrordocumento", By.xpath("//*[@id='content_left_forms_unified']/div[1]/span"));
		ActionsUtil.objetosPut("labelerrorcelular", By.xpath("//*[@id='content_left_forms_unified']/div/div[1]/span"));
		ActionsUtil.objetosPut("labelerrorcorreo", By.xpath("//*[@id='content_right_forms_unified']/div/div[1]/span"));
		ActionsUtil.objetosPut("labelerrorcorreoh", By.xpath("//*[@id=\'content_right_forms_unified\']/div/span"));
		ActionsUtil.objetosPut("consultarh", By.id("edit-consult-home"));
		ActionsUtil.objetosPut("seleccionmediodepago", By.id("tigoune-payment-method-title"));
		ActionsUtil.objetosPut("consultarm", By.id("edit-consult"));
		ActionsUtil.objetosPut("consultarhclic", By.xpath("//*[@id='edit-consult-home' and (not(@disabled='disabled'))]"));
		ActionsUtil.objetosPut("consultarmclic", By.xpath("//*[@id='edit-consult-mobile' and (not(@disabled='disabled'))]"));
		ActionsUtil.objetosPut("labelfacturas", By.xpath("//*[@id='alert_main' and @style='display: block;']"));
		ActionsUtil.objetosPut("listfacturas", By.xpath("//*[@id='content_list_invoices']"));
		ActionsUtil.objetosPut("correoelectronicom", By.id("edit-email-mobile"));
		ActionsUtil.objetosPut("correoelectronicoh", By.id("edit-email-home"));
		ActionsUtil.objetosPut("mensajedeerrormsisdn",
				By.xpath("//*[@id='content_left_forms_unified']/div/div[1]/span"));
		ActionsUtil.objetosPut("mensajesinfacturas", By.xpath("//*[@id='alert_main' and @style='display: block;']"));
		ActionsUtil.objetosPut("tipodedocumento", By.id("edit-document-type"));
		ActionsUtil.objetosPut("tarjetadecredito", By.id("payment-method-type-label-credit-payu"));
		ActionsUtil.objetosPut("numerodetarjeta", By.id("edit-cardnumber"));
		ActionsUtil.objetosPut("debitobancariopse",
				By.xpath("//*[@id='payment-method-type-label-debit-payu' and @class='tigoune-card-header']"));
		ActionsUtil.objetosPut("banco", By.id("edit-bank"));
		ActionsUtil.objetosPut("tipodepersona", By.id("edit-buyer-type-person"));
		ActionsUtil.objetosPut("nombresyapellidos", By.id("edit-buyer-name"));
		ActionsUtil.objetosPut("tipod", By.id("edit-buyer-document-type--2"));
		ActionsUtil.objetosPut("numerodedocumentod", By.id("edit-buyer-document--2"));
		ActionsUtil.objetosPut("emailpse", By.id("PNEMail"));
		ActionsUtil.objetosPut("pagard", By.id("edit-submit--2"));
		ActionsUtil.objetosPut("pagar", By.id("edit-submit"));
		ActionsUtil.objetosPut("iralbanco", By.id("btnSeguir"));
		ActionsUtil.objetosPut("debug", By.id("btnDebug"));
		ActionsUtil.objetosPut("bankprocessdate", By.id("txtBankProcessDate"));
		ActionsUtil.objetosPut("authorizationid", By.id("txtAuthorizationID"));
		ActionsUtil.objetosPut("return", By.id("btnReturnToPPE"));
		ActionsUtil.objetosPut("iconotarjeta", By.xpath("//*[@id=\'ico_card\']"));
		ActionsUtil.objetosPut("cvv", By.id("edit-cvc"));
		ActionsUtil.objetosPut("mm", By.id("edit-buyer-card-month-expiration"));
		ActionsUtil.objetosPut("aa", By.id("edit-buyer-card-year-expiration"));
		ActionsUtil.objetosPut("nombre", By.id("edit-ccname"));
		ActionsUtil.objetosPut("tipocc", By.id("edit-buyer-document-type"));
		ActionsUtil.objetosPut("numerodedocumentotc", By.id("edit-buyer-document"));
		ActionsUtil.objetosPut("autorizoestatarjetaparafuturospagos",
				By.xpath("//*[@id='edit-authorized']/div/div/label[1]"));
		ActionsUtil.objetosPut("primerpagototal",
				By.xpath("(//*[@id='content_list_invoices']//*[contains(@id,'btn')])[1]"));
		ActionsUtil.objetosPut("title-detail", By.id("title-detail"));
		ActionsUtil.objetosPut("numerodelproducto", By.id("product-number"));
		ActionsUtil.objetosPut("fechalimitedepago", By.xpath(
				"//*[@id=\"block-tigo-theme-content\"]/div/div[2]/div/div[2]/div[3]/div[1]/div/table/tbody/tr[2]/td/div"));
		ActionsUtil.objetosPut("referentedepago", By.xpath(
				"//*[@id=\"block-tigo-theme-content\"]/div/div[2]/div/div[2]/div[3]/div[2]/div/table/tbody/tr[2]/td/div"));
		ActionsUtil.objetosPut("numerodecontrato", By.xpath(
				"//*[@id=\"block-tigo-theme-content\"]/div/div[2]/div/div[2]/div[3]/div[3]/div/table/tbody/tr[2]/td/div"));
		ActionsUtil.objetosPut("periododefacturacion", By.xpath(
				"//*[@id=\"block-tigo-theme-content\"]/div/div[2]/div/div[2]/div[3]/div[3]/div/table/tbody/tr[2]/td/div"));
		ActionsUtil.objetosPut("valorapagar",
				By.xpath("//*[@id=\"block-tigo-theme-content\"]/div/div[2]/div/div[2]/div[4]/div[2]"));
		ActionsUtil.objetosPut("cancelarnequi", By.id("tigoune-nequi-button-cancel"));
		ActionsUtil.objetosPut("cancelarpse", By.id("edit-cancel--2"));
		ActionsUtil.objetosPut("cancelartc", By.id("edit-cancel"));
		ActionsUtil.objetosPut("msgerrortc", By.xpath("//*[@id='image-credit_card']//*[contains(@class,'error')]"));
		ActionsUtil.objetosPut("formapagoseleccionada", By.xpath("//*[@class='tigoune-card actived']"));
		ActionsUtil.objetosPut("formasdepago", By.xpath("//*[@id='payment_method']/div"));
		ActionsUtil.objetosPut("numerocuotas", By.id("edit-cardnumber-quota"));
		ActionsUtil.objetosPut("titulofacturasmoviles", By.id("title-init"));
		ActionsUtil.objetosPut("tieneonotienefacturas", By.xpath(
				"\"//*[@id='content_list_invoices' or @id='payment-method-type-label-credit-payu' or (@id='alert_main' and @style='display: block;')]\""));

		ActionsUtil.objetosPut("movil_msisdnconfacturas",By.id("payment-method-type-label-credit-payu"));
		ActionsUtil.objetosPut("movil_msisdnsinfacturas",By.xpath("//*[@id='alert_main' and @style='display: block;']"));
		ActionsUtil.objetosPut("hogar_numdocumentoconfacturas",By.id("content_list_invoices"));
		ActionsUtil.objetosPut("hogar_numdocumentosinfacturas",By.xpath("//*[@id='alert_main' and @style='display: block;']"));
		ActionsUtil.objetosPut("celularcomprador",By.id("edit-buyer-phone"));
		
	}

}
