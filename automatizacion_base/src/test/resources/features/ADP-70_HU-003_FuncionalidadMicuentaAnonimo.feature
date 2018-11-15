#Author: Nelson Mesa
#Keywords Summary :
@issue:ADP-70 @MiCuenta

Feature: HU003 Funcionalidades Mi cuenta Anónimo

Como usuario de mi cuenta Tigo 
ingresar a las funcionalidades del home para realizar diferentes transacciones

  Scenario: Paga tus facturas
    Given Estoy en la página de inicio de pago de facturas "https://tigoselfcareregional-uat-co.tigocloud.net"
    When doy clic en "Paga tus facturas"
    And Espero 2 segundos
    Then lo llevará a la página "https://transacciones.tigo.com.co/servicios/facturas"
    And llevará al formulario con el objeto "movil"

  Scenario: Recargas y paquetes
    Given Estoy en la página de inicio de pago de facturas "https://tigoselfcareregional-uat-co.tigocloud.net"
    When doy clic en "Recargas y paquetes"
    And Espero 4 segundos
    Then lo llevará a la página "https://transacciones.tigo.com.co/servicios/paquetes?he=1"
    And llevará al formulario con el objeto "comprar"
    
  Scenario: Registra tu equipo
    Given Estoy en la página de inicio de pago de facturas "https://tigoselfcareregional-uat-co.tigocloud.net"
    When doy clic en "Registra tu equipo"
    And Espero 2 segundos
    Then lo llevará a la página "https://www.tigo.com.co/atencion-al-cliente/registra-tu-equipo"
    
  Scenario: Repone tu SIM
    Given Estoy en la página de inicio de pago de facturas "https://tigoselfcareregional-uat-co.tigocloud.net"
    When doy clic en "Repone tu SIM"
    And Espero 2 segundos
    Then lo llevará a la página "https://www1.tigo.com.co/reposicion-sim-card"
    And llevará al formulario con el objeto "repone"