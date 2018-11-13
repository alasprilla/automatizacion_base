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
    #And se quiere visualizar con resolucion <X> x <Y>
    #When doy clic en "Hogar"
    #
#
    #Examples: 
      #|Ancho| Alto | X      | Y     |
      #||           | "320"  | "480" |
      #||           | "600"  | "1024"|
      #||           | "768"  | "1024"|
      #||           | "640"  | "960" |
      #||           | "720"  | "1280"|
      
   Scenario Outline: Pasarela - Solapamiento de Campos Seccion Selecciona Método de Pago 
    Given Estoy en la página de inicio de pago de facturas "https://transaccionesco-uat.tigocloud.net/servicios/facturas"
    #And el tamaño del navegador es "300" por "780"
    When doy clic en "HOGAR"
    And selecciono "CC" en el campo "Tipo de documento"
    And ingreso <documento> en el campo "número de documento"
    And ingreso "prueba@prueba.com" en el campo "Correo electrónico H"
    And doy clic en el botón "Consultar H"
    Then llevará al formulario con el objeto "title-detail"
    And se quiere visualizar con resolucion <X> x <Y>
    And Estoy en la página de selección de formas de pago con el tipo "Tarjeta de Credito" seleccionado
    

    Examples: 
      |Ancho| Alto |documento | X      | Y     |
      ||           |"70507173"| "320"  | "480" |
      ||           |"70507173"| "600"  | "1024"|
      ||           |"70507173"| "768"  | "1024"|
      ||           |"70507173"| "640"  | "960" |
      ||           |"70507173"| "720"  | "1280"|
      
