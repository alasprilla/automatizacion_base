package com.handresc1127.automatizacion.objectsmap;

import org.openqa.selenium.By;

import com.handresc1127.automatizacion.utilities.ActionsUtil;


public class ObjetosPagaTuFactura {
	
	 public ObjetosPagaTuFactura () {
		 ActionsUtil.objetosPage.put("hogar",  By.xpath("//*[@id='block-tigo-theme-content']/div/div[1]/div/div/div[1]/p"));
		ActionsUtil.objetosPage.put("movil",  By.xpath("//*[@id='block-tigo-theme-content']/div/div[1]/div/div/div[2]/p"));
		ActionsUtil.objetosPage.put("numerodedocumento", By.id("edit-document"));
		ActionsUtil.objetosPage.put("tulineatigo", By.id("edit-candidate-number"));
		ActionsUtil.objetosPage.put("labelerrordocumento", By.xpath("//*[@id='content_left_forms_unified']/div[1]/span"));
		ActionsUtil.objetosPage.put("labelerrorcelular", By.xpath("//*[@id='content_left_forms_unified']/div/div[1]/span"));
		ActionsUtil.objetosPage.put("labelerrorcorreo", By.xpath("//*[@id='content_right_forms_unified']/div/div[1]/span"));
		ActionsUtil.objetosPage.put("labelerrorcorreoh", By.xpath("//*[@id=\'content_right_forms_unified\']/div/span"));
		ActionsUtil.objetosPage.put("consultarh", By.id("edit-consult--2"));
		ActionsUtil.objetosPage.put("consultarm", By.id("edit-consult"));
		ActionsUtil.objetosPage.put("labelfacturas", By.xpath("//*[@id='alert_main' and @style='display: block;']"));
		ActionsUtil.objetosPage.put("listfacturas", By.xpath("//*[@id='content_list_invoices']"));
		ActionsUtil.objetosPage.put("correoelectronicom",By.id("edit-email"));
		ActionsUtil.objetosPage.put("correoelectronicoh",By.id("edit-email-fijo"));
		ActionsUtil.objetosPage.put("mensajedeerrormsisdn", By.xpath("//*[@id='content_left_forms_unified']/div/div[1]/span"));
		ActionsUtil.objetosPage.put("mensajesinfacturas", By.xpath("//*[@id='alert_main' and @style='display: block;']"));
		ActionsUtil.objetosPage.put("tipodedocumento", By.id("edit-document-type"));
		ActionsUtil.objetosPage.put("tarjetadecredito", By.id("payment-method-type-label-credit-payu"));
		ActionsUtil.objetosPage.put("numerodetarjeta", By.id("edit-cardnumber"));
		ActionsUtil.objetosPage.put("debitobancariopse", By.xpath("//*[@id='payment-method-type-label-debit-payu' and @class='tigoune-card-header']"));
		ActionsUtil.objetosPage.put("banco", By.id("edit-bank"));
		ActionsUtil.objetosPage.put("tipodepersona", By.id("edit-buyer-type-person"));
		ActionsUtil.objetosPage.put("nombresyapellidos", By.id("edit-buyer-name"));
		ActionsUtil.objetosPage.put("tipod", By.id("edit-buyer-document-type--2"));
		ActionsUtil.objetosPage.put("numerodedocumentod", By.id("edit-buyer-document--2"));
		ActionsUtil.objetosPage.put("emailpse", By.id("PNEMail"));
		ActionsUtil.objetosPage.put("pagard", By.id("edit-submit--2"));
		ActionsUtil.objetosPage.put("pagar", By.id("edit-submit"));
		ActionsUtil.objetosPage.put("iralbanco", By.id("btnSeguir"));
		ActionsUtil.objetosPage.put("debug", By.id("btnDebug"));
		ActionsUtil.objetosPage.put("bankprocessdate", By.id("txtBankProcessDate"));
		ActionsUtil.objetosPage.put("authorizationid", By.id("txtAuthorizationID"));
		ActionsUtil.objetosPage.put("return", By.id("btnReturnToPPE"));
		ActionsUtil.objetosPage.put("iconotarjeta", By.xpath("//*[@id=\'ico_card\']"));
		ActionsUtil.objetosPage.put("cvv", By.id("edit-cvc"));
		ActionsUtil.objetosPage.put("mm", By.id("edit-buyer-card-month-expiration"));
		ActionsUtil.objetosPage.put("aa", By.id("edit-buyer-card-year-expiration"));
		ActionsUtil.objetosPage.put("nombre", By.id("edit-ccname"));
		ActionsUtil.objetosPage.put("tipo", By.id("edit-buyer-document-type"));
		ActionsUtil.objetosPage.put("numerodedocumentotc", By.id("edit-buyer-document"));
		ActionsUtil.objetosPage.put("autorizoestatarjetaparafuturospagos", By.xpath("//*[@id='edit-authorized']/div/div/label[1]"));
		ActionsUtil.objetosPage.put("primerpagototal", By.xpath("(//*[@id='content_list_invoices']//*[contains(@id,'btn')])[1]"));
		ActionsUtil.objetosPage.put("title-detail", By.id("title-detail"));
		ActionsUtil.objetosPage.put("numerodelproducto", By.id("product-number"));
		ActionsUtil.objetosPage.put("fechalimitedepago", By.xpath(
				"//*[@id=\"block-tigo-theme-content\"]/div/div[2]/div/div[2]/div[3]/div[1]/div/table/tbody/tr[2]/td/div"));
		ActionsUtil.objetosPage.put("referentedepago", By.xpath(
				"//*[@id=\"block-tigo-theme-content\"]/div/div[2]/div/div[2]/div[3]/div[2]/div/table/tbody/tr[2]/td/div"));
		ActionsUtil.objetosPage.put("numerodecontrato", By.xpath(
				"//*[@id=\"block-tigo-theme-content\"]/div/div[2]/div/div[2]/div[3]/div[3]/div/table/tbody/tr[2]/td/div"));
		ActionsUtil.objetosPage.put("periododefacturacion", By.xpath(
				"//*[@id=\"block-tigo-theme-content\"]/div/div[2]/div/div[2]/div[3]/div[3]/div/table/tbody/tr[2]/td/div"));	
    	ActionsUtil.objetosPage.put("valorapagar", By.xpath("//*[@id=\"block-tigo-theme-content\"]/div/div[2]/div/div[2]/div[4]/div[2]"));
		ActionsUtil.objetosPage.put("cancelarnequi", By.id("tigoune-nequi-button-cancel"));
	    ActionsUtil.objetosPage.put("cancelarpse", By.id("edit-cancel--2"));
	 	ActionsUtil.objetosPage.put("cancelartc", By.id("edit-cancel"));
		ActionsUtil.objetosPage.put("msgerrortc", By.xpath("//*[@id='image-credit_card']//*[contains(@class,'error')]"));
		ActionsUtil.objetosPage.put("formapagoseleccionada", By.xpath("//*[@class='tigoune-card actived']"));
		ActionsUtil.objetosPage.put("formasdepago", By.xpath("//*[@id='payment_method']/div"));
		ActionsUtil.objetosPage.put("numerocuotas", By.id("edit-cardnumber-quota"));
		ActionsUtil.objetosPage.put("titulofacturasmoviles", By.id("title-init"));
		
	 }

}
