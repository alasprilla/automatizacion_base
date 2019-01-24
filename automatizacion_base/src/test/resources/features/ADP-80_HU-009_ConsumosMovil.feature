#Author: Alexandra Lasprilla
#Keywords Summary :
@issue:ADP-80 @MiCuenta
Feature: HU009_ConsumosMovil
  
  YO como usuario de mi cuenta Tigo 
  QUIERO Ingresar a mis consumos
  PARA llevar el registro y control de estos

  Background: Borrar Datos de Navegacion
    And se borran cookies del navegador

  Scenario: Mi Cuenta - Consumos Datos
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
    And doy clic en "No Linea Hibrido" si es visible
    And doy clic en "Seleccion MSISDN" si es visible
    And Espero 1 segundos
    And doy clic en "Linea Hibrido" si es visible
    And doy clic en "Consumos" si es visible
    And llevará al formulario con el objeto "Fecha y Hora Datos"
    And llevará al formulario con el objeto "Día Datos"
    And llevará al formulario con el objeto "Consumo Datos"

  Scenario: Mi Cuenta - Consumos llamadas Seleccionando Fecha del Calendario
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
    And doy clic en "No Linea Arma tu Plan" si es visible
    And doy clic en "Seleccion MSISDN" si es visible
    And Espero 1 segundos
    And doy clic en "Linea Arma tu Plan" si es visible
    And doy clic en "Consumos" si es visible
    And doy clic en "Fecha Inicial Llamadas"
    And doy clic en "Día del Calendario Llamadas"
    And doy clic en "Ok fecha"
    And doy clic en "Fecha Final Llamadas"
    And doy clic en "Mes Anterior Fecha Final"
    And doy clic en "Día del Calendario final Llamadas"
    And doy clic en "Ok fecha Final"
    And doy clic en "Ver Llamadas"
    And llevará al formulario con el objeto "Fecha y Hora llamadas"
    And llevará al formulario con el objeto "Destino llamadas"
    And llevará al formulario con el objeto "Duración llamadas"

Scenario: Mi Cuenta - Consumos llamadas sin seleccionar Fecha del Calendario
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
    And doy clic en "No Linea Arma tu Plan" si es visible
    And doy clic en "Seleccion MSISDN" si es visible
    And Espero 1 segundos
    And doy clic en "Linea Arma tu Plan" si es visible
    And doy clic en "Consumos" si es visible
    And doy clic en "Ver Llamadas"
    And llevará al formulario con el objeto "Fecha y Hora llamadas"
    And llevará al formulario con el objeto "Destino llamadas"
    And llevará al formulario con el objeto "Duración llamadas"
      
  Scenario: Mi Cuenta - Consumos Mensajes Seleccionando Fecha del Calendario
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
    And doy clic en "No Linea Hibrido" si es visible
    And doy clic en "Seleccion MSISDN" si es visible
    And Espero 1 segundos
    And doy clic en "Linea Hibrido" si es visible
    And doy clic en "Consumos" si es visible
    And doy clic en "Fecha Inicial Llamadas"
    And doy clic en "Día del Calendario Llamadas"
    And doy clic en "Ok fecha"
    And doy clic en "Fecha Final Llamadas"
    And doy clic en "Mes Anterior Fecha Final"
    And doy clic en "Día del Calendario final Llamadas"
    And doy clic en "Ok fecha final"
    And Presiono la tecla "Avanzar Página" sobre "Ver Mensajes"
    And doy clic en "Ver Mensajes"
    And llevará al formulario con el objeto "Fecha y Hora Mensajes"
    And llevará al formulario con el objeto "Destino Mensajes"
      
 Scenario: Mi Cuenta - Consumos Mensajes sin seleccionar Fecha del Calendario
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
    And doy clic en "No Linea Arma tu plan" si es visible
    And doy clic en "Seleccion MSISDN" si es visible
    And Espero 1 segundos
    And doy clic en "Linea Arma tu plan" si es visible
    And doy clic en "Consumos" si es visible
    And Presiono la tecla "Avanzar Página" sobre "Ver llamadas"
    And doy clic en "Ver Mensajes"
    And llevará al formulario con el objeto "Fecha y Hora Mensajes"
    And llevará al formulario con el objeto "Destino Mensajes"
      
