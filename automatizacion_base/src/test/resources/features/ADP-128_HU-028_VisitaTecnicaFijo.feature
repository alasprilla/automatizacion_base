#Author: Alexandra Lasprilla
#Keywords Summary :
@issue:ADP-128 @MiCuenta
Feature: HU028 Visita Tecnica Fijo
  
  Yo como usuario de mi cuenta Tigo      #Pendiente 
  Quiero tener soporte de mis equipos
  Para resolver las fallas presentadas

  Background: Borrar Datos de Navegacion
    And se borran cookies del navegador

  Scenario: Centro de ayuda            #Pendiente
    Given Estoy en la página de inicio "Página mi cuenta tigo" en la url "https://tigoselfcareregional-uat-co.tigocloud.net"
    When doy clic en "Ingresar"
    And ingreso "automatizacionmicuenta@gmail.com" en el campo "Correo Mi Cuenta"
    And doy clic en "Validar"
    And doy clic en "siguiente"
    And ingreso "Colombia2019" en el campo "Contrasena Gmail"
    And doy clic en "Siguiente C"
    And Espero 1 segundos
    And doy clic en "Seleccion MSISDN" si es visible
    And Espero 1 segundos
    And doy clic en "No linea Fija" si es visible
    And doy clic en "Seleccion MSISDN" si es visible
    And Espero 1 segundos
    And doy clic en "Linea Fija" si es visible
    And doy clic en "Visita Técnica" si es visible
    And doy clic en "Centro de Ayuda Fijo"
    And voy a la pestaña "ultima"
    And lo llevará a la página "https://ayuda.tigoune.co/hc/es/articles/115015747568-"
    And cerrar pestaña

  #Scenario: Chat en linea           #Pendiente
    #Given Estoy en la página de inicio "Página mi cuenta tigo" en la url "https://tigoselfcareregional-uat-co.tigocloud.net"
    #When doy clic en "Ingresar"
    #And ingreso "automatizacionmicuenta@gmail.com" en el campo "Correo Mi Cuenta"
    #And doy clic en "Validar"
    #And doy clic en "siguiente"
    #And ingreso "Colombia2019" en el campo "Contrasena Gmail"
    #And doy clic en "Siguiente C"
    #And Espero 1 segundos
    #And doy clic en "Seleccion MSISDN" si es visible
    #And Espero 1 segundos
    #And doy clic en "No linea Fija" si es visible
    #And doy clic en "Seleccion MSISDN" si es visible
    #And Espero 1 segundos
    #And doy clic en "Linea Fija" si es visible
    #And doy clic en "Visita Técnica" si es visible
    #And doy clic en "Chat en linea"
   #Then llevará al formulario con el objeto "Chat Online"