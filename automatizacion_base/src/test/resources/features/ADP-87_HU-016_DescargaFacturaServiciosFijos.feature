#Author: Alexandra Lasprilla 
#Keywords Summary :
@issue:ADP-87 @MiCuenta
Feature: HU016_DescargaDeFacturaFija
  
Yo como usuario de mi cuenta Tigo 
Quiero ingresar al menú facturación
Para realizar la descarga de las facturas de mis servicios fijos

  Background: Borrar Datos de Navegacion
    And se borran cookies del navegador

  #Scenario: Mi Cuenta - Descarga de última factura
    #Given Estoy en la página de inicio "Página mi cuenta tigo" en la url "https://tigoselfcareregional-uat-co.tigocloud.net"
    #When doy clic en "Ingresar"
    #And ingreso "automatizacionmicuenta@gmail.com" en el campo "Correo Mi Cuenta"
    #And doy clic en "Validar"
    #And doy clic en "siguiente"
    #And ingreso "Colombia2019" en el campo "Contrasena Gmail"
    #And doy clic en "Siguiente C"
    #And Espero 1 segundos
    #And doy clic en "Seleccion MSISDN" si es visible
    #And Espero 1 segundos
    #And doy clic en "No Linea Fija" si es visible
    #And doy clic en "Seleccion MSISDN" si es visible
    #And Espero 1 segundos
    #And doy clic en "Linea Fija" si es visible
    #And doy clic en "Facturacion" si es visible
    #And doy clic en "Ultima Factura Pdf"
    #And Espero 15 segundos
    #When abro en el navegador el archivo "11231944.951397311-44.pdf"
    #And cerrar pestaña

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
    And doy clic en "No Linea Fija" si es visible
    And doy clic en "Seleccion MSISDN" si es visible
    And Espero 1 segundos
    And doy clic en "Linea Fija" si es visible
    And doy clic en "Facturacion" si es visible
    And doy clic en "Historico PDF"
    And Espero 15 segundos
    When abro en el navegador el archivo "11231944.951397311-44.pdf"
    And cerrar pestaña
    