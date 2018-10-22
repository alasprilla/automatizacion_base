#Author: Alexandra Lasprilla
#Keywords Summary : MSISDN
@issue:ADP-43
Feature: HU16_ValidacionTeclasEspecialesMSISND
  Como Tigoune
  Quiero realizar pruebas automatizadas sobre el campo "Número Celular" en el formulario de paquetes y recargas
  Para garantizar que se pueden utilizar las teclas especiales sobre dicho campo

  Scenario: Recarga de página con F5
    Given Estoy en la página de inicio de compra paquetes y recargas "https://transaccionesco-uat.tigocloud.net/servicios/paquetes?clear=true"
    When Doy clic en "Recarga"
    When Doy clic en "Ingresa tu línea Tigo"
    And presiono la tecla "F5"
    Then la página se recarga

  Scenario Outline: Borrar caracteres con backspace en el campo "Tu línea Tigo"
    Given Estoy en la página de inicio de compra paquetes y recargas "https://transaccionesco-uat.tigocloud.net/servicios/paquetes?clear=true"
    When Doy clic en "Recarga"
    When Ingreso <msisdn> en el campo "Ingresa tu línea Tigo"
    And presiono la tecla "backspace"
    Then el último caracter se borra

    Examples: 
      | msisdn      |
      | "300"       |
      | "301200"    |
      | "30159874"  |
      | "301623784" |

  Scenario Outline: Borrar caracteres con suprimir en el campo "Tu línea Tigo"
    Given Estoy en la página de inicio de compra paquetes y recargas "https://transaccionesco-uat.tigocloud.net/servicios/paquetes?clear=true"
    When Doy clic en "Recarga"
    When Ingreso <msisdn> en el campo "Ingresa tu línea Tigo"
    And presiono la tecla "inicio"
    And presiono la tecla "suprimir"
    Then el primer caracter se borra

    Examples: 
      | msisdn      |
      | "300"       |
      | "301200"    |
      | "30159874"  |
      | "301623784" |

  Scenario Outline: Desplazarse con flecha a la izquierda en el campo "Tu línea Tigo"
    Given Estoy en la página de inicio de compra paquetes y recargas "https://transaccionesco-uat.tigocloud.net/servicios/paquetes?clear=true"
    When Doy clic en "Recarga"
    When Ingreso <msisdn> en el campo "Ingresa tu línea Tigo"
    And presiono la tecla "flecha izquierda"
    And presiono la tecla "suprimir"
    Then el último caracter se borra

    Examples: 
      | msisdn      |
      | "300"       |
      | "301200"    |
      | "30159874"  |
      | "301623784" |

  Scenario Outline: Desplazarse con flecha a la derecha en el campo "Tu línea Tigo"
    Given Estoy en la página de inicio de compra paquetes y recargas "https://transaccionesco-uat.tigocloud.net/servicios/paquetes?clear=true"
    When Doy clic en "Recarga"
    When Ingreso <msisdn> en el campo "Ingresa tu línea Tigo"
    And presiono la tecla "inicio"
    And presiono la tecla "flecha derecha"
    And presiono la tecla "backspace"
    Then el primer caracter se borra

    Examples: 
      | msisdn      |
      | "300"       |
      | "301200"    |
      | "30159874"  |
      | "301623784" |
