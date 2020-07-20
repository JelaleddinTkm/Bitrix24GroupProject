Feature: Login

  @login
  Scenario: User should be able to login to the landing page
    Given User is on the login page
    When User logs in with credentials
    Then User should see the dashboard
