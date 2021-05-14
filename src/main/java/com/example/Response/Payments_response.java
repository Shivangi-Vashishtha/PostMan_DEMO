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
	private String benName;

	private String benAccount;

	private float amount;
	
	public	 Payments_response (Payments_ORM po) {
		this.payment_id=po.getPayment_id();
		this.benName = po.getBenName();
		this.benAccount = po.getBenAccount();
		this.amount = po.getAmount();
	}

}
