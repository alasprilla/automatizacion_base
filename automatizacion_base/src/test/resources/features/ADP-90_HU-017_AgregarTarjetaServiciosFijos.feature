#Author: Alexandra Lasprilla Cardona
#Keywords Summary :
@issue:ADP-90 @MiCuenta
Feature: HU017_AgregarTarjetaServiciosFijos
  
  Yo como usuario de mi cuenta Tigo 
  Quiero agregar mi tarjeta de crédito 
  Para programar el pago de mis facturas de servicios fijos

  Scenario: Mi Cuenta - Formulario agregar tarjeta
    Given Estoy en la página de inicio "Página mi cuenta tigo" en la url "https://tigoselfcareregional-uat-co.tigocloud.net"
    When doy clic en "Ingresar"
    And ingreso "lopezanamaria1@hotmail.com" en el campo "Correo Mi Cuenta"
    And doy clic en "Validar"
    And ingreso "pruebas2018" en el campo "Contrasena"
    And doy clic en "Continuar Mi Cuenta"
    And doy clic en "Seleccion MSISDN" si es visible
    And Espero 1 segundos
    And doy clic en "No Linea Casa Ana" si es visible
    And doy clic en "Seleccion MSISDN" si es visible
    And Espero 1 segundos
    And doy clic en "Linea Casa Ana" si es visible
    And doy clic en "Agregar Tarjeta"
    Then llevará al formulario con el objeto "Agregar tarjeta de crédito"
