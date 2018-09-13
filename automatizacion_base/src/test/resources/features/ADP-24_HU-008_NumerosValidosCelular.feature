#Author: Alexandra Lasprilla Cardona
#Keywords Summary :
@issue:ADP-24
Feature: HU008 Validación número Celular
  Como Tigoune
  Quiero realizar pruebas automatizadas de la consulta de facturas del servicio móvil
  Para garantizar que se pueden utilizar las teclas especiales básicas en el formulario de consulta de facturas

  Scenario: Ingreso de número valido que no es Tigo
    Given Estoy en la página de inicio de pago de facturas "https://transaccionesco-uat.tigocloud.net/servicios/facturas"
    When ingreso el número celular "3000000000" en el campo "Tu línea Tigo"
    And ingreso el correo "prueba@prueba.com" en el campo "Correo electrónico"
    Then mostrará el siguiente "mensaje sin facturas" en letras blancas con fondo rojo "No hemos encontrado facturas para este número de línea."

  Scenario: Ingreso de número válido Tigo sin facturas pendientes
    Given Estoy en la página de inicio de pago de facturas "https://transaccionesco-uat.tigocloud.net/servicios/facturas"
    When ingreso el número celular "3003255454" en el campo "Tu línea Tigo"
    And ingreso el correo "prueba@prueba.com" en el campo "Correo electrónico"
    Then mostrará el siguiente "mensaje sin facturas" en letras blancas con fondo azul "No hemos encontrado facturas para este número de línea."

  Scenario: Ingreso de número válido Tigo con facturas pendientes
    Given Estoy en la página de inicio de pago de facturas "https://transaccionesco-uat.tigocloud.net/servicios/facturas"
    When ingreso el número celular "3043302450" en el campo "Tu línea Tigo"
    And ingreso el correo "prueba@prueba.com" en el campo "Correo electrónico"
    Then llevará al formulario donde se selecciona el tipo de pago
