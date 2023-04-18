Feature: Ingresar con usuario registrado al los modulos de la DIAN

  @Consulta
  Scenario Outline: Ingresar al modulo consulta obligación de la DIAN
    Given Ingresar al sitio DIAN
    When Hacer click sobre usuario registrado
    And Seleccionar acepto terminos y condiciones
    And Hacer click en continuar Recomendaciones
    And Seleccionar a nombre de "<nombreDe>"
    And Seleccionar tipo de documento "<tipoDocumento>"
    And Ingresar numero de documento "<numDocumento>"
    And Ingresar contrasena "<contrasena>"
    And click en el boton ingresar
    And Validar
    Examples:
      | nombreDe        | tipoDocumento        | numDocumento | contrasena |  |  |  |  |
      | A NOMBRE PROPIO | Cédula de Ciudadanía | 72267272     | Jeison32*  |  |  |  |  |