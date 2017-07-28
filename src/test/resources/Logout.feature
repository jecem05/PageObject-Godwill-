@duper
Feature: as a user,
I want to be able to logout

Background: Login steps
Given am on the "Landing" Page 
And I enter my "Username" as "wegit" 
And I enter my "Password" as "12345678" 
When I click "Login" button 
Then am on the "Home" Page

Scenario: Logout
Given am on the "Home" Page 
When I click "Logout" link
Then am on the "Landing" Page