	#Author: Alexandra Lasprilla Cardona
#Keywords Summary :
@issue:ADP-16
Feature: HU005_Llenado_Formulario_TD
		Como Tigoune
		Quiero pruebas automatizadas de la casuística en el llenado de formulario de TD
		Para acelerar el proceso de desarrollo y garantizar integridad

Background: seleccion medio de pago
    Given Estoy en la página de inicio de pago de facturas "https://transaccionesco-uat.tigocloud.net/servicios/facturas"
    When ingreso "3008914224" en el campo "Tu línea Tigo"
    And doy clic en el campo "Correo electrónico" y escribo el email "prueba@prueba.com"
    Then llevará al formulario donde se selecciona el tipo de pago

    Scenario: Validación del campo "Banco"
    Given Estoy en la página de selección de formas de pago con el tipo "Debito Bancario PSE" seleccionado
     And selecciono "" en el campo "Banco"
     And selecciono "N" en el campo "Tipo de Persona"
     And ingreso "nombre" en el campo "Nombres y Apellidos"
     And selecciono "CC" en el campo "Tipo D"
     And ingreso "1234567896" en el campo "Número de documento D"
    Then el botón "Pagar D" esta "deshabilitado"
    
    Scenario: Validación del campo "Tipo de persona"
    Given Estoy en la página de selección de formas de pago con el tipo "Debito Bancario PSE" seleccionado
     And selecciono "BAN.CO" en el campo "Banco"
     And selecciono "" en el campo "Tipo de Persona"
     And ingreso "nombre" en el campo "Nombres y Apellidos"
     And selecciono "CC" en el campo "Tipo D"
     And ingreso "1234567896" en el campo "Número de documento D"
    Then el botón "Pagar D" esta "deshabilitado"
    
    Scenario: Validación del campo "Nombres y Apellidos"
    Given Estoy en la página de selección de formas de pago con el tipo "Debito Bancario PSE" seleccionado
     And selecciono "BAN.CO" en el campo "Banco"
     And selecciono "N" en el campo "Tipo de Persona"
     And ingreso "" en el campo "Nombres y Apellidos"
     And selecciono "CC" en el campo "Tipo D"
     And ingreso "1234567896" en el campo "Número de documento D"
    Then el botón "Pagar D" esta "deshabilitado"
    
    Scenario: Validación del campo "Tipo"
    Given Estoy en la página de selección de formas de pago con el tipo "Debito Bancario PSE" seleccionado
     And selecciono "BAN.CO" en el campo "Banco"
     And selecciono "N" en el campo "Tipo de Persona"
     And ingreso "nombre" en el campo "Nombres y Apellidos"
     And selecciono "" en el campo "Tipo D"
     And ingreso "1234567896" en el campo "Número de documento D"
    Then el botón "Pagar D" esta "deshabilitado"
    
    Scenario: Validación del campo "Número de documento""
    Given Estoy en la página de selección de formas de pago con el tipo "Debito Bancario PSE" seleccionado
     And selecciono "BAN.CO" en el campo "Banco"
     And selecciono "N" en el campo "Tipo de Persona"
     And ingreso "nombre" en el campo "Nombres y Apellidos"
     And selecciono "CC" en el campo "Tipo D"
     And ingreso "" en el campo "Número de documento D"
    Then el botón "Pagar D" esta "deshabilitado"
    
    Scenario: Validación del campo "Validación de campos llenos"
    Given Estoy en la página de selección de formas de pago con el tipo "Debito Bancario PSE" seleccionado
     And selecciono "BAN.CO" en el campo "Banco"
     And selecciono "N" en el campo "Tipo de Persona"
     And ingreso "nombre" en el campo "Nombres y Apellidos"
     And selecciono "CC" en el campo "Tipo D"
     And ingreso "123456789" en el campo "Número de documento D"
     And Presiono la tecla "tab"
     Then el campo "Pagar D" tiene el atributo "class" en el valor "button--secondary"
    
    
    
    
    

