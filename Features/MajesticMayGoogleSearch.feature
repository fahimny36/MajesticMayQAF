Feature: google search

Scenario Outline: simple search

Given I am on google homepage
When I enter the search "<term>"
And I click on google search button
Then I received related search result

Examples:
|term								|
|Quality Assuarance |
|Software Testing		|
