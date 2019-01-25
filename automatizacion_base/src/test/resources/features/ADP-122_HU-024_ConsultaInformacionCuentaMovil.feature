#Author: Alexandra Lasprilla
#Keywords Summary :
@issue:ADP-122 @MiCuenta
Feature: HU024 Consulta Informacion Cuenta - Movil
  
  Yo como usuario de mi cuenta Tigo 
  Quiero ingresar a la informacion de mi cuenta 
  Para conocer mis datos personales almacenados

  Background: Borrar Datos de Navegacion
    And se borran cookies del navegador

  Scenario: Usuario no tiene visitas programadas ni históricas
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
    And doy clic en "No linea arma tu plan" si es visible
    And doy clic en "Seleccion MSISDN" si es visible
    And Espero 1 segundos
    And doy clic en "linea arma tu plan 1" si es visible
    And doy clic en "Mi cuenta movil" si es visible
    Then llevará al formulario con el objeto "Mi Informacion"
    And el campo "Nombre" tiene el texto "Colombia Movil Pruebas Billing"
    And el campo "Documento" tiene el texto "Cedula de Ciudadanía 8301149210"
    And el campo "Dirreccion" tiene el texto "CRR 9 99 02"
    And el campo "Departamento" tiene el texto "BOGOTA D.E"
    And el campo "Ciudad" tiene el texto "BOGOTA"
    And el campo "Correo Electronico" tiene el texto "No disponible"
    And el campo "Telefono" tiene el texto "3008819838"
    
    