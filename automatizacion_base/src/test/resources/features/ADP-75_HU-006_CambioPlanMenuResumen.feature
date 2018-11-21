#Author: Alexandra Lasprilla Cardona
#Keywords Summary :
@issue:ADP-75 @MiCuenta
Feature: HU006_CambioDePlanMenuResumen
  
  Yo como usuario de mi cuenta Tigo 
  Quiero ingresar al menú resumen
  Para realizar el cambio de plan.
  
    Background: Borrar Datos de Navegacion 
    And se borran cookies del navegador

  Scenario: Mi Cuenta - Cámbiate ya en Resumen de línea móvil con plan 5.1
    Given Estoy en la página de inicio de pago de facturas "https://tigoselfcareregional-uat-co.tigocloud.net"
    When doy clic en el botón "Ingresar"
    And ingreso "lopezanamaria1@hotmail.com" en el campo "Correo Mi Cuenta"
    And doy clic en el botón "Validar"
    And ingreso "pruebas2018" en el campo "Contrasena"
    And doy clic en el botón "Continuar Mi Cuenta"
    And doy clic en "Seleccion MSISDN"
    And doy clic en "Linea Pruebas Juanca"
    And doy clic forzado en "Resumen"
    And doy clic en "Cambiate Ya"
    Then el campo "Mejorar Plan" tiene el texto "Mejorar Plan"
    Then el campo "Detalle Plan" tiene el texto "Tenemos el plan perfecto para ti. Activalo en nuestro chat en línea."

    
  Scenario: Mi Cuenta - Cámbiate ya en Resumen de línea móvil prepago
    Given Estoy en la página de inicio de pago de facturas "https://tigoselfcareregional-uat-co.tigocloud.net"
    When doy clic en el botón "Ingresar"
    And ingreso "lopezanamaria1@hotmail.com" en el campo "Correo Mi Cuenta"
    And doy clic en el botón "Validar"
    And ingreso "pruebas2018" en el campo "Contrasena"
    And doy clic en el botón "Continuar Mi Cuenta"
    And doy clic en "Seleccion MSISDN"
    And Espero 1 segundos
    And doy clic en "Linea Hibrido Mariana"
    And doy clic en el botón "Resumen"
    Then el campo "Cambiate Ya" no existe 

  Scenario Outline: Mi Cuenta - Cámbiate ya en resumen de línea móvil con plan Empleados
    Given Estoy en la página de inicio de pago de facturas "https://tigoselfcareregional-uat-co.tigocloud.net"
    And se borran cookies del navegador 
    When doy clic en el botón "Ingresar"
    And ingreso "lopezanamaria1@hotmail.com" en el campo "Correo Mi Cuenta"
    And doy clic en el botón "Validar"
    And ingreso "pruebas2018" en el campo "Contrasena"
    And doy clic en el botón "Continuar Mi Cuenta"
    And doy clic en "Seleccion MSISDN"
    And doy clic en "Linea Hibrido Ana"
    And doy clic en el botón "Resumen"
    And doy clic en el botón "Cambiate Ya"
    Then llevará al formulario con el objeto <Planes>

    Examples: 
    | Planes     |
    |"Plan 5.1"  |
    |"Plan 5.2"  |
    |"Plan 5.3"  |