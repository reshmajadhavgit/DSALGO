Feature: Implement Linked List in Python page functionality

Background: Login with valid credentials
Given User is logged into Homepage with valid username "automationtechies" and "techies@1234" 
And User clicks the Get Started button from Linked List section
Then Linked List page opens up successfully
And User clicks on link "Implement Linked List in Python" on Linked List page
Then User navigate to the respective Linked List "Implement Linked List in Python" page

Scenario: Verify the text on the Implement Linked List in Python page
Then Text should be correct on Implement Linked List in Python page

Scenario: Verify the Try here button on the Implement Linked List in Python page
When User clicks on Try here button on Implement Linked List in Python page
Then Try here editor page opens up on Implement Linked List in Python page