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

Feature: Test OrangeHRM Pages
  
  #@Smoke Test @Functional Test
  #@demo1 @demo3
  #Scenario: Test Login Module
   # Given Browser Open
    #When I enter URL
    #Then Check if login page is displayed
    
    #And when i enter the credentials "Admin" and "admin123"
    #Then User should be logged in and dashboard should be displayed
    
  @demo2  
  Scenario: Test Admin Module
    When i hover mouse on admin
    Then the suboptions should be displayed
    
  #@demo1
  #Scenario: Test LeavePage Module
   # When I hover mouse on leave
   # Then the leave suboptions should be displayed 
