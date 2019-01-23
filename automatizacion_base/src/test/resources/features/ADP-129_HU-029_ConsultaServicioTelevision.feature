#Author: Alexandra Lasprilla
#Keywords Summary :
@issue:ADP-129 @MiCuenta
Feature: HU029 Consulta Servicio Television
  
  Yo como usuario de mi cuenta Tigo 
  Quiero consultar el detalle de mi servicio de televisión
  Para Ver información de mis dispositivos y de mi suscripción

  Background: Borrar Datos de Navegacion
    And se borran cookies del navegador

  Scenario: Usuario sin servicios de televisión
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
  And doy clic en "No linea Fija con Television" si es visible
  And doy clic en "Seleccion MSISDN" si es visible
  And Espero 1 segundos
  And doy clic en "Linea Fija con Television" si es visible
  And doy clic en "Servicios" si es visible
  Then el campo "Producto television detalles" no existe
  
  Scenario: Usuario de televisión tradicional
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
  And doy clic en "No linea Fija" si es visible
  And doy clic en "Seleccion MSISDN" si es visible
  And Espero 1 segundos
  And doy clic en "Linea Fija" si es visible
  And doy clic en "Servicios" si es visible
  Then llevará al formulario con el objeto "Producto television detalles"
  Then llevará al formulario con el objeto "Nombre servicio television"
  Then llevará al formulario con el objeto "Numero servicio television"
  Then llevará al formulario con el objeto "Estado servicio television"
  And doy clic en "Producto television detalles"
  And llevará al formulario con el objeto "Television"
  And doy clic en "Servicios" si es visible
  And doy clic en "Diagnosticar Fallas"
  And el campo "Modal Diagnostico fallas" tiene el texto "¡Espera mientras revisamos tus servicios en linea!"
  
  Scenario: Usuario de televisión oneTV
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
    And doy clic en "No linea Fija Wifi" si es visible
    And doy clic en "Seleccion MSISDN" si es visible
    And Espero 1 segundos
    And doy clic en "Linea Fija Wifi" si es visible
    And doy clic en "Servicios" si es visible
    Then llevará al formulario con el objeto "Producto television detalles"
    Then llevará al formulario con el objeto "Nombre servicio television"
    Then llevará al formulario con el objeto "Numero servicio television"
    Then llevará al formulario con el objeto "Estado servicio television"
    And doy clic en "Producto television detalles"
    And llevará al formulario con el objeto "Television"
    And doy clic en "Servicios" si es visible
    And doy clic en "Diagnosticar Fallas"
    And el campo "Modal Diagnostico fallas" tiene el texto "¡Espera mientras revisamos tus servicios en linea!"
