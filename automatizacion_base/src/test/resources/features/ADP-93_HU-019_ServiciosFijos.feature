#Author: Alexandra Lasprilla Cardona
#Keywords Summary :
@issue:ADP-93 @MiCuenta
Feature: HU019_ServiciosFijos
  
Yo como usuario de mi cuenta Tigo 
Quiero ingresar a mis servicios fijos
Para realizar consultas y transacciones

  Scenario: Mi Cuenta - Productos contratados
    Given Estoy en la página de inicio de pago de facturas "https://tigoselfcareregional-uat-co.tigocloud.net"
    When doy clic en el botón "Ingresar"
    And ingreso "lopezanamaria1@hotmail.com" en el campo "Correo Mi Cuenta"
    And doy clic en el botón "Validar"
    And ingreso "pruebas2018" en el campo "Contrasena"
    And doy clic en el botón "Continuar Mi Cuenta"
    And doy clic en "Seleccion MSISDN" si es visible
    And doy clic en "Linea Pruebas Juanca"
    And doy clic en "Seleccion MSISDN"
    And doy clic en "Linea Casa Ana"
    And doy clic en "Servicios"
    Then llevará al formulario con el objeto "Productos Contratados"
    

