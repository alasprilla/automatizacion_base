#Author: Rigoberto Henao
#Keywords Summary : MSISDN
@issue:ADP-13
Feature: HU002_ValidacionMSISDN
  Como Tigoune
  Quiero realizar pruebas automatizadas de la consulta de facturas del servicio móvil
  Para garantizar que se pueden utilizar las teclas especiales básicas en el formulario de consulta de facturas

  Scenario: Recarga de página tu línea tigo con F5
    Given Estoy en la página de inicio de pago de facturas "https://transaccionesco-uat.tigocloud.net/servicios/facturas"
    When doy clic en "Tu línea Tigo"
    And Presiono la tecla "F5"
    Then La página se recarga

  Scenario Outline: Validación teclas especiales campo "Tu línea Tigo"
    Given Estoy en la página de inicio de pago de facturas "https://transaccionesco-uat.tigocloud.net/servicios/facturas"
    When ingreso <msisdn> en el campo "Tu línea Tigo"
    And Presiono la tecla <tecla1>
    And Presiono la tecla <tecla2>
    And Presiono la tecla <tecla3>
    Then mostrará en el valor del campo "Tu línea Tigo" el texto <resultado>

    Examples: 
      | msisdn      | tecla1             | tecla2           | tecla3      | resultado  |
      | "300"       | "inicio"           | "flecha derecha" | "backspace" | "00"       |
      | "301200"    | "inicio"           | "flecha derecha" | "backspace" | "01200"    |
      | "30159874"  | "inicio"           | "flecha derecha" | "backspace" | "0159874"  |
      | "301623784" | "inicio"           | "flecha derecha" | "backspace" | "01623784" |
      | "300"       | "inicio"           | "suprimir"       | ""          | "00"       |
      | "301200"    | "inicio"           | "suprimir"       | ""          | "01200"    |
      | "30159874"  | "inicio"           | "suprimir"       | ""          | "0159874"  |
      | "301623784" | "inicio"           | "suprimir"       | ""          | "01623784" |
      | "300"       | "backspace"        | ""               | ""          | "30"       |
      | "301200"    | "backspace"        | ""               | ""          | "30120"    |
      | "30159874"  | "backspace"        | ""               | ""          | "3015987"  |
      | "301623784" | "backspace"        | ""               | ""          | "30162378" |
      | "300"       | "flecha izquierda" | "suprimir"       | ""          | "30"       |
      | "301200"    | "flecha izquierda" | "suprimir"       | ""          | "30120"    |
      | "30159874"  | "flecha izquierda" | "suprimir"       | ""          | "3015987"  |
      | "301623784" | "flecha izquierda" | "suprimir"       | ""          | "30162378" |
