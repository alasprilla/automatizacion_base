#Author: Nelson Mesa
#Keywords Summary :
@issue:ADP-93 @MiCuenta
Feature: HU023_Cambio Tipo de Factura Fijo
  
  Yo como usuario de mi cuenta Tigo 
  Quiero ingresar a mis servicios fijos
  Para Para cambiar mi tipo de factura
  
    #Scenario: El usuario ya tiene factura electrónica
    #Given Estoy en la página de inicio "Página mi cuenta tigo" en la url "https://tigoselfcareregional-uat-co.tigocloud.net"
    #When doy clic en "Ingresar"
    #And ingreso "automatizacionmicuenta@gmail.com" en el campo "Correo Mi Cuenta"
    #And doy clic en "Validar"
    #And doy clic en "siguiente"
    #And ingreso "Colombia2019" en el campo "Contrasena Gmail"
    #And doy clic en "Siguiente C"
    #And Espero 1 segundos
    #And doy clic en "Seleccion MSISDN" si es visible
    #And Espero 1 segundos
    #And doy clic en "No Linea fija" si es visible
    #And doy clic en "Seleccion MSISDN" si es visible 
    #And Espero 1 segundos
    #And doy clic en "Linea Fija" si es visible
    #And doy clic en "Facturacion" si es visible
    #And doy clic en "modificarfacturacion"
    #And Espero 4 segundos
    #Then llevará al formulario con el objeto "Datos Facturación"
    #And llevará al formulario con el objeto "documento"
    #And llevará al formulario con el objeto "número"
    #And llevará al formulario con el objeto "correo electrónico"
    
    
    Scenario: Cambio de tipo de factura usuario de factura electrónica a factura física
    Given Estoy en la página de inicio "Página mi cuenta tigo" en la url "https://tigoselfcareregional-uat-co.tigocloud.net"
    When doy clic en "Ingresar"
    And se quiere visualizar con resolucion "800" x "900"
    And ingreso "automatizacionmicuenta@gmail.com" en el campo "Correo Mi Cuenta"
    And doy clic en "Validar"
    #And doy clic en "siguiente"
    And ingreso "Colombia2019" en el campo "Contrasena"
    #And doy clic en "Siguiente C"
    And doy clic en "continuar mi cuenta"
    And Espero 1 segundos
    And doy clic en "Seleccion MSISDN" si es visible
    And Espero 1 segundos
    And doy clic en "No Linea fija" si es visible
    And doy clic en "Seleccion MSISDN" si es visible
    And Espero 1 segundos
    And doy clic en "Linea Fija" si es visible
    And doy clic en "Facturacion" si es visible
    And doy clic en "Modificar Facturación"
    And doy clic en "Impresa"
    And doy clic en "OK"
    And Espero 4 segundos
    Then llevará al formulario con el objeto "Factura Impresa"