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
    Then el texto que se intenta ingresar no se mostrará
    And mostrará el mensaje en color rojo "El número de línea solo debe tener números"

    Examples: 
      | letras |
      | "abc"  |
      | "gty"  |

  Scenario Outline: Ingreso de números de más de 10 dígitos
    Given Estoy en la página de inicio de pago de facturas "https://transaccionesco-uat.tigocloud.net/servicios/facturas"
    When Cuando doy clic en el campo "Tu línea Tigo" y escribo el número celular <msisdn>
    Then mostrará en el campo "Tu línea Tigo" el texto <resultado>

    Examples: 
      | msisdn         | resultado        |
      | 31234567890123 | "3123456789" |
      | 36587589658749 | "3658758965" |

  Scenario Outline: Ingreso de números de menos de 10 dígitos
    Given Estoy en la página de inicio de pago de facturas "https://transaccionesco-uat.tigocloud.net/servicios/facturas"
    When Cuando doy clic en el campo "Tu línea Tigo" y escribo el número celular <msisdn>
    Then El botón "Consultar" se deshabilita y mostrará el siguiente "mensaje de error msisdn" en color rojo "El número de línea que ingresaste no es válido."

    Examples: 
      | msisdn |
      | 312345 |
      | 365897 |

  Scenario Outline: Ingreso de números que no comiencen con 3 ni con 5
    Given Estoy en la página de inicio de pago de facturas "https://transaccionesco-uat.tigocloud.net/servicios/facturas"
    When Cuando doy clic en el campo "Tu línea Tigo" y escribo el número celular <msisdn>
    Then El botón "Consultar" se deshabilita y mostrará el siguiente "mensaje de error msisdn" en color rojo "El número de línea que ingresaste no es de Tigo. Verifícalo e intenta de nuevo."

    Examples: 
      | msisdn |
      |      0 |
      |      1 |
      |      2 |
      |      4 |
      |      6 |
      |      7 |
      |      8 |
      |      9 |
