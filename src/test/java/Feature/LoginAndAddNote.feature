Feature: Login and note taking functionality

  Scenario Outline: User login with valid credentials
    Given I open the "<url>"
    And I accept all cookies
    And I click on login button
    Then I should see "<title>" on the login page
    When I enter "<username>" and "<password>"
    And I click on sign in button
    Then I should be on dashboard and verify "<username>" is granted

    Examples:
      |url|title| username|password |
      |https://evernote.com/|Welcome Back| f2016027040@gmail.com   |Amw4v@wc|


  Scenario Outline: User login with invalid credentials
    Given I open the "<url>"
    And I accept all cookies
    And I click on login button
    Then I should see "<title>" on the login page
    When I enter "<username>" and click continue button
    Then I should see "<errorMessage>"

    Examples:
      |url|title| username|errorMessage |
      |https://evernote.com/|Welcome Back| faizan.majeed@outlook.com   |There is no account for the username or email you entered.|

  Scenario Outline: Write a note, logout, and verify note existence after login
    Given I open the "<url>"
    And I accept all cookies
    And I click on login button
    Then I should see "<title>" on the login page
    When I enter "<username>" and "<password>"
    And I click on sign in button
    And I create a note with "<noteTitle>" and "<note>"
    And I logout from the account
    And I enter "<username>" and "<password>"
    And I click on sign in button
    Then I should be able to view the previously created note with content "<note>" and "<noteTitle>"
    And I logout from the account
    Examples:
      |url| note |title| username|password |noteTitle|note|
      |https://evernote.com/|  This is a test note|Welcome Back| f2016027040@gmail.com   |Amw4v@wc|Test|This is Faizan|
