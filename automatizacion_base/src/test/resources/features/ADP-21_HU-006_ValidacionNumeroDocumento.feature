#Author: Alexandra Lasprilla Cardona
#Keywords Summary : Validacion Documento
@issue:ADP-21, @Pasarela
Feature: HU006 Validación número documento
  Como Tigoune
  Quiero realizar pruebas automatizadas de la consulta de facturas del servicio fijo
  Para garantizar que se pueden utilizar las teclas especiales básicas en el formulario de consulta de facturas

  Scenario: Pasarela - Recarga de página hogares con F5
    Given Estoy en la página de inicio de pago de facturas "https://transaccionesco-uat.tigocloud.net/servicios/facturas"
    When doy clic en "HOGAR"
    And selecciono "CC" en el campo "Tipo de documento"
    And Presiono la tecla "F5"
    Then La página se recarga

  Scenario Outline: Pasarela - Validación teclas especiales campo "número de documento"
    Given Estoy en la página de inicio de pago de facturas "https://transaccionesco-uat.tigocloud.net/servicios/facturas"
    When doy clic en "HOGAR"
    And selecciono "CC" en el campo "Tipo de documento"
    And ingreso <documento> en el campo "número de documento"
    And Presiono la tecla <tecla1>
    And Presiono la tecla <tecla2>
    And Presiono la tecla <tecla3>
    Then mostrará en el valor del campo "número de documento" el texto <resultado>

    Examples: 
      | documento   | tecla1   | tecla2             | tecla3      | resultado  |
      | "123"       | "inicio" | "flecha derecha"   | "backspace" | "23"       |
      | "101254"    | "inicio" | "flecha derecha"   | "backspace" | "01254"    |
      | "15859874"  | "inicio" | "flecha derecha"   | "backspace" | "5859874"  |
      | "123453784" | "inicio" | "flecha derecha"   | "backspace" | "23453784" |
      | "123"       | "inicio" | "suprimir"         | ""          | "23"       |
      | "101254"    | "inicio" | "suprimir"         | ""          | "01254"    |
      | "15859874"  | "inicio" | "suprimir"         | ""          | "5859874"  |
      | "123453784" | "inicio" | "suprimir"         | ""          | "23453784" |
      | "123"       | "fin"    | "backspace"        | ""          | "12"       |
      | "101254"    | "fin"    | "backspace"        | ""          | "10125"    |
      | "15859874"  | "fin"    | "backspace"        | ""          | "1585987"  |
      | "123453784" | "fin"    | "backspace"        | ""          | "12345378" |
      | "123"       | "fin"    | "flecha izquierda" | "suprimir"  | "12"       |
      | "101254"    | "fin"    | "flecha izquierda" | "suprimir"  | "10125"    |
      | "15859874"  | "fin"    | "flecha izquierda" | "suprimir"  | "1585987"  |
      | "123453784" | "fin"    | "flecha izquierda" | "suprimir"  | "12345378" |
