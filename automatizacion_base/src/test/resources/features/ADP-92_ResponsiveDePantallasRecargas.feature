#Author: Alexandra Lasprilla Cardona
#Keywords Summary :
@issue:ADP-92 @Recargas
Feature: Responsive de Pantallas de Recargas
  Como Tigoune
  Quiero realizar pruebas automatizadas en la página de Recargas
  Para garantizar la correcta visualización del diseño de la página

  Scenario Outline: Recargas - Recarga Valor Preestablecido seleccionando Tarjeta de Crédito
    Given Estoy en la página de inicio "Pagina paquetes" en la url "https://transaccionesco-uat.tigocloud.net/servicios/paquetes"
    And se quiere visualizar con resolucion <X> x <Y>
    When doy clic en "Recarga"
    And ingreso "3003255454" en el campo "Ingresa tu línea Tigo"
    And ingreso "prueba@prueba.com" en el campo "Correo electrónico"
    And doy clic en "Recargar"
    Then llevará al formulario con el objeto "Titulo Detalle"
    And Estoy en la página de selección de formas de pago con el tipo "Tarjeta de Crédito" seleccionado

    Examples: 
      | X     | Y      |
      | "320" | "480"  |
      | "600" | "1024" |
      | "768" | "1024" |
      | "640" | "960"  |
      | "720" | "1280" |

  Scenario Outline: Recargas - Recarga Valor Preestablecido seleccionando Tarjeta de Debito
    Given Estoy en la página de inicio "Pagina paquetes" en la url "https://transaccionesco-uat.tigocloud.net/servicios/paquetes"
    And se quiere visualizar con resolucion <X> x <Y>
    When doy clic en "Recarga"
    And ingreso "3003255454" en el campo "Ingresa tu línea Tigo"
    And ingreso "prueba@prueba.com" en el campo "Correo electrónico"
    And doy clic en "Recargar"
    Then llevará al formulario con el objeto "Titulo Detalle"
    And Estoy en la página de selección de formas de pago con el tipo "Debito Bancario PSE" seleccionado

    Examples: 
      | X     | Y      |
      | "320" | "480"  |
      | "600" | "1024" |
      | "768" | "1024" |
      | "640" | "960"  |
      | "720" | "1280" |

  Scenario Outline: Recargas - Recarga Otro Valor seleccionando Tarjeta de Crédito
    Given Estoy en la página de inicio "Pagina paquetes" en la url "https://transaccionesco-uat.tigocloud.net/servicios/paquetes"
    And se quiere visualizar con resolucion <X> x <Y>
    When doy clic en "Recarga"
    And ingreso "3043605513" en el campo "Ingresa tu línea Tigo"
    And doy clic en "Lista Valor"
    And doy clic en "otro valor"
    And ingreso "10000" en el campo "Valor a recargar"
    And ingreso "prueba@prueba.com" en el campo "Correo electrónico"
    And doy clic en "Recargar"
    Then llevará al formulario con el objeto "Titulo Detalle"
    And Estoy en la página de selección de formas de pago con el tipo "Tarjeta de Crédito" seleccionado

    Examples: 
      | X     | Y      |
      | "320" | "480"  |
      | "600" | "1024" |
      | "768" | "1024" |
      | "640" | "960"  |
      | "720" | "1280" |

  Scenario Outline: Recargas - Recarga Otro Valor seleccionando Tarjeta de Debito
    Given Estoy en la página de inicio "Pagina paquetes" en la url "https://transaccionesco-uat.tigocloud.net/servicios/paquetes"
    And se quiere visualizar con resolucion <X> x <Y>
    When doy clic en "Recarga"
    And ingreso "3043605513" en el campo "Ingresa tu línea Tigo"
    And doy clic en "Lista Valor"
    And doy clic en "otro valor"
    And ingreso "10000" en el campo "Valor a recargar"
    And ingreso "prueba@prueba.com" en el campo "Correo electrónico"
    And doy clic en "Recargar"
    Then llevará al formulario con el objeto "Titulo Detalle"
    And Estoy en la página de selección de formas de pago con el tipo "Debito Bancario PSE" seleccionado

    Examples: 
      | X     | Y      |
      | "320" | "480"  |
      | "600" | "1024" |
      | "768" | "1024" |
      | "640" | "960"  |
      | "720" | "1280" |
