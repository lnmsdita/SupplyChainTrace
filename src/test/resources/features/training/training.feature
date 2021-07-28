Feature: Training menu
  as a user
  I want to see training data
  So that I should going to training menu

  @training
  Scenario: success in training page
    Given dashboard sctTraining website
    When going to training page
    Then success in training page
  @training
  Scenario: success in form add new training
    Given in training page
    When going to click button add training
    Then success in form add new training