@RunServer
Feature: Configure Environment
  Scenario: English Environment
    Given I am in Configure Environment page
    When  I select English language
    And I select Open SoundID default theme button
    And I select Get started button
    Then I see My SoundID page
    And the language is english

  Scenario: Mocked english Environment
    Given I am in Configure Environment page
    When  I select English language
    And I select Device mock button
    And I select Open SoundID default theme button
    And I select Get started button
    Then I see My SoundID page
    And the language is english