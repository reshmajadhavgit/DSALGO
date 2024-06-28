Feature: Deletion page functionality

Background: Login with valid credentials
Given User is logged into Homepage with valid username "automationtechies" and "techies@1234" 
And User clicks the Get Started button from Linked List section
Then Linked List page opens up successfully
And User clicks on link "Deletion" on Linked List page
When User clicks on Practice Question link on Deletion page
Then Practice Question page opens up on Deletion page

Scenario: Verify the Data Structures drop down is displayed
Then Data Structures drop down should be displayed on Deletion page

Scenario: Verify the username is displayed
Then username should be displayed on Deletion page

Scenario: Verify the Signout link is displayed
Then Signout link should be displayed on Deletion page

Scenario: Verify Numpy Ninja logo
Then Numpy Ninja logo should be visible