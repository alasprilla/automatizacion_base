#Author: Alexandra Lasprilla Cardona
#Keywords Summary :
@issue:ADP-54
Feature: Ecommerce

  Scenario:  
    Given Estoy en la página de inicio de activa tu sim "https://transaccionesco-uat.tigocloud.net/servicios/activate?msisdn=3018927656&imsi=732111173644059"
    Then llevará al formulario con el objeto "title page-title"
    When doy clic en "Correo electronico" y escribo el email "nhmesa@indracompany.com"
    And deslizo la flecha "desliza para enviar" para seguir con el proceso
    Then llevará al formulario con el objeto "title-detail"