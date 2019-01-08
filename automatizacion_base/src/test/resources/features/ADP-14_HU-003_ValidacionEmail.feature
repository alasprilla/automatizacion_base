#Author: Rigoberto Henao
#Keywords Summary : Email
@issue:ADP-14 @Pasarela
Feature: HU003 Validación de Email
  Como Tigoune 
  Quiero realizar pruebas automatizadas de la consulta de facturas del servicio móvil 
  Para garantizar que la consulta se realice con un email válido

  Scenario Outline: Pasarela - Email sin usuario
    Given Estoy en la página de inicio "Pagina pago de facturas" en la url "https://transaccionesco-uat.tigocloud.net/servicios/facturas"
    When doy clic en "Movil"
    And ingreso <msisdn> en el campo "Tu línea Tigo"
    And ingreso <email> en el campo "Correo electrónico M"
    Then el campo "label error correo" tiene el texto "El correo electrónico no es correcto. Verifícalo e intenta de nuevo."
    And el campo "label error correo" tiene el atributo "color" en el valor "rojo"
    And el campo "Consultar M" tiene el atributo "disabled" en el valor "true"

    Examples: 
      | msisdn       | email             |
      | "3043302450" | "@prueba.com"     |
      | "3043302450" | "@PRUEBA.COM"     |
      | "3043302450" | "@aquí.com"       |
      | "3043302450" | "@AQUÍ.COM"       |
      | "3043302450" | "@prueba2.com.co" |
      | "3043302450" | "@PRUEBA2.COM.co" |

  Scenario Outline: Pasarela - Email sin dominio
    Given Estoy en la página de inicio "Pagina pago de facturas" en la url "https://transaccionesco-uat.tigocloud.net/servicios/facturas"
    When doy clic en "Movil"
    And ingreso <msisdn> en el campo "Tu línea Tigo"
    And ingreso <email> en el campo "Correo electrónico M"
    Then el campo "label error correo" tiene el texto "El correo electrónico no es correcto. Verifícalo e intenta de nuevo."
    And el campo "label error correo" tiene el atributo "color" en el valor "rojo"
    And el campo "Consultar M" tiene el atributo "disabled" en el valor "true"

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

  Scenario Outline: Pasarela - Email con dominio invalido
    Given Estoy en la página de inicio "Pagina pago de facturas" en la url "https://transaccionesco-uat.tigocloud.net/servicios/facturas"
    When doy clic en "Movil"
    And ingreso <msisdn> en el campo "Tu línea Tigo"
    And ingreso <email> en el campo "Correo electrónico M"
    Then el campo "label error correo" tiene el texto "El correo electrónico no es correcto. Verifícalo e intenta de nuevo."
    And el campo "label error correo" tiene el atributo "color" en el valor "rojo"
    And el campo "Consultar M" tiene el atributo "disabled" en el valor "true"

    Examples: 
      | msisdn       | email                   |
      | "3043302450" | "ejemplo@dominio.a"     |
      | "3043302450" | "ejemplo@dominio.com.a" |
      | "3043302450" | "ejemplo@d.a"           |
      | "3043302450" | "ejemplo@d.com.a"       |

  Scenario Outline: Pasarela - Email terminado en punto (.)
    Given Estoy en la página de inicio "Pagina pago de facturas" en la url "https://transaccionesco-uat.tigocloud.net/servicios/facturas"
    When doy clic en "Movil"
    And ingreso <msisdn> en el campo "Tu línea Tigo"
    And ingreso <email> en el campo "Correo electrónico M"
    Then el campo "label error correo" tiene el texto "El correo electrónico no es correcto. Verifícalo e intenta de nuevo."
    And el campo "label error correo" tiene el atributo "color" en el valor "rojo"
    And el campo "Consultar M" tiene el atributo "disabled" en el valor "true"

    Examples: 
      | msisdn       | email                  |
      | "3043302450" | "ejemplo."             |
      | "3043302450" | "ejemplo.@"            |
      | "3043302450" | "ejemplo@."            |
      | "3043302450" | "ejemplo@dominio."     |
      | "3043302450" | "ejemplo@dominio.com." |
      | "3043302450" | "ejemplo.@dominio."    |

  Scenario Outline: Pasarela - Email valido
    Given Estoy en la página de inicio "Pagina pago de facturas" en la url "https://transaccionesco-uat.tigocloud.net/servicios/facturas"
    When doy clic en "Movil"
    And ingreso <msisdn> en el campo "Tu línea Tigo"
    And ingreso <email> en el campo "Correo electrónico M"
    And Espero 1 segundos
    Then el campo "Consultar M" tiene el atributo "disabled" en el valor ""

    Examples: 
      | msisdn       | email                   |
      | "3043302450" | "ejemplo@ejemplo.com"   |
      | "3043302450" | "casoexitoso@ti.go"     |
      | "3043302450" | "caso_exitoso@tigo.com" |
