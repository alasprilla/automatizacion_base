#Author: Alexandra Lasprilla Cardona
#Keywords Summary :
@issue:ADP-80 @MiCuenta
Feature: HU009_ConsumosMovil
  
Yo como usuario de mi cuenta Tigo 
Quiero Ingresar a mis consumos
Para llevar el registro y control de estos

  Background: Borrar Datos de Navegacion
    And se borran cookies del navegador

  Scenario Outline: Mi Cuenta - Consumos Datos
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
    And doy clic en "No Linea Hibrido" si es visible
    And doy clic en "Seleccion MSISDN" si es visible
    And Espero 1 segundos
    And doy clic en "Linea Hibrido" si es visible
    And doy clic en "Consumos" si es visible
    Then llevará al formulario con el objeto <Detalle>
    
    Examples: 
      | Detalle            |
      | "FechayHora"       |
      | "Día"              |
      | "Consumo Datos"    |
    
