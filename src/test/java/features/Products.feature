@ProductSelection
Feature: Product Selection

  @Test1
  Scenario Outline: product selection scenario
    Given User has lunched website
    When User Enter correct username "<UserName>" and password "<Password>"
    And User clicks on login Button
    And User should be clicks on "<Product_Name>"
    Then Product should be added to cart
    Then validate that product product is added in cart"<Product_Id>"

    Examples: 
      | UserName      | Password     | Product_Id | Product_Name        |
      | standard_user | secret_sauce |          1 | Sauce Labs Backpack |
