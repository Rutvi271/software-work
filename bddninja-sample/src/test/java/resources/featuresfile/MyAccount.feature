Feature: MY Account
  Scenario: Register Account
    Given I am on homepage
    And I click on my account
    And I click on register
    And I verify the register page "Register Account"

  Scenario: Login Page
    Given I am on homepage
    And I click on my account
    And I click on login
    And I verify the login page "Returning Customer"

  Scenario: Register Account Successfully
    Given I am on homepage
    And I click on my account
    And I click on register
    And I enter all details
    And I verify acc created "Your Account Has Been Created!"
    And I click continue
    And I click on my account on page
    And I logout
    And I verify text for logging out "Account Logout"
    And I continue to main page

  Scenario: Log in Successfully
    Given I am on homepage
    And I click on my account
    And I click on login
    And I enter login details
    And I click continue to login
    And I verify my account "My Account"
    And I click on my account on page
    And I logout
    And I verify text for logging out "Account Logout"
    And I continue to main page

