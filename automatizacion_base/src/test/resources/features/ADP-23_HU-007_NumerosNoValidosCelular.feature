#Author: Alexandra Lasprilla Cardona
#Keywords Summary :
@issue:ADP-23 @Pasarela
Feature: HU007 Validación número Invalido Celular
  Como Tigoune
  Quiero realizar pruebas automatizadas de la consulta de facturas del servicio móvil
  Para garantizar que no permita ingresar número de móvil no válidos en el formulario de consulta de facturas

  Scenario Outline: Pasarela - Texto en el campo Tu línea Tigo
    Given Estoy en la página de inicio "Pagina pago de facturas" en la url "https://transaccionesco-uat.tigocloud.net/servicios/facturas"
    When doy clic en "Movil"
    And ingreso <letras> en el campo "Tu línea Tigo"
    And el campo "Tu línea Tigo" tiene el texto ""
    And el campo "label error celular" tiene el texto "El número de línea que ingresaste no es de Tigo. Verifícalo e intenta de nuevo"
    And el campo "label error celular" tiene el atributo "color" en el valor "rojo"

    Examples: 
      | letras    |
      | "abcdef"  |
      | "tigoUne" |

  Scenario Outline: Pasarela - Tu línea tigo de más de 10 dígitos
    Given Estoy en la página de inicio "Pagina pago de facturas" en la url "https://transaccionesco-uat.tigocloud.net/servicios/facturas"
    When doy clic en "Movil"
    And ingreso <msisdn> en el campo "Tu línea Tigo"
    And Presiono la tecla "Tab"
    Then mostrará en el valor del campo "Tu línea Tigo" el texto <resultado>

    Examples: 
      | msisdn           | resultado        |
      | "31234567890123" | "(312) 345-6789" |
      | "36587589658749" | "(365) 875-8965" |

  Scenario Outline: Pasarela - Tu línea tigo de menos de 10 dígitos
    Given Estoy en la página de inicio "Pagina pago de facturas" en la url "https://transaccionesco-uat.tigocloud.net/servicios/facturas"
    When doy clic en "Movil"
    And ingreso <msisdn> en el campo "Tu línea Tigo"
    And doy clic en "Titulo facturas moviles"
    Then el campo "label error celular" tiene el texto "El número de línea que ingresaste no es de Tigo. Verifícalo e intenta de nuevo."
    And el campo "label error celular" tiene el atributo "color" en el valor "rojo"
    And el campo "Consultar M" tiene el atributo "disabled" en el valor "true"

    Examples: 
      | msisdn   |
      | "312345" |
      | "365897" |

  Scenario Outline: Pasarela - Tu línea tigo no comienza con 3 ni con 5
    Given Estoy en la página de inicio "Pagina pago de facturas" en la url "https://transaccionesco-uat.tigocloud.net/servicios/facturas"
    When doy clic en "Movil"
    And ingreso <msisdn> en el campo "Tu línea Tigo"
    Then el campo "label error celular" tiene el texto "El número de línea que ingresaste no es de Tigo. Verifícalo e intenta de nuevo."
    And el campo "label error celular" tiene el atributo "color" en el valor "rojo"
    And el campo "Consultar M" tiene el atributo "disabled" en el valor "true"

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
