#Author: Alexandra Lasprilla Cardona
#Keywords Summary :
@issue:ADP-78 @MiCuenta
Feature: HU007_PagarFacturaMovilMenuResumen
  
  Yo como usuario de mi cuenta Tigo 
  Quiero ingresar al menú resumen
  Para realizar el pago de la factura móvil desde el menú resumen

  Background: Borrar Datos de Navegacion
    And se borran cookies del navegador

  Scenario: Mi Cuenta - Pago factura línea pospago
    Given Estoy en la página de inicio "Página mi cuenta tigo" en la url "https://tigoselfcareregional-uat-co.tigocloud.net"
    When doy clic en "Ingresar"
    And ingreso "lopezanamaria1@hotmail.com" en el campo "Correo Mi Cuenta"
    And doy clic en "Validar"
    And ingreso "pruebas2018" en el campo "Contrasena"
    And doy clic en "Continuar Mi Cuenta"
    And doy clic en "Seleccion MSISDN" si es visible
    And doy clic en "Linea Hibrido" si es visible
    And doy clic en "Seleccion MSISDN" si es visible
    And doy clic en "Linea Hibrido Ana" si es visible
    And doy clic en "Resumen" si es visible
    And doy clic en "Pagar Factura"
    Then llevará al formulario con el objeto "Pagar tu Factura"

  Scenario: Mi Cuenta - Pago de factura línea prepago
    Given Estoy en la página de inicio "Página mi cuenta tigo" en la url "https://tigoselfcareregional-uat-co.tigocloud.net"
    When doy clic en "Ingresar"
    And ingreso "lopezanamaria1@hotmail.com" en el campo "Correo Mi Cuenta"
    And doy clic en "Validar"
    And ingreso "pruebas2018" en el campo "Contrasena"
    And doy clic en "Continuar Mi Cuenta"
    And doy clic en "Seleccion MSISDN" si es visible
    And doy clic en "Linea Hibrido" si es visible
    And doy clic en "Seleccion MSISDN" si es visible
    And doy clic en "Linea Hibrido Mariana" si es visible
    And doy clic en "Resumen" si es visible
    Then el campo "Pagar Factura" no existe
