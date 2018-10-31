package com.handresc1127.automatizacion.objectsmap;

import org.openqa.selenium.By;

import com.handresc1127.automatizacion.utilities.ActionsUtil;

public class ObjetosRecargasPaquetes {
	
	public ObjetosRecargasPaquetes () {
		ActionsUtil.objetosPut("recarga",By.xpath("//*[@id='tap_selector']/div[2]"));
		//ActionsUtil.objetosPut("ingresatulineatigo", By.id("num_lin"));
		ActionsUtil.objetosPut("ingresatulineatigo", By.id("recharge-line"));
		ActionsUtil.objetosPut("correoelectronico" , By.id("edit-email"));
		ActionsUtil.objetosPut("recargar", By.id("edit-button-recargar"));
		ActionsUtil.objetosPut("3000", By.xpath("//*[@id='container_recharge']/div[1]/div/div[2]/div/ul/div/li[6]"));
		ActionsUtil.objetosPut("otrovalor", By.xpath("//*[@id='container_recharge']/div[1]/div/div[2]/div/ul/div/li[6]"));
		ActionsUtil.objetosPut("valorarecargar", By.id("edit-otro-valor"));
		ActionsUtil.objetosPut("otrovalorcargado", By.xpath("//*[@id='other_value' and not(contains(@style,'none'))and not(contains(@style,'overflow'))]") );
		ActionsUtil.objetosPut("otrovalor", By.xpath("//*[@id='container_recharge' and not(contains(@style,'none'))]/div[1]/div/div[2]/div/ul/div/li[6]"));
		ActionsUtil.objetosPut("valorarecargar", By.xpath("//*[@id='edit-otro-valor' and not(contains(@style,'none'))and not(contains(@style,'overflow'))]"));
		ActionsUtil.objetosPut("otrovalorcargado", By.xpath("//*[@id='other_value']/div/div/div[1]/label"));
		ActionsUtil.objetosPut("labelerrorvalorrecargas", By.xpath("//*[@id='other_value']/div/div/div[1]/p"));
		ActionsUtil.objetosPut("recargadesde", By.xpath("//*[@id=\'other_value\']/div/div/div[2]"));
		ActionsUtil.objetosPut("labelerrorcelularrecargas",By.xpath("//*[@id=\'container_recharge\']/div[1]/div/div[1]/div/p"));
		ActionsUtil.objetosPut("valor", By.xpath("//*[@id=\'block-tigo-theme-content\']/div/div[2]/div/div/div/div[1]/p[3]"));
		ActionsUtil.objetosPut("title-detail", By.id("tigoune-payment-method-title"));
	
	}
}
