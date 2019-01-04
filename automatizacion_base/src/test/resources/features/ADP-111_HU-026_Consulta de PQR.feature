#Author: Karen Perez Parrado
#Keywords Summary :
@issue:ADP-111 @MiCuenta
Feature: HU026_Consulta de PQR
  
  Yo como usuario de mi cuenta Tigo 
  Quiero ingresar a mis PQR
  Para conocer el detalle y la solución de estas

  Scenario: Mi Cuenta - Consulta de PQR
    Given se borran cookies del navegador
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
    And doy clic en "No Linea Fija" si es visible
    And doy clic en "Seleccion MSISDN" si es visible
    And Espero 1 segundos
    And doy clic en "Linea Fija" si es visible
    And doy clic en "Consulta PQR" si es visible
    And Espero 1 segundos
		Then llevará al formulario con el objeto "Estados PQRs"
		And Espero a que el numero de elementos de "Estado cada pqr" sea ">=" que 1