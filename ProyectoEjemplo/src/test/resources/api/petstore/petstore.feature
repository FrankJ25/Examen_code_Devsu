Feature: Pruebas API Petstore

  Background:
    * url 'https://petstore.swagger.io/v2'
    * def petId = 123456

  Scenario: Añadir una mascota a la tienda

    * def requestBody =
    """
    {
      "id": #(petId),
      "name": "Firulais",
      "status": "available"
    }
    """

    Given path '/pet'
    And request requestBody
    When method post
    Then status 200
    And print 'REQUEST:', requestBody
    And print 'RESPONSE:', response


  Scenario: Consultar la mascota por ID

    Given path '/pet', petId
    When method get
    Then status 200
    And print 'RESPONSE:', response


  Scenario: Actualizar nombre y estado de la mascota

    * def requestUpdate =
    """
    {
      "id": #(petId),
      "name": "FirulaisActualizado",
      "status": "sold"
    }
    """

    Given path '/pet'
    And request requestUpdate
    When method put
    Then status 200
    And print 'REQUEST:', requestUpdate
    And print 'RESPONSE:', response


  Scenario: Consultar mascotas por status

    Given path '/pet/findByStatus'
    And param status = 'sold'
    When method get
    Then status 200
    And print 'RESPONSE:', response