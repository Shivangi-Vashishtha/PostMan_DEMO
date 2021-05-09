package com.example.Payments;

import org.springframework.beans.factory.annotation.Value;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GetPaymentDtls {
	
	
	@JsonIgnore
	float amount;
	
	@JsonIgnore // to ignore a particular field when printing in JSON form
	String BenAccount;
	
	@JsonProperty("Beneficiary_name") //  to name a particular field which showing in JSON form
	String BenName;
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public String getBenAccount() {
		return BenAccount;
	}
	public void setBenAccount(String benAccount) {
		BenAccount = benAccount;
	}
	public String getBenName() {
		return BenName;
	}
	public GetPaymentDtls(float amount, String benAccount, String benName) {
		
		this.amount = amount;
		BenAccount = benAccount;
		BenName = benName;
	}
	public void setBenName(String benName) {
		BenName = benName;
	}

}
