#Author: Alexandra Lasprilla Cardona
#Keywords Summary : 

@issue:ADP-74, @MiCuenta
Feature: HU005_Modulo Consulta Tu Visita
		Y0 como usuario de mi cuenta Tigo 
		Quiero ingresar al módulo de consulta tu visita
		Para consultar el estado de las instalaciones y reparaciones.

  #Scenario: Mi Cuenta - Ingreso documento válido con agenda
    #Given Estoy en la página de inicio de pago de facturas "https://tigoselfcareregional-uat-co.tigocloud.net"
    #When ingreso "42767842" en el campo "Ingresa tu documento"
    
  Scenario: Mi Cuenta - Ingreso documento válido sin agenda
    Given Estoy en la página de inicio de pago de facturas "https://tigoselfcareregional-uat-co.tigocloud.net"
    When ingreso "43921358" en el campo "Ingresa tu documento"
    And doy clic en el botón "Consultar"
    Then el campo "label error documento" tiene el texto "Los sentimos, en el momento no tienes una visita programada"
    
  Scenario: Mi Cuenta -  Ingreso documento inválido
    Given Estoy en la página de inicio de pago de facturas "https://tigoselfcareregional-uat-co.tigocloud.net"
    When ingreso "000" en el campo "Ingresa tu documento"
    And doy clic en el botón "Consultar"
    Then el campo "label error documento" tiene el texto "El documento ingresado no es válido. Verifícalo e intenta de nuevo."
    
  Scenario Outline: Mi Cuenta -  Validación tipo de documento CC
    Given Estoy en la página de inicio de pago de facturas "https://tigoselfcareregional-uat-co.tigocloud.net"
    And selecciono "CC" en el campo "Tipo"
    When ingreso <valor> en el campo "Ingresa tu documento"
    And doy clic en el botón "Consultar"
    Then el campo "label error documento" tiene el texto "El documento ingresado no es válido. Verifícalo e intenta de nuevo."
    
    Examples: 
      | valor   |
      | "abcd"  | 
      | "*/*/"  | 
    

    
    

 