#Author: Metis
#Keywords Summary : tarjeta, crédito
#Encoding: utf-8
#Language: es
@issue:ADP-3 @Pasarela
Feature: HU001 Validación TC
  Como Tigoune
  Quiero pruebas automatizadas de la casuística en el ingreso de números de TC
  Para garantizar que se pueden utilizar las teclas especiales básicas en el campo "Número de tarjeta"

  Background: seleccion medio de pago
    Given Estoy en la página de inicio "Pagina pago de facturas" en la url "https://transaccionesco-uat.tigocloud.net/servicios/facturas"
    When doy clic en "Movil"
    And ingreso "movil_msisdn con facturas" en el campo "Tu línea Tigo"
    And ingreso "prueba@prueba.com" en el campo "Correo electrónico M"
    And doy clic en "Consultar M clic"
    Then llevará al formulario con el objeto "title-detail"

  Scenario Outline: Pasarela - Borrar con backspace en el campo "Número de tarjeta"
    Given Estoy en la página de selección de formas de pago con el tipo "Tarjeta de Crédito" seleccionado
    When ingreso <tc> en el campo "Número de tarjeta"
    And Presiono la tecla "backspace"
    Then mostrará en el valor del campo "Número de tarjeta" el texto <resultado>

    #Then El último caracter se borra
    Examples: 
      | tc               | resultado          |
      | "548528654531"   | "5485 2865 453"    |
      | "54852865453140" | "5485 2865 4531 4" |

  Scenario Outline: Pasarela - Borrar con suprimir en el campo "Número de tarjeta"
    Given Estoy en la página de selección de formas de pago con el tipo "Tarjeta de Crédito" seleccionado
    When ingreso <tc> en el campo "Número de tarjeta"
    And Presiono la tecla "inicio"
    And Presiono la tecla "suprimir"
    Then mostrará en el valor del campo "Número de tarjeta" el texto <resultado>

    Examples: 
      | tc               | resultado          |
      | "44852865"       | "4852 865"         |
      | "44852865453140" | "4852 8654 5314 0" |

  Scenario Outline: Pasarela - Desplazarse a la izquierda en el campo "Número de tarjeta"
    Given Estoy en la página de selección de formas de pago con el tipo "Tarjeta de Crédito" seleccionado
    When ingreso <tc> en el campo "Número de tarjeta"
    And Presiono la tecla "flecha izquierda"
    And Presiono la tecla "suprimir"
    Then mostrará en el valor del campo "Número de tarjeta" el texto <resultado>

    Examples: 
      | tc             | resultado       |
      | "34852"        | "3485"          |
      | "348528654531" | "3485 286545 3" |

  Scenario Outline: Pasarela - Desplazarse a la derecha en el campo "Número de tarjeta"
    Given Estoy en la página de selección de formas de pago con el tipo "Tarjeta de Crédito" seleccionado
    When ingreso <tc> en el campo "Número de tarjeta"
    And Presiono la tecla "inicio"
    And Presiono la tecla "flecha derecha"
    And Presiono la tecla "backspace"
    Then mostrará en el valor del campo "Número de tarjeta" el texto <resultado>

    Examples: 
      | tc               | resultado          |
      | "34110"          | "4110"             |
      | "34113030036922" | "4113 0300 3692 2" |
