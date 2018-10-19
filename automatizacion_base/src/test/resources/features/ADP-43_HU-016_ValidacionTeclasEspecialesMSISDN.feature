#Author: Alexandra Lasprilla
#Keywords Summary : MSISDN
@issue:ADP-43
Feature: HU16_ValidacionTeclasEspecialesMSISND
  Como Tigoune
	Quiero realizar pruebas automatizadas sobre el campo "Número Celular" en el formulario de paquetes y recargas
  Para garantizar que se pueden utilizar las teclas especiales sobre dicho campo
  
  
  Scenario: Recarga de página con F5
    Given Estoy en la página de inicio de compra paquetes y recargas "https://transaccionesco-uat.tigocloud.net/servicios/paquetes?he=1"
    When Doy clic en "Recarga"
    When Doy clic en "Ingresa tu línea Tigo"
    And  presiono la tecla "F5"
    Then la página se recarga

  