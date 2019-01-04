#Author: 
#Keywords Summary :
@issue:ADP-110 @MiCuenta
Feature: HU025_HistoricoConsumosTelefonia
  
Yo como usuario de mi cuenta Tigo 
Quiero ingresar al Histórico de consumos
Para conocer el detalle de los consumos del servicio de telefonía

  Background: Borrar Datos de Navegacion
    And se borran cookies del navegador
    
  Scenario: Mi Cuenta - Histórico de consumos
    Given Estoy en la página de inicio "Página mi cuenta tigo" en la url "https://tigoselfcareregional-uat-co.tigocloud.net"
    When doy clic en "Ingresar"
    And ingreso "automatizacionmicuenta@gmail.com" en el campo "Correo Mi Cuenta"
    And doy clic en "Validar"
    And doy clic en "siguiente"
    And ingreso "Colombia2019" en el campo "Contrasena Gmail"
    And doy clic en "Siguiente C"
    And Espero 1 segundos
    And doy clic en "Seleccion MSISDN" si es visible
    And Espero 1 segundos
    And doy clic en "No Linea fija" si es visible
    And doy clic en "Seleccion MSISDN" si es visible
    And Espero 1 segundos
    And doy clic en "Linea Fija" si es visible
    And doy clic en "Servicios" si es visible 
    And doy clic en "Producto Telefonia detalles"
    And doy clic en "Historico de Consumo"
   Then llevará al formulario con el objeto "Detalle consumo" 
   
    Scenario: Mi Cuenta - Detalle del Histórico de consumos
    Given Estoy en la página de inicio "Página mi cuenta tigo" en la url "https://tigoselfcareregional-uat-co.tigocloud.net"
    When doy clic en "Ingresar"
    And ingreso "automatizacionmicuenta@gmail.com" en el campo "Correo Mi Cuenta"
    And doy clic en "Validar"
    And doy clic en "siguiente"
    And ingreso "Colombia2019" en el campo "Contrasena Gmail"
    And doy clic en "Siguiente C"
    And Espero 1 segundos
    And doy clic en "Seleccion MSISDN" si es visible
    And Espero 1 segundos
    And doy clic en "No Linea fija" si es visible
    And doy clic en "Seleccion MSISDN" si es visible
    And Espero 1 segundos
    And doy clic en "Linea Fija" si es visible
    And doy clic en "Servicios" si es visible 
    And doy clic en "Producto Telefonia detalles"
    And doy clic en "Historico de Consumo"
    And doy clic en "Ver detalle" 
   Then llevará al formulario con el objeto "Fecha consumo"