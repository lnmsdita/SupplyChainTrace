Feature: SME menu
  as a user
  I want to see SME data
  So that I should going to SME menu

  @sme
  Scenario: success in SME page
    Given dashboard supplychain website
    When going to SME page
    Then success in SME page
  @sme
  Scenario: success in form add new sme
    Given in sme page
    When going to click button add sme
    Then success in form add new sme