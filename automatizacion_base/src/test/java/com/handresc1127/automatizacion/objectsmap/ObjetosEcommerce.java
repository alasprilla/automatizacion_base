package com.handresc1127.automatizacion.objectsmap;

import org.openqa.selenium.By;

import com.handresc1127.automatizacion.utilities.ActionsUtil;

public class ObjetosEcommerce {

	public ObjetosEcommerce() {
		// Ecommerce
		ActionsUtil.objetosPut("titlepage-title", By.id("block-tigo-theme-page-title"));
		ActionsUtil.objetosPut("droppable", By.xpath("//*[contains(@class,'droppable')]"));
		ActionsUtil.objetosPut("draggable", By.xpath("//*[contains(@class,'draggable')]"));
		ActionsUtil.objetosPut("balon", By.id("ball"));
		ActionsUtil.objetosPut("expedicion", By.xpath("//*[@id='tigo-activation-personal-data']/article/section[3]/div/div[4]/div/div[1]"));
		ActionsUtil.objetosPut("ano", By.xpath("//*[@id='tigo-activation-personal-data']/article/section[3]/div/div[4]/ul/li[4]"));
		ActionsUtil.objetosPut("activar", By.id("edit-activate"));
		ActionsUtil.objetosPut("continuaractivacion", By.id("edit-submit"));
		ActionsUtil.objetosPut("tomateunafotografia", By.xpath("//*[@id='tigo-activation-contrato']/article/section[1]/div[1]/div[2]/p[2]"));
	}
}
