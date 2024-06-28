Feature: Login functionality

Scenario: Login with valid credentials
Given User is on the Login page
When User enters username "automationtechies" and enters password "techies@1234"
And User clicks on Login button
Then User is logged in to home page

Scenario Outline: Login feature with multiple invalid data sets
   	Given User is on the Login page
   	When User enters invalid credentials userName "<userName>" and passWord "<passWord>"
   	And User clicks on Login button
    Then User sees the error message on Login page
 		Examples:
      | 		userName       					|	     passWord 				 |
      |reshma  										  |reshma                  |
      |automationtechies  					|1234567890              |
    	|automationtechies123 				|techies@1234            |