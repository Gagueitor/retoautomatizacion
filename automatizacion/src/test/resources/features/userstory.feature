# Autor: Juan Camilo Valencia Morales
@stories
Feature: Creación de un nuevo usuario en la plataforma uTest - Desafío técnico de automatización
  Se requiere probar el formulario de creación de usuario de Utest.com para esto se usará el patrón screenplay para validar las creaciones de usuario de la siguiente manera:
  @scenario1
  Scenario: Crear un usuario en la plataforma uTest

    Given que se ingresa a Utest

    When un usuario diligencia el formulario de registro

    Then debera existir un nuevo usuario con los datos registrados
