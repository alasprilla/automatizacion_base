package com.handresc1127.automatizacion;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

//@tag1 AND @tag2= "@tag1","@tag2"
//@tag1 OR @tag2= "@tag1, @tag2"
//NOT @tag1 = "~@tag1"
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		glue = { "com.handresc1127.automatizacion" }, 
		//features = {"src/test/resources/features/HU0001-BusquedaBasicaGoogle.feature" }, 
		//tags = {"@BusquedaBasica"},}
		features = {"src/test/resources/features/SPIKE001-Aprendiendo.feature" }, 
		tags = {"@Turorial","@Tigo"},
		monochrome = true, 
		plugin = {"pretty", "html:target/reports/html/", "junit:target/reports/junit/allcukes.xml","json:target/reports/cukes.json" }
		)


public class RunnerTags {

}
