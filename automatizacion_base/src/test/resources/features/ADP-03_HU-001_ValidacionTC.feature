#Author: Metis
#Keywords Summary : tarjeta, crédito
#Encoding: utf-8
#Language: es

@issue:ADP-3
Feature: HU001_ValidacionTC
  Como Tigoune
  Quiero pruebas automatizadas de la casuística en el ingreso de números de TC
  Para garantizar que se pueden utilizar las teclas especiales básicas en el campo "Número de tarjeta"

  Background: seleccion medio de pago
    Given Estoy en la página de inicio de pago de facturas "https://transaccionesco-uat.tigocloud.net/servicios/facturas"
    When ingreso "3043302450" en el campo "Tu línea Tigo"
    And doy clic en el campo "Correo electrónico" y escribo el email "prueba@prueba.com"
    And doy clic en el botón "Consultar"
    Then llevará al formulario con el objeto "title-detail"

  Scenario Outline: Borrar caracteres con backspace en el campo "Número de tarjeta"
    Given Estoy en la página de selección de formas de pago con el tipo "Tarjeta de Crédito" seleccionado
    When ingreso <tc> en el campo "Número de tarjeta"
    And Presiono la tecla "backspace"
    Then El último caracter se borra

    Examples: 
      | tc               |
      | "548528654531"   |
      | "54852865453140" |

  Scenario Outline: Borrar caracteres con suprimir en el campo "Número de tarjeta"
    Given Estoy en la página de selección de formas de pago con el tipo "Tarjeta de Crédito" seleccionado
    When ingreso <tc> en el campo "Número de tarjeta"
    And Presiono la tecla "inicio"
    And Presiono la tecla "suprimir"
    Then Entonces el primer caracter se borra

    Examples: 
      | tc               |
      | "44852865"       |
      | "44852865453140" |

  Scenario Outline: Desplazarse con flecha a la izquierda en el campo "Número de tarjeta"
    Given Estoy en la página de selección de formas de pago con el tipo "Tarjeta de Crédito" seleccionado
    When ingreso <tc> en el campo "Número de tarjeta"
    And Presiono la tecla "flecha izquierda"
    And Presiono la tecla "suprimir"
    Then El último caracter se borra

    Examples: 
      | tc               |
      | "34852"          |
      | "348528654531"   |

  Scenario Outline: Desplazarse con flecha a la derecha en el campo "Número de tarjeta"
    Given Estoy en la página de selección de formas de pago con el tipo "Tarjeta de Crédito" seleccionado
    When ingreso <tc> en el campo "Número de tarjeta"
    And Presiono la tecla "inicio"
    And Presiono la tecla "flecha derecha"
    And Presiono la tecla "backspace"
    Then Entonces el primer caracter se borra

    Examples: 
      | tc               |
      | "34110"          |
      | "34113030036922" |
