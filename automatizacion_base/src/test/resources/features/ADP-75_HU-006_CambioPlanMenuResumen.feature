#Author: Alexandra Lasprilla Cardona
#Keywords Summary :
@issue:ADP-75 @MiCuenta
Feature: HU006_CambioDePlanMenuResumen
  
  Yo como usuario de mi cuenta Tigo 
  Quiero ingresar al menú resumen
  Para realizar el cambio de plan.

  Scenario: Mi Cuenta - Cámbiate ya en Resumen de línea móvil con plan 5.1
    Given Estoy en la página de inicio de pago de facturas "https://tigoselfcareregional-uat-co.tigocloud.net"
    When doy clic en el botón "Ingresar"
    And ingreso "lopezanamaria1@hotmail.com" en el campo "Correo Mi Cuenta"
    And doy clic en el botón "Validar"
    And ingreso "pruebas2018" en el campo "Contrasena"
    And doy clic en el botón "Continuar Mi Cuenta"
    And doy clic en "Seleccion MSISDN"
    And doy clic en "Msisdn Mi Cuenta"
    And doy clic en el botón "Resumen"
    And doy clic en el botón "Cambiate Ya"
    Then el campo "" tiene el texto "Mejorar Plan. Tenemos el plan perfecto para ti. Activalo en nuestro chat en línea."

  #Scenario: Mi Cuenta - Cámbiate ya en Resumen de línea móvil prepago
    #Given Estoy en la página de inicio de pago de facturas "https://tigoselfcareregional-uat-co.tigocloud.net"
    #When doy clic en el botón "Ingresar"
    #And ingreso "lopezanamaria1@hotmail.com" en el campo "Correo Mi Cuenta"
    #And doy clic en el botón "Validar"
    #And ingreso "pruebas2018" en el campo "Contrasena"
    #And doy clic en el botón "Continuar Mi Cuenta"
    #And selecciono "3006100623" en el campo "Seleccion MSISDN"
    #And doy clic en el botón "Resumen"
    #Then No se mostrará la opción de mejorar el plan.
#
  #Scenario: Mi Cuenta - Cámbiate ya en resumen de línea móvil con plan Empleados
    #Given Estoy en la página de inicio de pago de facturas "https://tigoselfcareregional-uat-co.tigocloud.net"
    #When doy clic en el botón "Ingresar"
    #And ingreso "lopezanamaria1@hotmail.com" en el campo "Correo Mi Cuenta"
    #And doy clic en el botón "Validar"
    #And ingreso "pruebas2018" en el campo "Contrasena"
    #And doy clic en el botón "Continuar Mi Cuenta"
    #And selecciono "3003790380" en el campo "Seleccion MSISDN"
    #And doy clic en el botón "Resumen"
    #And doy clic en el botón "Cambiate Ya"
    #Then mostrará las opciones de los planes pospago 5.1, 5.2 y 5.3
