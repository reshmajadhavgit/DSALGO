Feature: Linked List page functionality

Background: Login with valid credentials
Given User is logged into Homepage with valid username "automationtechies" and "techies@1234" 
And User clicks the Get Started button from Linked List section
Then Linked List page opens up successfully
And User clicks on link "Creating Linked LIst" on Linked List page
Then User navigate to the respective Linked List "Creating Linked LIst" page

Scenario: Verify the title on the Creating Linked LIst page
Then Title should be correct Creating Linked LIst page

Scenario: Verify the Practice Question link on the Creating Linked LIst page
When User clicks on Practice Question link on Creating Linked LIst page
Then Practice Question page opens up