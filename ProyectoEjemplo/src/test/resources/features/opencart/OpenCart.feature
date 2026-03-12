Feature: Flujo de compra en OpenCart

  Como usuario de OpenCart
  Quiero agregar productos al carrito y comprar como invitado
  Para validar el flujo E2E de compra exitosamente

  @CompraOpenCart
  Scenario Outline: Flujo de compra E2E en OpenCart con Guest Checkout
    Given el usuario abre la pagina de OpenCart
    When agrega los productos "<producto1>" y "<producto2>" al carrito en OpenCart
    And el usuario navega al carrito de compras en OpenCart
    And el usuario procede al checkout como invitado en OpenCart
    And completa los datos de facturacion con nombre "<nombre>", apellido "<apellido>", email "<email>", telefono "<telefono>", direccion "<direccion>", ciudad "<ciudad>", codigo postal "<codigoPostal>", pais "<pais>", region "<region>"
    Then el usuario finaliza la compra exitosamente en OpenCart
    And se muestra el mensaje de confirmacion en OpenCart "<mensajeConfirmacion>"

    Examples:
      | producto1      | producto2    | nombre | apellido | email                | telefono   | direccion      | ciudad | codigoPostal | pais   | region   | mensajeConfirmacion          |
      | MacBook        | iPhone       | Juan   | Perez    | juanperez@test.com   | 987654321  | Av Peru 123    | Lima   | 15001        | Peru   | Lima     | Your order has been placed! |