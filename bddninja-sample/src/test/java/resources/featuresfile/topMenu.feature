Feature: Top Menu

  Scenario: Mouse should hover on each menu
    Given I am on homepage
    When I click on Desktops
    And I click on Show All Desktop
    Then I verify text "Desktops"
    
  Scenario: Mouse should hover on laptops and notebook
      Given I am on homepage
      When I click on Laptops and Notebook
      And I click on show all Laptops and Notebook
      Then I am verifying text "Laptops & Notebooks"

  Scenario: Mouse should hover on components
    Given I am on homepage
    When I click on Components
    And I click on show all Components
    Then I verify "Components"