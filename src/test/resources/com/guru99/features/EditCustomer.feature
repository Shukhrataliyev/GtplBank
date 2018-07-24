@tag
Feature: Edit customer

  Background: Manager logged in to edit customer page
    Given I logged in to my bank account
    When I am on edit customer page

  Scenario Outline: Verify customer id
    When I  enter "<customerid>" value in customer id field
 
    
    And I press tab and move to next field
    Then Error message "<message>" for id should be displayed

    Examples: 
      | customerid | message                            |
      | empty      | Customer ID is required            |
      | 1234Acc    | Characters are not allowed         |
      | Acc123     | Characters are not allowed         |
      | name!@     | Special characters are not allowed |
      | !@         | Special characters are not allowed |

      
      