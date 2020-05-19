@SmokeTest
Feature: Editar un usuario

  Background: 
  Given I want to write Guru99 Homepage
    When I write my creditials
      | mngr259965 |  jYruryd |
  
  
  Scenario: I want to delette a client
    When I need delette a customer
     |  74008  |
    Then displayed text Customer delete Successfully
			|  Do you really want to delete this Customer?  |