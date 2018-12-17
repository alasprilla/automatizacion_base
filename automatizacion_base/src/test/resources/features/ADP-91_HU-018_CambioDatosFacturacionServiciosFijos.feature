#Author: Alexandra Lasprilla Cardona
#Keywords Summary :
@issue:ADP-91 @MiCuenta
Feature: HU018_CambioDatosFacturacionServiciosFijos
  
  Yo como usuario de mi cuenta Tigo 
  Quiero cambiar los datos de facturación
  Para para recibir la factura de mis servicios fijos en el correo electrónico

  Scenario: Mi Cuenta - Cambio Datos de Facturación
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
    And doy clic en "No Linea Fija" si es visible
    And doy clic en "Seleccion MSISDN" si es visible
    And Espero 1 segundos
    And doy clic en "Linea Fija" si es visible
    And doy clic forzado en "Facturación"
    And doy clic en "Modificar Facturación"
    And doy clic en "Documento"
    And doy clic en "CC"
    And ingreso "123458745" en el campo "Número Documento"
    And ingreso "lopezanamaria1@hotmail.com" en el campo "Correo Electronico Fijo"
    And doy clic en "OK"
    Then el campo "Mensaje Confirmación" tiene el texto "A partir de ahora recibirás tu factura en el correo electrónico lopezanamaria1@hotmail.com"


  