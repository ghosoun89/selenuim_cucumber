Feature: Contact page features
 @Regression
  Scenario: Make sure that the email text field is visible
    Given User open the website and go to login page
    When User fill email as "QA_test" and password as "Test@123" and click on login
    And clicks on contacts
    Then Email text field should be visible

   @Sanity @Regression
  Scenario: Add new contact
    Given User open the website and go to login page
    When User fill email as "QA_test" and password as "Test@123" and click on login
    And clicks on contacts
    And clicks on add new Contact
    And Fill the first name and last name
    Then A new contact should be added