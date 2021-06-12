Feature: Implementing Login functionality of LeafTaps application

Background:
Given Open the Chrome browser
And Load the Application url as 'http://leaftaps.com/opentaps/'



Scenario Outline: Login with Positive data
Given Enter the user name as <username>
And Enter the Password as <password>
When Click on Login Button
Then Home page should be displayed

Examples:
|username|password|
|'DemoSalesManager'|'crmsfa'|
|'DemoCSR'|'crmsfa'|


Scenario: Login with Negative data
Given Enter the user name as 'DemoSalesManager'
And Enter the Password as 'crmsfa12'
When Click on Login Button
But Home page is not displayed