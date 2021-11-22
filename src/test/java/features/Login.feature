@LoginFeature
Feature: Login Feature

  @Regression
  Scenario Outline: Positive login scenario
    Given User has lunched website
    When User Enter correct username "<UserName>" and password "<Password>"
    And User clicks on login Button
    Then User should be navigated to the product page "<Product>"

    Examples: 
      | UserName      | Password     | Product  |
      | standard_user | secret_sauce | PRODUCTS |

  @Regression
  Scenario Outline: Negative login scenario
    Given User has lunched website
    When User Enter correct username "<UserName>" and password "<Password>"
    And User clicks on login Button
    Then User should be getting the "<Error>"

    Examples: 
      | UserName      | Password | Error                                                                     |
      | standard_user | secre    | Epic sadface: Username and password do not match any user in this service |
