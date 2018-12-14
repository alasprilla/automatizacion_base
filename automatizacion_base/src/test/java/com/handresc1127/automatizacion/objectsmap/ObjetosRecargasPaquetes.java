package com.handresc1127.automatizacion.objectsmap;

import org.openqa.selenium.By;

import com.handresc1127.automatizacion.utilities.ActionsUtil;

public class ObjetosRecargasPaquetes {
	
	public ObjetosRecargasPaquetes () {
		ActionsUtil.objetosPut("recarga",By.xpath("//*[@id='tap_selector']/div[2]"));
		ActionsUtil.objetosPut("ingresatulineatigo", By.id("recharge-line"));
		ActionsUtil.objetosPut("correoelectronico" , By.id("edit-email"));
		ActionsUtil.objetosPut("recargar", By.id("edit-button-recargar"));
		ActionsUtil.objetosPut("otrovalor", By.xpath("//*[@id='container_recharge' and not(contains(@style,'none'))]/div[1]/div/div[2]/div/ul/div/li[6]"));
		ActionsUtil.objetosPut("valorarecargar", By.xpath("//*[@id='edit-otro-valor' and not(contains(@style,'none'))and not(contains(@style,'overflow'))]"));
		ActionsUtil.objetosPut("listavalor", By.xpath("//*[@id='container_recharge']/div[1]/div/div[2]/div/ul/li/div[2]"));
		ActionsUtil.objetosPut("otrovalorcargado", By.xpath("//*[@id='other_value']/div/div/div[1]/label"));
		ActionsUtil.objetosPut("labelerrorvalorrecargas", By.xpath("//*[@id='other_value']/div/div/div[1]/p"));
		ActionsUtil.objetosPut("recargadesde", By.xpath("//*[@id=\'other_value\']/div/div/div[2]"));
		ActionsUtil.objetosPut("labelerrorcelularrecargas",By.xpath("//*[@id=\'container_recharge\']/div[1]/div/div[1]/div/p"));
		ActionsUtil.objetosPut("valor", By.xpath("//*[@id=\'block-tigo-theme-content\']/div/div[2]/div/div/div/div[1]/p[3]"));
		ActionsUtil.objetosPut("titulodetalle", By.id("tigoune-payment-method-title"));
		
		ActionsUtil.objetosPut("3mil",  By.xpath("//*[@id='container_recharge']/div[1]/div/div[2]/div/ul/div/li[1]"));
		ActionsUtil.objetosPut("6mil",  By.xpath("//*[@id='container_recharge']/div[1]/div/div[2]/div/ul/div/li[2]"));
		ActionsUtil.objetosPut("15mil", By.xpath("//*[@id='container_recharge']/div[1]/div/div[2]/div/ul/div/li[3]"));
		ActionsUtil.objetosPut("20mil", By.xpath("//*[@id='container_recharge']/div[1]/div/div[2]/div/ul/div/li[4]"));
		ActionsUtil.objetosPut("30mil", By.xpath("//*[@id='container_recharge']/div[1]/div/div[2]/div/ul/div/li[5]"));
		ActionsUtil.objetosPut("esperaunmomento", By.xpath("//*[@id='debt']/div/div/div[1]/div[2]/h2"));
	    ActionsUtil.objetosPut("continuar", By.xpath("//*[@id=\'debt\']/div/div/div[3]/button[1]"));
	    ActionsUtil.objetosPut("aumentarrecarga", By.xpath("//*[@id=\'debt\']/div/div/div[3]/button[2]"));
		ActionsUtil.objetosPut("mensajeerrorrecarga", By.xpath("//*[@id='page']/div[1]/div/div/div/div"));
	
		ActionsUtil.objetosPut("numerocelular", By.xpath("//*[@id='block-tigo-theme-content']/div/div[2]/div/div/div/div[1]/p[1]/b"));
		ActionsUtil.objetosPut("fechafacturacion", By.xpath("//*[@id='block-tigo-theme-content']/div/div[2]/div/div/div/div[3]/div/div[1]/p[2]"));
		ActionsUtil.objetosPut("adelantasaldo", By.xpath("//*[@id='payment-method-type-label-advance-balance']/label/div[1]/div[1]"));
		//Paquetes
		ActionsUtil.objetosPut("paquetes", By.xpath("//*[@id='tap_selector']/div[1]"));
		ActionsUtil.objetosPut("ingresatulineatigopaquetes", By.id("numlinsin"));
		ActionsUtil.objetosPut("flechaatras", By.xpath("//*[@id='tab_navegar']/div[1]/div[2]/div[2]/a[1]"));
		ActionsUtil.objetosPut("flechasiguiente", By.xpath("//*[@id='tab_navegar']/div[1]/div[2]/div[2]/a[2]"));
		ActionsUtil.objetosPut("comprar600mb", By.xpath("//*[@id='tab_navegar']/div[1]/div[1]/ul/li[1]/div/div[2]/div/a"));
		ActionsUtil.objetosPut("comprar350mb", By.xpath("//*[@id='tab_navegar']/div[1]/div[1]/ul/li[2]/div/div[2]/div/a"));
		ActionsUtil.objetosPut("comprar2gb30dias", By.xpath("//*[@id='tab_navegar']/div[1]/div[1]/ul/li[3]/div/div[2]/div/a"));
		ActionsUtil.objetosPut("comprar40mb", By.xpath("//*[@id='tab_navegar']/div[1]/div[1]/ul/li[4]/div/div[2]/div/a"));
		ActionsUtil.objetosPut("comprar100mb", By.xpath("//*[@id='tab_navegar']/div[1]/div[1]/ul/li[5]/div/div[2]/div/a"));
		ActionsUtil.objetosPut("comprar2gb15dias", By.xpath("//*[@id='tab_navegar']/div[1]/div[1]/ul/li[6]/div/div[2]/div/a"));
		ActionsUtil.objetosPut("comprar150mb", By.xpath("//*[@id='tab_navegar']/div[1]/div[1]/ul/li[7]/div/div[2]/div/a"));
		ActionsUtil.objetosPut("comprar120mb", By.xpath("//*[@id='tab_navegar']/div[1]/div[1]/ul/li[8]/div/div[2]/div/a"));
		ActionsUtil.objetosPut("comprar1gb", By.xpath("//*[@id='tab_navegar']/div[1]/div[1]/ul/li[9]/div/div[2]/div/a"));
		ActionsUtil.objetosPut("comprar50mb", By.xpath("//*[@id='tab_navegar']/div[1]/div[1]/ul/li[10]/div/div[2]/div/a"));
		ActionsUtil.objetosPut("comprar500mb", By.xpath("//*[@id='tab_navegar']/div[1]/div[1]/ul/li[11]/div/div[2]/div/a"));
		ActionsUtil.objetosPut("continuarcomprapaquete", By.id("bt-regsinbal"));
		ActionsUtil.objetosPut("vamosaverificartusdatos", By.xpath("//*[@id='mod_regnumber']/div[3]/h2"));
		ActionsUtil.objetosPut("codigoverificacion", By.id("cod_act"));
		ActionsUtil.objetosPut("continuarverificacion", By.id("bt-contver"));
		ActionsUtil.objetosPut("correoverificacion", By.id("emailpackages"));
		ActionsUtil.objetosPut("estoyseguro", By.id("bt-buyconfirmation"));
		//Objetos para obtener el otp por medio de la app MySMS
		ActionsUtil.objetosPut("correogmail", By.id("identifierId"));
		ActionsUtil.objetosPut("siguiente", By.xpath("//*[@id='identifierNext']/content/span"));
		ActionsUtil.objetosPut("siguientec", By.xpath("//*[@id='passwordNext']/content/span"));
		ActionsUtil.objetosPut("contrasenagmail", By.xpath("//*[@id='password']/div[1]/div/div[1]/input"));
		ActionsUtil.objetosPut("login", By.xpath("/html/body/div[4]/div[2]/div/div[2]/div/table/tbody/tr[3]/td/button[1]/div/div"));
		ActionsUtil.objetosPut("iniciarcongmail", By.xpath("/html/body/div[4]/div[2]/div/div[2]/div/table/tbody/tr[3]/td/div[1]/table/tbody/tr[1]/td/div[1]/div[1]/div[2]"));
		ActionsUtil.objetosPut("ultimomensaje", By.xpath("/html/body/div[4]/div[2]/div/div[2]/div/div[4]/div/div[2]/div/div[3]/div/div[2]/div/div[3]/div/div[2]/div[1]/div/div/div[1]/span/span[2]"));	
	}
}
