@SmokeTest
Feature: Creacion de un usuario

  Background: 
  Given I want to write Guru99 Homepage
    When I write my creditials
      | mngr259965 |  jYruryd |


  @Login
  Scenario: I create a new client
    When I write my data
	| Elias Loai |  02101985 | avenida siempre viva |  Miami  |  Florida |  033222  |  3002200001  |  jun.loa@gma.com  |  mic0ntr4señ4 |
     
    Then I should see the next text Customer Registered Successfully