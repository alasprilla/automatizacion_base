#Author: Henry Andres Correa

@Ecommerce
Feature: Prueba de Adherencia Ecommerce

    Scenario:  
    Given Estoy en la página de inicio de pago de facturas "https://transaccionesco-uat.tigocloud.net/servicios/activate?msisdn=3018927656&imsi=732111173644059"
    Then llevará al formulario con el objeto "title page-title"
    When doy clic en el campo "Correo electrónico" y escribo el email "pruebas@yopmail.com"   
    And deslizo la flecha "desliza para enviar" para seguir con el proceso
    Then llevará al formulario con el objeto "title-detail"