#Author: Alexandra Lasprilla Cardona
#Keywords Summary :
@issue:ADP-24
Feature: HU008 Validación número Celular
  Como Tigoune
  Quiero realizar pruebas automatizadas de la consulta de facturas del servicio móvil
  Para garantizar que se pueden utilizar las teclas especiales básicas en el formulario de consulta de facturas

  Scenario Outline: Ingreso de número valido que no es Tigo
    Given Estoy en la página de inicio de pago de facturas "https://transaccionesco-uat.tigocloud.net/servicios/facturas"
    When ingreso <msisdn> en el campo "Tu línea Tigo"
    And ingreso <email> en el campo "Correo electrónico"
    And doy clic en el botón "Consultar"
    Then el campo "mensaje sin facturas" tiene el texto "No hemos encontrado facturas pendientes para este número de línea."
    And el campo "mensaje sin facturas" tiene el atributo "background" en el valor "rojo_rgb"
    And el campo "mensaje sin facturas" tiene el atributo "color" en el valor "blanco"

    Examples: 
      | msisdn       | email                   |
      | "3000000000" | "prueba@prueba.com"     |
      | "3110000000" | "ejemplo@ejemplo.com"   |
      | "3150000000" | "casoexitoso@ti.go"     |
      | "3200000000" | "caso_exitoso@tigo.com" |

  Scenario Outline: Ingreso de número válido Tigo sin facturas pendientes
    Given Estoy en la página de inicio de pago de facturas "https://transaccionesco-uat.tigocloud.net/servicios/facturas"
    When ingreso <msisdn> en el campo "Tu línea Tigo"
    And ingreso <email> en el campo "Correo electrónico"
    And doy clic en el botón "Consultar"
    Then el campo "mensaje sin facturas" tiene el texto "No hemos encontrado facturas pendientes para este número de línea."
    And el campo "mensaje sin facturas" tiene el atributo "background" en el valor "azul"
    And el campo "mensaje sin facturas" tiene el atributo "color" en el valor "blanco"

    Examples: 
      | msisdn       | email                 |
      | "3006759101" | "prueba@prueba.com"   |
      | "3014769996" | "ejemplo@pruebas.com" |

  @CasoFeliz
  Scenario Outline: Ingreso de número válido Tigo con facturas pendientes
    Given Estoy en la página de inicio de pago de facturas "https://transaccionesco-uat.tigocloud.net/servicios/facturas"
    When ingreso <msisdn> en el campo "Tu línea Tigo"
    And ingreso <email> en el campo "Correo electrónico"
    And doy clic en el botón "Consultar"
    Then llevará al formulario con el objeto "title-detail"

    Examples: 
      | msisdn       | email               |
      | "3043302450" | "prueba@prueba.com" |

  Scenario: Visualización de datos de línea Tigo con facturas pendientes
    Given Estoy en la página de inicio de pago de facturas "https://transaccionesco-uat.tigocloud.net/servicios/facturas"
    When ingreso "3043302450" en el campo "Tu línea Tigo"
    And ingreso "prueba@prueba.com" en el campo "Correo electrónico"
    And doy clic en el botón "Consultar"
    Then llevará al formulario con el objeto "title-detail"
    And el campo "title-detail" tiene el texto "RESUMEN DE TU TRANSACCIÓN"
    And el campo "Numero del Producto" tiene el texto "Tu línea Tigo: (304) 330-2450"
    And el campo "Fecha límite de pago" no está vacío
    And el campo "Referente de pago" no está vacío
    And el campo "Periodo de facturación" no está vacío
    And el campo "Valor a pagar" no está vacío
