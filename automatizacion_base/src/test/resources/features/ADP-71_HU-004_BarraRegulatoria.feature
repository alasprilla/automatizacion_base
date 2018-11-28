#Author:Jose David Moreno 
#Keywords Summary :
@issue:ADP-71, @MiCuenta
Feature: HU004_Barra Regulatoria
  Y0 como usuario de mi cuenta Tigo 
  Quiero ingresar a la barra regulatoria
  Para estar informado de las PQR reportadas

  Scenario: Consulta/Radica PQR para UNE
    Given Estoy en la página de inicio de pago de facturas "https://tigoselfcareregional-uat-co.tigocloud.net"
    When doy clic en "Consulta PQR UNE"
    And voy a la pestaña "ultima"
    Then llevará al formulario con el objeto "PQR UNE"
    And cerrar pestaña

  Scenario: Consulta/Radica PQR Tigo
    Given Estoy en la página de inicio de pago de facturas "https://tigoselfcareregional-uat-co.tigocloud.net"
    When doy clic en "Consulta PQR TIGO"
    And voy a la pestaña "ultima"
    Then llevará al formulario con el objeto "PQR TIGO"
    And cerrar pestaña

  Scenario: Consulta ante la SIC
    Given Estoy en la página de inicio de pago de facturas "https://tigoselfcareregional-uat-co.tigocloud.net"
    When doy clic en "Consulta SIC"
    And voy a la pestaña "ultima"
    Then llevará al formulario con el objeto "SIC"
    And cerrar pestaña
    
  Scenario: Conoce nuestras Tiendas
    Given Estoy en la página de inicio de pago de facturas "https://tigoselfcareregional-uat-co.tigocloud.net"
    When doy clic en "Nuestras Tiendas"
    And voy a la pestaña "ultima"
    Then llevará al formulario con el objeto "tiendas"
    And cerrar pestaña
