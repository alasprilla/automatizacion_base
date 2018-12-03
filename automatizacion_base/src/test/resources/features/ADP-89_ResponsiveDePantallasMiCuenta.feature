#Author: Alexandra Lasprilla Cardona
#Keywords Summary :
@issue:ADP-89 @MiCuenta
Feature: Responsive de Pantallas de Mi Cuenta
  Como Tigoune
  Quiero realizar pruebas automatizadas en la página de Mi Cuenta
  Para garantizar la correcta visualización del diseño de la página

  Background: Borrar Datos de Navegacion
    And se borran cookies del navegador

  Scenario Outline: Mi Cuenta - Responsive de Mi Cuenta 
    Given Estoy en la página de inicio "Página mi cuenta tigo" en la url "https://tigoselfcareregional-uat-co.tigocloud.net"
    And se quiere visualizar con resolucion <X> x <Y>
    And doy clic en "Personaliza red Wifi"
    When doy clic en "Ingresar"
    And ingreso "lopezanamaria1@hotmail.com" en el campo "Correo Mi Cuenta"
    And doy clic forzado en "Validar"
    And ingreso "pruebas2018" en el campo "Contrasena"
    And doy clic en "Continuar Mi Cuenta"
    
    Examples: 
      | X     | Y      |
      | "320" | "480"  |
      | "600" | "1024" |
      | "768" | "1024" |
      | "640" | "960"  |
      | "720" | "1280" |

  