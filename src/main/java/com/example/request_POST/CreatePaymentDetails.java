package com.example.request_POST;





import javax.validation.constraints.NotBlank;

import org.springframework.validation.annotation.Validated;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class CreatePaymentDetails {
	
	Long payment_id;
	
	String ben_name;
	
	
	String ben_account;
	
	@NotBlank(message = "Amount is required")
	float amount;
}
