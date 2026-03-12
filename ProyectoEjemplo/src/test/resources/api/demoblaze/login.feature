Feature: Login API Demoblaze

  Background:
    * url baseUrl

  Scenario: Usuario y password correcto en login
    * def requestBody =
    """
    {
      "username": "usuario_prueba_api",
      "password": "Test123"
    }
    """
    Given path '/login'
    And request requestBody
    When method post
    Then status 200
    And print 'REQUEST:', requestBody
    And print 'RESPONSE:', response

  Scenario: Usuario y password incorrecto en login
    * def requestBody =
    """
    {
      "username": "usuario_prueba_api",
      "password": "incorrecto"
    }
    """
    Given path '/login'
    And request requestBody
    When method post
    Then status 200
    And print 'REQUEST:', requestBody
    And print 'RESPONSE:', response