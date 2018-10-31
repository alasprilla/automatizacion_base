#Author: Nelson Mesa
#Keywords Summary :
@issue:ADP-46

Feature: HU019 Recarga de valores preestablecidos

Como Tigoune
Quiero realizar pruebas automatizadas sobre la selección del valor en el formulario de paquetes y recargas
Para garantizar que funcione correctamente el inicio del proceso de recarga

  Scenario Outline: Ingreso de texto en el campo "Valor a recargar"
    Given Estoy en la página de inicio de pago de facturas "https://transaccionesco-uat.tigocloud.net/servicios/paquetes?he=1"
    When doy clic en "Recarga"
    And Espero 2 segundos
    When ingreso "3003255454" en el campo "Ingresa tu línea Tigo"
    And Espero 2 segundos
    And  doy clic en el botón <valor>
    And ingreso "pruebas@yopmail.com" en el campo "Correo electrónico M"
    And doy clic en el botón "Recargar"
    Then llevará al formulario con el objeto "title-detail"
    And el campo "valor" tiene el texto <valorformato>

     Examples:  
     
      | valor  | valorformato |
      | "3mil" | "$ 3,000"    |
      | "6Mil" | "$ 6,000"    |
      | "15Mil"| "$ 15,000"   |
      | "20mil"| "$ 20,000"   |
      | "30Mil"| "$ 30,000"   |  