Feature: Laptop and Notebook
  Scenario: Product price high to low
    Given I am on homepage
    And I click on Laptops and Notebook
    And I click on show all Laptops and Notebook
    And I sort the price high to low
    Then I verify price "Ex Tax:$2,000.00"

  Scenario: User should place order successfully
    Given I am on homepage
    And I click on Laptops and Notebook
    And I click on show all Laptops and Notebook
    And I sort the price high to low
    And I select MacBook
    And I verify  "MacBook"
    And I click on cart button
    And I verify success text "Success: You have added MacBook to your shopping cart!"
    And I click on shopping cart link
    And I check the text "Shopping Cart"
    And I verify the product "MacBook"
    And I update the quantity
    And I verify updated cart text "Success: You have modified your shopping cart!"
    And I verify total price "$1,204.00"
    And I click Checkout
    And I verify the checkout page "Checkout"
    And I click on guest checkout button
    And I click continue to fill the details
    And I fill all the details
    And I write comment
    And I verify warning text "Warning: Payment method required!"






