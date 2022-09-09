Feature: A user should be able to order food from Swiggy
Scenario: A user should be sucessfully the checkout page after selecting food from a particular restaurant 

Given a user is on the landing page of Swiggy

And he Enters location as ban
And he selects first location from suggested location in suggestionBox
And he redirects to Restaurant listPage and select first suggested restaurant from recommended list
And he redirects to orderPage and adds first item to cart 
And he click on checkout button
Then Verify you are on Checkout page