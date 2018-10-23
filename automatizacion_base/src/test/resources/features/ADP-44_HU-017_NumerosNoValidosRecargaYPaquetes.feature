#Author: Alexandra Lasprilla Cardona
#Keywords Summary :
@issue:ADP-44
Feature: HU017 Validación número Invalido Celular en Recargas y Paquetes
  
  Como Tigoune
  Quiero realizar pruebas automatizadas sobre el campo "Número Celular" en el formulario de paquetes y recargas
  Para garantizar que solo permita ingresar número válidos

  Scenario Outline: Ingreso de texto en el campo "Ingresa tu línea Tigo"
    Given Estoy en la página de inicio de compra paquetes y recargas "https://transaccionesco-uat.tigocloud.net/servicios/paquetes?clear=true"
    When Doy clic en "Recarga"
    And Ingreso <letras> en el campo "Ingresa tu línea Tigo"
    Then El campo "Ingresa tu línea Tigo" tiene el texto ""

    Examples: 
      | letras    |
      | "abcdef"  |
      | "tigoUne" |

  Scenario Outline: Ingreso de números de más de 10 dígitos
    Given Estoy en la página de inicio de compra paquetes y recargas "https://transaccionesco-uat.tigocloud.net/servicios/paquetes?clear=true"
    When Doy clic en "Recarga"
    And Ingreso <msisdn> en el campo "Ingresa tu línea Tigo"
    Then Mostrará en el valor del campo "Ingresa tu línea Tigo" el texto <resultado>

    Examples: 
      | msisdn           | resultado        |
      | "31234567890123" | "(312) 345-6789" |
      | "36587589658749" | "(365) 875-8965" |

  Scenario Outline: Ingreso de números de menos de 10 dígitos
    Given Estoy en la página de inicio de pago de facturas "https://transaccionesco-uat.tigocloud.net/servicios/paquetes?clear=true"
    When Doy clic en "Recarga"
    And Ingreso <msisdn> en el campo "Ingresa tu línea Tigo"
    And Ingreso <correo> en el campo "Correo Electronico"
    Then El botón "Recargar" esta "deshabilitado"

    Examples: 
      | msisdn   | correo                |
      | "312345" | "prueba@prueba.com"   |
      | "365897" | "ejemplo@ejemplo.com" |

  Scenario Outline: Ingreso de números que no comiencen con 3 ni con 5
    Given Estoy en la página de inicio de pago de facturas "https://transaccionesco-uat.tigocloud.net/servicios/paquetes?clear=true"
    When Doy clic en "Recarga"
    When Ingreso <msisdn> en el campo "Ingresa tu línea Tigo"
    Then El botón "Recargar" esta "deshabilitado"
    And El campo "label error celular" tiene el texto "El número ingresado es incorrecto"
    And El campo "label error celular" tiene el atributo "color" en el valor "rojo"

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