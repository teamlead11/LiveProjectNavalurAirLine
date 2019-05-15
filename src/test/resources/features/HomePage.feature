@tag
Feature: to test flight functionality

  @tag1
  Scenario Outline: To test flight with one way with different type of passengers
    Given The user is in the home page
    When User selects the single trip
    And the user fill in the flight details "<From>","<To>","<Departure>","<Adult>","<Minor>","<Senior>"
    Then the user clicks  the SearchMyFlight otpion

    Examples: 
      | From           | To              | Departure | Adult | Minor | Senior |
      | Acapulco       | Queretaro       |        21 |     1 |     1 |      2 |
      | Aguascalientes | Puerto Vallarta |        17 |     0 |     1 |      1 |
      | Chihuahua      | Culiacan        |        23 |     1 |     1 |      0 |
      | Durango        | Chihuahua       |        25 |     2 |     0 |      1 |
      | Tijuana        | Hermosillo      |        30 |     0 |     0 |      1 |

  @tag2
  Scenario Outline: To test flight with one way with different type of passengers
    Given The user is in the home page
    When User selects the Round trip
    And the user fill in the flight details "<From>","<To>","<Departure>","<Return>","<Adult>","<Minor>","<Senior>"
    Then the user clicks  the SearchMyFlight otpion

    Examples: 
      | From           | To              | Departure | Return | Adult | Minor | Senior |
      | Acapulco       | Queretaro       |        21 |     23 |     1 |     1 |      2 |
      | Aguascalientes | Puerto Vallarta |        17 |     19 |     0 |     1 |      1 |
      | Chihuahua      | Culiacan        |        23 |     26 |     1 |     1 |      0 |
      | Durango        | Chihuahua       |        25 |     29 |     2 |     0 |      1 |
      | Tijuana        | Hermosillo      |        30 |     02 |     0 |     0 |      1 |

  @tag4
  Scenario Outline: To test the invalid flight details for single trip
    Given The user is in home page
    When User enter the invalid flight details  "<From>","<To>","<Departure>","<Adult>","<Minor>","<Senior>"
    Then validate the error messages

    Examples: 
      | From     | To        | Departure | Adult | Minor | Senior |
      | ADSFSDDF | ADSDSDS   |        21 |     1 |     1 |      2 |
      | Acapulco | Queretaro |        21 |     0 |     1 |      0 |
