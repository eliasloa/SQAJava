#language:es
Característica: Crear Store Order exitoso

  Escenario: Envio store order exitosa
    Cuando Elias envia la siguiente solicitud  a "https://petstore.swagger.io/v2/store/order"
    	| idOrder    | petId   | quantity | shipDate 									| status  	| complete |
      |   342  		 | 3		   | 2     		| 2020-06-05T21:16:29.668Z  | placed	  |  true		 |
      Entonces  se valida que el codigo de estatus sea 200
      Y valida el contenido del id  "id" sea 342
      Y valida el contenido del campo  "petId" sea 3
		  Y valida que el contenido del item  "quantity" sea 2
		  Y valida el contenido de la fecha  "shipDate" sea "2020-06-05T21:16:29.668+0000"
		  