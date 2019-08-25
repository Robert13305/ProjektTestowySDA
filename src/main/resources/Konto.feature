Feature: PHPTRAVEL.NET Signing up.

  Scenario 1 Signing up with valid datas.
    Given User is in MY ACCOUNT panel.
    When User chooses SIGN UP button.
    And User fills all required and valid datas.
    And User clicks on SIGN UP button.
    Then User is signed and logged in homepage.
    And User gets an email with signing up confirmation.

    Scenario 2 Signing up with invalid datas.
      Given User is in MY ACCOUNT panel.
      When User chooses SIGN UP button.
      And User fills columns with no data or invalid datas.
      And User clicks on SIGN UP button.
      Then User is not signed and not logged in homepage.
      And User does not get an email with signing up confirmation.