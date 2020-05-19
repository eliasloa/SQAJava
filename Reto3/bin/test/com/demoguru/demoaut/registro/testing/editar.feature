@SmokeTest
Feature: Editar un usuario

  Background: 
  Given I want to write Guru99 Homepage
    When I write my creditials
      | mngr259965 |  jYruryd |
  
  
  Scenario: As a registered and enabled user of the page, I want to edit a new client
    When I need update my customer
     |  13771 | avenida las vegas 123 |  Miami  |  Florida |  033212  |  30000000  |  skiay@ffd.com  | 
    Then I should see the next text displayed text Customer details updated Successfully
