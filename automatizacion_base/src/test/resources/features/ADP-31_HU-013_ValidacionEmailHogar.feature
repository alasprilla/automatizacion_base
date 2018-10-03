#Author: Alexandra Lasprilla Cardona
#Keywords Summary : Email Hogar
@issue:ADP-31
Feature: HU013: Validación de email Hogar
	Como Tigoune
	Quiero realizar pruebas automatizadas de la consulta de facturas del servicio fijo
	Para garantizar que la consulta se realice con un email válido

  #Parámetros: "@prueba.com", "@PRUEBA.COM", "@aquí.com", "@AQUÍ.COM"
  Scenario Outline: Email sin usuario
    Given Estoy en la página de inicio de pago de facturas "https://transaccionesco-uat.tigocloud.net/servicios/facturas"
    When doy clic en "HOGAR"
     And selecciono "CC" en el campo "Tipo de documento"
     And ingreso <documento> en el campo "número de documento"
     And doy clic en el campo "Correo electrónico" y escribo el email <email>
    Then el botón "Consultar" esta "deshabilitado"
     And el campo "label error correo H" tiene el texto "El correo electrónico que ingresaste no es válido. Verifícalo e intenta de nuevo."
     And el campo "label error correo H" tiene el atributo "color" en el valor "rojo"

    Examples: 
      | documento    | email             |
      | "123"        | "@prueba.com"     |
      | "101254"     | "@PRUEBA.COM"     |
      | "15859874"   | "@aquí.com"       |
      | "123453784"  | "@AQUÍ.COM"       |
      | "1088021549" | "@prueba2.com.co" |
      | "1078541256" | "@PRUEBA2.COM.co" |

  #Parámetros: "usuario", "usuario@", "USUARIO", "aquí", "aquí@", "AQUÍ@"
  Scenario Outline: Email sin dominio
    Given Estoy en la página de inicio de pago de facturas "https://transaccionesco-uat.tigocloud.net/servicios/facturas"
     When doy clic en "HOGAR"
     And selecciono "CC" en el campo "Tipo de documento"
     And ingreso <documento> en el campo "número de documento"
    And doy clic en el campo "Correo electrónico" y escribo el email <email>
    Then el botón "Consultar" esta "deshabilitado"
    And el campo "label error correo H" tiene el texto "El correo electrónico que ingresaste no es válido. Verifícalo e intenta de nuevo."
    And el campo "label error correo H" tiene el atributo "color" en el valor "rojo"

    Examples: 
      | documento    | email       |
      | "123"        | "usuario"   |
      | "101254"     | "usuario@"  |
      | "15859874"   | "USUARIO"   |
      | "123453784"  | "aquí"      |
      | "1088021549" |"aquí@"      |
      | "1078541256" | "AQUÍ@"     |             
							       
     


  