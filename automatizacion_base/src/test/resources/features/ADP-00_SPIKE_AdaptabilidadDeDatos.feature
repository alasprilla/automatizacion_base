#Author: Henry Andrés Correa Correa
#Keywords Summary : Datos, Adaptabilidad, Movil, Hogar, Tigo
@issue:ADP-61 @CasoFeliz @Pasarela @Paquetes
Feature: SPIKE Adaptabilidad de datos
  Como automatizador de pruebas
  Quiero que mis datos esten clasificados por el criterio facturas pendientes
  Para que el robot tome el dato que necesite y no tenga errores

  Scenario Outline: Adaptabilidad tu linea tigo
    Given Estoy en la página de inicio de pago de facturas "https://transaccionesco-uat.tigocloud.net/servicios/facturas"
    When ingreso <msisdn> en el campo "Tu línea Tigo"
    And ingreso "pruebas@yopmail.com" en el campo "Correo electrónico M"
    And doy clic en el botón "Consultar M clic"
    Then clasificar el dato <msisdn> en "movil_msisdn con facturas" o en "movil_msisdn sin facturas"

    Examples: 
      | msisdn       |
      | "3043878232" |
      | "3043302450" |
      | "3004434877" |
      | "3043605513" |
      | "3003588240" |

  Scenario Outline: Adaptabilidad hogares
    Given Estoy en la página de inicio de pago de facturas "https://transaccionesco-uat.tigocloud.net/servicios/facturas"
    When doy clic en "HOGAR"
    And selecciono "CC" en el campo "Tipo de documento"
    And ingreso <documento> en el campo "número de documento"
    And ingreso "prueba@prueba.com" en el campo "Correo electrónico H"
    And doy clic en el botón "Consultar H clic"
    Then clasificar el dato <documento> en "Hogar_numDocumento con facturas" o en "Hogar_numDocumento sin facturas"

    Examples: 
      | documento    |
      | "71770656"   |
      | "70507173"   |
      | "70031392"   |
      | "1035422732" |
      | "552716"     |
