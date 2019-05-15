Feature: To verify Checkin feature in Home page

  Scenario Outline: Verify checkin feature in negative scenario
    Given The user is in the Home Page
    When The user should click on checkin button
    And The user enter Booking reference and surname detials and click on continue "<Breference>","<Surname>"
    Then The user should see error message

    Examples: 
      | Breference | Surname |
      | b134       | pras    |
      | c455       | prad    |
