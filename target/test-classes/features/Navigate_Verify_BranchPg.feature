Feature: Navigate to Branch Page and verify all the elements on Branch Page
    Verify if user is able to navigate to Branch Page and verify the presence of all the below elements present on Branch Page
    # Button: Create a New Branch
    # Text Box : Search Query
    # Button : Search a Branch
    # Label : ID
    # Label : Name
    # Label : Code
   
  Scenario: Navigate to Branch Page and verify all the elements present on Branch Page
    Given user is logged in to the application with username "admin" and password "admin"
    When user clicks on Branch Link
    Then user is able to navigate to Branch Page and verify all the elements are present on Branch Page
    
  