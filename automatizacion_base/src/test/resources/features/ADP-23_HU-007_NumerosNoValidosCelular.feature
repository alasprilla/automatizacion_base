#Author: Alexandra Lasprilla Cardona
#Keywords Summary :
@issue:ADP-23
Feature: HU007 Validación número Invalido Celular
  Como Tigoune
  Quiero realizar pruebas automatizadas de la consulta de facturas del servicio móvil
  Para garantizar que no permita ingresar número de móvil no válidos en el formulario de consulta de facturas

  Scenario Outline: Ingreso de texto en el campo Tu línea Tigo
    Given Estoy en la página de inicio de pago de facturas "https://transaccionesco-uat.tigocloud.net/servicios/facturas"
    When ingreso <letras> en el campo "Tu línea Tigo"
    And el campo "Tu línea Tigo" tiene el texto ""
    And el campo "label error celular" tiene el texto "El número de línea solo debe tener números"
    And el campo "label error celular" tiene el atributo "color" en el valor "rojo"

    Examples: 
      | letras    |
      | "abcdef"  |
      | "tigoUne" |

  Scenario Outline: Ingreso de números de más de 10 dígitos
    Given Estoy en la página de inicio de pago de facturas "https://transaccionesco-uat.tigocloud.net/servicios/facturas"
    When ingreso <msisdn> en el campo "Tu línea Tigo"
    Then mostrará en el valor del campo "Tu línea Tigo" el texto <resultado>

    Examples: 
      | msisdn           | resultado    |
      | "31234567890123" | "3123456789" |
      | "36587589658749" | "3658758965" |

  Scenario Outline: Ingreso de números de menos de 10 dígitos
    Given Estoy en la página de inicio de pago de facturas "https://transaccionesco-uat.tigocloud.net/servicios/facturas"
    When ingreso <msisdn> en el campo "Tu línea Tigo"
    Then el botón "Consultar" esta "deshabilitado"
    And el campo "label error celular" tiene el texto "El número de línea que ingresaste no es válido"
    And el campo "label error celular" tiene el atributo "color" en el valor "rojo"

    Examples: 
      | msisdn   |
      | "312345" |
      | "365897" |

  Scenario Outline: Ingreso de números que no comiencen con 3 ni con 5
    Given Estoy en la página de inicio de pago de facturas "https://transaccionesco-uat.tigocloud.net/servicios/facturas"
    When ingreso <msisdn> en el campo "Tu línea Tigo"
    Then el botón "Consultar" esta "deshabilitado"
    And el campo "label error celular" tiene el texto "El número de línea que ingresaste no es de Tigo. Verifícalo e intenta de nuevo."
    And el campo "label error celular" tiene el atributo "color" en el valor "rojo"

    Examples: 
      | msisdn       |
      | "0000000000" |
      | "1000000000" |
      | "2000000000" |
      | "4000000000" |
      | "6000000000" |
      | "7000000000" |
      | "8000000000" |
      | "9000000000" |
