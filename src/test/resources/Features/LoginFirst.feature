
@tag
Feature: Validate the login functionality of Facebook

Background:
   Given Launch the Browser
    And Open the Facebook Application
 

  @tag1
  Scenario Outline: Validate the Facebook login with valid credentials
 
    When Enter the valid "<username>" and "<password>"
    And Click the Login button
    Then I validate the "Sucessfull login" outcomes
    And Close the Browser 
    
    Examples:
|username|password|
|Logesh|125412|
|Janu|658954|

 