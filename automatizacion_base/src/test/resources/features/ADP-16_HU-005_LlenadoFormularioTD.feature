#Author: Alexandra Lasprilla Cardona
#Keywords Summary :
@issue:ADP-16
Feature: HU005_Llenado_Formulario_TD
  Como Tigoune
  Quiero pruebas automatizadas de la casuística en el llenado de formulario de TD
  Para acelerar el proceso de desarrollo y garantizar integridad

  Background: seleccion medio de pago
    Given Estoy en la página de inicio de pago de facturas "https://transaccionesco-uat.tigocloud.net/servicios/facturas"
    When ingreso "3043605513" en el campo "Tu línea Tigo"
    And ingreso "prueba@prueba.com" en el campo "Correo electrónico M"
    And doy clic en el botón "ConsultarM"
    Then llevará al formulario con el objeto "title-detail"

  Scenario Outline: Validación de campos de transacción PSE
    Given Estoy en la página de selección de formas de pago con el tipo "Debito Bancario PSE" seleccionado
    And selecciono <banco> en el campo "Banco"
    And selecciono <tipoPersona> en el campo "Tipo de Persona"
    And ingreso <nombresApellidos> en el campo "Nombres y Apellidos"
    And selecciono <tipoDoc> en el campo "Tipo D"
    And ingreso <numeroDoc> en el campo "Número de documento D"
    And Presiono la tecla "tab"
    Then el campo "Pagar D" tiene el atributo "class" en el valor <estadoBotonPagar>
    And doy clic en el botón "Cancelar PSE"

    Examples: 
      | campo a validar           | banco    | tipoPersona | nombresApellidos    | tipoDoc | numeroDoc   | estadoBotonPagar    |
      | "Banco"                   | ""       | "N"         | "nombres apellidos" | "CC"    | "123456789" | "button--inactive"  |
      | "Tipo de persona"         | "BAN.CO" | ""          | "nombre apellidos"  | "CC"    | "123456789" | "button--inactive"  |
      | "Nombres y Apellidos"     | "BAN.CO" | "N"         | ""                  | "CC"    | "123456789" | "button--inactive"  |
      | "Tipo de documento"       | "BAN.CO" | "N"         | "nombre apellidos"  | ""      | "123456789" | "button--inactive"  |
      | "Número de documento"     | "BAN.CO" | "N"         | "nombre apellidos"  | "CC"    | ""          | "button--inactive"  |
      | "Todos los campos llenos" | "BAN.CO" | "N"         | "nombre apellidos"  | "CC"    | "123456789" | "button--secondary" |
