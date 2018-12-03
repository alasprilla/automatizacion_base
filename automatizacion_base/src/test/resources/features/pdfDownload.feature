#Author: Henry Andres Correa Correa
#Keywords Summary :

Feature: pdfDownload
  
  Yo 
  Quiero 
  Para 

  Scenario: Abrir pdf
    Given Estoy en la página de inicio "Página mi cuenta tigo" en la url "https://tigoselfcareregional-uat-co.tigocloud.net"
    When abro en el navegador el archivo "License-Agreement-SetaPDF.pdf"
    And Espero 3 segundos
