Feature: Insight
  As a end user
  I want to read article post
  so tha I can gain some knowledge

  Scenario: Insight article
    Given  I am on the QAWorks Site    
    When I navigate to "OUR INSIGHTS" page
    And I select any insights
    Then I verify that i read respective article