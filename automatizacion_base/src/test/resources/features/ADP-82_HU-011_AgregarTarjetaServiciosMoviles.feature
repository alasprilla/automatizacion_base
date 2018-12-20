#Author: Alexandra Lasprilla Cardona
#Keywords Summary :
@issue:ADP-82 @MiCuenta
Feature: HU011_AgregarTarjetaServiciosMoviles
  
Yo como usuario de mi cuenta Tigo 
Quiero agregar mi tarjeta de crédito 
Para programar el pago de mis facturas

  Scenario: Mi Cuenta - Formulario agregar tarjeta
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
    And doy clic en "Resumen" si es visible
    And doy clic en "Agregar Tarjeta"
    Then llevará al formulario con el objeto "Agregar tarjeta de crédito"