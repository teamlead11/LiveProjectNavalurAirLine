
   
@tag
Feature: to test flight functionality
  
   @tag2
  Scenario Outline: To test flight with one way
    Given The user is in the home page
    When the user clicks the one way
    And the user fill in the flight details "<departure>","<arrival>","<Deptime>","<Adult>","<Child>","<Infant>"
    Then the user clicks  the SearchNow button

    Examples: 
      | departure                  | arrival        | Deptime | Adult | Child | Infant |
      | Lanseria Int. Johannesburg | Port Elizabeth |      16 |     2 |     2 |      1 |
      | Port Elizabeth             | East London    |      17 |     1 |     1 |      0 |

  @tag3
  Scenario Outline: To test flight with Round Trip
    Given The user is in the home page
    When the user clicks the Round Trip 
    And the user fill in the flight details "<departure>","<arrival>","<Deptime>","<Return>","<Adult>","<Child>","<Infant>"
    Then the user clicks  the SearchNow button

    Examples: 
      | departure                  | arrival        | Deptime | Return | Adult | Child | Infant |
      | Lanseria Int. Johannesburg | Port Elizabeth |      16 |     17 |     2 |     1 |      1 |
      | Port Elizabeth             | East London    |      17 |     18 |     1 |     2 |      0 |
  
   @tag4
  Scenario Outline: To verify invalid message
    Given The user is in the home page
    When the user fill in the flight details "<departure>","<arrival>","<Deptime>","<Return>","<Adult>","<Child>","<Infant>"
    Then the user clicks  the SearchNow button
    And the user should see the invalid message
     Examples: 
      | departure                  | arrival        | Deptime | Return | Adult | Child | Infant |
      | Lanseria Int. Johannesburg | Port Elizabeth |      16 |     17 |     1 |     2 |      2 |
      | Port Elizabeth             | East London    |      17 |     18 |     1 |     1 |      2 |
    