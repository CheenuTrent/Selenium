Feature: To validate the login functionality of flipkart application
Scenario: To validate login with valid username and invalid password  
Given To launch the chromebrowser and maximise it
When To launch the URL of flipkart application
And To pass the valid username in username field
And To pass the invalid password in password field
And to click the login button
And to check whether the application navigate to homepage or not 
Then To close the browser


