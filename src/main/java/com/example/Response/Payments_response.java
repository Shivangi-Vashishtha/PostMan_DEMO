package com.example.Response;
import javax.persistence.Transient;

import com.example.ORM.Payments_ORM;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Payments_response {

	private long payment_id;

	@JsonProperty("first_name")
	private String benName;

	private String benAccount;

	private float amount;
	
	
	String benDetails;
	
	String street;
	String city;
	
	public	 Payments_response (Payments_ORM po) {
		this.payment_id=po.getPayment_id();
		this.benName = po.getBenName();
		this.benAccount = po.getBenAccount();
		this.amount = po.getAmount();
		this.benDetails=po.getBenName() + " " + po.getBenAccount();
		this.street=po.getAddress().getStreet(); //getAddress--> address is another entity and we can get street from thr.
		this.city=po.getAddress().getCity();
	}

}
