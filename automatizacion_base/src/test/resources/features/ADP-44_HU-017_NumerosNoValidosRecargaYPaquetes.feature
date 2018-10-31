#Author: Alexandra Lasprilla Cardona
#Keywords Summary :
@issue:ADP-44, @Paquetes
Feature: HU017 Validación número Invalido Celular en Recargas y Paquetes
  
  Como Tigoune
  Quiero realizar pruebas automatizadas sobre el campo "Número Celular" en el formulario de paquetes y recargas
  Para garantizar que solo permita ingresar número válidos

  Scenario Outline: Paquetes - Ingresa tu línea Tigo es texto
    Given Estoy en la página de inicio de pago de facturas "https://transaccionesco-uat.tigocloud.net/servicios/paquetes?clear=true"
    When doy clic en "Recarga"
    And ingreso <letras> en el campo "Ingresa tu línea Tigo"
    Then el campo "Ingresa tu línea Tigo" tiene el texto ""

    Examples: 
      | letras    |
      | "abcdef"  |
      | "tigoUne" |

  Scenario Outline: Paquetes - Ingresa tu línea Tigo de más de 10 dígitos
    Given Estoy en la página de inicio de pago de facturas "https://transaccionesco-uat.tigocloud.net/servicios/paquetes?clear=true"
    When doy clic en "Recarga"
    And ingreso <msisdn> en el campo "Ingresa tu línea Tigo"
    Then mostrará en el valor del campo "Ingresa tu línea Tigo" el texto <resultado>

    Examples: 
      | msisdn           | resultado        |
      | "31234567890123" | "(312) 345-6789" |
      | "36587589658749" | "(365) 875-8965" |

  Scenario Outline: Paquetes - Ingresa tu línea Tigo de menos de 10 dígitos
    Given Estoy en la página de inicio de pago de facturas "https://transaccionesco-uat.tigocloud.net/servicios/paquetes?clear=true"
    When doy clic en "Recarga"
    And ingreso <msisdn> en el campo "Ingresa tu línea Tigo"
    And ingreso <correo> en el campo "Correo Electronico"
    Then el campo "Recargar" tiene el atributo "class" en el valor "inactive"

    Examples: 
      | msisdn   | correo                |
      | "312345" | "prueba@prueba.com"   |
      | "365897" | "ejemplo@ejemplo.com" |

  Scenario Outline: Paquetes - Ingresa tu línea Tigo no comienza con 3 ni con 5
    Given Estoy en la página de inicio de pago de facturas "https://transaccionesco-uat.tigocloud.net/servicios/paquetes?clear=true"
    When doy clic en "Recarga"
    And ingreso <msisdn> en el campo "Ingresa tu línea Tigo"
    Then el campo "Recargar" tiene el atributo "class" en el valor "inactive"
    And el campo "label error celular recargas" tiene el texto "El número ingresado es incorrecto"
    And el campo "label error celular recargas" tiene el atributo "color" en el valor "rojo"

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
