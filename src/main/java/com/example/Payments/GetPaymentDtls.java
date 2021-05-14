package com.example.Payments;



import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


//@Getter
//@Setter
//@ToString
//@EqualsAndHashCode

// @Data   // if we want to used annotations mentioned in 15,16,17,18 lines--we can use @data single (equal to above 4 annotations of lombok)


@Getter
@Setter
@AllArgsConstructor
//@NoArgsConstructor
public class GetPaymentDtls {
	
	
	@JsonIgnore
	@Getter
	@Setter
	private float amount;
	
	 // to ignore a particular field when printing in JSON form
	private String benAccount;
	
	
	
	@JsonProperty("Beneficiary_name") //  to name a particular field which showing in JSON form
	private String benName;

	
/* public GetPaymentDtls(float amount, String benAccount, String benName) {
		
		this.amount = amount;
		this.benAccount = benAccount;
		this.benName = benName;
	}


	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public String getBenAccount() {
		return benAccount;
	}

	public void setBenAccount(String benAccount) {
		this.benAccount = benAccount;
	}

	public String getBenName() {
		return benName;
	}

	

	public void setBenName(String BenName) {
		this.benName = benName;
	}
	*/
	
	

}
