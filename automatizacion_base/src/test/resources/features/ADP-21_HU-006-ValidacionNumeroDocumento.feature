#Author: Alexandra Lasprilla Cardona
#Keywords Summary : Validacion Documento
@issue:ADP-21
Feature: HU006_ValidacionNumeroDocumento
  Como Tigoune
  Quiero realizar pruebas automatizadas de la consulta de facturas del servicio fijo
  Para garantizar que se pueden utilizar las teclas especiales básicas en el formulario de consulta de facturas

  Scenario: Recarga de página con F5
    Given Estoy en la página de inicio de pago de facturas "https://transaccionesco-uat.tigocloud.net/servicios/facturas"
    When doy clic en "HOGAR"
    And selecciono "CC" en el campo "Tipo de documento"
    And Presiono la tecla "F5"
    Then La página se recarga

  Scenario Outline: Borrar caracteres con backspace en el campo "número de documento"
    Given Estoy en la página de inicio de pago de facturas "https://transaccionesco-uat.tigocloud.net/servicios/facturas"
    When doy clic en "HOGAR"
    And selecciono "CC" en el campo "Tipo de documento"
    And ingreso <documento> en el campo "número de documento"
    And Presiono la tecla "backspace"
    Then El último caracter del campo número de documento se borra

    Examples: 
      | documento   |
      | "123"       |
      | "101254"    |
      | "15859874"  |
      | "123453784" |

  Scenario Outline: Borrar caracteres con suprimir en el campo "número de documento"
    Given Estoy en la página de inicio de pago de facturas "https://transaccionesco-uat.tigocloud.net/servicios/facturas"
    When doy clic en "HOGAR"
    And selecciono "CC" en el campo "Tipo de documento"
    And ingreso <documento> en el campo "número de documento"
    And Presiono la tecla "inicio"
    And Presiono la tecla "suprimir"
    Then Entonces el primer caracter del campo número de documento se borra

    Examples: 
      | documento   |
      | "123"       |
      | "101254"    |
      | "15859874"  |
      | "123453784" |

  Scenario Outline: Desplazarse con flecha a la izquierda en el campo "número de documento"
    Given Estoy en la página de inicio de pago de facturas "https://transaccionesco-uat.tigocloud.net/servicios/facturas"
    When doy clic en "HOGAR"
    And selecciono "CC" en el campo "Tipo de documento"
    And ingreso <documento> en el campo "número de documento"
    And Presiono la tecla "flecha izquierda"
    And Presiono la tecla "suprimir"
    Then El último caracter del campo número de documento se borra

    Examples: 
      | documento   |
      | "123"       |
      | "101254"    |
      | "15859874"  |
      | "123453784" |

  Scenario Outline: Desplazarse con flecha a la derecha en el campo "número de documento"
    Given Estoy en la página de inicio de pago de facturas "https://transaccionesco-uat.tigocloud.net/servicios/facturas"
    When doy clic en "HOGAR"
    And selecciono "CC" en el campo "Tipo de documento"
    And ingreso <documento> en el campo "número de documento"
    And Presiono la tecla "inicio"
    And Presiono la tecla "flecha derecha"
    And Presiono la tecla "backspace"
    Then Entonces el primer caracter del campo número de documento se borra

    Examples: 
      | documento   |
      | "123"       |
      | "101254"    |
      | "15859874"  |
      | "123453784" |
