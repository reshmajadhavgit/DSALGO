Feature: Types of Linked List page functionality

Background: Login with valid credentials
Given User is logged into Homepage with valid username "automationtechies" and "techies@1234" 
And User clicks the Get Started button from Linked List section
Then Linked List page opens up successfully
And User clicks on link "Types of Linked List" on Linked List page
Then User navigate to the respective Linked List "Types of Linked List" page

Scenario: Verify the title on the Types of Linked List page
Then Title should be correct on Types of Linked List page

Scenario: Verify the Practice Question link on the Types of Linked List page
When User clicks on Practice Question link on Types of Linked List page
Then Practice Question page opens up on Types of Linked List page