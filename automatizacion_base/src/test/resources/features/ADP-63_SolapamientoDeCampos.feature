#Author: Alexandra Lasprilla Cardona
#Keywords Summary :
@issue:ADP-63  @Pasarela
Feature: Solapamiento de Campos
  Como Tigoune
  Quiero realizar pruebas automatizadas en la página de Paga tu Factura
  Para garantizar la correcta visualización del diseño de la página

  #Scenario Outline: Pasarela - Solapamiento de Campos Seccion Hogar 
    #Given Estoy en la página de inicio de pago de facturas "https://transaccionesco-uat.tigocloud.net/servicios/facturas"
    #And el tamaño del navegador es "300" por "780"
    #When doy clic en "Hogar"
    #And se quiere visualizar con resolucion <X> x <Y>
#
    #Examples: 
      #|Ancho| Alto | X      | Y     |
      #||           | "320"  | "480" |
      #||           | "600"  | "1024"|
      #||           | "768"  | "1024"|
      #||           | "640"  | "960" |
      #||           | "640"  | "960" |
      
   Scenario Outline: Pasarela - Solapamiento de Campos Seccion Selecciona Método de Pago 
    Given Estoy en la página de inicio de pago de facturas "https://transaccionesco-uat.tigocloud.net/servicios/facturas"
    #And el tamaño del navegador es "300" por "780"
    When ingreso "3148588733" en el campo "Tu línea Tigo"
    And ingreso "pruebas@yopmail.com" en el campo "Correo electrónico M"
    And doy clic en el botón "Consultar M"
    Then llevará al formulario con el objeto "title-detail"
    And Estoy en la página de selección de formas de pago con el tipo "Debito Bancario PSE" seleccionado
    And selecciono "BANCO UNION COLOMBIANO" en el campo "Banco"
    And se quiere visualizar con resolucion <X> x <Y>

    Examples: 
      |Ancho| Alto | X      | Y     |
      ||           | "320"  | "480" |
      ||           | "600"  | "1024"|
      ||           | "768"  | "1024"|
      ||           | "640"  | "960" |
      ||           | "640"  | "960" |
      
