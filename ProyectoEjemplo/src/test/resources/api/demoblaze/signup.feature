Feature: Signup API Demoblaze

  Background:
    * url baseUrl

  Scenario: Crear un nuevo usuario en signup
    * def randomUser = 'user_' + java.util.UUID.randomUUID()
    * def requestBody =
    """
    {
      "username": "#(randomUser)",
      "password": "Test123"
    }
    """
    Given path '/signup'
    And request requestBody
    When method post
    Then status 200
    And print 'REQUEST:', requestBody
    And print 'RESPONSE:', response

  Scenario: Intentar crear un usuario ya existente
    * def requestBody =
    """
    {
      "username": "usuario_prueba_api",
      "password": "Test123"
    }
    """
    Given path '/signup'
    And request requestBody
    When method post
    Then status 200
    And print 'REQUEST:', requestBody
    And print 'RESPONSE:', response