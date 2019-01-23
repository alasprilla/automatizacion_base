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

      


   
