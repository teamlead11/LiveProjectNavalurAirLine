
@tag
Feature: to check flight search oneway
 
  @tag1
  Scenario:
   

  @tag2
  Scenario Outline:  To test search for one way flights
     Given The user is in Home page
    When The user fill in all the details
  
    Then The user should see the list of available flights
    

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
