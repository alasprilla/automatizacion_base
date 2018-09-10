package com.handresc1127.automatizacion;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		glue = { "com.handresc1127.automatizacion" }, 
		features = {"src/test/resources/features/ADP-14_HU-003_ValidacionEmail.feature" }, 
		tags = {},//"@HU-003", "@Caso1", "@Caso2", "@Caso3", "@Caso4", "@Caso5"
		monochrome = true, 
		plugin = {"pretty", "html:target/reports/html/", "junit:target/reports/junit/allcukes.xml","json:target/reports/cukes.json" }
		)


public class RunnerTags {

}
