Feature: Flujo de compra en Demoblaze

  Como usuario de la tienda Demoblaze
  Quiero agregar productos al carrito
  Para completar una compra exitosamente

  @CompraDemoblaze
  Scenario Outline: Flujo de compra E2E agregando productos al carrito
    Given el usuario abre la pagina
    When el usuario agrega los productos "<producto1>" y "<producto2>" al carrito
    And el usuario navega al carrito de compras
    And completa el formulario con nombre "<nombre>", pais "<pais>", ciudad "<ciudad>", tarjeta "<tarjeta>", mes "<mes>", año "<anio>"
    Then el usuario finaliza la compra exitosamente
    And se muestra el mensaje de confirmacion de compra

    Examples:
      | producto1      | producto2   | nombre | pais | ciudad | tarjeta    | mes | anio |
      | Samsung galaxy | Nokia lumia | Juan   | Peru | Lima   | 1234567890 | 12  | 2026 |