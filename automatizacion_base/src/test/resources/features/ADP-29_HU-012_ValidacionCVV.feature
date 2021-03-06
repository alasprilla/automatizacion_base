#Author: Alexandra Lasprilla Cardona
#Keywords Summary :
@issue:ADP-29
Feature: HU012_ValidacionCVV
  Como Tigoune
  Quiero pruebas automatizadas de la casuística en el ingreso de números de TC
  Para garantizar que se ingresa un CVV con la longitud y el tipo correctos

  Background: seleccion medio de pago
    Given Estoy en la página de inicio de pago de facturas "https://transaccionesco-uat.tigocloud.net/servicios/facturas"
    When ingreso "3008914224" en el campo "Tu línea Tigo"
    And doy clic en el campo "Correo electrónico" y escribo el email "prueba@prueba.com"
    And doy clic en el botón "Consultar"
    Then llevará al formulario con el objeto "title-detail"

  Scenario Outline: Texto en el campo "CVV"
    Given Estoy en la página de selección de formas de pago con el tipo "Tarjeta de Crédito" seleccionado
    And ingreso "4357223863986989" en el campo "Número de tarjeta"
    When ingreso <letras> en el campo "CVV"
    And el campo "CVV" tiene el texto ""

    Examples: 
      | letras    |
      | "abcdef"  |
      | "tigoUne" |

  Scenario Outline: Ingreso de número "CVV" con Visa, Mastercard y Diners
    Given Estoy en la página de selección de formas de pago con el tipo "Tarjeta de Crédito" seleccionado
    And ingreso <tarjeta> en el campo "Número de tarjeta"
    When ingreso <numero> en el campo "CVV"
    Then mostrará en el valor del campo "CVV" el texto <resultado>

    Examples: 
      | Tipos de Tarjeta | tarjeta            | numero | resultado |
      | "Visa"           | "4357223863986989" | "3214" | "***"     |
      | "Mastercard"     | "5511807769895870" | "6547" | "***"     |
      | "Diners"         | "38454807134064"   | "9375" | "***"     |

  Scenario Outline: Ingreso de número "CVV" con American Express
    Given Estoy en la página de selección de formas de pago con el tipo "Tarjeta de Crédito" seleccionado
    And ingreso <tarjeta> en el campo "Número de tarjeta"
    When ingreso <numero> en el campo "CVV"
    Then mostrará en el valor del campo "CVV" el texto <resultado>

    Examples: 
      | Tipos de Tarjeta  | tarjeta           | numero  | resultado |
      | "AmericanExpress" | "348902405962190" | "32149" | "****"    |
      | "AmericanExpress" | "344195017589436" | "65471" | "****"    |
