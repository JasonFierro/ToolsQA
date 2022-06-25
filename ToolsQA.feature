Feature: Escribir los escenarios que se requieran en gherkin (Cucumber) y automatizar los mismos con Selenium Webdriver
  o Serenity Screenplay, para los siguientes casos de negocio en el sitio ( https://demoqa.com/login )

  Background:
    Given Ingresar al sitio ToolsQA
    When Escribir el usuario
    And Escribir la contraseña
    Then Validar la pantalla principal de ToolsQA

    @AgregarLibros
    Scenario Outline: Seleccionar el libro “Speaking JavaScript” y "Programming JavaScript Applications", adicionar a la
    colección del usuario (Add to Your Collection) y al final debe eliminarse “Speaking JavaScript” del perfil.
      Given Ir a la tienda de libros Go to Book Store
      And Buscar en la tienda de libros, los libros que tengan la palabra1 "<palabra1>"
      When Seleccionar el libro Speaking
      And Adicionar a la colección del usuario Add to Your Collection
      And Regresar a la canasta o colección Profile
      And Ir a la tienda de libros Go to Book Store
      And Buscar en la tienda de libros, los libros que tengan la palabra2 "<palabra2>"
      And Seleccionar el libro Programming JavaScript Applications
      And Adicionar a la colección del usuario Add to Your Collection
      And Regresar a la canasta o colección Profile
      Then Se deben visualizar los libros  seleccionados Speaking JavaScript y Programming JavaScript Applications
      And Eliminar de la canasta o coleccion "<eliminar>"
      Then Salir del sitio Log out

      Examples:
      |palabra1  |palabra2  |libro1                              |libro2                                  |eliminar           |
      |Speaking  |JavaScript|Speaking JavaScript                 |Programming JavaScript Applications     |Speaking JavaScript|

