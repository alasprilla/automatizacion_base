#Author: Alexandra Lasprilla Cardona
#Keywords Summary :
@issue:ADP-64 @Recargas
Feature: HU022 Ingreso numero valido Tigo con deuda pendiente
  
  Como Tigoune
  Quiero realizar pruebas automatizadas sobre el campo "Número Celular" en el formulario de paquetes y recargas
  Para garantizar que funcione correctamente el inicio del proceso de recarga

  Scenario: Recargas - Ingreso de número válido Tigo con deuda pendiente seleccionando valor mínimo de recargas
    Given Estoy en la página de inicio de pago de facturas "https://transaccionesco-uat.tigocloud.net/servicios/paquetes"
    When doy clic en "Recarga"
    And ingreso "3008911502" en el campo "Ingresa tu línea Tigo"
    And ingreso "prueba@prueba.com" en el campo "Correo electrónico"
    And doy clic en el botón "3Mil"
    And doy clic en "recargar"
    Then llevará al formulario con el objeto "Espera un momento"

  Scenario: Recargas - Ingreso de número válido Tigo con deuda pendiente seleccionando la opción de otro valor
    Given Estoy en la página de inicio de pago de facturas "https://transaccionesco-uat.tigocloud.net/servicios/paquetes"
    When doy clic en "Recarga"
    And ingreso "3008911502" en el campo "Ingresa tu línea Tigo"
    And doy clic en "otro valor"
    And Espero 1 segundos
    And doy clic en "otro valor"
    And ingreso "3000" en el campo "Valor a recargar"
    And ingreso "prueba@prueba.com" en el campo "Correo electrónico"
    And doy clic en "recargar"
    Then llevará al formulario con el objeto "Espera un momento"

  Scenario Outline: Recargas - Ingreso de número válido Tigo con deuda pendiente seleccionando continuar
    Given Estoy en la página de inicio de pago de facturas "https://transaccionesco-uat.tigocloud.net/servicios/paquetes"
    When doy clic en "Recarga"
    And ingreso "3008911502" en el campo "Ingresa tu línea Tigo"
    And ingreso "prueba@prueba.com" en el campo "Correo electrónico"
    And doy clic en el botón <valor>
    And doy clic en "recargar"
    Then llevará al formulario con el objeto "Espera un momento"
    And doy clic en "Continuar"
    Then llevará al formulario con el objeto "title-detail"
    And el campo "valor" tiene el texto <valorformato>

    Examples: 
      | valor  | valorformato |
      | "3Mil" | "$ 3,000"    |
      | "6Mil" | "$ 6,000"    |

  Scenario Outline: Recargas - Ingreso de número válido Tigo con deuda pendiente seleccionando Aumentar Recarga
    Given Estoy en la página de inicio de pago de facturas "https://transaccionesco-uat.tigocloud.net/servicios/paquetes"
    When doy clic en "Recarga"
    And ingreso "3008911502" en el campo "Ingresa tu línea Tigo"
    And ingreso "prueba@prueba.com" en el campo "Correo electrónico"
    And doy clic en el botón <valor>
    And doy clic en "recargar"
    Then llevará al formulario con el objeto "Espera un momento"
    And doy clic en "Aumentar Recarga"
    And llevará al formulario con el objeto "otro valor cargado"
    And Espero 1 segundos
    And doy clic en "recargar"
    Then llevará al formulario con el objeto "title-detail"

    Examples: 
      | valor  | 
      | "3Mil" | 
      | "6Mil" | 
