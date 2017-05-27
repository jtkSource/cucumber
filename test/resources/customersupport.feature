Feature: Customer support functionality for a site
  Background:
    Given Today is not Sunday

  Scenario Outline: User should be able to raise a ticket
    Given User "<user>" with premium membership "<isPremium>" gets support page
    When User enter Support for "<item>"
    Then User should be able to raise a ticket if user is premium member
    Examples:
      | user | item | isPremium |
      |jtk   |cars     |true    |
      |feb   |bike     |false   |

