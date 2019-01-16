#Author: Karen Perez Parrado
#Keywords Summary :
@issue:ADP-95 @MiCuenta
Feature: HU021 Cambio de nombre de la red Wifi
  
    YO como usuario de mi cuenta Tigo 
    QUIERO ingresar a mi servicio de internet
    PARA realizar el cambio de nombre de mi red Wifi

  Background: Borrar Datos de Navegacion
    Given se borran cookies del navegador

  Scenario Outline: Cambio de nombre de la red wifi NO exitoso
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
    And doy clic en "No Linea Fija Wifi" si es visible
    And doy clic en "Seleccion MSISDN" si es visible
    And Espero 1 segundos
    And doy clic en "Linea Fija Wifi" si es visible
    And Espero 1 segundos
    And doy clic en "Servicios" si es visible
    And Espero 1 segundos
    And doy clic en "Producto Internet Detalles"
    And doy clic en "Cambiar Nombre de la Red Wifi URL"
    And ingreso <NombreRed> en el campo "Cambiar Nombre de la Red Wifi"
    And doy clic en "Aceptar"
    Then el campo "Mensaje Confirmación" tiene el texto <Mensaje>

    Examples: 
      | Escenario               | NombreRed    | Mensaje                                                                |
      | "Caracteres especiales" | "Colombia+}" | "El nombre es inválido, revise que no contenga caracteres especiales." |
      | "Menos de 6 Caracteres" | "hola1"      | "El nombre es inválido, revise que tenga entre 6 y 10 caracteres."     |
      | "Campo Vacio"           | ""           | "El nombre es inválido, revise que no esté vacio."                     |

  Scenario Outline: Cambio de nombre de la red wifi exitoso
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
    And doy clic en "No Linea Fija Wifi" si es visible
    And doy clic en "Seleccion MSISDN" si es visible
    And Espero 1 segundos
    And doy clic en "Linea Fija Wifi" si es visible
    And Espero 1 segundos
    And doy clic en "Servicios" si es visible
    And Espero 1 segundos
    And doy clic en "Producto Internet Detalles"
    And doy clic en "Cambiar Nombre de la Red Wifi URL"
    And ingreso <NombreRed> en el campo "Cambiar Nombre de la Red Wifi"
    And doy clic en "Aceptar"
    Then el campo "Mensaje Confirmación" tiene el texto <Mensaje>

    Examples: 
      | Escenario                     | NombreRed    | Mensaje                                              |
      | "Nombre Exitoso"              | "Prueba"     | "El cambio de nombre de la red de wifi fue exitosa." |
      | "Nombre Exitoso Numérico"     | "1234567890" | "El cambio de nombre de la red de wifi fue exitosa." |
      | "Nombre Exitoso Alfanumérico" | "Correa1701" | "El cambio de nombre de la red de wifi fue exitosa." |
