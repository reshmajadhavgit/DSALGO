Feature: Traversal page functionality

Background: Login with valid credentials
Given User is logged into Homepage with valid username "automationtechies" and "techies@1234" 
And User clicks the Get Started button from Linked List section
Then Linked List page opens up successfully
And User clicks on link "Traversal" on Linked List page
Then User navigate to the respective Linked List "Traversal" page

Scenario: Verify the text on the Traversal page
Then Text should be correct on Traversal page

Scenario: Verify the Try here button on the Traversal page
When User clicks on Try here button on Traversal page
Then Try here editor page opens up on Traversal page

Scenario: Verify Numpy Ninja logo
Then Numpy Ninja logo should be visible