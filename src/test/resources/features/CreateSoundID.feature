@RunServer
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
    Then I see the profile creation page
      | Processing your personalization                   |
      | Creating your personalized SoundID profile...     |
      | Your SoundID profile is created!                  |
    And I see the profile uploading
    And I see SoundID toggle Enabled

  Scenario: Redo The Preference Test
    Given I have configured Mocked english Environment
    And I have created a SoundID
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
    Then I see the profile creation page
      | Processing your personalization                   |
      | Creating your personalized SoundID profile...     |
      | Your SoundID profile is created!                  |
    And I see the profile uploading
    And I see SoundID toggle Enabled