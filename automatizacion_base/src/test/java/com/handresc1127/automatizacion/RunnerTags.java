package com.handresc1127.automatizacion;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

//@tag1 AND @tag2= "@tag1","@tag2"
//@tag1 OR @tag2= "@tag1, @tag2"
//NOT @tag1 = "~@tag1"
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(glue = { "com.handresc1127.automatizacion" }, features = {
		"src/test/resources/features/ADP-00_SPIKE_AdaptabilidadDeDatosRecargas.feature",
		"src/test/resources/features/ADP-00_SPIKE_AdaptabilidadDeDatos.feature",
		"src/test/resources/features/ADP-03_HU-001_ValidacionTC.feature",
		"src/test/resources/features/ADP-13_HU-002_ValidacionMSISDN.feature",
		"src/test/resources/features/ADP-14_HU-003_ValidacionEmail.feature",
		"src/test/resources/features/ADP-15_HU-004_LlenadoFormularioTC.feature",
		"src/test/resources/features/ADP-16_HU-005_LlenadoFormularioTD.feature",
		"src/test/resources/features/ADP-21_HU-006_ValidacionNumeroDocumento.feature",
		"src/test/resources/features/ADP-23_HU-007_NumerosNoValidosCelular.feature",
		"src/test/resources/features/ADP-24_HU-008_NumerosValidosCelular.feature",
		"src/test/resources/features/ADP-26_HU-009_ValidacionEnCampoNumeroDocumento.feature",
		"src/test/resources/features/ADP-27_HU-010_ValidacionDeNumeroDeTC.feature",
		"src/test/resources/features/ADP-28-HU-011_IconoEnTC.feature",
		"src/test/resources/features/ADP-29_HU-012_ValidacionCVV.feature",
		"src/test/resources/features/ADP-31_HU-013_ValidacionEmailHogar.feature",
		"src/test/resources/features/ADP-43_HU-016_ValidacionTeclasEspecialesMSISDN.feature",
		"src/test/resources/features/ADP-44_HU-017_NumerosNoValidosRecargaYPaquetes.feature",
		"src/test/resources/features/ADP-45_HU-018_NumerosValidosRecargaYPaquetes.feature",
		"src/test/resources/features/ADP-46_HU-019_RecargaValoresPreestablecidos.feature",
		"src/test/resources/features/ADP-47_HU-020_RecargaOtroValor.feature",
		"src/test/resources/features/ADP-51_HU-021_PagoCompleto.feature",
		"src/test/resources/features/ADP-64_HU-022_IngresoNumeroValidoTigoDeudaPendiente.feature",
		"src/test/resources/features/ADP-76_HU-023_AdelantaSaldo.feature",
		"src/test/resources/features/ADP-63_ResponsiveDePantallasPasarelaMovil.feature",
		"src/test/resources/features/ADP-63_ResponsiveDePantallasPasarelaHogar.feature",
		"src/test/resources/features/ADP-89_ResponsiveDePantallasMiCuenta.feature",
		"src/test/resources/features/ADP-92_ResponsiveDePantallasRecargas.feature",
		"src/test/resources/features/ADP-101_PruebaAdherenciaDePaquetes.feature",
		"src/test/resources/features/ADP-66_HU-001_ValidarIngreso.feature",
		"src/test/resources/features/ADP-67_HU-002_RegistroEnMiCuenta.feature",
		"src/test/resources/features/ADP-70_HU-003_FuncionalidadMicuentaAnonimo.feature",
		"src/test/resources/features/ADP-71_HU-004_BarraRegulatoria.feature",
		"src/test/resources/features/ADP-74_HU-005_ModuloConsultaTuVisita.feature",
		"src/test/resources/features/ADP-75_HU-006_CambioPlanMenuResumen.feature",
		"src/test/resources/features/ADP-78_HU-007_PagarFacturaMovilMenuResumen.feature",
		"src/test/resources/features/ADP-79_HU-008_DescargaDeFacturaMovil.feature",
		"src/test/resources/features/ADP-80_HU-009_ConsumosMovil.feature",
		"src/test/resources/features/ADP-81_HU-010_AsesorPersonalizado.feature",
		"src/test/resources/features/ADP-82_HU-011_AgregarTarjetaServiciosMoviles.feature",
		"src/test/resources/features/ADP-83_HU-012_FacturaDigital.feature",
		"src/test/resources/features/ADP-84_HU-013_SaldosEnDinero.feature",
		"src/test/resources/features/ADP-85_HU-014_SoporteTecnico.feature",
		"src/test/resources/features/ADP-86_HU-015_MejoraTuPlan.feature",
		"src/test/resources/features/ADP-87_HU-016_DescargaFacturaServiciosFijos.feature",
		"src/test/resources/features/ADP-90_HU-017_AgregarTarjetaServiciosFijos.feature",
		"src/test/resources/features/ADP-91_HU-018_CambioDatosFacturacionServiciosFijos.feature",
		"src/test/resources/features/ADP-93_HU-019_ServiciosFijos.feature",
		"src/test/resources/features/ADP-92_ResponsiveDePantallasRecargas.feature",
		"src/test/resources/features/ADP-94_HU-020_CambioContraseñaWifi.feature",
		"src/test/resources/features/ADP-95_HU021_CambioNombreRedWifi.feature",
		"src/test/resources/features/ADP-96_HU-022_CambioCanalWifi.feature",
		"src/test/resources/features/ADP-108_HU-023_CambiarDMZ.feature",
		"src/test/resources/features/ADP-109_HU-024_DetallesServiciosFijos.feature",
		"src/test/resources/features/ADP-110_HU-025_HistoricoConsumosTelefonia.feature",
		"src/test/resources/features/ADP-111_HU-026_ConsultaDePQR.feature" },

		tags = { "" }, monochrome = true, plugin = { "pretty", "html:target/reports/html/",
				"junit:target/reports/junit.xml", "json:target/reports/cukes.json" })

public class RunnerTags {
}
