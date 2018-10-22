package com.handresc1127.automatizacion.pageobjects;

import java.util.Dictionary;
import java.util.Hashtable;

import org.openqa.selenium.By;

public class ObjetosRecargasPaquetes {

Dictionary<String, By> objetosRecargasPaquetes = new Hashtable<String, By>();
	
	public ObjetosRecargasPaquetes () {
		objetosRecargasPaquetes.put("recarga",By.xpath("//*[@id='tap_selector']/div[2]"));
		objetosRecargasPaquetes.put("ingresatulineatigo", By.id("recharge-line"));
		
	}
	 public  By getObjetoRecargasPaquetes(String NombreObjeto) {
		 return objetosRecargasPaquetes.get(NombreObjeto);
	 }
	 
	 public  Dictionary<String, By> getDictionary(){
		 return objetosRecargasPaquetes;
	 }

}
