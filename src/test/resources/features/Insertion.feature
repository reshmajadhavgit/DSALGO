Feature: Insertion page functionality

Background: Login with valid credentials
Given User is logged into Homepage with valid username "automationtechies" and "techies@1234" 
And User clicks the Get Started button from Linked List section
Then Linked List page opens up successfully
And User clicks on link "Insertion" on Linked List page
Then User navigate to the respective Linked List "Insertion" page

Scenario: Verify the title on the Insertion page
Then Title should be correct Insertion page

Scenario: Verify the Practice Question link on the Insertion page
When User clicks on Practice Question link on Insertion page
Then Practice Question page opens up on Insertion page

Scenario: Verify the Data Structures drop down is displayed
Then Data Structures drop down should be displayed on Insertion page

Scenario: Verify the username is displayed
Then username should be displayed on Insertion page