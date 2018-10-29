#Author: Henry Andres Correa
#Keywords Summary :
@issue:ADP-51
Feature: Prueba de Adherencia Ecommerce
   
    #Scenario:  Pagina de arrastrar y soltar
    #Given Estoy en la página de inicio de pago de facturas "http://crossbrowsertesting.github.io/drag-and-drop.html"
    #When arrastro el elemento "draggable" hasta el elemento "dropable"  
    #When Espero 3 segundos 
    #
    #Scenario:  pagina de llevar a la posicion
    #Given Estoy en la página de inicio de pago de facturas "http://crossbrowsertesting.github.io/drag-and-drop.html"
    #When arrastro el elemento "draggable" hasta la posición "100,100"  
    #When Espero 3 segundos
    #
    #Scenario:  Pagina del balon 
    #Given Estoy en la página de inicio de pago de facturas "https://javascript.info/article/mouse-drag-and-drop/ball4/"
    #When arrastro el elemento "balón" hasta la posición "-75,-100"  
    #When Espero 3 segundos
        #
    @Ecommerce
    Scenario: Demostración de ecommerce
    Given Estoy en la página de inicio de pago de facturas "https://transaccionesco-uat.tigocloud.net/servicios/activate?msisdn=3018927656&imsi=732111173644059"
    When Espero 3 segundos
    When llevará al formulario con el objeto "title page-title"
    And ingreso "nhmesa@indracompany.com" en el campo "Correo electrónico M"
    When arrastro el elemento "draggable" hasta la posición "400,0"     
    When Espero 2 segundos
    Then llevará al formulario con el objeto "title page-title" 
    And el campo "title page-title" tiene el texto "Activa tu SIM en 1 paso"
   
    