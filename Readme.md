
# Compatibility 
- Before you run test, make sure your firefox version to be >50 as am using selenium 3 

# How to run 
G0 to root directory 
  - COMMAND : mvn clean test -Dbrowser=firefox
  - go to src/test/java/com/qa/works/ and run RunCukesTest.java

# Dependencies Used 
- Junit 
- Cucumber  (selected framework)
- Webdriver manager  (to download all browser drivers )
- Selenium  (to interact with UI)
- Hamcrest (To assert)
- Cucumber-picocontaine (for dependency injections )

# Highlights
- Using only one locator for complete form elements, in feature any new element is included under form we dont need to touch java code (refer Contact page)
- Used page object model
- Used page factory
- Used Dependency injectin concept (piko-container form Cucumber)

# Improvements
  - We be nice to take screen shot on every test failure.
  
# Bugs (mentioning in very high level)
- Cannot submit a form in contact us page
    - Expected: should submit form with some valid validation message
    - Actual: throwing "There was an error trying to send your message. Please try again later."

- Cannot submit any form in different services like TEST AUTOMATION, BDD/ATDD SOLUTIONS, CONTINUOUS DELIVERY and VISUALISATION
    - Expected: should submit form with some valid validation message
    - Actual: throwing "There was an error trying to send your message. Please try again later."
 