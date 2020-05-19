 #language:es

Característica: Inicio de Sesion pagina NewTours

	@Exitoso
  Esquema del escenario: Inicios de sesion Exitosos  <testCase>
    Dado que estoy en la pagina de inicio de NewTours
    Cuando ingreso mis credenciales
      | usuario   | clave   |
      | <Usuario> | <Clave> |
    Entonces valido el ingreso correcto

    Ejemplos: 
      | Usuario    | Clave   |
      | icer13     | admin   |

      
  @Fallido
  Esquema del escenario: Inicios de sesion Fallido  <testCase>
    Dado que estoy en la pagina de inicio de NewTours
    Cuando ingreso mis credenciales
      | usuario   | clave   |
      | <Usuario> | <Clave> |
    Entonces valido el error de ingreso

    Ejemplos: 
      | Usuario    | Clave   |
      | icer13     | a1234   |
      | icer14     | admin   |