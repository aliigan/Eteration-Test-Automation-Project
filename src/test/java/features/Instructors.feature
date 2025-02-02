@Instructors
Feature: Eteration Academy Instructor Check

  @CheckTheList
  Scenario: Check if the instructor list is empty and number is 8
    Given User is on Eteration Academy home page
    When User goes to Instructors page
    Then Instructor list should not be empty
    And Insructor number should be 8