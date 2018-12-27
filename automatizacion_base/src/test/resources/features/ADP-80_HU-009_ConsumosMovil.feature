#Author: Alexandra Lasprilla
#Keywords Summary :
@issue:ADP-80 @MiCuenta
Feature: HU009_ConsumosMovil
  
  YO como usuario de mi cuenta Tigo 
  QUIERO Ingresar a mis consumos
  PARA llevar el registro y control de estos

  Background: Borrar Datos de Navegacion
    And se borran cookies del navegador

  Scenario Outline: Mi Cuenta - Consumos Datos
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
    And llevará al formulario con el objeto <detalles>

    Examples: 
      | detalles             |
      | "Fecha y Hora Datos" |
      | "Día Datos"          |
      | "Consumo Datos"      |

  Scenario Outline: Mi Cuenta - Consumos llamadas Seleccionando Fecha del Calendario
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
    And doy clic en "Mes Anterior Fecha Inicial"
    And doy clic en "Día del Calendario Llamadas"
    And doy clic en "Ok fecha"
    And doy clic en "Fecha Final Llamadas"
    And doy clic en "Mes Anterior Fecha Final"
    And doy clic en "Día del Calendario final Llamadas"
    And doy clic en "Ok fecha Final"
    And doy clic en "Ver Llamadas"
    And llevará al formulario con el objeto <detalles llamadas>

    Examples: 
      | detalles llamadas       |
      | "Fecha y Hora llamadas" |
      | "Destino llamadas"      |
      | "Duración llamadas"     |

Scenario Outline: Mi Cuenta - Consumos llamadas sin seleccionar Fecha del Calendario
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
    And llevará al formulario con el objeto <detalles llamadas>

    Examples: 
      | detalles llamadas       |
      | "Fecha y Hora llamadas" |
      | "Destino llamadas"      |
      | "Duración llamadas"     |
      
      
  Scenario Outline: Mi Cuenta - Consumos Mensajes Seleccionando Fecha del Calendario
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
    And doy clic en "Mes Anterior Fecha Inicial"
    And doy clic en "Día del Calendario Llamadas"
    And doy clic en "Ok fecha"
    And doy clic en "Fecha Final Llamadas"
    And doy clic en "Mes Anterior Fecha Final"
    And doy clic en "Día del Calendario final Llamadas"
    And doy clic en "Ok fecha final"
    And Presiono la tecla "Avanzar Página" sobre "Ver Mensajes"
    And doy clic en "Ver Mensajes"
    And llevará al formulario con el objeto <detalles Mensajes>

    Examples: 
      | detalles Mensajes       |
      | "Fecha y Hora Mensajes" |
      | "Destino Mensajes"      |
      
 Scenario Outline: Mi Cuenta - Consumos Mensajes sin seleccionar Fecha del Calendario
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
    And Presiono la tecla "Avanzar Página" sobre "Ver Mensajes"
    And doy clic en "Ver Mensajes"
    And llevará al formulario con el objeto <detalles Mensajes>

    Examples: 
      | detalles Mensajes       |
      | "Fecha y Hora Mensajes" |
      | "Destino Mensajes"      |
      
