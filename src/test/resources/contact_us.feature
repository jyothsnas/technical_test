Feature: Contact Us Page  
  As an end user  
  I want a contact us page  
  So that I can find out more about QAWorks exciting services


  Scenario: Valid Submission  
    Given I am on the QAWorks Site    
    When I navigate to "contact us" page
    And I should be able to contact QAWorks with the following information  
      | name    | j.Bloggs                                  |
      | email   | j.Bloggs@qaworks.com                      |
      | company | test automation                           |
      | message | please contact me I want to find out more |

    Then I should validate message has been sent

