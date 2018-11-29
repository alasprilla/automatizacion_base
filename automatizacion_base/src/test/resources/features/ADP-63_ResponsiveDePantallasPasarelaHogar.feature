#Author: Alexandra Lasprilla Cardona
#Keywords Summary :
@issue:ADP-63 @Pasarela
Feature: Responsive de Pantallas de Pasarela de pagos
  Como Tigoune
  Quiero realizar pruebas automatizadas en la página de Paga tu Factura
  Para garantizar la correcta visualización del diseño de la página

  Scenario Outline: Pasarela - Responsive Seccion Hogar (Tarjeta Crédito)
    Given Estoy en la página de inicio "Pagina pago de facturas" en la url "https://transaccionesco-uat.tigocloud.net/servicios/facturas"
    And se quiere visualizar con resolucion <X> x <Y>
    When doy clic en "Hogar"
    And selecciono "CC" en el campo "Tipo de documento"
    And ingreso "Hogar_numDocumento con facturas" en el campo "número de documento"
    And ingreso "prueba@prueba.com" en el campo "Correo electrónico H"
    And doy clic en "Consultar H clic"
    And doy clic en "primer Pago total"
    Then llevará al formulario con el objeto "title-detail"
    And Estoy en la página de selección de formas de pago con el tipo "Tarjeta de Crédito" seleccionado

    Examples: 
      | X     | Y      |
      | "320" | "480"  |
      | "600" | "1024" |
      | "768" | "1024" |
      | "640" | "960"  |
      | "720" | "1280" |

Scenario Outline: Pasarela - Responsive Seccion Hogar (Tarjeta Debito)
    Given Estoy en la página de inicio "Pagina pago de facturas" en la url "https://transaccionesco-uat.tigocloud.net/servicios/facturas"
    And se quiere visualizar con resolucion <X> x <Y>
    When doy clic en "Hogar"
    And selecciono "CC" en el campo "Tipo de documento"
    And ingreso "Hogar_numDocumento con facturas" en el campo "número de documento"
    And ingreso "prueba@prueba.com" en el campo "Correo electrónico H"
    And doy clic en "Consultar H clic"
    And doy clic en "primer Pago total"
    Then llevará al formulario con el objeto "title-detail"
    And Estoy en la página de selección de formas de pago con el tipo "Debito Bancario PSE" seleccionado

    Examples: 
      | X     | Y      |
      | "320" | "480"  |
      | "600" | "1024" |
      | "768" | "1024" |
      | "640" | "960"  |
      | "720" | "1280" |

