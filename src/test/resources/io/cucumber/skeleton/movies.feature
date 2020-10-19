Feature: Movies

  Scenario: a movie is added to the catalogue
    Given I have an empty catalogue
    When a movie is added to the catalogue
    Then the size of the catalogue is now 1

  Scenario: a movie is removed from the catalogue
    Given I have a catalogue with a movie
    When the movie is removed from the catalogue
    Then the size of the catalogue is now 0

  Scenario: user requests a listed movie
    Given I have "Taxi Driver" as a listed movie
    When user requests to watch "Taxi Driver"
    Then user gets the movie "Taxi Driver"

