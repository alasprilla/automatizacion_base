#Author: Alexandra Lasprilla Cardona
#Keywords Summary :
@issue:ADP-109 @MiCuenta
Feature: HU024_DetallesServiciosFijos
  
Yo como usuario de mi cuenta Tigo 
Quiero ingresar a mis servicios fijos
Para conocer la información y el detalle de los productos

  Scenario Outline: Mi Cuenta - Detalles servicio Internet
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
    And doy clic en "No Linea fija" si es visible
    And doy clic en "Seleccion MSISDN" si es visible
    And Espero 1 segundos
    And doy clic en "Linea Fija" si es visible
    And doy clic en "Servicios" si es visible 
    And doy clic en "Producto Internet Detalles" 
   Then llevará al formulario con el objeto <Detalle Internet>
   
       Examples: 
      | Detalle Internet                | 
      | "Plan Producto"                 | 
      | "Numero Suscripcion Producto"   |
      | "Direccion Ubicacion Producto"  |
    
   Scenario Outline: Mi Cuenta - Detalles servicio de Televisión
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
    And doy clic en "No Linea fija" si es visible
    And doy clic en "Seleccion MSISDN" si es visible
    And Espero 1 segundos
    And doy clic en "Linea Fija" si es visible
    And doy clic en "Servicios" si es visible
    And doy clic en "Producto Televisión Detalles"
    Then llevará al formulario con el objeto <Detalle Television>
    
    Examples: 
      | Detalle Television               | 
      | "Plan Producto"                  | 
      | "Numero Suscripcion Producto"    |
      | "Direccion Ubicacion Producto"   |
      | "Informacion de Dispositivos"    |
       
    
 