
Feature: Orden de compra de productos

@LoginYambal
  Scenario Outline: Registro de una orden de compra con credito yambal
    Given el usuario abre el portal en "<ambiente>" para "<pais>"
    When inicia sesión con <usuario> y <clave>
    And se agrega producto al carrito de compras
    And se escoge <nroproductos> productos al carrito de compras y se agrega a la bolsa
    And se Ingresa al check out y se valida el resumen del pedido
    Then se procede a pagar con CreditoYambal
    And se valida el historial del pedido
    Examples:
      | ambiente | pais | usuario   | clave      | nroproductos |
      | S1       | MX   | 221697398 | 11.Y4nb41$ | 5            |



  Scenario Outline: Registro de una orden de compra con tarjeta de credito
    Given el usuario abre el portal en "<ambiente>" para "<pais>"
    When inicia sesión con <usuario> y <clave>
    And se agrega producto al carrito de compras
    And se escoge <nroproductos> productos al carrito de compras y se agrega a la bolsa
    And se Ingresa al check out y se valida el resumen del pedido
    Then se procede a pagar con Tarjeta de credito
    And se valida el historial del pedido
    Examples:
      | ambiente | pais | usuario   | clave      | nroproductos |
      | S1       | MX   | 221697398 | 11.Y4nb41$ | 5            |

