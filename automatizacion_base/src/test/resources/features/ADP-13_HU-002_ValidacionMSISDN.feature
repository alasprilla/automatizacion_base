#Author: Rigoberto Henao
#Keywords Summary : MSISDN
@issue:ADP-13 @Pasarela
Feature: HU002 Validación Teclas Especiales MSISDN
  Como Tigoune
  Quiero realizar pruebas automatizadas de la consulta de facturas del servicio móvil
  Para garantizar que se pueden utilizar las teclas especiales básicas en el formulario de consulta de facturas

  Scenario: Pasarela - Recarga de página tu línea tigo con F5
    Given Estoy en la página de inicio "Pagina pago de facturas" en la url "https://transaccionesco-uat.tigocloud.net/servicios/facturas"
    When doy clic en "Movil" 
    And doy clic en "Tu línea Tigo"
    And Presiono la tecla "F5"
    Then La página se recarga

  Scenario Outline: Pasarela - Validación teclas especiales campo "Tu línea Tigo"
    Given Estoy en la página de inicio "Pagina pago de facturas" en la url "https://transaccionesco-uat.tigocloud.net/servicios/facturas"
    When doy clic en "Movil"
    And ingreso <msisdn> en el campo "Tu línea Tigo"
    And Presiono la tecla <tecla1>
    And Presiono la tecla <tecla2>
    And Presiono la tecla <tecla3>
    Then mostrará en el valor del campo "Tu línea Tigo" el texto <resultado>

    Examples: 
      | msisdn      | tecla1   | tecla2             | tecla3      | resultado       |
      | "300"       | "inicio" | "flecha derecha"   | "backspace" | "(300"         |
      | "301200"    | "inicio" | "flecha derecha"   | "backspace" | "(301) 200"     |
      | "30159874"  | "inicio" | "flecha derecha"   | "backspace" | "(301) 598-74"  |
      | "301623784" | "inicio" | "flecha derecha"   | "backspace" | "(301) 623-784" |
      | "300"       | "inicio" | "suprimir"         | ""          | "(300"         |
      | "301200"    | "inicio" | "suprimir"         | ""          | "(301) 200"     |
      | "30159874"  | "inicio" | "suprimir"         | ""          | "(301) 598-74"  |
      | "301623784" | "inicio" | "suprimir"         | ""          | "(301) 623-784" |
      | "300"       | "fin"    | "backspace"        | ""          | "(30"           |
      | "301200"    | "fin"    | "backspace"        | ""          | "(301) 20"      |
      | "30159874"  | "fin"    | "backspace"        | ""          | "(301) 598-7"   |
      | "301623784" | "fin"    | "backspace"        | ""          | "(301) 623-78"  |
      | "300"       | "fin"    | "flecha izquierda" | "suprimir"  | "(30"           |
      | "301200"    | "fin"    | "flecha izquierda" | "suprimir"  | "(301) 20"      |
      | "30159874"  | "fin"    | "flecha izquierda" | "suprimir"  | "(301) 598-7"   |
      | "301623784" | "fin"    | "flecha izquierda" | "suprimir"  | "(301) 623-78"  |
