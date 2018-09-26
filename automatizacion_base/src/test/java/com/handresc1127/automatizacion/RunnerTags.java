package com.handresc1127.automatizacion;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

//@tag1 AND @tag2= "@tag1","@tag2"
//@tag1 OR @tag2= "@tag1, @tag2"
//NOT @tag1 = "~@tag1"
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(glue = { "com.handresc1127.automatizacion" }, 
	features = {
		"src/test/resources/features/ADP-3_HU-001-ValidacionTC.feature",	
		"src/test/resources/features/ADP-13_HU-002-ValidacionMSISDN.feature",
		"src/test/resources/features/ADP-14_HU-003_ValidacionEmail.feature",
		"src/test/resources/features/ADP-21_HU-006-ValidacionNumeroDocumento.feature",
		"src/test/resources/features/ADP-23_HU-007_NumerosNoValidosCelular.feature",
		"src/test/resources/features/ADP-24_HU-008_NumerosValidosCelular.feature",
		"src/test/resources/features/ADP-26_HU-009_ValidacionEnCampoNumeroDocumento.feature"
		},


		tags = {}, monochrome = true, plugin = { "pretty", "html:target/reports/html/",
				"junit:target/reports/junit/allcukes.xml", "json:target/reports/cukes.json" })

public class RunnerTags {

}
