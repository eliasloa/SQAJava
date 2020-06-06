#language:es
Característica: Crear Usuario exitoso

  Escenario: Envio de usuario exitoso
    Cuando Elias envia la siguiente operacion al servicio  "https://petstore.swagger.io/v2/user"
    	| idUsuario    | Username   | firstName | lastName | email  					| password   | phone 			|	userStatus 	|
      |   436  			 | Cronos12		| Elias  		| Loa	  	 | notengo@sa.com	  |  12345		 | 88877793		|		4					|
      Entonces valida que el codigo de estatus sea 200
      Y valida que el contenido del  "code" sea 200
      Y valida el contenido del  "type" sea "unknown"
		  Y valida que el contenido del  "message" sea "436"