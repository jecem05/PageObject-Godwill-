Feature: As a User,
I want to be able 
to enter customer details


Scenario: Data table Scenario 
Given am on the "Landing" Page 
And I enter my "Username" as "aut001" 
And I enter my "Password" as "12345678" 
When I click "Login" button 
When I click on "Contact Support" tab
When I enter all contact support details
| tommy | I love Java | Java everyday | All over the world | SE10 2EU | Email@franko.com | Message to the wolrd of java |
When I click "Submit" button 
Then "Contact Support" page should be displayed as "Contact Support"
