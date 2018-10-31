#Author: Jose David Moreno Serrano
#Keywords Summary :
@issue:ADP-45
Feature: HU018 Validación números Validos Celular en Recargas y Paquetes
  
  Como Tigoune
  Quiero realizar pruebas automatizadas sobre el campo "Número Celular" en el formulario de paquetes y recargas
  Para garantizar que funcione correctamente el inicio del proceso de recarga

  Scenario Outline: Ingreso de número valido que no es Tigo
    Given Estoy en la página de inicio de pago de facturas "https://transaccionesco-uat.tigocloud.net/servicios/paquetes"
    When doy clic en "Recarga"
    And ingreso <msisdn> en el campo "Ingresa tu línea Tigo"
    And ingreso "prueba@prueba.com" en el campo "Correo electrónico"
    And doy clic en "Recargar"
    Then el campo "Error" tiene el texto "El número de línea que ingresaste no es de tigo. Por favor verifícalo."
    And el campo "Error" tiene el atributo "color" en el valor "rojo"

    Examples: 
      | msisdn       |
      | "3000000000" |
      | "3110000000" |
      | "3150000000" |
      | "3200000000" |

  Scenario: Ingreso de número válido Tigo con un plan que no permite recargas
  Given Estoy en la página de inicio de pago de facturas "https://transaccionesco-uat.tigocloud.net/servicios/paquetes"
  And ingreso "3008911502" en el campo "Ingresa tu línea Tigo"
  And ingreso "prueba@prueba.com" en el campo "Correo electrónico"
  And doy clic en "Recargar"
  
  Scenario: Ingreso de número válido Tigo con una linea suspendida
  Given Estoy en la página de inicio de pago de facturas "https://transaccionesco-uat.tigocloud.net/servicios/paquetes"
  And ingreso "3008911502" en el campo "Ingresa tu línea Tigo"
  And ingreso "prueba@prueba.com" en el campo "Correo electrónico"
  And doy clic en "Recargar"  
  Then el campo "label error celular recargas" tiene el texto "Lo sentimos, tu línea se encuentra suspendida por robo o pérdida"
  And el campo "label error celular recargas" tiene el atributo "color" en el valor "rojo"
  
  Scenario Outline: Ingreso de número válido Tigo con un plan que permite recargas
  Given Estoy en la página de inicio de pago de facturas "https://transaccionesco-uat.tigocloud.net/servicios/paquetes"
  When doy clic en "Recarga"   
  And ingreso <msisdn> en el campo "Ingresa tu línea Tigo"
  And ingreso "prueba@prueba.com" en el campo "Correo electrónico"
  And doy clic en "Recargar"
  Then llevará al formulario con el objeto "title-detail"
  And el campo "Numero Celular" tiene el texto <Formato Celular>
  And el campo "Fecha Facturacion" no está vacío
  And el campo "Fecha límite de pago" no está vacío
  
  Examples: 
      | msisdn       | Formato Celular   |
      | "3003255454" | "(300) 325-5454"  | 
      | "3016078288" | "(301) 607-8288"  |
      