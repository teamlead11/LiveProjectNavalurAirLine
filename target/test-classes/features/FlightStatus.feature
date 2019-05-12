#Author: your.email@your.domain.com
@tag
Feature: To test flight status

  @tag2
  Scenario Outline: To test search by flight number
    Given The user is in flight status page
    When The user search with flight number "<FlightNumber>"
    Then The user should see only one search result

    Examples: 
      | FlightNumber |
      | FA130        |
