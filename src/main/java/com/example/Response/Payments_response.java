package com.example.Response;
import com.example.ORM.Payments_ORM;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Payments_response {

	private long payment_id;

	@JsonProperty("first_name")
	private String ben_name;

	private String ben_account;

	private float amount;
	
	public	 Payments_response (Payments_ORM po) {
		this.payment_id=po.getPayment_id();
		this.ben_name = po.getBen_name();
		this.ben_account = po.getBen_account();
		this.amount = po.getAmount();
	}

}
