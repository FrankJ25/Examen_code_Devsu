Feature: Pruebas API Petstore User

  Background:
    * url 'https://petstore.swagger.io/v2'
    * def username = 'user_' + java.util.UUID.randomUUID()
    * def email = username + '@test.com'

  Scenario: CRUD completo de usuario en Petstore
    * def createRequest =
    """
    {
      "id": 1001,
      "username": "#(username)",
      "firstName": "Frank",
      "lastName": "Pozo",
      "email": "#(email)",
      "password": "Test123",
      "phone": "987654321",
      "userStatus": 1
    }
    """

    Given path '/user'
    And request createRequest
    When method post
    Then status 200
    And print 'REQUEST CREAR:', createRequest
    And print 'RESPONSE CREAR:', response

    Given path '/user', username
    When method get
    Then status 200
    And match response.username == username
    And print 'RESPONSE BUSCAR:', response

    * def updateRequest =
    """
    {
      "id": 1001,
      "username": "#(username)",
      "firstName": "FrankActualizado",
      "lastName": "Pozo",
      "email": "frank.actualizado@test.com",
      "password": "Test123",
      "phone": "987654321",
      "userStatus": 1
    }
    """

    Given path '/user', username
    And request updateRequest
    When method put
    Then status 200
    And print 'REQUEST ACTUALIZAR:', updateRequest
    And print 'RESPONSE ACTUALIZAR:', response

    Given path '/user', username
    When method get
    Then status 200
    And match response.firstName == 'FrankActualizado'
    And match response.email == 'frank.actualizado@test.com'
    And print 'RESPONSE BUSCAR ACTUALIZADO:', response

    Given path '/user', username
    When method delete
    Then status 200
    And print 'RESPONSE ELIMINAR:', response