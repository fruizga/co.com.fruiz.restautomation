Feature: Create an user on Reqres.in
  I want to create an user

  Scenario: Creating an user
    When you create an user
      | name | job  |
    | brandon | java |
    Then I should see the user created