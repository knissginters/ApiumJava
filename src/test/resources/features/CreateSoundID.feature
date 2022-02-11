Feature: Create SoundID
  Scenario: Do a Preference Test
    Given I have configured Mocked english Environment
    And I am in My SoundID page
    When I select Create SoundID button
    And I see the tutorial description:
      | Preference test                     |
      | Choose the sound you like           |
      | Complete several sound comparisons. |
    And I select start test button
    And The First track list are visible and the Second track list ar not visible
      | First track list            | Second track list       |
      | Cymatics                    | Alessia Raisi I want to |
      | Distorted guitars           | Climb                   |
      | Electronic beats 1          | Go into a dream         |
      | Rick Feds and Una Daniela   |                         |
      | Stagnant Project            |                         |
      | Kireyev and the Void        |                         |
      | Lily Wire and Debby Lee Star|                         |
    And I chose Track and Continue
      | Cymatics                   |
    And I do The preference test
    Then I see the profile creation and uploading page
      | Creating your personalized SoundID profile...    |
      | Uploading profile...                             |
      | The sound of your headphones is now personalized!|
    And I select Continue button
    And I see SoundID toggle Enabled
    And I see toggle tutorial text

  Scenario: Redo The Preference Test
    Given I have configured Mocked english Environment
    And I have created a SoundID
    And I see the profile creation and uploading page
      | Creating your personalized SoundID profile...    |
      | Uploading profile...                             |
      | The sound of your headphones is now personalized!|
    And I select Continue button
    And I see SoundID toggle Enabled
    When I select Retake test button
    And I see the tutorial description:
      | Preference test                     |
      | Choose the sound you like           |
      | Complete several sound comparisons. |
    And I select start test button
    And The First track list are visible and the Second track list ar not visible
      | First track list           | Second track list       |
      | Cymatics                   | Alessia Raisi I want to |
      |Distorted guitars           | Climb                   |
      |Electronic beats 1          | Go into a dream         |
      |Rick Feds and Una Daniela   |                         |
      |Stagnant Project            |                         |
      |Kireyev and the Void        |                         |
      |Lily Wire and Debby Lee Star|                         |
    And I chose Track and Continue
      | Cymatics                   |
    And I do The preference test
    And I see the profile creation and uploading page
      | Creating your personalized SoundID profile...    |
      | Uploading profile...                             |
      | The sound of your headphones is now personalized!|
    And I select Continue button
    Then I see SoundID toggle Enabled
    And I see toggle tutorial text

  Scenario: Toggle tutorial is displayed
    Given I have configured Mocked english Environment
    And I have created a SoundID
    And I see the profile creation and uploading page
      | Creating your personalized SoundID profile...    |
      | Uploading profile...                             |
      | The sound of your headphones is now personalized!|
    And I select Continue button
    And I see SoundID toggle Enabled
    And I see toggle tutorial text
    When I toggle the SoundID toggle
    And I see SoundID toggle Disabled
    Then I do not see toggle tutorial text

