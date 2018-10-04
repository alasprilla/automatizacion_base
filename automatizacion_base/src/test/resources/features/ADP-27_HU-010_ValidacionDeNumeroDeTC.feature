#Author: Henry Andres Correa Correa
@issue:ADP-27
Feature: HU010 Validación de número de TC
  Como Tigoune
  Quiero pruebas automatizadas de la casuística en el ingreso de números de TC
  Para garantizar que se ingrese una tarjeta de crédito válida

  Background: seleccion medio de pago
    Given Estoy en la página de inicio de pago de facturas "https://transaccionesco-uat.tigocloud.net/servicios/facturas"
    When ingreso "3008914224" en el campo "Tu línea Tigo"
    And doy clic en el campo "Correo electrónico" y escribo el email "prueba@prueba.com"
    And doy clic en el botón "Consultar"
    Then llevará al formulario con el objeto "title-detail"

  Scenario: Texto en el campo "Número de tarjeta"
    Given Estoy en la página de selección de formas de pago con el tipo "Tarjeta de Crédito" seleccionado
    When ingreso "No númerico" en el campo "Número de tarjeta"
    Then el campo "Msg Error TC" tiene el texto "El número de tarjeta solo debe tener números"
    And el campo "Msg Error TC" tiene el atributo "color" en el valor "rojo"

  Scenario: El campo "Número de tarjeta" de menos de 14 dígitos
    Given Estoy en la página de selección de formas de pago con el tipo "Tarjeta de Crédito" seleccionado
    When ingreso "1234567890123" en el campo "Número de tarjeta"
    And doy clic forzado en "CVV"
    Then el campo "Msg Error TC" tiene el texto "Debe ingresar una tarjeta de crédito valida."
    And el campo "Msg Error TC" tiene el atributo "color" en el valor "rojo"

  Scenario: Ingreso de número de más de 19 dígitos
    Given Estoy en la página de selección de formas de pago con el tipo "Tarjeta de Crédito" seleccionado
    When ingreso "123456789012345678901234" en el campo "Número de tarjeta"
    Then mostrará en el valor del campo "Número de tarjeta" el texto "1234567890123456789"
