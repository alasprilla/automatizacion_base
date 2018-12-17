#Author: Alexandra Lasprilla Cardona
#Keywords Summary :
@issue:ADP-93 @MiCuenta
Feature: HU019_ServiciosFijos
  
  Yo como usuario de mi cuenta Tigo 
  Quiero ingresar a mis servicios fijos
  Para realizar consultas y transacciones

  Scenario: Mi Cuenta - Productos contratados
    Given Estoy en la página de inicio "Página mi cuenta tigo" en la url "https://tigoselfcareregional-uat-co.tigocloud.net"
    When doy clic en "Ingresar"
    #And se quiere visualizar con resolucion "800" x "900"
    And ingreso "automatizacionmicuenta@gmail.com" en el campo "Correo Mi Cuenta"
    And doy clic en "Validar"
    And doy clic en "siguiente"
    And ingreso "Colombia2019" en el campo "Contrasena Gmail"
    And doy clic en "Siguiente C"
    And Espero 1 segundos
    And doy clic en "Seleccion MSISDN" si es visible
    And Espero 1 segundos
    And doy clic en "No Linea fija" si es visible
    And doy clic en "Seleccion MSISDN" si es visible
    And Espero 1 segundos
    And doy clic en "Linea Fija" si es visible
    And doy clic en "Servicios"
    Then llevará al formulario con el objeto "Productos Contratados"
