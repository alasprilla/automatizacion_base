#Author: Alexandra Lasprilla Cardona
#Keywords Summary :
@issue:ADP-90 @MiCuenta
Feature: HU017_AgregarTarjetaServiciosFijos
  
  Yo como usuario de mi cuenta Tigo 
  Quiero agregar mi tarjeta de crédito 
  Para programar el pago de mis facturas de servicios fijos

  Scenario: Mi Cuenta - Formulario agregar tarjeta
    Given Estoy en la página de inicio "Página mi cuenta tigo" en la url "https://tigoselfcareregional-uat-co.tigocloud.net"
    When doy clic en el botón "Ingresar"
    And ingreso "lopezanamaria1@hotmail.com" en el campo "Correo Mi Cuenta"
    And doy clic en el botón "Validar"
    And ingreso "pruebas2018" en el campo "Contrasena"
    And doy clic en el botón "Continuar Mi Cuenta"
    And doy clic en "Seleccion MSISDN" si es visible
    And doy clic en "Linea Pruebas Juanca" si es visible
    And doy clic en "Seleccion MSISDN" si es visible
    And doy clic en "Linea Casa Ana" si es visible
    And doy clic en el botón "Agregar Tarjeta"
    Then llevará al formulario con el objeto "Agregar tarjeta de crédito"
