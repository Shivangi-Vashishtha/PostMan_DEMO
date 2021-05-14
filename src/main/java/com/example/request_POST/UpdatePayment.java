package com.example.request_POST;

import javax.validation.constraints.NotNull;

import lombok.*;

@Getter
@Setter
public class UpdatePayment {

@NotNull(message = "Payment ID is mandatory")	
Long payment_id;
	
	String ben_name;
	
	
	String ben_account;
	
	
	float amount;
}
