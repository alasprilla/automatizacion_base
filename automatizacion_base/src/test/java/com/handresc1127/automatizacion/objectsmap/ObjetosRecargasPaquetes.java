package com.handresc1127.automatizacion.objectsmap;

import org.openqa.selenium.By;

import com.handresc1127.automatizacion.utilities.ActionsUtil;

public class ObjetosRecargasPaquetes {
	
	public ObjetosRecargasPaquetes () {
		ActionsUtil.objetosPut("recarga",By.xpath("//*[@id='tap_selector']/div[2]"));
		//ActionsUtil.objetosPut("ingresatulineatigo", By.id("num_lin"));
		ActionsUtil.objetosPut("ingresatulineatigo", By.id("recharge-line"));
		//ActionsUtil.objetosPut("ingresatulineatigo", By.xpath("//*[@id='recharge-line' and @class='wrrp_campo without_icon active']"));
		ActionsUtil.objetosPut("correoelectronico" , By.id("edit-email"));
		ActionsUtil.objetosPut("recargar", By.id("edit-button-recargar"));
		ActionsUtil.objetosPut("otrovalor", By.xpath("//*[@id='container_recharge' and not(contains(@style,'none'))]/div[1]/div/div[2]/div/ul/div/li[6]"));
		//ActionsUtil.objetosPut("valorarecargar", By.id("edit-otro-valor"));
		ActionsUtil.objetosPut("valorarecargar", By.xpath("//*[@id='edit-otro-valor' and not(contains(@style,'none'))and not(contains(@style,'overflow'))]"));
		//ActionsUtil.objetosPut("otrovalorcargado", By.xpath("//*[@id='other_value' and not(contains(@style,'none'))and not(contains(@style,'overflow'))]/div/div/div[2]"));
		ActionsUtil.objetosPut("otrovalorcargado", By.xpath("//*[@id='other_value']/div/div/div[2]"));
		ActionsUtil.objetosPut("labelerrorvalorrecargas", By.xpath("//*[@id='other_value']/div/div/div[1]/p"));
		ActionsUtil.objetosPut("recargadesde", By.xpath("//*[@id=\'other_value\']/div/div/div[2]"));
		ActionsUtil.objetosPut("labelerrorcelularrecargas",By.xpath("//*[@id='block-tieneinformaciondesaldoydeudadelmsisdn']/div[1]/div/div[1]/div[2]/div[1]/p"));
	}
}
