#Author: Alexandra Lasprilla Cardona
#Keywords Summary :
@issue:ADP-36
Feature: Prueba de Adherencia Pago Completo

Background: seleccion medio de pago
    Given Estoy en la página de inicio de pago de facturas "https://transaccionesco-uat.tigocloud.net/servicios/facturas"
    When ingreso "3043302450" en el campo "Tu línea Tigo"
    And doy clic en el campo "Correo electrónico" y escribo el email "prueba@prueba.com"
    Then llevará al formulario donde se selecciona el tipo de pago

  #Parametros:
#  Scenario Outline: Seleccion Tarjeta de crédito 
#    Given Estoy en la página de selección de formas de pago con el tipo "Tarjeta de Crédito" seleccionado
#    When ingreso <tc> en el campo "Número de tarjeta"
#     And ingreso <cvv> en el campo "CVV"
#     And selecciono "11" en el campo "MM"
#     And selecciono "2019" en el campo "AA"
#     And ingreso <estado> en el campo "Nombre"
#     And selecciono "CE" en el campo "tipo"
#     And ingreso <numdoc> en el campo "número de documento TC"
#     And doy clic en el botón "Pagar"
    #Then llevara al detalle de la transacción 
     

#    Examples: 
#      | tc                 |cvv    |estado     |numdoc       |
#      | "4357223863986989" |"932"  |"approved" |"123456789"  |
     # | "4905741876639102" |"136"  |"pending"  |"108802546"  |   
     # | "4566039724385949" |"558"  |"declined" |"369854854"  |
     
    Scenario: Seleccion Tarjeta Debito
    Given Estoy en la página de selección de formas de pago con el tipo "Debito Bancario PSE" seleccionado
     And selecciono "BANCO UNION COLOMBIANO" en el campo "Banco"
     And selecciono "N" en el campo "Tipo de Persona"
     And ingreso "approved" en el campo "Nombres y Apellidos"
     And selecciono "CC" en el campo "Tipo D"
     And ingreso "1234567896" en el campo "Número de documento D"
     And Presiono la tecla "tab"
     And doy clic en el botón "Pagar D"
     And ingreso "lasprilla.alexandra@gmail.com" en el campo "Email PSE"
     
     