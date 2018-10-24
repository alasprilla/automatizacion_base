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
		ActionsUtil.objetosPut("otrovalor", By.xpath("//*[@id='container_recharge']/div[1]/div/div[2]/div/ul/div/li[6]"));
		ActionsUtil.objetosPut("valorarecargar", By.xpath("//*[@id='edit-otro-valor']"));
		ActionsUtil.objetosPut("labelerrorvalorrecargas", By.xpath("//*[@id='other_value']/div/div/div[1]/p"));
		ActionsUtil.objetosPut("labelerrorcelularrecargas",By.xpath("//*[@id='block-tieneinformaciondesaldoydeudadelmsisdn']/div[1]/div/div[1]/div[2]/div[1]/p"));
	}
}
