#Author: your.email@your.domain.com
@tag
Feature: To test flight status

  @tag2
  Scenario Outline: To test search by flight number
  Given The user in home booking flight page
    When ther user click the trip way
    And the user enter valid origin and destination detail "<depart>","<arrival>"
    And the user enter valid Date to travel
    And the user select the count of passenger
    Then the user click the find flight button to view list of flight
   
   
    Examples: 
      | depart | arrival |
      | fd     | fefw    |
