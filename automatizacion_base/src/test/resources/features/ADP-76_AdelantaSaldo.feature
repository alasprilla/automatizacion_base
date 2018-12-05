#Author: Karen Perez
#Keywords Summary :
@issue:ADP-76 @Recargas
Feature: Adelanta Saldo
  
  Como Tigoune
  Quiero realizar pruebas automatizadas sobre adelantar saldo en el formulario de recargas
  Para garantizar que permita realizar el proceso de transacción de Adelanta Saldo

  Scenario: Recargas - Visualización de opción adelanta saldo como medio de pago
    Given Estoy en la página de inicio de pago de facturas "https://transaccionesco-uat.tigocloud.net/servicios/paquetes?he=1"
    When doy clic en "Recarga"
    When ingreso "3002774442" en el campo "Ingresa tu línea Tigo"
    And ingreso "pruebas@yopmail.com" en el campo "Correo electrónico M"
    And doy clic en el botón "Recargar"
    Then llevará al formulario con el objeto "Titulo Detalle"
    And doy clic en "Adelanta Saldo"