#Author: Alexandra Lasprilla Cardona
#Keywords Summary : campos, tarjeta, credito, validacion
#Encoding: utf-8
#Language: es
@issue:ADP-15 @Pasarela
Feature: HU004 Llenado formulario TC
  Como Tigoune
  Quiero pruebas automatizadas de la casuística en el llenado de formulario de TC
  Para acelerar el proceso de desarrollo y garantizar integridad

  Background: seleccion medio de pago
    Given Estoy en la página de inicio "Pagina pago de facturas" en la url "https://transaccionesco-uat.tigocloud.net/servicios/facturas"
    When doy clic en "Movil"
    And ingreso "movil_msisdn con facturas" en el campo "Tu línea Tigo"
    And ingreso "prueba@prueba.com" en el campo "Correo electrónico M"
    And doy clic en "Consultar M clic"
    Then llevará al formulario con el objeto "title-detail"

  Scenario: Validación del campo "Fecha vencimiento" con mes "MM"
    Given Estoy en la página de selección de formas de pago con el tipo "Tarjeta de Crédito" seleccionado
    And ingreso "4357223863986989" en el campo "Número de tarjeta"
    And ingreso "932" en el campo "CVV"
    And selecciono "MM" en el campo "MM"
    And selecciono "nextYYYY()" en el campo "AA"
    And ingreso "nombre" en el campo "Nombre"
    And selecciono "CC" en el campo "tipo cc"
    And ingreso "12345" en el campo "número de documento TC"
    And ingreso "3000000000" en el campo "celular comprador"
    And doy clic en "Autorizo esta tarjeta para futuros pagos"
    And Espero 1 segundos
    Then el campo "Pagar" tiene el atributo "disabled" en el valor "true"
    And doy clic en "Cancelar TC"

  Scenario: Validación del campo "Fecha vencimiento" con año "AA"
    Given Estoy en la página de selección de formas de pago con el tipo "Tarjeta de Crédito" seleccionado
    And ingreso "4357223863986989" en el campo "Número de tarjeta"
    And ingreso "932" en el campo "CVV"
    And selecciono "nextMM()" en el campo "MM"
    And selecciono "AA" en el campo "AA"
    And ingreso "nombre" en el campo "Nombre"
    And selecciono "CC" en el campo "tipo cc"
    And ingreso "12345" en el campo "número de documento TC"
    And ingreso "3000000000" en el campo "celular comprador"
    And doy clic en "Autorizo esta tarjeta para futuros pagos"
    And Espero 1 segundos
    Then el campo "Pagar" tiene el atributo "disabled" en el valor "true"
    And doy clic en "Cancelar TC"

  Scenario: Validación del campo "Fecha vencimiento" con fecha inferior al día actual
    Given Estoy en la página de selección de formas de pago con el tipo "Tarjeta de Crédito" seleccionado
    And ingreso "4357223863986989" en el campo "Número de tarjeta"
    And ingreso "932" en el campo "CVV"
    And selecciono "01" en el campo "MM"
    And selecciono "thisYYYY()" en el campo "AA"
    And ingreso "nombre" en el campo "Nombre"
    And selecciono "CC" en el campo "tipo cc"
    And ingreso "12345" en el campo "número de documento TC"
    And doy clic en "Autorizo esta tarjeta para futuros pagos"
    And Espero 1 segundos
    Then el campo "Pagar" tiene el atributo "disabled" en el valor "true"
    And doy clic en "Cancelar TC"

  Scenario Outline: Validación del campo "Fecha vencimiento" correcto
    Given Estoy en la página de selección de formas de pago con el tipo "Tarjeta de Crédito" seleccionado
    And ingreso "4357223863986989" en el campo "Número de tarjeta"
    And ingreso "932" en el campo "CVV"
    And selecciono <mes> en el campo "MM"
    And selecciono <ano> en el campo "AA"
    And ingreso "approved" en el campo "Nombre"
    And selecciono "CC" en el campo "tipo cc"
    And ingreso "12345648" en el campo "número de documento TC"
    And ingreso "3000000000" en el campo "celular comprador"
    And doy clic en "Autorizo esta tarjeta para futuros pagos"
    And Espero 2 segundos
    Then el campo "Pagar" tiene el atributo "class" en el valor "button--secondary"
    And doy clic en "Cancelar TC"

    Examples: 
      | mes        | ano          |
      | "thisMM()" | "thisYYYY()" |
      | "nextMM()" | "thisYYYY()" |
      | "thisMM()" | "nextYYYY()" |
