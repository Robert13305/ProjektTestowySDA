Feature: PHPTRAVEL.NET booking flights

  Scenario 1 Booking flights invalid
    Given User is in FLIGHTS
    When User chooses first location (New Lakefront)
    And User chooses final destination (New Castle Intl Arpt)
    And User chooses a proper date (26.08.2019)
    And User chooses number of tickets and for whom it is booked (1, Adult)
    And User chooses whether it is one way or a round trip (one way)
    And User clicks on Search button
    Then No offer is visible
    And Data not found shown


  Scenario 2 Booking flights valid
    Given User is in FLIGHTS
    When User chooses first location (Lawica Arpt)
    And User chooses final destination (Jorge Newberry)
    And User chooses a proper date (25.08.2019)
    And User chooses number of tickets and for whom it is booked (1, Adult)
    And User chooses whether it is one way or a round trip (one way)
    And User clicks on Search button
    Then 16 offers are visible
    And There is a possibility of choosing most desired one