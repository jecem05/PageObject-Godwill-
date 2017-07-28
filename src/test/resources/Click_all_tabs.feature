@duper
Feature: as a user,
I want to be able click all tabs

Background: Login steps
Given am on the "Landing" Page 
And I enter my "Username" as "wegit" 
And I enter my "Password" as "12345678" 
When I click "Login" button 
Then am on the "Home" Page

Scenario Outline: Click all Tabs
Given am on the "Home" Page
When I click on "<Tab_Name>" tab
Then "<Page_Displayed>" page should be displayed as "<Name_Of_Page>"

Examples: 
|     Tab_Name  | Page_Displayed | Name_Of_Page   |
| Trade Your Jet| Trade Your Jet | Trade Your Jet |
| Book Your Jet | Book Your Jet  | Book Your Jet  |
| Just Trade    | Just Trade     | Just Trade     |
| About Us      | About Us       | About Us       |