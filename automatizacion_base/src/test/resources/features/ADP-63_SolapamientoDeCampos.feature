#Author: Alexandra Lasprilla Cardona
#Keywords Summary :
@issue:ADP-63, @Pasarela
Feature: Solapamiento de Campos
  Como Tigoune
  Quiero realizar pruebas automatizadas en la página de Paga tu Factura
  Para garantizar la correcta visualización del diseño de la página

  Scenario Outline: Pasarela - Solapamiento de Campos
    Given Estoy en la página de inicio de pago de facturas "https://transaccionesco-uat.tigocloud.net/servicios/facturas"
    When doy clic en "Hogar"
    And se quiere visualizar con resolucion <X> x <Y>

    Examples: 
      | X      | Y     |
      | "300"  | "480" |
      | "800"  | "600" |
      | "940"  | "780" |
      | "768"  | "1024"|
