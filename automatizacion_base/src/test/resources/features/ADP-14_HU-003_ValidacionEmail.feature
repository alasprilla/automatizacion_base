#Author: Rigoberto Henao
#Keywords Summary : Email
@issue:ADP-14 @HU-003
Feature: Como Tigoune Quiero realizar pruebas automatizadas de la consulta de facturas del servicio móvil Para garantizar que la consulta se realice con un email válido

  @tag2
  Scenario Outline: Title of your scenario outline
    Given I want to write a step with <name>
    When I check for the <value> in step
    Then I verify the <status> in step

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |

  #Parámetros: "@prueba.com", "@PRUEBA.COM", "@aquí.com", "@AQUÍ.COM"
  @Caso1
  Scenario Outline: Email sin usuario
    Given Dado que estoy en la página de inicio de pago de facturas <url>
    When Cuando doy clic en el campo "Tu línea Tigo"
    And scribo el número celular <msisdn>
    And doy clic en el campo "Correo electrónico"
    And escribo el email <email>
    Then El botón "Consultar" se deshabilita
    And mostrará el siguiente mensaje en color rojo <errorMsg>

    Examples: 
      | url                                                            | msisdn     | email             | errorMsg                                                                           |
      | "https://transaccionesco-uat.tigocloud.net/servicios/facturas" | 3043302450 | "@prueba.com"     | "El correo electrónico que ingresaste no es válido. Verifícalo e intenta de nuevo" |
      | "https://transaccionesco-uat.tigocloud.net/servicios/facturas" | 3043302450 | "@PRUEBA.COM"     | "El correo electrónico que ingresaste no es válido. Verifícalo e intenta de nuevo" |
      | "https://transaccionesco-uat.tigocloud.net/servicios/facturas" | 3043302450 | "@aquí.com"       | "El correo electrónico que ingresaste no es válido. Verifícalo e intenta de nuevo" |
      | "https://transaccionesco-uat.tigocloud.net/servicios/facturas" | 3043302450 | "@AQUÍ.COM"       | "El correo electrónico que ingresaste no es válido. Verifícalo e intenta de nuevo" |
      | "https://transaccionesco-uat.tigocloud.net/servicios/facturas" | 3043302450 | "@prueba2.com.co" | "El correo electrónico que ingresaste no es válido. Verifícalo e intenta de nuevo" |
      | "https://transaccionesco-uat.tigocloud.net/servicios/facturas" | 3043302450 | "@PRUEBA2.COM.co" | "El correo electrónico que ingresaste no es válido. Verifícalo e intenta de nuevo" |

  #Parámetros: "usuario", "usuario@", "USUARIO", "aquí", "aquí@", "AQUÍ@"
  @Caso2
  Scenario Outline: Email sin dominio
    Given Dado que estoy en la página de inicio de pago de facturas <url>
    When Cuando doy clic en el campo "Tu línea Tigo"
    And escribo el número celular <msisdn>
    And doy clic en el campo "Correo electrónico"
    And escribo el email <email>
    Then El botón "Consultar" se deshabilita
    And mostrará el siguiente mensaje en color rojo <errorMsg>

    Examples: 
      | url                                                            | msisdn     | email      | errorMsg                                                                           |
      | "https://transaccionesco-uat.tigocloud.net/servicios/facturas" | 3043302450 | "usuario"  | "El correo electrónico que ingresaste no es válido. Verifícalo e intenta de nuevo" |
      | "https://transaccionesco-uat.tigocloud.net/servicios/facturas" | 3043302450 | "usuario@" | "El correo electrónico que ingresaste no es válido. Verifícalo e intenta de nuevo" |
      | "https://transaccionesco-uat.tigocloud.net/servicios/facturas" | 3043302450 | "USUARIO"  | "El correo electrónico que ingresaste no es válido. Verifícalo e intenta de nuevo" |
      | "https://transaccionesco-uat.tigocloud.net/servicios/facturas" | 3043302450 | "aquí"     | "El correo electrónico que ingresaste no es válido. Verifícalo e intenta de nuevo" |
      | "https://transaccionesco-uat.tigocloud.net/servicios/facturas" | 3043302450 | "aquí@"    | "El correo electrónico que ingresaste no es válido. Verifícalo e intenta de nuevo" |
      | "https://transaccionesco-uat.tigocloud.net/servicios/facturas" | 3043302450 | "AQUÍ@"    | "El correo electrónico que ingresaste no es válido. Verifícalo e intenta de nuevo" |
      | "https://transaccionesco-uat.tigocloud.net/servicios/facturas" | 3043302450 | "AQUÍ@ti"  | "El correo electrónico que ingresaste no es válido. Verifícalo e intenta de nuevo" |
      | "https://transaccionesco-uat.tigocloud.net/servicios/facturas" | 3043302450 | "AQUÍ@go"  | "El correo electrónico que ingresaste no es válido. Verifícalo e intenta de nuevo" |

  #Parámetros: "ejemplo@dominio.a", "ejemplo@dominio.com.a", "ejemplo@d.a", "ejemplo@d.com.a"
  @Caso3
  Scenario Outline: Email con dominio de primer nivel de solo un caracter
    Given Dado que estoy en la página de inicio de pago de facturas <url>
    When Cuando doy clic en el campo "Tu línea Tigo"
    And escribo el número celular <msisdn>
    And doy clic en el campo "Correo electrónico"
    And escribo el email <email>
    Then El botón "Consultar" se deshabilita
    And mostrará el siguiente mensaje en color rojo <errorMsg>

    Examples: 
      | url                                                            | msisdn     | email                   | errorMsg                                                                           |
      | "https://transaccionesco-uat.tigocloud.net/servicios/facturas" | 3043302450 | "ejemplo@dominio.a"     | "El correo electrónico que ingresaste no es válido. Verifícalo e intenta de nuevo" |
      | "https://transaccionesco-uat.tigocloud.net/servicios/facturas" | 3043302450 | "ejemplo@dominio.com.a" | "El correo electrónico que ingresaste no es válido. Verifícalo e intenta de nuevo" |
      | "https://transaccionesco-uat.tigocloud.net/servicios/facturas" | 3043302450 | "ejemplo@d.a"           | "El correo electrónico que ingresaste no es válido. Verifícalo e intenta de nuevo" |
      | "https://transaccionesco-uat.tigocloud.net/servicios/facturas" | 3043302450 | "ejemplo@d.com.a"       | "El correo electrónico que ingresaste no es válido. Verifícalo e intenta de nuevo" |

  #Parámetros: "ejemplo.", "ejemplo.@", "ejemplo@.", "ejemplo@dominio.", "ejemplo@dominio.com."
  @Caso4
  Scenario Outline: Email terminado en punto (.)
    Given Dado que estoy en la página de inicio de pago de facturas <url>
    When Cuando doy clic en el campo "Tu línea Tigo"
    And escribo el número celular <msisdn>
    And doy clic en el campo "Correo electrónico"
    And escribo el email <email>
    Then El botón "Consultar" se deshabilita
    And mostrará el siguiente mensaje en color rojo <errorMsg>

    Examples: 
      | url                                                            | msisdn     | email                  | errorMsg                                                                           |
      | "https://transaccionesco-uat.tigocloud.net/servicios/facturas" | 3043302450 | "ejemplo."             | "El correo electrónico que ingresaste no es válido. Verifícalo e intenta de nuevo" |
      | "https://transaccionesco-uat.tigocloud.net/servicios/facturas" | 3043302450 | "ejemplo.@"            | "El correo electrónico que ingresaste no es válido. Verifícalo e intenta de nuevo" |
      | "https://transaccionesco-uat.tigocloud.net/servicios/facturas" | 3043302450 | "ejemplo@."            | "El correo electrónico que ingresaste no es válido. Verifícalo e intenta de nuevo" |
      | "https://transaccionesco-uat.tigocloud.net/servicios/facturas" | 3043302450 | "ejemplo@dominio."     | "El correo electrónico que ingresaste no es válido. Verifícalo e intenta de nuevo" |
      | "https://transaccionesco-uat.tigocloud.net/servicios/facturas" | 3043302450 | "ejemplo@dominio.com." | "El correo electrónico que ingresaste no es válido. Verifícalo e intenta de nuevo" |
      | "https://transaccionesco-uat.tigocloud.net/servicios/facturas" | 3043302450 | "ejemplo.@dominio."    | "El correo electrónico que ingresaste no es válido. Verifícalo e intenta de nuevo" |

  #Parámetros: "ejemplo@ejemplo.com"
  @Caso5
  Scenario Outline: Email correcto
    Given Dado que estoy en la página de inicio de pago de facturas <url>
    When Cuando doy clic en el campo "Tu línea Tigo"
    And escribo el número celular <msisdn>
    And doy clic en el campo "Correo electrónico"
    And escribo el email <email>
    Then El botón "Consultar" se habilita

    Examples: 
      | url                                                            | msisdn     | email                   |
      | "https://transaccionesco-uat.tigocloud.net/servicios/facturas" | 3043302450 | "ejemplo@ejemplo.com"   |
      | "https://transaccionesco-uat.tigocloud.net/servicios/facturas" | 3043302450 | "casoexitoso@ti.go"     |
      | "https://transaccionesco-uat.tigocloud.net/servicios/facturas" | 3043302450 | "caso_exitoso@tigo.com" |
