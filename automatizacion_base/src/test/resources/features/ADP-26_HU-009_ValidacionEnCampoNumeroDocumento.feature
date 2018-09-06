#Author: Henry Andres Correa Correa
#Keywords Summary : Cedula, Validacion, Documento
@issue:ADP-26 
@HU009 @NumeroDocumento
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
    Then mostrará hasta el 13° dígito

  Scenario Outline: Ingreso de documentos de <digitos> dígitos
    Given Estoy en la página de inicio de pago de facturas "https://transaccionesco-uat.tigocloud.net/servicios/facturas"
    When doy clic en la opción "HOGAR"
    And selecciono la opción "CC" en el campo Tipo de documento
    And ingreso <documento> en el campo "número de documento"
    Then mostrará hasta el 13° dígito

    Examples: 
      | digitos | documento    |
      |       9 |    123456789 |
      |      11 |  12345678901 |
      |      11 | 123456789012 |

  #Scenario: Ingreso de documentos de 9 dígitos
  #Given Estoy en la página de inicio de pago de facturas "https://transaccionesco-uat.tigocloud.net/servicios/facturas"
  #When doy clic en la opción "HOGAR"
  #And selecciono la opción "CC" en el campo Tipo de documento
  #And ingreso "123456789" en el campo "número de documento"
  #Then mostrará el siguiente mensaje en color rojo "Ingresaste un documento no soportado, por favor verifícalo"
  #
  #Scenario: Ingreso de documentos de 11 dígitos
  #Given Estoy en la página de inicio de pago de facturas "https://transaccionesco-uat.tigocloud.net/servicios/facturas"
  #When doy clic en la opción "HOGAR"
  #And selecciono la opción "CC" en el campo Tipo de documento
  #And ingreso "12345678901" en el campo "número de documento"
  #Then mostrará el siguiente mensaje en color rojo "Ingresaste un documento no soportado, por favor verifícalo"
  #
  #Scenario: Ingreso de documentos de 12 dígitos
  #Given Estoy en la página de inicio de pago de facturas "https://transaccionesco-uat.tigocloud.net/servicios/facturas"
  #When doy clic en la opción "HOGAR"
  #And selecciono la opción "CC" en el campo Tipo de documento
  #And ingreso "123456789012" en el campo "número de documento"
  #Then mostrará el siguiente mensaje en color rojo "Ingresaste un documento no soportado, por favor verifícalo"
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
      | documento | estadoFacturas                 |
      |  71770656 | "no tiene facturas pendientes" |
      |    552716 |                    12345678901 |
  #Scenario Outline: Ingreso de cédula válida sin facturas pendientes
    #Given Estoy en la página de inicio de pago de facturas "https://transaccionesco-uat.tigocloud.net/servicios/facturas"
    #When doy clic en la opción "HOGAR"
    #And selecciono la opción "CC" en el campo Tipo de documento
    #And ingreso <documento> en el campo "número de documento"
    #And ingreso "prueba@prueba.com" en el campo "Correo electrónico"
    #And doy clic en el botón "Consultar"
    #Then mostrará el siguiente mensaje en letras blancas con fondo azul "El usuario no tiene facturas pendientes"
#
    #Examples: 
      #| documento |
      #|  71770656 |
#
  #Scenario Outline: Ingreso de cédula válida con facturas pendientes
    #Given Estoy en la página de inicio de pago de facturas "https://transaccionesco-uat.tigocloud.net/servicios/facturas"
    #When doy clic en la opción "HOGAR"
    #And selecciono la opción "CC" en el campo Tipo de documento
    #And ingreso <documento> en el campo "número de documento"
    #And ingreso "prueba@prueba.com" en el campo "Correo electrónico"
    #And doy clic en el botón "Consultar"
    #Then mostrará el listado de facturas pendientes
#
    #Examples: 
      #| documento |
      #|    552716 |
