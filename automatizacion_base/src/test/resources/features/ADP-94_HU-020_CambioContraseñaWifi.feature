#Author: Leison David Perilla Palacios
#Keywords Summary :
@issue:ADP-94 @MiCuenta
Feature: HU020_Cambio contraseña Wifi
  
    YO como usuario de mi cuenta Tigo 
    QUIERO ingresar a mi servicio de internet
    PARA Para realizar el cambio de la contraseña Wifi

  Scenario: Mi Cuenta - Cambio contraseña Wifi exitoso
    Given Estoy en la página de inicio "Página mi cuenta tigo" en la url "https://tigoselfcareregional-uat-co.tigocloud.net"
    When doy clic en "Ingresar"
    And ingreso "automatizacionmicuenta@gmail.com" en el campo "Correo Mi Cuenta"
    And doy clic en "Validar"
    And ingreso "Colombia2019" en el campo "Contrasena Gmail"
    And doy clic en "Siguiente C"
    And Espero 1 segundos
    And doy clic en "Seleccion MSISDN" si es visible
    And Espero 1 segundos
    And doy clic en "No Linea Fija" si es visible
    And doy clic en "Seleccion MSISDN" si es visible
    And Espero 1 segundos
    And doy clic en "Linea Fija" si es visible
    And doy clic en "Servicios" si es visible
    And doy clic en "Producto Internet Detalles"
    And doy clic en "Cambiar Contrasena Wifi"
    And ingreso "Colombia2019" en el campo "Nueva Contrasena Wifi"
    And doy clic en "Aceptar"
    Then el campo "Mensaje Confirmación" tiene el texto "El cambio de la contraseña de la red wifi fue exitoso"
    
   Scenario: Mi Cuenta - Cambio contraseña wifi fallido
    Given Estoy en la página de inicio "Página mi cuenta tigo" en la url "https://tigoselfcareregional-uat-co.tigocloud.net"
    And doy clic en "Seleccion MSISDN" si es visible
    And Espero 1 segundos
    And doy clic en "No Linea Fija" si es visible
    And doy clic en "Seleccion MSISDN" si es visible
    And Espero 1 segundos
    And doy clic en "Linea Fija" si es visible
    And doy clic en "Servicios" si es visible
    And doy clic en "Producto Internet Detalles"
    And doy clic en "Cambiar Contrasena Wifi"
    And ingreso "Colombia2019+}" en el campo "Nueva Contrasena Wifi"
    And doy clic en "Aceptar"
    Then el campo "Mensaje Confirmación" tiene el texto "La contraseña es inválida, revise que no contenga caracteres especiales."
     
    