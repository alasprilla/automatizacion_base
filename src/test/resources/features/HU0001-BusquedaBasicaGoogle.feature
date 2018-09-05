#Author: Henry Andres Correa Correa
#Keywords Summary : Busqueda, Google
#Convensiones:
#Genero: 			1.Masculino 	2.Femenino	3.Sin Informacion
#direccionNo  V.Checked			F.Unchecked
@Google
Feature: Busqueda basica google
Story: Como un internauta, quiero buscar en Google, para poder aprender cosas nuevas.

  @BusquedaBasica
  Scenario: simple busqueda en Google
    Given un navegador web se encuentra en la página de Google
    When la frase de búsqueda "indra" se introduce
    Then Resultados para "Indra" se muestran
