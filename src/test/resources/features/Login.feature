#Author: your.email@your.domain.com
Feature: Login Test

  @tag1
  Scenario: As a tester I oen phonelcdparts application and I click my account 
    			and I click login button to enter my valid user name and password and 
    			I click sing in button so that i can loged in

    Given I open phonelcdparts application
    And I I click my account
    And I click login button
    When I enter my valid user name
    And I enter my valid password
    And I click sing in button
    Then I can loged in
