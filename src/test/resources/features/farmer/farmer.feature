Feature: Farmer for sctGlobal web
  as a user
  I want to access the website
  So that I should add new farmer


  Scenario: success in farmer page
    Given dashboard sct website
    When going to farmer sct
    Then success in farmer page

#  Scenario: success in form add new farmer
#    Given in farmer page
#    When going to click button add
#    Then success in form add new farmer

#  scenario garden, family, and pekerja di running setelah farmer sukses di create

#  Scenario: success in form add new garden
#    Given in detail farmer page for garden
#    When going to click button add new garden
#    Then success input and save new garden

#  Scenario: success in form add new family
#    Given in detail farmer page for family
#    When going to click button add new family
#    Then success input and save new family

#  Scenario: success in form add new pekerja
#    Given in detail farmer page for pekerja
#    When going to click button add new pekerja
#    Then success input and save new pekerja