Feature: Linked List page functionality

Background: Login with valid credentials
Given User is logged into Homepage with valid username "automationtechies" and "techies@1234" 
When User clicks the Get Started button from Linked List section
Then Linked List page opens up successfully



#Scenario: Verify the url on the Linked List page
#Then Linked List url should be correct

Scenario Outline: Verify the links on Linked List Page
   	When User clicks on link "<PageLink>" on Linked List page
    Then User navigate to the respective Linked List "<PageTitle>" page
 		Examples:
      | 		PageLink       									|	          PageTitle                |
      |Introduction   										  |Introduction                    |
      |Creating Linked LIst                 |Creating Linked LIst            |
      |Types of Linked List                 |Types of Linked List            |
      |Implement Linked List in Python		  |Implement Linked List in Python |
      |Traversal                            |Traversal                       |
      |Insertion                            |Insertion                       |
      |Deletion                             |Deletion                        |
   
      
      
