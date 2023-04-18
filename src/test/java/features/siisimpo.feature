Feature: Como usuario deseo realizar flujo alterno y flujo exitoso de compra de recarga mas vendida

  @Sprint2
    @HN
    @Recargas @pdv @recargaExitosa
    @V2.0 @V2.1 @V2.2 @V2.2.1 @V2.2.2 @V2.2.3
  Scenario Outline: Realizar una recarga mas vendida exitosamente
    Given El usuario ingresa a la aplicacion DIAN "<testCase>" con el pais "<pais>" y la funcionalidad "<funcionalidad>"

    Examples:
      | LineaMovil | testCase                                      | pais | funcionalidad |
      | 98422634   | Realizar una recarga mas vendida exitosamente | HN   | Recargas      |