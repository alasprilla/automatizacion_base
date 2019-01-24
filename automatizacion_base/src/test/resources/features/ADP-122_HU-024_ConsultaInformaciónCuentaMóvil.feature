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
    And doy clic en "Linea Arma Tu Plan 1" si es visible
    
    