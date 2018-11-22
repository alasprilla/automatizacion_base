#Author: Alexandra Lasprilla Cardona
#Keywords Summary :
@issue:ADP-79 @MiCuenta
Feature: HU008_DescargaFacturaMovil
  
  Yo como usuario de mi cuenta Tigo 
  Quiero realizar la descarga de mi factura móvil
  Para conocer el detalle de los consumos

  Background: Borrar Datos de Navegacion
    And se borran cookies del navegador

  Scenario: Mi Cuenta - Descarga de factura en menú resumen
    Given Estoy en la página de inicio de pago de facturas "https://tigoselfcareregional-uat-co.tigocloud.net"
    When doy clic en el botón "Ingresar"
    And ingreso "lopezanamaria1@hotmail.com" en el campo "Correo Mi Cuenta"
    And doy clic en el botón "Validar"
    And ingreso "pruebas2018" en el campo "Contrasena"
    And doy clic en el botón "Continuar Mi Cuenta"
    And doy clic en "Seleccion MSISDN"
    And doy clic en "Linea Hibrido Ana"
    And doy clic forzado en "Resumen"
    And Espero 3 segundos
    And doy clic en "Ultima Factura PDF"
    And Espero 2 segundos
    Then realizará la descarga de la factura

