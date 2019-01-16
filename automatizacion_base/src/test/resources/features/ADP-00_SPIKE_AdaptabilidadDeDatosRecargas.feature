#Author: your.email@your.domain.com
#Keywords Summary :
@Pasarela

Feature: SPIKE Adaptabilidad de datos
  Como automatizador de pruebas
  Quiero que mis datos esten clasificados por el criterio lineas con saldo pendiente
  Para que el robot tome el dato que necesite y no tenga errores

  Scenario Outline: Adaptabilidad tu saldo pendiente
  	Given Estoy en la página de inicio "Pagina paquetes" en la url "https://transaccionesco-uat.tigocloud.net/servicios/paquetes?clear=true"
    When doy clic en "Recarga"
    And ingreso <msisdn> en el campo "Ingresa Tu Linea Tigo"
    And doy clic en "3mil"
    And ingreso "pruebas@pruebas.com" en el campo "Correo Electronico"
    And doy clic en "Recargar"
    Then clasificar el dato <msisdn> en "msisdn con deuda" o en "msisdn sin deuda"
    Examples: 
      | msisdn       |
      | "3008911502" |
      | "3008812932" |
      | "3003849685" |
      | "3002774442" |
      | "3043903980" |
      | "3003186648" |