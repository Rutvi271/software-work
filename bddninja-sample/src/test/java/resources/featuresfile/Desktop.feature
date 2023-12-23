Feature: Desktop

  Scenario: Product should sort by Z to A
    Given I am on homepage
    When I click on Desktops
    And I click on Show All Desktop
    And I sort Z to A
    Then I am verifying sorting "Sony VAIO"

  Scenario: Product added to shopping cart
    Given I am on homepage
    When I click on Desktops
    And I click on Show All Desktop
    And I sort it A to Z
    And I select product HP LP3065
    And I verify text  "HP LP3065"
    And I select date
    And I add quantity
    And I click cart button
    And I verify success message "Success: You have added HP LP3065 to your shopping cart!"
    And I click on shopping cart on message
    And I verify shopping cart text "Shopping Cart"
    And I verify product name "HP LP3065"
    And I verify delivery date "Delivery Date:2022-11-30"
    And I verify product "Product 21"
    Then I verify the price "$122.00"




