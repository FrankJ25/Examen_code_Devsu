Feature: Flujo de compra en SauceDemo

  Como usuario de SauceDemo
  Quiero autenticarme y realizar una compra
  Para validar el flujo E2E de compra exitosamente

  @CompraSauceDemo
  Scenario Outline: Flujo de compra E2E en SauceDemo
    Given el usuario abre la pagina de SauceDemo
    When inicia sesion con usuario "<usuario>" y clave "<clave>"
    And agrega los productos "<producto1>" y "<producto2>" al carrito
    And el usuario navega al carrito de compras en SauceDemo
    And completa el checkout con nombre "<nombre>", apellido "<apellido>", codigo postal "<codigoPostal>"
    Then el usuario finaliza la compra exitosamente
    And se muestra el mensaje de confirmacion en SauceDemo "<mensajeConfirmacion>"


    Examples:
      | usuario       | clave        | producto1           | producto2             | nombre | apellido | codigoPostal | mensajeConfirmacion       |
      | standard_user | secret_sauce | Sauce Labs Backpack | Sauce Labs Bike Light | Juan   | Perez    | 15001        | Thank you for your order! |

