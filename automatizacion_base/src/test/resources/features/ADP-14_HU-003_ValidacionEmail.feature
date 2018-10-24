#Author: Rigoberto Henao
#Keywords Summary : Email
@issue:ADP-14
Feature: HU003: Validación de email
  Como Tigoune 
  Quiero realizar pruebas automatizadas de la consulta de facturas del servicio móvil 
  Para garantizar que la consulta se realice con un email válido

  Scenario Outline: Email sin usuario
    Given Estoy en la página de inicio de pago de facturas "https://transaccionesco-uat.tigocloud.net/servicios/facturas"
    When ingreso <msisdn> en el campo "Tu línea Tigo"
    And ingreso <email> en el campo "Correo electrónico M"
    Then el botón "ConsultarM" esta "deshabilitado"
    And el campo "label error correo" tiene el texto "El correo electrónico que ingresaste no es válido. Verifícalo e intenta de nuevo."
    And el campo "label error correo" tiene el atributo "color" en el valor "rojo"

    Examples: 
      | msisdn       | email             |
      | "3043302450" | "@prueba.com"     |
      | "3043302450" | "@PRUEBA.COM"     |
      | "3043302450" | "@aquí.com"       |
      | "3043302450" | "@AQUÍ.COM"       |
      | "3043302450" | "@prueba2.com.co" |
      | "3043302450" | "@PRUEBA2.COM.co" |

  Scenario Outline: Email sin dominio
    Given Estoy en la página de inicio de pago de facturas "https://transaccionesco-uat.tigocloud.net/servicios/facturas"
    When ingreso <msisdn> en el campo "Tu línea Tigo"
    And ingreso <email> en el campo "Correo electrónico M"
    Then el botón "ConsultarM" esta "deshabilitado"
    And el campo "label error correo" tiene el texto "El correo electrónico que ingresaste no es válido. Verifícalo e intenta de nuevo."
    And el campo "label error correo" tiene el atributo "color" en el valor "rojo"

    Examples: 
      | msisdn       | email      |
      | "3043302450" | "usuario"  |
      | "3043302450" | "usuario@" |
      | "3043302450" | "USUARIO"  |
      | "3043302450" | "aquí"     |
      | "3043302450" | "aquí@"    |
      | "3043302450" | "AQUÍ@"    |
      | "3043302450" | "AQUÍ@ti"  |
      | "3043302450" | "AQUÍ@go"  |

  Scenario Outline: Email con dominio de primer nivel de solo un caracter
    Given Estoy en la página de inicio de pago de facturas "https://transaccionesco-uat.tigocloud.net/servicios/facturas"
    When ingreso <msisdn> en el campo "Tu línea Tigo"
    And ingreso <email> en el campo "Correo electrónico M"
    Then el botón "ConsultarM" esta "deshabilitado"
    And el campo "label error correo" tiene el texto "El correo electrónico que ingresaste no es válido. Verifícalo e intenta de nuevo."
    And el campo "label error correo" tiene el atributo "color" en el valor "rojo"

    Examples: 
      | msisdn       | email                   |
      | "3043302450" | "ejemplo@dominio.a"     |
      | "3043302450" | "ejemplo@dominio.com.a" |
      | "3043302450" | "ejemplo@d.a"           |
      | "3043302450" | "ejemplo@d.com.a"       |

  Scenario Outline: Email terminado en punto (.)
    Given Estoy en la página de inicio de pago de facturas "https://transaccionesco-uat.tigocloud.net/servicios/facturas"
    When ingreso <msisdn> en el campo "Tu línea Tigo"
    And ingreso <email> en el campo "Correo electrónico M"
    Then el botón "ConsultarM" esta "deshabilitado"
    And el campo "label error correo" tiene el texto "El correo electrónico que ingresaste no es válido. Verifícalo e intenta de nuevo."
    And el campo "label error correo" tiene el atributo "color" en el valor "rojo"

    Examples: 
      | msisdn       | email                  |
      | "3043302450" | "ejemplo."             |
      | "3043302450" | "ejemplo.@"            |
      | "3043302450" | "ejemplo@."            |
      | "3043302450" | "ejemplo@dominio."     |
      | "3043302450" | "ejemplo@dominio.com." |
      | "3043302450" | "ejemplo.@dominio."    |

  @CasoFeliz
  Scenario Outline: Email correcto
    Given Estoy en la página de inicio de pago de facturas "https://transaccionesco-uat.tigocloud.net/servicios/facturas"
    When ingreso <msisdn> en el campo "Tu línea Tigo"
    And ingreso <email> en el campo "Correo electrónico M"
    Then el campo "ConsultarM" tiene el atributo "class" en el valor "--active"

    Examples: 
      | msisdn       | email                   |
      | "3043302450" | "ejemplo@ejemplo.com"   |
      | "3043302450" | "casoexitoso@ti.go"     |
      | "3043302450" | "caso_exitoso@tigo.com" |
