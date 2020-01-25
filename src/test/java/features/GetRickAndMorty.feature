Feature:Verify different operations using Rest Assured and Rick And Morty Apis
  Scenario: Verify one Character
    Given I perform Get Operations for "/character"
    And I perform Get for the Character number "2"
    Then I should see Character's name as "Morty"

  Scenario: Verify Character Get parameter
    Given I perform Get Operations for "/character"
    Then I should see verify GET parameter

   Scenario: Verify one episode
     Given I perform Get operations for episodes
     Then I should see verify name as "Get Schwifty"

  Scenario: Verify Location episode
    Given I perform Get operations for Location
    Then I should see verify wrong Location
