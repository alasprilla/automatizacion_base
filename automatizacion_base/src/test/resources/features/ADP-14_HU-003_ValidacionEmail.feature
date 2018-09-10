#Author: Rigoberto Henao
#Keywords Summary : Email
@issue:ADP-14 @HU-003
Feature: Como Tigoune Quiero realizar pruebas automatizadas de la consulta de facturas del servicio móvil Para garantizar que la consulta se realice con un email válido

  #Parámetros: "@prueba.com", "@PRUEBA.COM", "@aquí.com", "@AQUÍ.COM"
  Scenario Outline: Email sin usuario
    Given estoy en la página de inicio de pago de facturas "https://transaccionesco-uat.tigocloud.net/servicios/facturas"
    When Cuando doy clic en el campo "Tu línea Tigo" y escribo el número celular <msisdn>
    And doy clic en el campo "Correo electrónico" y escribo el email <email>
    Then El botón "Consultar" se deshabilita y mostrará el siguiente mensaje en color rojo "El correo electrónico que ingresaste no es válido. Verifícalo e intenta de nuevo."

    Examples: 
      | msisdn     | email             |
      | 3043302450 | "@prueba.com"     |
      | 3043302450 | "@PRUEBA.COM"     |
      | 3043302450 | "@aquí.com"       |
      | 3043302450 | "@AQUÍ.COM"       |
      | 3043302450 | "@prueba2.com.co" |
      | 3043302450 | "@PRUEBA2.COM.co" |

  #Parámetros: "usuario", "usuario@", "USUARIO", "aquí", "aquí@", "AQUÍ@"
  Scenario Outline: Email sin dominio
    Given estoy en la página de inicio de pago de facturas "https://transaccionesco-uat.tigocloud.net/servicios/facturas"
    When Cuando doy clic en el campo "Tu línea Tigo" y escribo el número celular <msisdn>
    And doy clic en el campo "Correo electrónico" y escribo el email <email>
    Then El botón "Consultar" se deshabilita y mostrará el siguiente mensaje en color rojo "El correo electrónico que ingresaste no es válido. Verifícalo e intenta de nuevo."

    Examples: 
      | msisdn     | email      |
      | 3043302450 | "usuario"  |
      | 3043302450 | "usuario@" |
      | 3043302450 | "USUARIO"  |
      | 3043302450 | "aquí"     |
      | 3043302450 | "aquí@"    |
      | 3043302450 | "AQUÍ@"    |
      | 3043302450 | "AQUÍ@ti"  |
      | 3043302450 | "AQUÍ@go"  |

  #Parámetros: "ejemplo@dominio.a", "ejemplo@dominio.com.a", "ejemplo@d.a", "ejemplo@d.com.a"
  Scenario Outline: Email con dominio de primer nivel de solo un caracter
    Given estoy en la página de inicio de pago de facturas "https://transaccionesco-uat.tigocloud.net/servicios/facturas"
    When Cuando doy clic en el campo "Tu línea Tigo" y escribo el número celular <msisdn>
    And doy clic en el campo "Correo electrónico" y escribo el email <email>
    Then El botón "Consultar" se deshabilita y mostrará el siguiente mensaje en color rojo "El correo electrónico que ingresaste no es válido. Verifícalo e intenta de nuevo."

    Examples: 
      | msisdn     | email                   |
      | 3043302450 | "ejemplo@dominio.a"     |
      | 3043302450 | "ejemplo@dominio.com.a" |
      | 3043302450 | "ejemplo@d.a"           |
      | 3043302450 | "ejemplo@d.com.a"       |

  #Parámetros: "ejemplo.", "ejemplo.@", "ejemplo@.", "ejemplo@dominio.", "ejemplo@dominio.com."
  Scenario Outline: Email terminado en punto (.)
    Given estoy en la página de inicio de pago de facturas "https://transaccionesco-uat.tigocloud.net/servicios/facturas"
    When Cuando doy clic en el campo "Tu línea Tigo" y escribo el número celular <msisdn>
    And doy clic en el campo "Correo electrónico" y escribo el email <email>
    Then El botón "Consultar" se deshabilita y mostrará el siguiente mensaje en color rojo "El correo electrónico que ingresaste no es válido. Verifícalo e intenta de nuevo."

    Examples: 
      | msisdn     | email                  |
      | 3043302450 | "ejemplo."             |
      | 3043302450 | "ejemplo.@"            |
      | 3043302450 | "ejemplo@."            |
      | 3043302450 | "ejemplo@dominio."     |
      | 3043302450 | "ejemplo@dominio.com." |
      | 3043302450 | "ejemplo.@dominio."    |

  #Parámetros: "ejemplo@ejemplo.com"
  Scenario Outline: Email correcto
    Given estoy en la página de inicio de pago de facturas "https://transaccionesco-uat.tigocloud.net/servicios/facturas"
    When Cuando doy clic en el campo "Tu línea Tigo" y escribo el número celular <msisdn>
    And doy clic en el campo "Correo electrónico" y escribo el email <email>
    Then El botón "Consultar" se habilita

    Examples: 
      | msisdn     | email                   |
      | 3043302450 | "ejemplo@ejemplo.com"   |
      | 3043302450 | "casoexitoso@ti.go"     |
      | 3043302450 | "caso_exitoso@tigo.com" |
