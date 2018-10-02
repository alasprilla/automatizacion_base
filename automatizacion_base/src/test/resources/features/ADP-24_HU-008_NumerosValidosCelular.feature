#Author: Alexandra Lasprilla Cardona
#Keywords Summary :
@issue:ADP-24
Feature: HU008 Validación número Celular
  Como Tigoune
  Quiero realizar pruebas automatizadas de la consulta de facturas del servicio móvil
  Para garantizar que se pueden utilizar las teclas especiales básicas en el formulario de consulta de facturas

  Scenario Outline: Ingreso de número valido que no es Tigo
    Given Estoy en la página de inicio de pago de facturas "https://transaccionesco-uat.tigocloud.net/servicios/facturas"
    When ingreso <msisdn> en el campo "Tu línea Tigo"
    And doy clic en el campo "Correo electrónico" y escribo el email <email>
    Then mostrará el siguiente "mensaje sin facturas" en letras blancas con fondo rojo "No hemos encontrado facturas pendientes para este número de línea."
    
    Examples: 
      | msisdn       | email                  |
      | "3000000000" | "prueba@prueba.com"    |
      | "3110000000" | "ejemplo@ejemplo.com"  |
      | "3150000000" | "casoexitoso@ti.go"    |
      | "3200000000" | "caso_exitoso@tigo.com"|

  Scenario Outline: Ingreso de número válido Tigo sin facturas pendientes
    Given Estoy en la página de inicio de pago de facturas "https://transaccionesco-uat.tigocloud.net/servicios/facturas"
		When ingreso <msisdn> en el campo "Tu línea Tigo"
    And doy clic en el campo "Correo electrónico" y escribo el email <email>
    Then mostrará el siguiente "mensaje sin facturas" en letras blancas con fondo azul "No hemos encontrado facturas pendientes para este número de línea."
    
    Examples: 
      | msisdn       | email                  |
      | "3003255454" | "prueba@prueba.com"    | 
      | "3014422427" | "ejemplo@ejemplo.com"  |

	@CasoFeliz
  Scenario Outline: Ingreso de número válido Tigo con facturas pendientes
    Given Estoy en la página de inicio de pago de facturas "https://transaccionesco-uat.tigocloud.net/servicios/facturas"
		When ingreso <msisdn> en el campo "Tu línea Tigo"
    And doy clic en el campo "Correo electrónico" y escribo el email <email>
    Then llevará al formulario donde se selecciona el tipo de pago

    Examples: 
      | msisdn       | email                  |
      | "3043302450" | "prueba@prueba.com"    | 
