package com.example.request_POST;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class CreatePaymentDetails {
	
	Long payment_id;
	
	String ben_name;
	
	
	String ben_account;
	
	
	float amount;
}
