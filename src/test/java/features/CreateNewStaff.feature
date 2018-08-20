Feature: Create a new Staff in the system
    Verify is user is able to create a new staff in the system

    Scenario Outline: Navigate to Staff Page verify if user is able to create a new staff
     Given user is logged in to the application with username "admin" and password "admin"
     When user clicks on Staff Link
     And clicks on create new staff button and enters "<Name>" and "<Branch>"
     Then user should be able to create a new staff with "<Name>" and "<Branch>"
    Examples:
    |Name     |Branch |
    |JOHN     |PHYSICS| 
    |BART     |BIOLOGY|
    |PETER    |CHEMISTRY|
     
   
    
    
    