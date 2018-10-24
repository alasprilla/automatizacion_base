#Author: Alexandra Lasprilla
#Keywords Summary : MSISDN
@issue:ADP-43
Feature: HU16_ValidacionTeclasEspecialesMSISND
  Como Tigoune
  Quiero realizar pruebas automatizadas sobre el campo "Número Celular" en el formulario de paquetes y recargas
  Para garantizar que se pueden utilizar las teclas especiales sobre dicho campo

  Scenario: Recarga de página con F5
    Given Estoy en la página de inicio de pago de facturas "https://transaccionesco-uat.tigocloud.net/servicios/paquetes?clear=true"
    When doy clic en "Recarga"
    And doy clic en "Ingresa tu línea Tigo"
    And Presiono la tecla "F5"
    Then La página se recarga

  Scenario Outline: Borrar caracteres con backspace en el campo "Tu línea Tigo"
    Given Estoy en la página de inicio de pago de facturas "https://transaccionesco-uat.tigocloud.net/servicios/paquetes?clear=true"
    When doy clic en "Recarga"
    And ingreso <msisdn> en el campo "Ingresa tu línea Tigo"
    And Presiono la tecla <tecla1>
    And Presiono la tecla <tecla2>
    And Presiono la tecla <tecla3>
    Then mostrará en el valor del campo "Ingresa tu línea Tigo" el texto <resultado>

    Examples: 
      | msisdn      | tecla1             | tecla2           | tecla3      | resultado      |
      | "300"       | "inicio"           | "flecha derecha" | "backspace" | "(00"          |
      | "301200"    | "inicio"           | "flecha derecha" | "backspace" | "(012) 00"     |
      | "30159874"  | "inicio"           | "flecha derecha" | "backspace" | "(015) 987-4"  |
      | "301623784" | "inicio"           | "flecha derecha" | "backspace" | "(016) 237-84" |
      | "300"       | "inicio"           | "suprimir"       | ""          | "(00"          |
      | "301200"    | "inicio"           | "suprimir"       | ""          | "(012) 00"     |
      | "30159874"  | "inicio"           | "suprimir"       | ""          | "(015) 987-4"  |
      | "301623784" | "inicio"           | "suprimir"       | ""          | "(016) 237-84" |
      | "300"       | "backspace"        | ""               | ""          | "(30"          |
      | "301200"    | "backspace"        | ""               | ""          | "(301) 20"     |
      | "30159874"  | "backspace"        | ""               | ""          | "(301) 598-7"  |
      | "301623784" | "backspace"        | ""               | ""          | "(301) 623-78" |
      | "300"       | "flecha izquierda" | "suprimir"       | ""          | "(30"          |
      | "301200"    | "flecha izquierda" | "suprimir"       | ""          | "(301) 20"     |
      | "30159874"  | "flecha izquierda" | "suprimir"       | ""          | "(301) 598-7"  |
      | "301623784" | "flecha izquierda" | "suprimir"       | ""          | "(301) 623-78" |
