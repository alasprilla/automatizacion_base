#Author: Alexandra Lasprilla Cardona
#Keywords Summary :
@issue:ADP-84 @MiCuenta 
Feature: HU013_SaldosEnDinero
  
  Yo como usuario de mi cuenta Tigo 
  Quiero conocer el saldo de mis líneas
  Para realizar recargas o transferencias de dinero

  Background: Borrar Datos de Navegacion
    And se borran cookies del navegador

  Scenario: Mi Cuenta - Realizar recargas
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
    And doy clic en "No Linea Arma tu Plan" si es visible
    And doy clic en "Seleccion MSISDN" si es visible
    And Espero 1 segundos
    And doy clic en "Linea Arma tu Plan" si es visible
    And doy clic en "Saldos" si es visible
    And doy clic en "Recargar Mi Cuenta"
    Then llevará al formulario con el objeto "recarga"
    And lo llevará a la página "https://transacciones.tigo.com.co/servicios/paquetes"
    
  Scenario: Mi Cuenta - Transferir saldo
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
    And doy clic en "No Linea Prepago" si es visible
    And doy clic en "Seleccion MSISDN" si es visible
    And Espero 1 segundos
    And doy clic en "Linea Prepago" si es visible
    And doy clic en "Saldos" si es visible
    And doy clic en "Transferir"
    And ingreso "501" en el campo "Monto a Compartir"
    And ingreso "3006541273" en el campo "Número del destinatario"
    And doy clic en "OK"
    And doy clic en "Confirmar Transferencia"
    Then el campo "Mensaje Confirmación" tiene el texto "La transferencia de saldo ha sido exitosa."
