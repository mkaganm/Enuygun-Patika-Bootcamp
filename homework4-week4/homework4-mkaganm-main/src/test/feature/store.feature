Feature:
  @store
  Scenario: Succesfull store operations
    When user makes order request
    Then register order
    And Status is 200 OK.
    When user makes get inventory request.
    Then inventory informations.
    And Status is 200 OK.
