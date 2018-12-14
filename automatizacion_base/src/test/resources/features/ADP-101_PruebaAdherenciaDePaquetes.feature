#Author: Alexandra Lasprilla Cardona
#Keywords Summary :
@issue:ADP-101 @Paquetes
Feature: Prueba de Adherencia de Paquetes
  
  Como Tigoune
  Quiero realizar pruebas automatizadas sobre la página de paquetes
  Para garantizar que funcionen correctamente las pruebas automatizadas

  Scenario: Paquetes - Prueba de Adherencia con la aplicación MySMS
    Given Estoy en la página de inicio "Pagina paquetes" en la url "https://transaccionesco-uat.tigocloud.net/servicios/paquetes"
    When doy clic en "Paquetes"
    And doy clic en "Comprar 600MB"
    And ingreso "3148588733" en el campo "Ingresa tu Línea Tigo Paquetes"
    And doy clic en "Continuar Compra Paquete"
    And llevará al formulario con el objeto "Vamos a Verificar tus Datos"
    And obtener el otp del correo "pruebaspaquetes@gmail.com" y la contraseña "Pruebaspaquetes1" y guardarlo en "codVer"
    And cerrar pestaña
    And ingreso "codVer" en el campo "Codigo Verificación"
    And doy clic en "Continuar Verificación"
    And ingreso "pruebaspaquetes@gmail.com" en el campo "Correo Verificación"
    And doy clic en "Estoy Seguro"
    Then llevará al formulario con el objeto "Titulo Detalle"