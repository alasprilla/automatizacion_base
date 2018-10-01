	#Author: Alexandra Lasprilla Cardona
#Keywords Summary :
@issue:ADP-36
Feature: Prueba de Adherencia Pago Completo

Background: seleccion medio de pago
    Given Estoy en la página de inicio de pago de facturas "https://transaccionesco-uat.tigocloud.net/servicios/facturas"
    When ingreso "3008914224" en el campo "Tu línea Tigo"
    And doy clic en el campo "Correo electrónico" y escribo el email "prueba@prueba.com"
    Then llevará al formulario donde se selecciona el tipo de pago

    Scenario Outline: Seleccion Tarjeta Debito
    Given Estoy en la página de selección de formas de pago con el tipo "Debito Bancario PSE" seleccionado
     And selecciono "BANCO UNION COLOMBIANO" en el campo "Banco"
     And selecciono "N" en el campo "Tipo de Persona"
     And ingreso <estado> en el campo "Nombres y Apellidos"
     And selecciono "CC" en el campo "Tipo D"
     And ingreso "1234567896" en el campo "Número de documento D"
     And Presiono la tecla "tab"
     And doy clic en el botón "Pagar D"
     And ingreso "lasprilla.alexandra@gmail.com" en el campo "Email PSE"
     And doy clic en el botón "Ir al Banco"
     And doy clic en el botón "Debug"
     And ingreso "27/09/2018" en el campo "BankProcessDate"
     And ingreso "12365478" en el campo "authorizationID"
     And doy clic en el botón "Return"
     Then Mostrará el "Detalle" de la transaccion 
     Examples: 
      | estado             |
      | "approved"         |
      | "pending"          |
      | "declined"         |