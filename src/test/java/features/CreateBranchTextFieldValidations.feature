Feature: Verify the text validations for fields Name and Code while Branch Creation
    Verify that the text fields validations are working for Branch creation
    #Verify that the Name field should be atleast 5 characters
    #Verify that there should not be numbers or special characters in Name field
    #Verify that Name field should not be greater than 20 characters
    #Verify that Code field should be atleast 2 characters long
    #Verify that the Code field should not be greater than 10 characters
    #Verify that the Code field should not contain special characters
    
    Scenario Outline: Navigate to Branch Page verify if user is able to create a new branch
     Given user is logged in to the application with username "admin" and password "admin"
     When user clicks on Branch Link
     And user creates new branch with "<Name>" and "<Code>" 
     Then the text field validations should be in place as per the "<Status>"
    Examples:
    |Name                                                                 |Code                 |Status |
    |PH                                                                   |B1                   |FAILURE|
    |B223234$%                                                            |B2                   |FAILURE|
    |CHEMISTRYSDFDSFSDFDFDFDSFSFSDFSFERWERWERWERWEREWREWRWERWERWERWERWERWE|B3                   |FAILURE|
    |MATHS                                                                |B                    |FAILURE|
    |PHYSICS                                                              |B223B2323232323232323|FAILURE|
    |CHEMISTRY                                                            |B$%r%r               |FAILURE|
    |SCIENCE                                                              |B5                   |SUCCESS|