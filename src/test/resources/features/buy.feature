@regression
Feature: Search functionality
  As a User, I would like to use the search functionality

  @author_SP @sanity @regression
  Scenario Outline: Search the buy car with model
  Given I am on homepage
    When I mouse hover on “buy+sell” tab
    And I click ‘Search Cars’ link
    Then I navigate to ‘new and used car search’ page
    And I select make "<make>"
    And I select model "<model>"
    And I select location "<location>"
    And I select price "<price>"
    And I click on Find My Next Car tab
    Then I should see the make "<make>" in results

  Examples:
  | make      | model          | location          | price            |
  | Audi      | A1             | New England       |  $65,000         |
  | Ford      | Fiesta         | Sydney            |  $80,000         |
  | BMW       | 116i           | Central West      |  $45,000         |
  | Lexus     | CT             | Newcastle         |  $56,000         |
  | MG        | 3              | Brisbane          |  $85,000         |
  | Tesla     | Model 3        | Gold Coast        |  $75,000         |

@author_SP
  Scenario Outline: Search the used car with model
    Given I am on homepage
    When I mouse hover on "buy+sell" tab
    And I click ‘Used’ link
    Then I navigate to 'Used Cars For Sale' page
    And I select make "<make>"
    And I select model "<model>"
    And I select location "<location>"
    And I select price "<price>"
    And I click on Find My Next Car tab
    Then I should see the make "<make>" in results
    Examples:
  | make      | model          | location          | price            |
  | Audi      | A1             | New England       |  $65,000         |
  | Ford      | Fiesta         | Sydney            |  $80,000         |
  | BMW       | 116i           | Central West      |  $45,000         |
  | Lexus     | CT             | Newcastle         |  $56,000         |
  | MG        | 3              | Brisbane          |  $85,000         |
  | Tesla     | Model 3        | Gold Coast        |  $75,000         |