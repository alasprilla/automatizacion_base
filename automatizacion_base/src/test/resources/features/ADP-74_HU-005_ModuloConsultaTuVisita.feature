#Author: Alexandra Lasprilla Cardona
#Keywords Summary :
@issue:ADP-74 @MiCuenta
Feature: HU005_Modulo Consulta Tu Visita
  Y0 como usuario de mi cuenta Tigo 
  Quiero ingresar al módulo de consulta tu visita
  Para consultar el estado de las instalaciones y reparaciones.

  Scenario: Mi Cuenta - Ingreso documento válido con agenda
    Given Estoy en la página de inicio de pago de facturas "https://tigoselfcareregional-uat-co.tigocloud.net"
    And doy clic en "Tipo Documento miTigo"
    And doy clic en "Tipo Ul NIT"
    When ingreso "900092385" en el campo "Ingresa tu documento"
    And doy clic en el botón "Consultar"
    Then llevará al formulario con el objeto "Visitas Pendientes"

  Scenario: Mi Cuenta - Ingreso documento válido sin agenda
    Given Estoy en la página de inicio de pago de facturas "https://tigoselfcareregional-uat-co.tigocloud.net"
    When ingreso "43921358" en el campo "Ingresa tu documento"
    And doy clic en el botón "Consultar"
    Then el campo "Mensaje Error Documento" tiene el texto "Los sentimos, en el momento no tienes una visita programada"

  Scenario: Mi Cuenta -  Ingreso documento inválido
    Given Estoy en la página de inicio de pago de facturas "https://tigoselfcareregional-uat-co.tigocloud.net"
    When ingreso "000" en el campo "Ingresa tu documento"
    And doy clic en el botón "Consultar"
    Then el campo "Mensaje Error Documento" tiene el texto "El documento ingresado no es válido. Verifícalo e intenta de nuevo."

  Scenario Outline: Mi Cuenta -  Validación tipo de documento CC
    Given Estoy en la página de inicio de pago de facturas "https://tigoselfcareregional-uat-co.tigocloud.net"
    And doy clic en "Tipo Documento miTigo"
    And doy clic en "Tipo Ul CC"
    When ingreso <valor> en el campo "Ingresa tu documento"
    And el campo "Consultar" tiene el atributo "disabled" en el valor "true"

    Examples: 
      | valor  |
      | "abcd" |
      | "*/*/" |

  Scenario Outline: Mi Cuenta -  Validación tipo de documento NIT
    Given Estoy en la página de inicio de pago de facturas "https://tigoselfcareregional-uat-co.tigocloud.net"
    And doy clic en "Tipo Documento miTigo"
    And doy clic en "Tipo Ul NIT"
    When ingreso <valor> en el campo "Ingresa tu documento"
    And el campo "Consultar" tiene el atributo "disabled" en el valor "true"

    Examples: 
      | valor  |
      | "abcd" |
      | "*/*/" |

  Scenario Outline: Mi Cuenta -  Validación tipo de documento CE
    Given Estoy en la página de inicio de pago de facturas "https://tigoselfcareregional-uat-co.tigocloud.net"
    And doy clic en "Tipo Documento miTigo"
    And doy clic en "Tipo Ul CE"
    When ingreso <valor> en el campo "Ingresa tu documento"
    And el campo "Consultar" tiene el atributo "disabled" en el valor "true"

    Examples: 
      | valor |
      | "%€"  |
      | "*/*" |

  Scenario Outline: Mi Cuenta -  Validación tipo de documento PS
    Given Estoy en la página de inicio de pago de facturas "https://tigoselfcareregional-uat-co.tigocloud.net"
    And doy clic en "Tipo Documento miTigo"
    And doy clic en "Tipo Ul PS"
    When ingreso <valor> en el campo "Ingresa tu documento"
    And el campo "Consultar" tiene el atributo "disabled" en el valor "true"

    Examples: 
      | valor  |
      | "%€"   |
      | "*/*/" |
