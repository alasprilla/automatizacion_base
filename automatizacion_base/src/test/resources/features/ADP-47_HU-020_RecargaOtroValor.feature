#Author: Nelson Mesa
#Keywords Summary :
@issue:ADP-47
Feature: HU020 Recarga de otros valores
  
  
  Como Tigoune
  Quiero realizar pruebas automatizadas sobre un valor no predeterminado en el formulario de paquetes y recargas
  Para garantizar que funcione correctamente el inicio del proceso de recarga

  #Parámetros: "abc", "sdf"
  #
  Scenario Outline: Ingreso de texto en el campo "Valor a recargar"
    Given Estoy en la página de inicio de pago de facturas "https://transaccionesco-uat.tigocloud.net/servicios/paquetes"
    When doy clic en "Recarga"
    When ingreso "3003255454" en el campo "Ingresa tu línea Tigo"
    And doy clic en "otro valor"
    And llevará al formulario con el objeto "otro valor cargado"
    And ingreso <texto> en el campo "Valor a recargar"
    Then el campo "Valor a recargar" tiene el texto ""

    Examples: 
      | texto |
      | "abc" |
      | "sdf" |

  #Parámetros: "10", "2999"
  Scenario Outline: Valor menor a 2.999 en el campo "Valor a recargar"
    Given Estoy en la página de inicio de pago de facturas "https://transaccionesco-uat.tigocloud.net/servicios/paquetes"
    When doy clic en "Recarga"
    When ingreso "3003255454" en el campo "Ingresa tu línea Tigo"
    And doy clic en "otro valor"
    And llevará al formulario con el objeto "otro valor cargado"
    And ingreso <valor> en el campo "Valor a recargar"
   # And Presiono la tecla <tecla>
   And doy clic en "Recarga desde"
    Then el campo "label error valor recargas" tiene el texto "El valor a recargar debe ser igual o mayor a $ 3,000 , por favor ajústalo e intenta de nuevo."
    And el campo "label error valor recargas" tiene el atributo "color" en el valor "rojo"

    Examples: 
      | valor  | tecla |
      | "10"   | "tab" |
      | "2999" | ""    |
