#Author: Alexandra Lasprilla Cardona
#Keywords Summary :
@issue:ADP-51
Feature: Pago Completo de Facturas Pendientes

Background: seleccion medio de pago
    Given Estoy en la página de inicio de pago de facturas "https://transaccionesco-uat.tigocloud.net/servicios/facturas"
    When ingreso "3008914224" en el campo "Tu línea Tigo"
    And doy clic en el campo "Correo electrónico" y escribo el email "prueba@prueba.com"
    And doy clic en el botón "Consultar"
    Then llevará al formulario con el objeto "title-detail"

    Scenario Outline: Seleccion Tarjeta Debito para realizar el Pago Completo 
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
     Then llevará al formulario con el objeto "title-detail"
     
     Examples: 
      | estado             |
      | "approved"         |
      | "pending"          |
      | "declined"         |