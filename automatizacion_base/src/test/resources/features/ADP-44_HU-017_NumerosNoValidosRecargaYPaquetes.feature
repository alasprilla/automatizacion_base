#Author: Alexandra Lasprilla Cardona
#Keywords Summary :
@issue:ADP-44
Feature: HU017 Validación número Invalido Celular en Recargas y Paquetes
  
  Como Tigoune
  Quiero realizar pruebas automatizadas sobre el campo "Número Celular" en el formulario de paquetes y recargas
  Para garantizar que solo permita ingresar número válidos

  
  #  Scenario Outline: Ingreso de texto en el campo "Ingresa tu línea Tigo"
  #  Given Estoy en la página de inicio de compra paquetes y recargas "https://transaccionesco-uat.tigocloud.net/servicios/paquetes?clear=true"
  #  When Doy clic en "Recarga"
  #  When Ingreso <letras> en el campo "Ingresa tu línea Tigo"
  #  And El campo "Ingresa tu línea Tigo" tiene el texto ""
 
   # Examples: 
   #   | letras    |
   #   | "abcdef"  |
   #   | "tigoUne" |
      
    Scenario Outline: Ingreso de números de más de 10 dígitos
    Given Estoy en la página de inicio de compra paquetes y recargas "https://transaccionesco-uat.tigocloud.net/servicios/paquetes?clear=true"
    When Doy clic en "Recarga"
    When Ingreso <msisdn> en el campo "Ingresa tu línea Tigo"
    Then Mostrará en el valor del campo "Ingresa tu línea Tigo" el texto <resultado>

    Examples: 
      | msisdn           | resultado    |
      | "31234567890123" | "3123456789" |
      | "36587589658749" | "3658758965" |
  