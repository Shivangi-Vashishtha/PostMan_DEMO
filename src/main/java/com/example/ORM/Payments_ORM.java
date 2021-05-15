package com.example.ORM;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.example.request_POST.CreatePaymentDetails;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@Entity  // use for telling that Payments_ORM is mapped to ORM
@Table(name="Payments_ORM") // used to tell the table name which is related with ORM
@Getter
@Setter
public class Payments_ORM {
	
	
	//@GeneratedValue(strategy = GenerationType.IDENTITY) // to specify that this is auto incremeted value and we are not handling this and this will automatically pass in POST operation.
	//@Column(name="payment_id")
	@Id  // to tell that this is used to identify each record uniquly.mandatory else spring toll will not work
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long payment_id;
	
	@Column(name="benName")
	String benName;
	
	@Column(name="benAccount")
	String benAccount;
	
	@Column(name="amount")
	float amount;
	
	@Transient
	String benDetails;
	
	@OneToOne
	@JoinColumn(name="address_id")
	Address address;
	
	public Payments_ORM(CreatePaymentDetails createPaymentDetails)
	{
		this.payment_id=createPaymentDetails.getPayment_id();
		this.benName=createPaymentDetails.getBenName();
		this.benAccount=createPaymentDetails.getBenAccount();
		this.amount=createPaymentDetails.getAmount();
		this.benDetails=createPaymentDetails.getBenName() + " " + createPaymentDetails.getBenAccount();
	}

	

	

}
