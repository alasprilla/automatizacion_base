#Author: Alexandra Lasprilla
#Keywords Summary :
@issue:ADP-128 @MiCuenta
Feature: HU028 Visita Tecnica Fijo
  
  Yo como usuario de mi cuenta Tigo 
  Quiero ingresar a Visita técnica 
  Para consultar las visitas que tengo agendadas y que ya se han realizado

  Background: Borrar Datos de Navegacion
    And se borran cookies del navegador

  #Scenario Outline: Usuario no tiene visitas programadas ni históricas
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
    #And el campo "Mensaje Card" tiene el texto "En el momento no tienes una visita programada."
    #And el campo "Mensaje Informacion" tiene el texto "Lo siento no tienes un agendamiento programado"
    #And el campo "Mensaje Informacion ColorFondo" tiene el atributo "background" en el valor "azul"
    #And doy clic en <Opciones>
    #And voy a la pestaña <Número Pestaña>
    #And lo llevará a la página <url>
    #And cerrar pestaña
#
    #Examples: 
      #| Opciones               | Número Pestaña | url                                                     |
      #| "Centro de Ayuda Fijo" | "ultima"       | "https://ayuda.tigoune.co/hc/es/articles/115015747568-" |
      #| "Volver al Inicio"     | "primera"      | "https://tigoselfcareregional-uat-co.tigocloud.net"     |
      
      
  Scenario: Usuario no tiene visitas programadas ni históricas Seleccionando Chat en linea
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
    #And el campo "Mensaje Card" tiene el texto "Los sentimos, en el momento no tienes una visita programada"
    #And el campo "Mensaje Informacion" tiene el texto "Lo siento no tienes un agendamiento programado"
    #And el campo "Mensaje Informacion ColorFondo" tiene el atributo "background" en el valor "azul"
    And doy clic en "Chat en linea"
    And cambiar de iframe
   Then llevará al formulario con el objeto "Chat Online"
   
   
