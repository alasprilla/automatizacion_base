#Author: Nelson Mesa
#Keywords Summary :
@issue:ADP-86 @MiCuenta
Feature: HU015_MejoraTuPlan
  
YO como usuario de mi cuenta Tigo 
QUIERO conocer los planes pospago
PARA escoger el que más se ajusta a mis necesidades
  
    Background: Borrar Datos de Navegacion 
    And se borran cookies del navegador

  Scenario Outline: Mejora tu plan
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
    And doy clic en "No linea hibrido" si es visible
    And doy clic en "Seleccion MSISDN" si es visible
    And Espero 1 segundos
    And doy clic en "Linea hibrido" si es visible
    And doy clic en "Administrar Servicios" si es visible
    And doy clic en "Mejora Plan" si es visible
    Then llevará al formulario con el objeto <Plan>
    
    Examples:
    |   Plan      |
    |"Pospago 5.3"| 
    |"Pospago 5.2"|
    |"Pospago 5.1"|
