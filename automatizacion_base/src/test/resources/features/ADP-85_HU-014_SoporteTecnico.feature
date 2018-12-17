#Author: Nelson Mesa
#Keywords Summary :
@issue:ADP-85 @MiCuenta
Feature: HU014_Soporte Tecnico
  
Yo como usuario de mi cuenta Tigo 
Quiero tener soporte de mis equipos
Para resolver las fallas presentadas

    Background: Borrar Datos de Navegacion 
    And se borran cookies del navegador

  Scenario: Centro de ayuda
    Given Estoy en la página de inicio "Página mi cuenta tigo" en la url "https://tigoselfcareregional-uat-co.tigocloud.net"
    When doy clic en "Ingresar"
    And ingreso "automatizacionmicuenta@gmail.com" en el campo "Correo Mi Cuenta"
    And doy clic en "Validar"
    And doy clic en "siguiente"
    And ingreso "Colombia2019" en el campo "Contrasena Gmail"
    And doy clic en "Siguiente C"
    And doy clic en "Seleccion MSISDN" si es visible
    And Espero 1 segundos
    And doy clic en "No linea hibrido juanca" si es visible
    And doy clic en "Seleccion MSISDN" si es visible
    And Espero 1 segundos
    And doy clic en "Linea hibridojuanca" si es visible
    And doy clic en "Resumen" si es visible
    And doy clic en "Soporte Tecnico"
    And doy clic en "Centro de Ayuda"
    And voy a la pestaña "ultima"
    And lo llevará a la página "https://ayuda.tigoune.co/hc/es/sections/115001850127-Equipos"
    And cerrar pestaña
  
  
    Scenario: Tiendas
    Given Estoy en la página de inicio "Página mi cuenta tigo" en la url "https://tigoselfcareregional-uat-co.tigocloud.net"
    When doy clic en "Ingresar"
    And ingreso "automatizacionmicuenta@gmail.com" en el campo "Correo Mi Cuenta"
    And doy clic en "Validar"
    And doy clic en "siguiente"
    And ingreso "Colombia2019" en el campo "Contrasena Gmail"
    And doy clic en "Siguiente C"
    And doy clic en "Seleccion MSISDN" si es visible
    And Espero 1 segundos
    And doy clic en "No linea hibrido juanca" si es visible
    And doy clic en "Seleccion MSISDN" si es visible
    And Espero 1 segundos
    And doy clic en "Linea hibridojuanca" si es visible
    And doy clic en "Resumen" si es visible
    And doy clic en "Soporte Tecnico"
    And doy clic en "tienda"
    And voy a la pestaña "ultima"
    And lo llevará a la página "https://www.tigo.com.co/tiendas"
    And cerrar pestaña		