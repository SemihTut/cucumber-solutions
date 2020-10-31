Feature: User Verification
  Background:
    Given I logged Visma Solutions API using "credentials" and "password"

    #Authentication step
  @smoke
  Scenario: verify information about logged user
    When I get the current user information from api
    Then status code should be 200


  Scenario: adding new customer, contact person and project
    When I created a new customer "TestCustomer_Semih" from API
    And status code should be 201
    When I created a new contact person "TestContact_Semih" from API
    And status code should be 201
    Then I created a new project "Project_Semih"
    And status code should be 201

 @wip
  Scenario: Get all which/who you want
    When I called for all "projects"
    Then status code should be 200

  Scenario: Delete what you want
    When I called for all "projects"
    And delete the last one "projects"
    Then status code should be 400


  Scenario: Create Project
    Then I created a new project "TestCase_GALATASARAY"
    And status code should be 201


   @done
  Scenario: Adding customer and deleting it
    When I created a new customer "TestCustomer_Semih" from API
    And status code should be 201
    When I created a new contact person "TestContact_JohnPark" from API
    And status code should be 201
    And delete the last one "customers"
    Then status code should be 204


  Scenario: Deleting Phase
    When I delete the "phases"
    Then status code should be 204

#needed update
  Scenario: Create Phase
    When I called for "projects" by "ProjectSemih"
    And I get the guid
    Then I created a new phase "Phase Two" to project "ProjectSemih"
    And status code should be 201


  Scenario: Adding work hours
    When I called for "worktypes" by "Projektinjohto"
    And I get the guid
    And I added 3 hours to "Projektinjohto" worktype to "Phase two"
    Then status code should be 201


  Scenario: Adding Project Fee
    When I called for "products" by "Konsultointipäivä"
    And I get the guid
    And I added ProjectFee using "Konsultointipäivä" to "Phase two"
    Then status code should be 201


  Scenario: Adding Project Travel Expenses
    When I called for "travelexpenses" by "Kilometrikorvaus"
    And I get the guid
    And I added ProjectTravelExpense 100 km to "Phase two"
    Then status code should be 201


  Scenario: Adding Invoices To Project
    When I called for "projects" by "Project_Semih"
    And I get the guid
    And I added the invoices
    Then status code should be 201


  Scenario: Getting all worktypes/products/travelexpenses by guid
    When I called for "worktypes" by "Projektinjohto"
    And status code should be 200
    Then I get the guid


  Scenario:
    When I called for invoice row
    Then status code should be 200