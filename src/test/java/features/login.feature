Feature: Test the login functionality

  Scenario: To login with valid email and password
    Given User open the website and go to login page
    When User fill email as "QA_test" and password as "Test@123" and click on login
    Then User should navigate to home page

  Scenario Outline: Login with invalid email and password
    Given User open the website and go to login page
    When User fill email as "<username>" and password as "<password>" and click on login
    Then Error message should appear
    Examples:
    |username | password   |
    |ghosoun  | tester123  |
    |hatem    |   wrong    |
    |jordan   |  test123   |
