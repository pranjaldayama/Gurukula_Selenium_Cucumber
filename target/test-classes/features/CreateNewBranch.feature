Feature: Create a new Branch in the system
    Verify is user is able to create a new branch in the system

    Scenario Outline: Navigate to Branch Page verify if user is able to create a new branch
     Given user is logged in to the application with username "admin" and password "admin"
     When user clicks on Branch Link
     And clicks on create new Branch button and enters "<Name>" and "<Code>"
     Then user should be able to create a new Branch with "<Name>" and "<Code>"
    Examples:
    |Name     |Code|
    |PHYSICS  |B1  | 
    |BIOLOGY  |B2  |
    |CHEMISTRY|B3  |
     
   
    
    
    