#Author Sanjit
#Design by Sanjit


Feature: Validte Login functionality


  Scenario: Check login is successfull
    Given User launch the browser
    When user open the url "https://admin-demo.nopcommerce.com/login"
    And user pass the username as admin@yourstore.com and password as admin
    And user will click on login button
    Then user will go to home page
    And Close browser


	Scenario Outline: Check login is successfull
    Given User launch the browser
    When user open the url "https://admin-demo.nopcommerce.com/login"
    And user pass the username as <email> and password as <password>
    And user will click on login button
    Then user will go to home page
    And Close browser

    Examples: 
      | email                  | password |
      | admin@yourstore.com    | admin    |
      | admin@yourstore.com | admin    |
      

