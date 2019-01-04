#Author: Henry Andres Correa Correa
#Keywords Summary :
@issue:ADP-108 @MiCuenta
Feature: HU023_CambiarDMZ
  
  YO como usuario de mi cuenta Tigo 
  Quiero ingresar a mi servicio de internet
  Para Para realizar el cambio de DMZ de mi red Wifi

  Background: Borrar Datos de Navegacion
    Given se borran cookies del navegador
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

  Scenario Outline: Mi Cuenta - Cambio de DMZ
    And doy clic en "servicios" si es visible
    And doy clic en "Producto Internet Detalles"
    And doy clic en "Cambiar DMZ del Wifi"
    And ingreso <ip> en el campo "Ingresar ip DMZ"
    And doy clic en "Ok"
    Then el campo "Mensaje Confirmación" tiene el texto <mensaje>

    Examples: 
      | escenario | ip              | mensaje                                                                                           |
      | "Fallido" | "255.255.12"    | "La IP es invalida, por favor revise que tenga el formato adecuado. Ejemplo: \"198.34.250.5\"." |
      | "Fallido" | "///???''"      | "La IP es invalida, revise que no contenga carácteres especiales."                                |
      | "Exitoso" | "192.168.1.250" | "Configuración de DMZ en la red wifi fue exitosa."                                                |
