@RunServer
Feature: Pause state
  Scenario: Track Page Pause State
    Given I have configured Mocked english Environment
    And I am in My SoundID page
    When I go to the track page
    And The First track list are visible and the Second track list ar not visible
      | First track list            | Second track list       |
      | Cymatics                    | Alessia Raisi I want to |
      | Distorted guitars           | Climb                   |
      | Electronic beats 1          | Go into a dream         |
      | Rick Feds and Una Daniela   |                         |
      | Stagnant Project            |                         |
      | Kireyev and the Void        |                         |
      | Lily Wire and Debby Lee Star|                         |
    And I play "Distorted guitars" Track
    And I set the SDK app to background for 3 seconds
    Then I see the Track is paused

  Scenario: Preference Test Pause State
    Given I have configured Mocked english Environment
    And I am in My SoundID page
    When I go to the Preference test page
    And I set the SDK app to background for 3 seconds
    Then I see the Preference test is paused


