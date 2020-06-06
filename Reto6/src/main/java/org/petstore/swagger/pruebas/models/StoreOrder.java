package org.petstore.swagger.pruebas.models;

public class StoreOrder {
	
	String idOrder;
	String petId;
	String quantity;
	String shipDate;
	String status;
	String complete;
	public StoreOrder(String idOrder, String petId, String quantity, String shipDate, String status, String complete) {
		
		this.idOrder = idOrder;
		this.petId = petId;
		this.quantity = quantity;
		this.shipDate = shipDate;
		this.status = status;
		this.complete = complete;
	}
	public String getIdOrder() {
		return idOrder;
	}
	public String getPetId() {
		return petId;
	}
	public String getQuantity() {
		return quantity;
	}
	public String getShipDate() {
		return shipDate;
	}
	public String getStatus() {
		return status;
	}
	public String getComplete() {
		return complete;
	}

	
	
}
