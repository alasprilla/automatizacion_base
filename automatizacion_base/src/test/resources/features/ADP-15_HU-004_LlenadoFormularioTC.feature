#Author: Alexandra Lasprilla Cardona
#Keywords Summary : campos, tarjeta, credito, validacion
#Encoding: utf-8
#Language: es

@issue:ADP-15
Feature: HU004_Llenado_Formulario_TC
  Como Tigoune
  Quiero pruebas automatizadas de la casuística en el llenado de formulario de TC
  Para acelerar el proceso de desarrollo y garantizar integridad

  Background: seleccion medio de pago
    Given Estoy en la página de inicio de pago de facturas "https://transaccionesco-uat.tigocloud.net/servicios/facturas"
    When ingreso "3043878232" en el campo "Tu línea Tigo"
    And doy clic en el campo "Correo electrónicoM" y escribo el email "prueba@prueba.com"
    And doy clic en el botón "ConsultarM"
    Then llevará al formulario con el objeto "title-detail"

  Scenario: Validación del campo "Fecha vencimiento" con mes "MM"
    Given Estoy en la página de selección de formas de pago con el tipo "Tarjeta de Crédito" seleccionado
    And ingreso "4357223863986989" en el campo "Número de tarjeta"
    And ingreso "932" en el campo "CVV"
    And selecciono "MM" en el campo "MM"
    And selecciono "2018" en el campo "AA"
    And ingreso "nombre" en el campo "Nombre"
    And selecciono "CC" en el campo "tipo"
    And ingreso "12345" en el campo "número de documento TC"
    And doy clic en el botón "Autorizo esta tarjeta para futuros pagos"
    Then el botón "Pagar" esta "deshabilitado"
    And doy clic en el botón "Cancelar TC"

  Scenario: Validación del campo "Fecha vencimiento" con año "AA"
    Given Estoy en la página de selección de formas de pago con el tipo "Tarjeta de Crédito" seleccionado
    And ingreso "4357223863986989" en el campo "Número de tarjeta"
    And ingreso "932" en el campo "CVV"
    And selecciono "01" en el campo "MM"
    And selecciono "AA" en el campo "AA"
    And ingreso "nombre" en el campo "Nombre"
    And selecciono "CC" en el campo "tipo"
    And ingreso "12345" en el campo "número de documento TC"
    And doy clic en el botón "Autorizo esta tarjeta para futuros pagos"
    Then el botón "Pagar" esta "deshabilitado"
    And doy clic en el botón "Cancelar TC"

  Scenario: Validación del campo "Fecha vencimiento" con fecha inferior al día actual
    Given Estoy en la página de selección de formas de pago con el tipo "Tarjeta de Crédito" seleccionado
    And ingreso "4357223863986989" en el campo "Número de tarjeta"
    And ingreso "932" en el campo "CVV"
    And selecciono "01" en el campo "MM"
    And selecciono "2018" en el campo "AA"
    And ingreso "nombre" en el campo "Nombre"
    And selecciono "CC" en el campo "tipo"
    And ingreso "12345" en el campo "número de documento TC"
    And doy clic en el botón "Autorizo esta tarjeta para futuros pagos"
    Then el botón "Pagar" esta "deshabilitado"
    And doy clic en el botón "Cancelar TC"

  Scenario Outline: Validación del campo "Fecha vencimiento" correcto
    Given Estoy en la página de selección de formas de pago con el tipo "Tarjeta de Crédito" seleccionado
    And ingreso "4357223863986989" en el campo "Número de tarjeta"
    And ingreso "932" en el campo "CVV"
    And selecciono <mes> en el campo "MM"
    And selecciono <ano> en el campo "AA"
    And ingreso "approved" en el campo "Nombre"
    And selecciono "CC" en el campo "tipo"
    And ingreso "12345648" en el campo "número de documento TC"
    And doy clic en el botón "Autorizo esta tarjeta para futuros pagos"
    Then el campo "Pagar" tiene el atributo "class" en el valor "button--secondary"
    And doy clic en el botón "Cancelar TC"

    Examples: 
      | mes  | ano    |
      | "01" | "2019" |
      | "11" | "2018" |
