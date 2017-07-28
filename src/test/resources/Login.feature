@duper
Feature: As a user,
I want to be able to login and logout

@demo2
Scenario Outline: Login and Logout
Given am on the "Landing" Page 
And I enter my "Username" as "<Username_Details>" 
And I enter my "Password" as "<Password_Details>" 
When I click "Login" button 
Then am on the "Home" Page

Examples: login details
| Username_Details | Password_Details |
|   wegit          | 12345678         |
|   aut001         | 12345678         |
