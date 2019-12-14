Feature: Login

  Scenario: Successful Login with Valid Credentials
    Given User Launch Chrome browser
    When User opens URL "https://www.walgreens.com/login.jsp"
    When User enters Email as "qa.test.jhon.smith@gmail.com" and Password as "12345ABC!"
    When Click on SignIn button
    Then User Page Title should be "Your Account | Walgreens"
    When User click on Log out link
    Then Log out Page Title should be "Logged Out | Walgreens"
    And close browser
