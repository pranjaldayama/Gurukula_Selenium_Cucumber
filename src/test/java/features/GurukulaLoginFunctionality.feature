Feature: Login Logout Feature
  Verify if user is able to Login in to the Gurukula site using valid credentials
  Verify that user should not be able to login to Gurukula using invalid credentials

  Scenario Outline: Login as a authenticated user
    Given user is on gurukula welcome page
    When user navigates to login page
    And user enters "<username>" and "<password>"
    And user clicks on Authenticate button
    Then success or failure message should be displayed and user should be able to successfully logged out of the application
   Examples:
   |username|password|
   |admin   |admin   |
   |abc123  |pqr123  |
    
  