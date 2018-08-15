Feature: Exercise scenarios test

  @test
  Scenario: Check if all the 3 categories of cheese are displayed
    Given three categories of cheese are displayed

  @test
  Scenario: Check if all the 3 sections are displayed for the selected cheese
    Given I click first cheese in the list
    Then three sections are displayed for the selected cheese

  @test
  Scenario: Change the mode to Night(Always)
    Given I can change the mode to Night Always
