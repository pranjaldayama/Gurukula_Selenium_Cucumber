Feature: Navigate to Staff Page and verify all the elements on Staff Page
    Verify if user is able to navigate to Staff Page and verify the presence of all the below elements on Staff Page
    #Button : Create a new Staff
    #Text Box : Search Query
    #Button : Search a Staff
    #Label : ID
    #Label : Name
    #Label : Branch
    #Icon : Pagination
    
  Scenario:  Navigate to Staff Page and Verify all the elements present on Staff Page
    Given user is logged in to the application with username "admin" and password "admin"
    When user clicks on Staff Link
    Then user is able to navigate to Staff Page and verify all the elements are present on Staff Page