#Author: Nelson Mesa
#Keywords Summary :
@issue:ADP-70 @MiCuenta
Feature: HU003 Funcionalidades Mi cuenta Anónimo
  
  Como usuario de mi cuenta Tigo 
  ingresar a las funcionalidades del home para realizar diferentes transacciones

  Scenario: Paga tus facturas
    Given Estoy en la página de inicio "Página mi cuenta tigo" en la url "https://tigoselfcareregional-uat-co.tigocloud.net"
    When doy clic en "Paga tus facturas"
    And voy a la pestaña "ultima"
    Then llevará al formulario con el objeto "movil"
    And lo llevará a la página "https://transacciones.tigo.com.co/servicios/facturas"
    And cerrar pestaña

  Scenario: Recargas y paquetes
    Given se borran cookies del navegador
    And Estoy en la página de inicio "Página mi cuenta tigo" en la url "https://tigoselfcareregional-uat-co.tigocloud.net"
    And Presiono la tecla "Avanzar Página" sobre "Recargas y paquetes"
    When doy clic en "Recargas y paquetes"
    And Espero 3 segundos
    And voy a la pestaña "ultima"
    Then llevará al formulario con el objeto "recarga"
    And lo llevará a la página "https://transacciones.tigo.com.co/servicios/paquetes"
    And cerrar pestaña

  Scenario: Registra tu equipo
    Given Estoy en la página de inicio "Página mi cuenta tigo" en la url "https://tigoselfcareregional-uat-co.tigocloud.net"
    When doy clic en "Registra tu equipo"
    And voy a la pestaña "ultima"
    Then llevará al formulario con el objeto "realizar registro de equipo"
    And lo llevará a la página "https://www.tigo.com.co/atencion-al-cliente/registra-tu-equipo"
    And cerrar pestaña

  Scenario: Repone tu SIM
    Given Estoy en la página de inicio "Página mi cuenta tigo" en la url "https://tigoselfcareregional-uat-co.tigocloud.net"
    When doy clic en "Repone tu SIM"
    And voy a la pestaña "ultima"
    Then llevará al formulario con el objeto "repone"
    And lo llevará a la página "https://www1.tigo.com.co/reposicion-sim-card"
    And cerrar pestaña
