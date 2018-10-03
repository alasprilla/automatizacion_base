#Author: Henry Andres Correa Correa
#Keywords Summary : Cedula, Validacion, Documento
@issue:ADP-26
Feature: HU009 CC válida en campo número de documento
  Como Tigoune
  Quiero realizar pruebas automatizadas de la consulta de facturas del servicio fijo
  Para garantizar que haya consistencia en los datos entre pantallas

  Scenario: Ingreso de texto en el campo número de documento
    Given Estoy en la página de inicio de pago de facturas "https://transaccionesco-uat.tigocloud.net/servicios/facturas"
    When doy clic en "HOGAR"
    And selecciono "CC" en el campo "Tipo de documento"
    And ingreso "no numérico" en el campo "número de documento"
    Then el campo "número de documento" tiene el texto ""
    And el campo "label error documento" tiene el texto "El documento solo debe tener números"
    And el campo "label error documento" tiene el atributo "color" en el valor "rojo"

  Scenario: Ingreso de documentos de más de 13 dígitos
    Given Estoy en la página de inicio de pago de facturas "https://transaccionesco-uat.tigocloud.net/servicios/facturas"
    When doy clic en "HOGAR"
    And selecciono "CC" en el campo "Tipo de documento"
    And ingreso "12345678901234" en el campo "número de documento"
    Then mostrará en el valor del campo "número de documento" el texto "1234567890123"

  Scenario Outline: Ingreso de documentos de N dígitos
    Given Estoy en la página de inicio de pago de facturas "https://transaccionesco-uat.tigocloud.net/servicios/facturas"
    When doy clic en "HOGAR"
    And selecciono "CC" en el campo "Tipo de documento"
    And ingreso <documento> en el campo "número de documento"
    And el campo "label error documento" tiene el texto "Ingresaste un documento no soportado, por favor verifícalo."
    And el campo "label error documento" tiene el atributo "color" en el valor "rojo"

    Examples: 
      | digitos | documento      |
      |       9 | "123456789"    |
      |      11 | "12345678901"  |
      |      12 | "123456789012" |

  @CasoFeliz
  Scenario Outline: Ingreso de cédula válida
    Given Estoy en la página de inicio de pago de facturas "https://transaccionesco-uat.tigocloud.net/servicios/facturas"
    When doy clic en "HOGAR"
    And selecciono "CC" en el campo "Tipo de documento"
    And ingreso <documento> en el campo "número de documento"
    And ingreso "prueba@prueba.com" en el campo "Correo electrónico"
    And doy clic en el botón "Consultar"
    Then mostrará el <estadoFacturas>

    #//Si no tiene el msj esta en letras blancas con fondo azul
    Examples: 
      | documento  | estadoFacturas                            |
      | "71770656" | "El usuario no tiene facturas pendientes" |
      | "552716"   | "listado de facturas pendientes"          |

  Scenario: Visualización de datos de servicios fijos con facturas pendientes
    Given Estoy en la página de inicio de pago de facturas "https://transaccionesco-uat.tigocloud.net/servicios/facturas"
    When doy clic en "HOGAR"
    And selecciono "CC" en el campo "Tipo de documento"
    And ingreso "552716" en el campo "número de documento"
    And ingreso "prueba@prueba.com" en el campo "Correo electrónico"
    And doy clic en el botón "Consultar"
    And doy clic en "primer Pago total"
    Then llevará al formulario con el objeto "title-detail"
    And el campo "title-detail" tiene el texto "RESUMEN DE TU TRANSACCIÓN"
    And el campo "Numero del Producto" comienza con el texto "Tu dirección: ****"
    And el campo "Fecha límite de pago" no está vacío
    And el campo "Referente de pago" no está vacío
    And el campo "Número de contrato" no está vacío
    And el campo "Valor a pagar" no está vacío
