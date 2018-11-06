#Author: Jose David Moreno 
#Keywords Summary : Registro, crédito
#Encoding: utf-8
#Language: es
@issue:ADP-67, @MiCuenta
Feature: HU002_Registro En Mi Cuenta
  Yo Como usuario de Mi Cuenta Tigo
  Quiero registrarme en Mi Cuenta
  Para gestionar mis servicios.

  Scenario: Registro en Mi Cuenta
    Given Estoy en la página de inicio de pago de facturas "https://tigoselfcareregional-uat-co.tigocloud.net"
    When doy clic en "Registrarme"
    Then llevará al formulario con el objeto "Crea Tu Cuenta"

 