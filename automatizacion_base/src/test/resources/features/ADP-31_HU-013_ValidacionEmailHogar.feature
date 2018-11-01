#Author: Alexandra Lasprilla Cardona
#Keywords Summary : Email Hogar
@issue:ADP-31, @Pasarela
Feature: HU013 Validación de email Hogar
  Como Tigoune
  Quiero realizar pruebas automatizadas de la consulta de facturas del servicio fijo
  Para garantizar que la consulta se realice con un email válido

  Scenario Outline: Pasarela - Email Hogar sin usuario
    Given Estoy en la página de inicio de pago de facturas "https://transaccionesco-uat.tigocloud.net/servicios/facturas"
    When doy clic en "HOGAR"
    And selecciono "CC" en el campo "Tipo de documento"
    And ingreso <documento> en el campo "número de documento"
    And ingreso <email> en el campo "Correo electrónico H"
    Then el campo "label error correo H" tiene el texto "El correo electrónico que ingresaste no es válido. Verifícalo e intenta de nuevo."
    And el campo "label error correo H" tiene el atributo "color" en el valor "rojo"
    And el campo "Consultar H" tiene el atributo "disabled" en el valor "true"

    Examples: 
      | documento    | email             |
      | "123"        | "@prueba.com"     |
      | "101254"     | "@PRUEBA.COM"     |
      | "15859874"   | "@aquí.com"       |
      | "123453784"  | "@AQUÍ.COM"       |
      | "1088021549" | "@prueba2.com.co" |
      | "1078541256" | "@PRUEBA2.COM.co" |

  Scenario Outline: Pasarela - Email Hogar sin dominio
    Given Estoy en la página de inicio de pago de facturas "https://transaccionesco-uat.tigocloud.net/servicios/facturas"
    When doy clic en "HOGAR"
    And selecciono "CC" en el campo "Tipo de documento"
    And ingreso <documento> en el campo "número de documento"
    And ingreso <email> en el campo "Correo electrónico H"
    Then el campo "label error correo H" tiene el texto "El correo electrónico que ingresaste no es válido. Verifícalo e intenta de nuevo."
    And el campo "label error correo H" tiene el atributo "color" en el valor "rojo"
    And el campo "Consultar H" tiene el atributo "disabled" en el valor "true"

    Examples: 
      | documento    | email      |
      | "123"        | "usuario"  |
      | "101254"     | "usuario@" |
      | "15859874"   | "USUARIO"  |
      | "123453784"  | "aquí"     |
      | "1088021549" | "aquí@"    |
      | "1078541256" | "AQUÍ@"    |

  Scenario Outline: Pasarela - Email Hogar dominio invalido
    Given Estoy en la página de inicio de pago de facturas "https://transaccionesco-uat.tigocloud.net/servicios/facturas"
    When doy clic en "HOGAR"
    And selecciono "CC" en el campo "Tipo de documento"
    And ingreso <documento> en el campo "número de documento"
    And ingreso <email> en el campo "Correo electrónico H"
    Then el campo "label error correo H" tiene el texto "El correo electrónico que ingresaste no es válido. Verifícalo e intenta de nuevo."
    And el campo "label error correo H" tiene el atributo "color" en el valor "rojo"
    And el campo "Consultar H" tiene el atributo "disabled" en el valor "true"

    Examples: 
      | documento   | email                   |
      | "123"       | "ejemplo@dominio.a"     |
      | "101254"    | "ejemplo@dominio.com.a" |
      | "15859874"  | "ejemplo@d.a"           |
      | "123453784" | "ejemplo@d.com.a"       |

  Scenario Outline: Pasarela - Email Hogar terminado en punto (.)
    Given Estoy en la página de inicio de pago de facturas "https://transaccionesco-uat.tigocloud.net/servicios/facturas"
    When doy clic en "HOGAR"
    And selecciono "CC" en el campo "Tipo de documento"
    And ingreso <documento> en el campo "número de documento"
    And ingreso <email> en el campo "Correo electrónico H"
    Then el campo "label error correo H" tiene el texto "El correo electrónico que ingresaste no es válido. Verifícalo e intenta de nuevo."
    And el campo "label error correo H" tiene el atributo "color" en el valor "rojo"
    And el campo "Consultar H" tiene el atributo "disabled" en el valor "true"

    Examples: 
      | documento    | email                  |
      | "123"        | "ejemplo."             |
      | "101254"     | "ejemplo.@"            |
      | "15859874"   | "ejemplo@."            |
      | "123453784"  | "ejemplo@dominio."     |
      | "1088021549" | "ejemplo@dominio.com." |
      | "1088354125" | "ejemplo.@dominio."    |

  Scenario Outline: Pasarela - Email Hogar válido
    Given Estoy en la página de inicio de pago de facturas "https://transaccionesco-uat.tigocloud.net/servicios/facturas"
    When doy clic en "HOGAR"
    And selecciono "CC" en el campo "Tipo de documento"
    And ingreso <documento> en el campo "número de documento"
    And ingreso <email> en el campo "Correo electrónico H"
    And Espero 2 segundos
    Then El botón "ConsultarH" se habilita

    Examples: 
      | documento  | email                   |
      | "123"      | "ejemplo@ejemplo.com"   |
      | "101254"   | "casoexitoso@ti.go"     |
      | "15859874" | "caso_exitoso@tigo.com" |
