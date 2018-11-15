#Author:Jose David Moreno 
#Keywords Summary :
@issue:ADP-71, @MiCuenta
Feature: HU005_Barra Regulatoria
  Y0 como usuario de mi cuenta Tigo 
  Quiero ingresar a la barra regulatoria
  Para estar informado de las PQR reportadas

  Scenario: Consulta/Radica PQR para UNE
    Given Estoy en la página de inicio de pago de facturas "https://tigoselfcareregional-uat-co.tigocloud.net"
    When doy clic en "Consulta PQR UNE"
    Then llevará al formulario con el objeto "PQR UNE"

  Scenario: Consulta/Radica PQR Tigo
    Given Estoy en la página de inicio de pago de facturas "https://tigoselfcareregional-uat-co.tigocloud.net"
    When doy clic en "Consulta PQR TIGO"
    Then llevará al formulario con el objeto "PQR TIGO"

  Scenario: Consulta ante la SIC
    Given Estoy en la página de inicio de pago de facturas "https://tigoselfcareregional-uat-co.tigocloud.net"
    When doy clic en "Consulta SIC"
    Then llevará al formulario con el objeto "SIC"
    
  Scenario: Conoce nuestras Tiendas
    Given Estoy en la página de inicio de pago de facturas "https://tigoselfcareregional-uat-co.tigocloud.net"
    When doy clic en "Nuestras Tiendas"
    Then llevará al formulario con el objeto "tiendas"
