Feature: Adactin Login feature
  I want to use this template for my feature file
Background: Welcome Note
Given Note Display

  @test1
  Scenario: Login
    Given User present in Adactin Login page
    When User Enter Username
    And User Enter Password
    And User Click on Login Button
    Then Get Title of the Page
   

  @test2
  Scenario Outline: Login pass
    Given User already login
    When User enter username as <UN>
    When User enter password as <PWD>

    Examples: 
      | UN          | PWD      |
      | rameshadepu | ramesh11 |
      | sandeepj    | sandeep6 |

  @test3
  Scenario: Book Hotel
    Then Select location
    And Select no Of rooms
    And Select between dates
    Then Adults Per Room
    Then Submit
    Then Home
     Then Close
