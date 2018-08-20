Feature: Create a new Branch in the system
    Verify is user is able to create a new branch in the system
    # Pre-requisite for this test script is CreateNewBranch.feature
    #First execute the feature CreateNewBranch then execute the feeature DeleteBranchesCreated
    
    Scenario: Navigate to Branch Page verify if user is able to create a new branch
     Given user is logged in to the application with username "admin" and password "admin"
     When user clicks on Branch Link
     Then user should be able to delete a new branch created
  