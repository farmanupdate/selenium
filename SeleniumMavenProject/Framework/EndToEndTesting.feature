#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template


Feature: End to End Testing Feature
  
  Scenario: Login Module
    Given Open the browser
    And Enter the URL and login credentials
    Then Check transaction page appears

	Scenario: Transfer Funds Module
    When Clicking on transfer funds tab
    Then Check if the transfer money and make payments page appears
    
  
  Scenario: Accounts Module
    Then Check if all the accounts are listed in From drop down
    And Check if all the accounts are listed in To drop down
    When Select the From Account
    And Select the To Account
    When Enter the amount and description
    And Click on Continue button
    And Click on Submit
    
  Scenario: Confirmation Module
    Then Check if confirmation page is displayed with message 
    
	Scenario: Logout Module
    When logout and close the browser
    
  #@test2
  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step
#
    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
