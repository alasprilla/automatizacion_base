#Author: Henry Andres Correa Correa
#Keywords Summary : Cedula, Validacion, Documento
@issue:ADP-26
Feature: HU009: CC válida en campo número de documento
  Como Tigoune
  Quiero realizar pruebas automatizadas de la consulta de facturas del servicio fijo
  Para garantizar que la consulta se realice con una cédula de ciudadanía válida

  Scenario: Ingreso de texto en el campo número de documento
    Given Estoy en la página de inicio de pago de facturas "https://transaccionesco-uat.tigocloud.net/servicios/facturas"
    When doy clic en la opción "HOGAR"
    And selecciono la opción "CC" en el campo Tipo de documento
    And ingreso "no numérico" en el campo "número de documento"
    Then el texto que se intenta ingresar no se mostrará
    And mostrará el siguiente mensaje en color rojo "El documento solo debe tener números"

  Scenario: Ingreso de documentos de más de 13 dígitos
    Given Estoy en la página de inicio de pago de facturas "https://transaccionesco-uat.tigocloud.net/servicios/facturas"
    When doy clic en la opción "HOGAR"
    And selecciono la opción "CC" en el campo Tipo de documento
    And ingreso "12345678901234" en el campo "número de documento"
    Then mostrará en el campo "número de documento" el texto "1234567890123"

  Scenario Outline: Ingreso de documentos de <digitos> dígitos
    Given Estoy en la página de inicio de pago de facturas "https://transaccionesco-uat.tigocloud.net/servicios/facturas"
    When doy clic en la opción "HOGAR"
    And selecciono la opción "CC" en el campo Tipo de documento
    And ingreso <documento> en el campo "número de documento"
    Then mostrará el siguiente mensaje en color rojo "Ingresaste un documento no soportado, por favor verifícalo."

    Examples: 
      | digitos | documento      |
      |       9 | "123456789"    |
      |      11 | "12345678901"  |
      |      12 | "123456789012" |

  Scenario Outline: Ingreso de cédula válida
    Given Estoy en la página de inicio de pago de facturas "https://transaccionesco-uat.tigocloud.net/servicios/facturas"
    When doy clic en la opción "HOGAR"
    And selecciono la opción "CC" en el campo Tipo de documento
    And ingreso <documento> en el campo "número de documento"
    And ingreso "prueba@prueba.com" en el campo "Correo electrónico"
    And doy clic en el botón "Consultar"
    Then mostrará el <estadoFacturas>

    #Si no tiene el msj esta en letras blancas con fondo azul
    Examples: 
      | documento  | estadoFacturas                            |
      | "71770656" | "El usuario no tiene facturas pendientes" |
      | "552716"   | "listado de facturas pendientes"          |
