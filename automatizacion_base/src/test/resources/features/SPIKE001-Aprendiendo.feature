#Author: hacorrea@indracompany.com
#Keywords Summary : Aprendiendo
@issue:ADP-25

@Turorial
Feature: paga tu factura
  mas informacion de paga tu factura

  @Tigo
  Scenario: Verificacion de valor a pagar
    Given Estamos en el sitio de PagaTuFactura
    When Ingresamos el msisdn "3043302450"	
    And presionamos el boton confirmar
    And en el formulario ingresamos "pruebasTigo@yopmail.com"
    And guardo el valor a pagar
    And presiono el boton pagar factura
    Then verifico el el valor a pagar coincida
