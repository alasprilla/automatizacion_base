#Author: Jose David Moreno Serrano - Karen Perez
#Keywords Summary :
@issue:ADP-45 @Recargas
Feature: HU018 Validación números Validos Celular en Recargas y Paquetes
  
  Como Tigoune
  Quiero realizar pruebas automatizadas sobre el campo "Número Celular" en el formulario de paquetes y recargas
  Para garantizar que funcione correctamente el inicio del proceso de recarga

  Scenario Outline: Recargas - Ingreso de número valido que no es Tigo
    Given Estoy en la página de inicio "Pagina paquetes" en la url "https://transaccionesco-uat.tigocloud.net/servicios/paquetes"
    When doy clic en "Recarga"
    And ingreso <msisdn> en el campo "Ingresa tu línea Tigo"
    And ingreso "prueba@prueba.com" en el campo "Correo electrónico"
    And doy clic en "Recargar"
    Then el campo "Mensaje Error Recarga" tiene el texto "El número de línea que ingresaste no es de Tigo. Por favor verifícalo"
    And el campo "Mensaje Error Recarga" tiene el atributo "color" en el valor "blanco"
    And el campo "Mensaje Error Recarga" tiene el atributo "background-color" en el valor "rojo"
    And Presiono la tecla "Inicio" 

    Examples: 
      | msisdn       |
      | "3000000000" |
      | "3110000000" |
      | "3150000000" |
      | "3200000000" |

  Scenario: Recargas - Ingreso de número válido Tigo con una linea suspendida
    Given Estoy en la página de inicio "Pagina paquetes" en la url "https://transaccionesco-uat.tigocloud.net/servicios/paquetes"
    When doy clic en "Recarga"
    And ingreso "3008914224" en el campo "Ingresa tu línea Tigo"
    And ingreso "prueba@prueba.com" en el campo "Correo electrónico"
    And doy clic en "Recargar"
    Then el campo "Mensaje Error Recarga" tiene el texto "Lo sentimos, tu línea se encuentra suspendida por robo o pérdida"
    And el campo "Mensaje Error Recarga" tiene el atributo "color" en el valor "blanco"
    And el campo "Mensaje Error Recarga" tiene el atributo "background-color" en el valor "rojo"
    And Presiono la tecla "Inicio" 

  Scenario Outline: Recargas - Ingreso de número válido Tigo con un plan que permite recargas
    Given Estoy en la página de inicio "Pagina paquetes" en la url "https://transaccionesco-uat.tigocloud.net/servicios/paquetes"
    When doy clic en "Recarga"
    And ingreso <msisdn> en el campo "Ingresa tu línea Tigo"
    And ingreso "prueba@prueba.com" en el campo "Correo electrónico"
    And doy clic en "Recargar"
    Then llevará al formulario con el objeto "Titulo Detalle"
    And el campo "Numero Celular" tiene el texto <Formato Celular>
    And el campo "Fecha Facturacion" no está vacío

    Examples: 
      | msisdn       | Formato Celular  |
      | "3003255454" | "(300) 325-5454" |
      | "3043605513" | "(304) 360-5513" |
