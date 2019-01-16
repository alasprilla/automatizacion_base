#Author: Alexandra Lasprilla Cardona
#Keywords Summary :
@issue:ADP-96 @MiCuenta
Feature: HU022_CambioCanalWifi
  
  Yo como usuario de mi cuenta Tigo 
  Quiero ingresar a mi servicio de internet
  Para realizar el cambio de canal de mi red Wifi

  Background: Borrar Datos de Navegacion
    And se borran cookies del navegador

  Scenario: Mi Cuenta - Cambio de Canal Fijo Wifi
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
    And doy clic en "No Linea Fija Wifi" si es visible
    And doy clic en "Seleccion MSISDN" si es visible
    And Espero 1 segundos
    And doy clic en "Linea Fija Wifi" si es visible
    And doy clic en "Servicios" si es visible
    And Espero 1 segundos
    And doy clic en "Producto Internet Detalles"
    And doy clic en "Cambiar canal Wifi"
    And doy clic en "Nuevo Canal"
    And doy clic en "Canal 3"
    And doy clic en "Aceptar"
    And el campo "Mensaje Cambio Canal" tiene el texto "El cambio de canal de la red de wifi fue exitosa."

  Scenario: Mi Cuenta - Cambio de Canal Automatico Wifi
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
    And doy clic en "No Linea Fija Wifi" si es visible
    And doy clic en "Seleccion MSISDN" si es visible
    And Espero 1 segundos
    And doy clic en "Linea Fija Wifi" si es visible
    And doy clic en "Servicios" si es visible
    And Espero 1 segundos
    And doy clic en "Producto Internet Detalles"
    And doy clic en "Cambiar canal Wifi"
    And doy clic en "Nuevo Canal"
    And doy clic en "Canal Automatico"
    And doy clic en "Aceptar"
    And el campo "Mensaje Cambio Canal" tiene el texto "El cambio de canal de la red de wifi fue exitosa."
