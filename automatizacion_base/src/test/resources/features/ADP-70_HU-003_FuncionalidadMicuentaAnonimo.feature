#Author: Nelson Mesa
#Keywords Summary :
@issue:ADP-70

Feature: HU003 Funcionalidades Mi cuenta Anónimo

Como usuario de mi cuenta Tigo 
ingresar a las funcionalidades del home para realizar diferentes transacciones

  Scenario: Paga tus facturas
    Given Estoy en la página de inicio de pago de facturas "https://tigoselfcareregional-uat-co.tigocloud.net"
    When doy clic en "Paga tus facturas"
    And Espero 2 segundos
    Then lo llevará a la página "https://transacciones.tigo.com.co/servicios/facturas"
    And llevará al formulario con el objeto "movil"

