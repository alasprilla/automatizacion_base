package com.handresc1127.automatizacion.pageobjects;

import java.util.Dictionary;
import java.util.Hashtable;

import org.openqa.selenium.By;


public class ObjetosPagaTuFactura {
	
	 
	  Dictionary<String, By> objetosPagaTuFactura = new Hashtable<String, By>();
	 

	 public ObjetosPagaTuFactura () {
		objetosPagaTuFactura.put("hogar",  By.xpath("//*[@id='block-tigo-theme-content']/div/div[1]/div/div/div[1]/p"));
		objetosPagaTuFactura.put("movil",  By.xpath("//*[@id='block-tigo-theme-content']/div/div[1]/div/div/div[2]/p"));
		objetosPagaTuFactura.put("numerodedocumento", By.id("edit-document"));
		objetosPagaTuFactura.put("tulineatigo", By.id("edit-candidate-number"));
		objetosPagaTuFactura.put("labelerrordocumento", By.xpath("//*[@id='content_left_forms_unified']/div[1]/span"));
		objetosPagaTuFactura.put("labelerrorcelular", By.xpath("//*[@id='content_left_forms_unified']/div/div[1]/span"));
		objetosPagaTuFactura.put("labelerrorcorreo", By.xpath("//*[@id='content_right_forms_unified']/div/div[1]/span"));
		objetosPagaTuFactura.put("labelerrorcorreoh", By.xpath("//*[@id=\'content_right_forms_unified\']/div/span"));
		objetosPagaTuFactura.put("consultarh", By.id("edit-consult--2"));
		objetosPagaTuFactura.put("consultarm", By.id("edit-consult"));
		objetosPagaTuFactura.put("labelfacturas", By.xpath("//*[@id='alert_main' and @style='display: block;']"));
		objetosPagaTuFactura.put("listfacturas", By.xpath("//*[@id='content_list_invoices']"));
		objetosPagaTuFactura.put("correoelectronicom",By.id("edit-email"));
		objetosPagaTuFactura.put("correoelectronicoh",By.id("edit-email-fijo"));
		objetosPagaTuFactura.put("mensajedeerrormsisdn", By.xpath("//*[@id='content_left_forms_unified']/div/div[1]/span"));
		objetosPagaTuFactura.put("mensajesinfacturas", By.xpath("//*[@id='alert_main' and @style='display: block;']"));
		objetosPagaTuFactura.put("tipodedocumento", By.id("edit-document-type"));
		objetosPagaTuFactura.put("tarjetadecredito", By.id("payment-method-type-label-credit-payu"));
		objetosPagaTuFactura.put("numerodetarjeta", By.id("edit-cardnumber"));
		objetosPagaTuFactura.put("debitobancariopse", By.xpath("//*[@id='payment-method-type-label-debit-payu' and @class='tigoune-card-header']"));
		objetosPagaTuFactura.put("banco", By.id("edit-bank"));
		objetosPagaTuFactura.put("tipodepersona", By.id("edit-buyer-type-person"));
		objetosPagaTuFactura.put("nombresyapellidos", By.id("edit-buyer-name"));
		objetosPagaTuFactura.put("tipod", By.id("edit-buyer-document-type--2"));
		objetosPagaTuFactura.put("numerodedocumentod", By.id("edit-buyer-document--2"));
		objetosPagaTuFactura.put("emailpse", By.id("PNEMail"));
		objetosPagaTuFactura.put("pagard", By.id("edit-submit--2"));
		objetosPagaTuFactura.put("pagar", By.id("edit-submit"));
		objetosPagaTuFactura.put("iralbanco", By.id("btnSeguir"));
		objetosPagaTuFactura.put("debug", By.id("btnDebug"));
		objetosPagaTuFactura.put("bankprocessdate", By.id("txtBankProcessDate"));
		objetosPagaTuFactura.put("authorizationid", By.id("txtAuthorizationID"));
		objetosPagaTuFactura.put("return", By.id("btnReturnToPPE"));
		objetosPagaTuFactura.put("iconotarjeta", By.xpath("//*[@id=\'ico_card\']"));
		objetosPagaTuFactura.put("cvv", By.id("edit-cvc"));
		objetosPagaTuFactura.put("mm", By.id("edit-buyer-card-month-expiration"));
		objetosPagaTuFactura.put("aa", By.id("edit-buyer-card-year-expiration"));
		objetosPagaTuFactura.put("nombre", By.id("edit-ccname"));
		objetosPagaTuFactura.put("tipo", By.id("edit-buyer-document-type"));
		objetosPagaTuFactura.put("numerodedocumentotc", By.id("edit-buyer-document"));
		objetosPagaTuFactura.put("autorizoestatarjetaparafuturospagos", By.xpath("//*[@id='edit-authorized']/div/div/label[1]"));
		objetosPagaTuFactura.put("primerpagototal", By.xpath("(//*[@id='content_list_invoices']//*[contains(@id,'btn')])[1]"));
		objetosPagaTuFactura.put("title-detail", By.id("title-detail"));
		objetosPagaTuFactura.put("numerodelproducto", By.id("product-number"));
		objetosPagaTuFactura.put("fechalimitedepago", By.xpath(
				"//*[@id=\"block-tigo-theme-content\"]/div/div[2]/div/div[2]/div[3]/div[1]/div/table/tbody/tr[2]/td/div"));
		objetosPagaTuFactura.put("referentedepago", By.xpath(
				"//*[@id=\"block-tigo-theme-content\"]/div/div[2]/div/div[2]/div[3]/div[2]/div/table/tbody/tr[2]/td/div"));
		objetosPagaTuFactura.put("numerodecontrato", By.xpath(
				"//*[@id=\"block-tigo-theme-content\"]/div/div[2]/div/div[2]/div[3]/div[3]/div/table/tbody/tr[2]/td/div"));
		objetosPagaTuFactura.put("periododefacturacion", By.xpath(
				"//*[@id=\"block-tigo-theme-content\"]/div/div[2]/div/div[2]/div[3]/div[3]/div/table/tbody/tr[2]/td/div"));	
    	objetosPagaTuFactura.put("valorapagar", By.xpath("//*[@id=\"block-tigo-theme-content\"]/div/div[2]/div/div[2]/div[4]/div[2]"));
		objetosPagaTuFactura.put("cancelarnequi", By.id("tigoune-nequi-button-cancel"));
	    objetosPagaTuFactura.put("cancelarpse", By.id("edit-cancel--2"));
	 	objetosPagaTuFactura.put("cancelartc", By.id("edit-cancel"));
		objetosPagaTuFactura.put("msgerrortc", By.xpath("//*[@id='image-credit_card']//*[contains(@class,'error')]"));
		objetosPagaTuFactura.put("formapagoseleccionada", By.xpath("//*[@class='tigoune-card actived']"));
		objetosPagaTuFactura.put("formasdepago", By.xpath("//*[@id='payment_method']/div"));
		objetosPagaTuFactura.put("numerocuotas", By.id("edit-cardnumber-quota"));
		objetosPagaTuFactura.put("titulofacturasmoviles", By.id("title-init"));
	 }
	 public  By getObjetoPagaTuFactura(String NombreObjeto) {
		 return objetosPagaTuFactura.get(NombreObjeto);
	 }
	 
	 public  Dictionary<String, By> getDictionary(){
		 return objetosPagaTuFactura;
	 }
}
