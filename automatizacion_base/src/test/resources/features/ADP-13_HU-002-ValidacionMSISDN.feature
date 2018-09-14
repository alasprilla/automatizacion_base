#Author: Rigoberto Henao
#Keywords Summary : MSISDN
@issue:ADP-13
Feature: HU002_ValidacionMSISDN
  Como Tigoune
  Quiero realizar pruebas automatizadas de la consulta de facturas del servicio móvil
  Para garantizar que se pueden utilizar las teclas especiales básicas en el formulario de consulta de facturas

  #Parametros: "F5"
  Scenario: Recarga de página con F5
    Given Estoy en la página de inicio de pago de facturas "https://transaccionesco-uat.tigocloud.net/servicios/facturas"
    When doy clic en "Tu línea Tigo"
    And Presiono la tecla "F5"
    Then La página se recarga

  #Parametros: "300", "301200", "30159874", "301623784"
  Scenario Outline: Borrar caracteres con backspace en el campo "Tu línea Tigo"
    Given Estoy en la página de inicio de pago de facturas "https://transaccionesco-uat.tigocloud.net/servicios/facturas"
    When ingreso <msisdn> en el campo "Tu línea Tigo"
    And Presiono la tecla "backspace"
    Then El último caracter se borra

    Examples: 
      | msisdn      |
      | "300"       |
      | "301200"    |
      | "30159874"  |
      | "301623784" |

  #Parametros: "300", "301200", "30159874", "301623784"
  Scenario Outline: Borrar caracteres con suprimir en el campo "Tu línea Tigo"
    Given Estoy en la página de inicio de pago de facturas "https://transaccionesco-uat.tigocloud.net/servicios/facturas"
    When ingreso <msisdn> en el campo "Tu línea Tigo"
    And Presiono la tecla "inicio"
    And Presiono la tecla "suprimir"
    Then Entonces el primer caracter se borra

    Examples: 
      | msisdn      |
      | "300"       |
      | "301200"    |
      | "30159874"  |
      | "301623784" |

  #Parametros: "300", "301200", "30159874", "301623784"
  Scenario Outline: Desplazarse con flecha a la izquierda en el campo "Tu línea Tigo"
    Given Estoy en la página de inicio de pago de facturas "https://transaccionesco-uat.tigocloud.net/servicios/facturas"
    When ingreso <msisdn> en el campo "Tu línea Tigo"
    And Presiono la tecla "flecha izquierda"
    And Presiono la tecla "suprimir"
    Then El último caracter se borra

    Examples: 
      | msisdn      |
      | "300"       |
      | "301200"    |
      | "30159874"  |
      | "301623784" |

  #Parametros: "300", "301200", "30159874", "301623784"
  Scenario Outline: Desplazarse con flecha a la derecha en el campo "Tu línea Tigo"
    Given Estoy en la página de inicio de pago de facturas "https://transaccionesco-uat.tigocloud.net/servicios/facturas"
    When ingreso <msisdn> en el campo "Tu línea Tigo"
    And Presiono la tecla "inicio"
    And Presiono la tecla "flecha derecha"
    And Presiono la tecla "backspace"
    Then Entonces el primer caracter se borra

    Examples: 
      | msisdn      |
      | "300"       |
      | "301200"    |
      | "30159874"  |
      | "301623784" |
