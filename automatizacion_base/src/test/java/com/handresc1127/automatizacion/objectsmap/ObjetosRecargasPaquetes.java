package com.handresc1127.automatizacion.objectsmap;

import org.openqa.selenium.By;

import com.handresc1127.automatizacion.utilities.ActionsUtil;

public class ObjetosRecargasPaquetes {
	
	public ObjetosRecargasPaquetes () {
		ActionsUtil.objetosPage.put("recarga",By.xpath("//*[@id='tap_selector']/div[2]"));
		ActionsUtil.objetosPage.put("ingresatulineatigo", By.id("num_lin"));
		//ActionsUtil.objetosPage.put("ingresatulineatigo", By.id("recharge-line"));
		ActionsUtil.objetosPage.put("ingresatulineatigo", By.id("num_lin"));
		ActionsUtil.objetosPage.put("correoelectronico" , By.id("edit-email"));
		ActionsUtil.objetosPage.put("recargar", By.id("edit-button-recargar"));
		ActionsUtil.objetosPage.put("labelerrorcelularrecargas",By.xpath("//*[@id='block-tieneinformaciondesaldoydeudadelmsisdn']/div[1]/div/div[1]/div[2]/div[1]/p"));
	}
}
