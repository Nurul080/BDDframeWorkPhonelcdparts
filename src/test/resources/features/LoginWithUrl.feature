@sprint1
Feature: Login test user input

  Scenario: user open phonelcdpart application and click my account button and login button
    			and user input valid username and valid password and user click sing in button
    			user can loged in

    Given user open "nurul" and "https://www.phonelcdparts.com/"
    And user click my account
    And user click login button
    When user enter username "suvosokal@gmail.com"
    And user enter password "m123456789"
    And user click on sing in button
    Then user logged in phonelcdparts

  Scenario: user open phonelcdpart application and click my account button and login button
    and user input valid username and valid password and user click sing in button
    user can loged in

    Given user open "Edge" and "https://www.phonelcdparts.com/"
    And user click my account
    And user click login button
    When user enter username "rudeladupur@gmail.com"
    And user enter password "j123456789"
    And user click on sing in button
    Then user logged in phonelcdparts

  Scenario: user open phonelcdpart application and click my account button and login button
    and user input valid username and valid password and user click sing in button
    user can loged in

    Given user open "Firefox" and "https://www.phonelcdparts.com/"
    And user click my account
    And user click login button
    When user enter username "porontobikel@gmail.com"
    And user enter password "j123456789"
    And user click on sing in button
    Then user logged in phonelcdparts
