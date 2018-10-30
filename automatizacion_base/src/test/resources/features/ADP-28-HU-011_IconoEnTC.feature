#Author: Alexandra Lasprilla Cardona
#Keywords Summary :
@issue:ADP-28
Feature: HU011_IconoEnTC
		Como Tigoune
		Quiero pruebas automatizadas de la casuística en el ingreso de números de TC
		Para garantizar que se muestra el ícono de la franquicia correcto de acuerdo con la tarjeta de crédito ingresada

  Background: seleccion medio de pago
    Given Estoy en la página de inicio de pago de facturas "https://transaccionesco-uat.tigocloud.net/servicios/facturas"
    When ingreso "3043878232" en el campo "Tu línea Tigo"
    And ingreso "prueba@prueba.com" en el campo "Correo electrónico M"
    And doy clic en el botón "Consultar M"
    Then llevará al formulario con el objeto "title-detail"

  Scenario Outline: Ingreso de número de tarjeta de crédito Visa correcto
    Given Estoy en la página de selección de formas de pago con el tipo "Tarjeta de Crédito" seleccionado
    And ingreso <Visa> en el campo "Número de tarjeta"
    And el campo "Icono Tarjeta" tiene el atributo "class" en el valor "visa"

    Examples: 
      | Visa                |
      | "4357223863986989"  |
      | "4177250463817130"  |

  Scenario Outline: Ingreso de número de tarjeta de crédito Mastercard correcto
    Given Estoy en la página de selección de formas de pago con el tipo "Tarjeta de Crédito" seleccionado
    And ingreso <mastercard> en el campo "Número de tarjeta"
    And el campo "Icono Tarjeta" tiene el atributo "class" en el valor "mastercard"

    Examples:
    |mastercard        |
    |"5511807769895870"|
    |"5121640864080995"|
    
  Scenario Outline: Ingreso de número de tarjeta de crédito American Express correcto
    Given Estoy en la página de selección de formas de pago con el tipo "Tarjeta de Crédito" seleccionado
    And ingreso <american> en el campo "Número de tarjeta"
    And el campo "Icono Tarjeta" tiene el atributo "class" en el valor "amex"

    Examples:
    |american          |
    |"378100434090066" |
    |"342321726862151" |
    
  Scenario Outline: Ingreso de número de tarjeta de crédito Diners Club correcto
    Given Estoy en la página de selección de formas de pago con el tipo "Tarjeta de Crédito" seleccionado
    And ingreso <diners> en el campo "Número de tarjeta"
    And el campo "Icono Tarjeta" tiene el atributo "class" en el valor "diners"

    Examples:
    |diners            |
    |"30128196222957"  |
    |"30331708089860"  |

  
