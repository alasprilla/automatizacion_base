#Author: Nelson Mesa
#Keywords Summary :
@issue:ADP-83 @MiCuenta
Feature: HU012_FacturaDigital
  
YO como usuario de mi cuenta Tigo 
QUIERO cambiar los datos de facturación
PARA para recibir mi factura en mi correo electrónico
  
    Background: Borrar Datos de Navegacion 
    And se borran cookies del navegador
  
  
  Scenario: Cambio a facturación Electrónica
    Given Estoy en la página de inicio "Página mi cuenta tigo" en la url "https://tigoselfcareregional-uat-co.tigocloud.net"
    When doy clic en "ingresar"
    And ingreso "lopezanamaria1@hotmail.com" en el campo "correomicuenta"
    And doy clic en "Validar"
    And ingreso "pruebas2018" en el campo "Contrasena"
    And doy clic en "Continuar Mi Cuenta"
    And doy clic en "Seleccion MSISDN" si es visible
    And doy clic en "lineapruebasjuanca" si es visible
    And doy clic en "Seleccion MSISDN" si es visible
    And doy clic en "Arma tu plan pruebas" si es visible
    And doy clic en "facturacion"
    And doy clic en "Activa tu factura electrónica"
    And doy clic en "impresa"
    And doy clic en "ok"
    And Espero 4 segundos
    Then el campo "tus datos de facturación" tiene el texto "Tus datos de facturación se han modificado correctamente."


    
  Scenario: Cambio a facturación Impresa
    Given Estoy en la página de inicio "Página mi cuenta tigo" en la url "https://tigoselfcareregional-uat-co.tigocloud.net"
    When doy clic en "ingresar"
    And ingreso "lopezanamaria1@hotmail.com" en el campo "correomicuenta"
    And doy clic en "Validar"
    And ingreso "pruebas2018" en el campo "Contrasena"
    And doy clic en "Continuar Mi Cuenta"
    And doy clic en "Seleccion MSISDN" si es visible
    And doy clic en "lineapruebasjuanca" si es visible
    And doy clic en "Seleccion MSISDN" si es visible
    And doy clic en "Arma tu plan pruebas" si es visible
    And doy clic en "facturacion"
    And doy clic en "Modificar"
    And doy clic en "Electronica"
    And doy clic en "ok"
    And Espero 4 segundos
    Then el campo "tus datos de facturación" tiene el texto "Tus datos de facturación se han modificado correctamente."