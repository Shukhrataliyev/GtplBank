Feature: Create new user

  Background: Manager logged in to create new user page
    Given I logged in to my bank account
    When I am on create new user page

  Scenario Outline: Verify name field
    When I  enter "<name>" 	 value in name field
    And I press tab and move to next field
    Then Error message  "<message>"  should be displayed

    Examples: 
      | name       | message                            |
      | empty      | Customer name must not be blank    |
      | name1234   | Numbers are not allowed            |
      |       1234 | Numbers are not allowed            |
      | name!@     | Special characters are not allowed |
      | !@         | Special characters are not allowed |
      | firstspace | First character cannot be space    |
      

  Scenario Outline: Verify city field
    When I  enter "<city>" 	 value in city field
    And I press tab and move to next field
    Then Error message in cityfield  "<message>"  should be displayed

    Examples: 
      | city       | message                            |
      | empty      | City Field must not be blank       |
      | city1234   | Numbers are not allowed            |
      |       1234 | Numbers are not allowed            |
      | city!@     | Special characters are not allowed |
      | !@         | Special characters are not allowed |
      | firstspace | First character cannot be space    |

  Scenario Outline: Verify state field
    When I  enter "<state>" 	 value in state field
    And I press tab and move to next field
    Then Error message in state "<message>"  should be displayed

    Examples: 
      | state      | message                            |
      | empty      | State  must not be blank           |
      | city1234   | Numbers are not allowed            |
      |       1234 | Numbers are not allowed            |
      | city!@     | Special characters are not allowed |
      | !@         | Special characters are not allowed |
      | firstspace | First character cannot be space    |

  Scenario Outline: Verify pinno field
    When I  enter "<pin>" 	 value in pin field
    And I press tab and move to next field
    Then Error message in pin "<message>"  should be displayed

    Examples: 
      | pin        | message                            |
      | 1234PIN    | Characters are not allowed         |
      | empty      | PIN code must not be blank         |
      |         12 | PIN Code must have 6 Digits        |
      |    1234567 | PIN Code must have 6 Digits        |
      | city!@     | Special characters are not allowed |
      | !@         | Special characters are not allowed |
      | firstspace | First character cannot be space    |

  Scenario Outline: Verify telephone field
    When I  enter "<telephonenumber>" 	 value in phone field
    And I press tab and move to next field
    Then Error message in phone "<message>"  should be displayed

    Examples: 
      | telephonenumber | message                            |
      | empty           | Telephone no must not be blank     |
      | telephonespace  | Telephone cannot have be space     |
      | 123124!@        | Special characters are not allowed |
      | !@12312234      | Special characters are not allowed |
      | firstspace      | First character cannot be space    |

  Scenario Outline: Verify email field
    When I  enter "<email>" value in email field
    And I press tab and move to next field
    Then Error message in email "<message>"  should be displayed

    Examples: 
      | email           | message                    |
      | empty           | Email-ID must not be blank |
      | guru99@gmail    | Email-ID is not valid      |
      | guru99          | Email-ID is not valid      |
      | Guru99@         | Email-ID is not valid      |
      | guru99@gmail.   | Email-ID is not valid      |
      | guru99gmail.com | Email-ID is not valid      |
      | firstspace      | Email-ID is not valid      |
