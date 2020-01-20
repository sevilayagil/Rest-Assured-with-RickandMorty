Feature:Verify different operations using Rest Assured and Rick And Morty Apis
  Scenario: Verify one Characters
    Given I perform Get Operations for "/character"
    And I perform Get for the Character number "2"
    Then I should see Character's name as "Morty"

  Scenario: Verify Character Get parameter
    Given I perform Get Operations for "/character"
    Then I should see verify GET parameter