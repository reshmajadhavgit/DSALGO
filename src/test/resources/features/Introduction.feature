Feature: Linked List page functionality

Background: Login with valid credentials
Given User is logged into Homepage with valid username "automationtechies" and "techies@1234" 
And User clicks the Get Started button from Linked List section
Then Linked List page opens up successfully
And User clicks on link "Introduction" on Linked List page
Then User navigate to the respective Linked List "Introduction" page

Scenario: Verify the text on the Introduction page
Then Text should be correct on Introduction page

Scenario: Verify the Try here button on the Introduction page
When User clicks on Try here button on Introduction page
Then Try here editor page opens up