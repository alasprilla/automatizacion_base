#Author: Alexandra Lasprilla
#Keywords Summary :
@issue:ADP-46
Feature: HU019 Recarga de valores preestablecidos
  
		Como Tigoune
		Quiero realizar pruebas automatizadas sobre la selección del valor en el formulario de paquetes y recargas
		Para garantizar que funcione correctamente el inicio del proceso de recarga

  Scenario Outline: Recarga de Valores preestablecidos
    Given Estoy en la página de inicio de pago de facturas "https://transaccionesco-uat.tigocloud.net/servicios/paquetes"
    When doy clic en "Recarga"
    When ingreso "3003255454" en el campo "Ingresa tu línea Tigo"
    And doy clic en <Valor>
    And ingreso "prueba@prueba.com" en el campo "Correo electrónico"
    And doy clic en "recargar"
    Then llevará al formulario con el objeto "title-detail"
    And el campo "Valor" tiene el texto <valorFormato>
    
    Examples: 
      |Valor    | valorFormato |
      |"3Mil"   | "$ 3,000"    |
      |"6Mil"   | "$ 6,000"    |
      |"15Mil"  | "$ 15,000"   |
      |"20Mil"  | "$ 20,000"   |
      |"30mil"  | "$ 30,000"   |