#Author: Nelson Mesa
#Keywords Summary :
@issue:ADP-86 @MiCuenta
Feature: HU015_MejoraTuPlan
  
YO como usuario de mi cuenta Tigo 
QUIERO conocer los planes pospago
PARA escoger el que más se ajusta a mis necesidades
  
    Background: Borrar Datos de Navegacion 
    And se borran cookies del navegador

  Scenario: Mejora tu plan
    Given Estoy en la página de inicio "Página mi cuenta tigo" en la url "https://tigoselfcareregional-uat-co.tigocloud.net"
    And se quiere visualizar con resolucion "850" x "1000"
    When doy clic en "Ingresar"
    And ingreso "lopezanamaria1@hotmail.com" en el campo "Correo mi cuenta"
    And doy clic en "Validar"
    And ingreso "pruebas2018" en el campo "Contrasena"
    And doy clic en "Continuar Mi Cuenta"
    And doy clic en "Seleccion MSISDN"
    And doy clic en "linea hibrido ana"
    And doy clic en "Administrar Servicios" si es visible
    And doy clic en "Mejora Plan" si es visible
    Then llevará al formulario con el objeto "Pospago 5.3"
    And llevará al formulario con el objeto "Pospago 5.2"
    And llevará al formulario con el objeto "Pospago 5.1"