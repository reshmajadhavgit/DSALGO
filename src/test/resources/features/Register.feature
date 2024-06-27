Feature: Registration functionality

Scenario Outline: Registration feature with multiple data sets
   	Given User navigates to Registration page
   	When User enters sheetName "<sheetName>" and rowNumber <rowNumber>
   	And User clicks on Register button
    Then User sees the error message
 		Examples:
      | 		sheetName       					|	     rowNumber 			|
      |register  										  |0                    |
      |register  										  |1                    |
    	|register  										  |2                    |
      |register  										  |3                    |
      |register  										  |4                    |
      |register  										  |5                    |
      |register  										  |6                    |
      |register  										  |7                    |
 	


#Scenario: User creates an account 
#Given User navigates to Registration page
#When User enters below details into the fields
#|username          |testerautomation     |
#|password          |automation@123      |
#|confirmPassword   |automation@123      |
#And User clicks on Register button
#Then User account should be created

#Scenario: User creates a duplicate account 
#Given User navigates to Registration page
#When User enters below details into the fields
#|username          |testadmin      |
#|password          |Indra@31   |
#|confirmPassword   |Indra@31   |
#And User clicks on Register button
#Then User should get a proper error message
#
#Scenario: User creates an account with blank values 
#Given User navigates to Registration page
#When User keeps all the fields blanks 
#And User clicks on Register button 
#Then User should remain on Register page

#test123	@/./+/-/_	@/./+/-/_

