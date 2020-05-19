#language:es

Característica: Registro en la pagina NewTours

	@Exitoso
  Esquema del escenario: Registro Exitoso  <testCase>
    Dado que estoy en la pagina de NewTours
    Cuando registro mis credenciales
      | nombre   | apellido   |  phone   |  email  |  address  |  city  |  state   |  postal   |  country  |  username  |  password  |  confirmarpassword  |
      | <Nombre> | <Apellido> | <Phone>  | <Email> | <Address> | <City> | <State>  | <Postal>  | <Country> | <Username> | <Password> | <ConfirmarPassword> |
    Entonces valido el registro correcto

    Ejemplos: 
      | Nombre   | Apellido   | Phone		   | Email					  | Address								| City		  | State			  | Postal	  | Country  |  Username				 | Password	  | ConfirmarPassword |
      | Elias    | Valencia   | 930099333  | notengo2@sqa.com  | avenida siempre viva  | Medellin  |  Antioquia  |  050001	  | COLOMBIA |  notengo2@sqa.com  |  admin1    |   admin1					|
