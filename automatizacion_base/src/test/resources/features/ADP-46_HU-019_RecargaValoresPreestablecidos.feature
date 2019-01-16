#Author: Nelson Mesa
#Keywords Summary :
@issue:ADP-46 @Recargas

Feature: HU019 Recarga de valores preestablecidos

Como Tigoune
Quiero realizar pruebas automatizadas sobre la selección del valor en el formulario de paquetes y recargas
Para garantizar que funcione correctamente el inicio del proceso de recarga

  Scenario Outline: Recargas - Validación valores preestablecidos
    Given Estoy en la página de inicio "Pagina paquetes" en la url "https://transaccionesco-uat.tigocloud.net/servicios/paquetes?he=1"
    When doy clic en "Recarga"
    And Espero 2 segundos
    When ingreso "3003255454" en el campo "Ingresa tu línea Tigo"
    And Espero 2 segundos
    And  doy clic en <valor>
    And ingreso "pruebas@yopmail.com" en el campo "Correo electrónico"
    And doy clic en "Recargar"
    Then llevará al formulario con el objeto "Titulo Detalle"
    And el campo "valor" tiene el texto <valorformato>

     Examples:  
     
      | valor  | valorformato |
      | "3mil" | "$ 3,000"    |
      | "5Mil" | "$ 5,000"    |
      | "10Mil"| "$ 10,000"   |
      | "15mil"| "$ 15,000"   |
      | "20Mil"| "$ 20,000"   |  