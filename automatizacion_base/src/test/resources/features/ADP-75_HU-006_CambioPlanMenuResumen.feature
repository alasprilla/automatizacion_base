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
    Given Estoy en la página de inicio "Página mi cuenta tigo" en la url "https://tigoselfcareregional-uat-co.tigocloud.net"
    When doy clic en "Ingresar"
    And ingreso "lopezanamaria1@hotmail.com" en el campo "Correo Mi Cuenta"
    And doy clic en "Validar"
    And ingreso "pruebas2018" en el campo "Contrasena"
    And doy clic en "Continuar Mi Cuenta"
    And doy clic en "Seleccion MSISDN" si es visible
    And Espero 1 segundos
    And doy clic en "No Linea Hibrido" si es visible
    And doy clic en "Seleccion MSISDN" si es visible
    And Espero 1 segundos
    And doy clic en "Linea Hibrido" si es visible
    And doy clic en "Resumen" si es visible
    And doy clic en "Cambiate Ya"
    Then el campo "Mejorar Plan" tiene el texto "Mejorar Plan"
    Then el campo "Detalle Plan" tiene el texto "Tenemos el plan perfecto para ti. Activalo en nuestro chat en línea."

  Scenario: Mi Cuenta - Cámbiate ya en Resumen de línea móvil prepago
    Given Estoy en la página de inicio "Página mi cuenta tigo" en la url "https://tigoselfcareregional-uat-co.tigocloud.net"
    When doy clic en "Ingresar"
    And ingreso "lopezanamaria1@hotmail.com" en el campo "Correo Mi Cuenta"
    And doy clic en "Validar"
    And ingreso "pruebas2018" en el campo "Contrasena"
    And doy clic en "Continuar Mi Cuenta"
    And doy clic en "Seleccion MSISDN" si es visible
    And Espero 1 segundos
    And doy clic en "No Linea Hibrido Mariana" si es visible
    And doy clic en "Seleccion MSISDN" si es visible
    And Espero 1 segundos
    And doy clic en "Linea Hibrido Mariana" si es visible
    And doy clic en "Resumen" si es visible
    Then el campo "Mejora Plan" no existe

  Scenario: Mi Cuenta - Cámbiate ya en resumen de línea móvil con plan Empleados
    Given Estoy en la página de inicio "Página mi cuenta tigo" en la url "https://tigoselfcareregional-uat-co.tigocloud.net"
    When doy clic en "Ingresar"
    And ingreso "lopezanamaria1@hotmail.com" en el campo "Correo Mi Cuenta"
    And doy clic en "Validar"
    And ingreso "pruebas2018" en el campo "Contrasena"
    And doy clic en "Continuar Mi Cuenta"
    And doy clic en "Seleccion MSISDN" si es visible
    And Espero 1 segundos
    And doy clic en "No Linea Hibrido Ana" si es visible
    And doy clic en "Seleccion MSISDN" si es visible
    And Espero 1 segundos
    And doy clic en "Linea Hibrido Ana" si es visible
    And doy clic en "Resumen" si es visible
    And doy clic en "Cambiate Ya"
    Then llevará al formulario con el objeto "Planes"
