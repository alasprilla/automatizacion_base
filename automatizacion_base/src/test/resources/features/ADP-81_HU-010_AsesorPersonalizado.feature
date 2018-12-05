#Author: Nelson Mesa
#Keywords Summary :
@issue:ADP-81 @MiCuenta
Feature: HU010_AsesorPersonalizado
  
Yo como usuario de mi cuenta Tigo 
Quiero asesoría personalizada
Para realizar consultas acerca de mis servicios

  Scenario: Mi Cuenta - Consultar mi asesor personalizado
    Given Estoy en la página de inicio "Página mi cuenta tigo" en la url "https://tigoselfcareregional-uat-co.tigocloud.net"
    When doy clic en "Ingresar"
    And ingreso "lopezanamaria1@hotmail.com" en el campo "Correo Mi Cuenta"
    And doy clic en "Validar"
    And ingreso "pruebas2018" en el campo "Contrasena"
    And doy clic en "Continuar Mi Cuenta"
    And doy clic en "Seleccion MSISDN" si es visible
    And Espero 1 segundos
    And doy clic en "No Linea Hibrido Ana" si es visible
    And doy clic en "Seleccion MSISDN" si es visible
    And Espero 1 segundos
    And doy clic en "Linea Hibrido Ana" si es visible
    And doy clic en "Resumen" si es visible
    And doy clic en "Consultar a mi asesor"
    And voy a la pestaña "ultima"
    And lo llevará a la página "https://ayuda.tigoune.co/hc/es/requests/new?ticket_form_id=360000251614"
    And cerrar pestaña
    

  