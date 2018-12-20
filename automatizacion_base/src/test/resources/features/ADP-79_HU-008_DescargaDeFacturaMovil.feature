#Author: Leison David Perilla
#Keywords Summary :
@issue:ADP-79 @MiCuenta
Feature: HU008_DescargaDeFacturaMovil
  
  YO como usuario de mi cuenta Tigo 
  QUIERO realizar la descarga de mi factura móvil
  PARA conocer el detalle de los consumos

  Background: Borrar Datos de Navegacion
    And se borran cookies del navegador

  Scenario: Mi Cuenta - Descarga de factura en menú resumen
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
    And doy clic en "No Linea Hibrido" si es visible
    And doy clic en "Seleccion MSISDN" si es visible
    And Espero 1 segundos
    And doy clic en "Linea Hibrido" si es visible
    And doy clic en "Resumen" si es visible
    And guardo el texto de "Referencia de pago" como "txt referencia de pago"
    And concateno "txt referencia de pago" con ".pdf" y se guarda en "txt referencia de pago"
    And doy clic en "Ultima Factura Pdf"
    And Espero 15 segundos
    When abro en el navegador el archivo "txt referencia de pago"
    And cerrar pestaña

  Scenario: Mi Cuenta - Descarga de factura en menú facturación
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
    And doy clic en "No Linea arma tu Plan" si es visible
    And doy clic en "Seleccion MSISDN" si es visible
    And Espero 1 segundos
    And doy clic en "Linea arma tu Plan 1" si es visible
    And doy clic en "Facturacion" si es visible
    And guardo el texto de "Referencia de pago" como "txt referencia de pago"
    And concateno "txt referencia de pago" con ".pdf" y se guarda en "txt referencia de pago"
    And doy clic en "Ultima Factura Pdf"
    And Espero 15 segundos
    When abro en el navegador el archivo "txt referencia de pago"
    And cerrar pestaña
