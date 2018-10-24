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
	}
}
