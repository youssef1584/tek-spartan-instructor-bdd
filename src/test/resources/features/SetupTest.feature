Feature: This feature is to setup framework


  Scenario: validate top left corner logo
    #Given open browser and navigate to retail app
    Then validate top left corner is TEKSCHOOL
    #Then close the browser

    Scenario: Validate Logo and Sign in button
      Then validate top left corner is TEKSCHOOL
      Then validate Sign in button is Enabled