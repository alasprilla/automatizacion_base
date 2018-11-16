#Author: Alexandra Lasprilla Cardona
#Keywords Summary :
@issue:ADP-63 @Pasarela
Feature: Responsive de Pantallas de Pasarela de pagos
  Como Tigoune
  Quiero realizar pruebas automatizadas en la página de Paga tu Factura
  Para garantizar la correcta visualización del diseño de la página

  Scenario Outline: Pasarela - Responsive Pantalla 1 Seccion Móvil
    Given Estoy en la página de inicio de pago de facturas "https://transaccionesco-uat.tigocloud.net/servicios/facturas"
    And se quiere visualizar con resolucion <X> x <Y>

    Examples: 
      | X     | Y       |
      | "320" | "480"   |
      | "600" | "1024"  |
      | "768" | "1024"  |
      | "640" | "960"   |
      | "720" | "1280"  |

  Scenario Outline: Pasarela - Responsive Pantalla 2 Seccion Móvil "Resumen de tu Transacción"
    Given Estoy en la página de inicio de pago de facturas "https://transaccionesco-uat.tigocloud.net/servicios/facturas"
    When doy clic en "Movil"
    And ingreso "3043302450" en el campo "Tu línea Tigo"
    And ingreso "prueba@prueba.com" en el campo "Correo electrónico M"
    And doy clic en el botón "Consultar M clic"
    And se quiere visualizar con resolucion <X> x <Y>
    Then llevará al formulario con el objeto "title-detail"

    Examples: 
      | X     | Y      |
      | "320" | "480"  |
      | "600" | "1024" |
      | "768" | "1024" |
      | "640" | "960"  |
      | "720" | "1280" |

  Scenario Outline: Pasarela - Responsive Pantalla 3 Seccion Móvil "Pago por Tarjeta de Crédito"
    Given Estoy en la página de inicio de pago de facturas "https://transaccionesco-uat.tigocloud.net/servicios/facturas"
    When doy clic en "Movil"
    And ingreso "3043302450" en el campo "Tu línea Tigo"
    And ingreso "prueba@prueba.com" en el campo "Correo electrónico M"
    And doy clic en el botón "Consultar M clic"
    And se quiere visualizar con resolucion <X> x <Y>
    Then llevará al formulario con el objeto "Seleccion medio de pago"
    And Estoy en la página de selección de formas de pago con el tipo "Tarjeta de Crédito" seleccionado

    Examples: 
      | X     | Y      |
      | "320" | "480"  |
      | "600" | "1024" |
      | "768" | "1024" |
      | "640" | "960"  |
      | "720" | "1280" |

  Scenario Outline: Pasarela - Responsive Pantalla 4 Seccion Móvil "Pago por Tarjeta Debito"
    Given Estoy en la página de inicio de pago de facturas "https://transaccionesco-uat.tigocloud.net/servicios/facturas"
    When doy clic en "Movil"
    And ingreso "3043302450" en el campo "Tu línea Tigo"
    And ingreso "prueba@prueba.com" en el campo "Correo electrónico M"
    And doy clic en el botón "Consultar M clic"
    And se quiere visualizar con resolucion <X> x <Y>
    Then llevará al formulario con el objeto "Seleccion medio de pago"
    And Estoy en la página de selección de formas de pago con el tipo "Debito Bancario PSE" seleccionado

    Examples: 
      | X     | Y      |
      | "320" | "480"  |
      | "600" | "1024" |
      | "768" | "1024" |
      | "640" | "960"  |
      | "720" | "1280" |
