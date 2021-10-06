@RunServer
Feature: Create SoundID
  @DoTest
  Scenario: Create a new SoundID
    Given I have configured Mocked english Environment
    And I am in My SoundID page
    And No soundId should exist
    When I select Create SoundID button
    And Start test button
    And I chose Track and Continue
    And I do The preference test
    And the language is english