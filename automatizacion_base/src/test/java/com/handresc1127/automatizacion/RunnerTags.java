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
	//	"src/test/resources/features/ADP-03_HU-001_ValidacionTC.feature",	
	//	"src/test/resources/features/ADP-13_HU-002_ValidacionMSISDN.feature",
	//	"src/test/resources/features/ADP-14_HU-003_ValidacionEmail.feature",
	//	"src/test/resources/features/ADP-15_HU-004_LlenadoFormularioTC.feature",	
	//	"src/test/resources/features/ADP-16_HU-005_LlenadoFormularioTD.feature",	
	//	"src/test/resources/features/ADP-21_HU-006_ValidacionNumeroDocumento.feature",
	//	"src/test/resources/features/ADP-23_HU-007_NumerosNoValidosCelular.feature",
	//	"src/test/resources/features/ADP-24_HU-008_NumerosValidosCelular.feature",
	//	"src/test/resources/features/ADP-26_HU-009_ValidacionEnCampoNumeroDocumento.feature",
	//	"src/test/resources/features/ADP-27_HU-010_ValidacionDeNumeroDeTC.feature",
	//	"src/test/resources/features/ADP-28-HU-011_IconoEnTC.feature",	
	//	"src/test/resources/features/ADP-29_HU-012_ValidacionCVV.feature",
	//	"src/test/resources/features/ADP-31_HU-013_ValidacionEmailHogar.feature",
	//	"src/test/resources/features/ADP-43_HU-016_ValidacionTeclasEspecialesMSISDN.feature",
	//	"src/test/resources/features/ADP-44_HU-017_NumerosNoValidosRecargaYPaquetes.feature",
	//  "src/test/resources/features/ADP-46_HU-019_RecargaValoresPreestablecidos.feature",	
	//	"src/test/resources/features/ADP-47_HU-020_RecargaOtroValor.feature",
	//	"src/test/resources/features/ADP-51_HU-021_PagoCompleto.feature",
        "src/test/resources/features/ADP-64_HU-022_IngresoNumeroValidoTigoDeudaPendiente.feature"
		},


		tags = {""}, monochrome = true, plugin = { "pretty", "html:target/reports/html/",
				"junit:target/reports/junit/allcukes.xml", "json:target/reports/cukes.json" })

public class RunnerTags {

}
