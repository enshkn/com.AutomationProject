Feature: Registration of a new user
  Background:
    Given go to the website "https://automationexercise.com/"

    Scenario: Registration of a new user first phase
      When click to signup-login button
      When send "enes2" to name field
      When send "hakis2@mail.com" to email field
      When click to signup button
      Then check the area and see the text "ENTER ACCOUNT INFORMATION"


