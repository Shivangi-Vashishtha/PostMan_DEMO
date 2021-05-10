package com.example.ORM;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity  // use for telling that Payments_ORM is mapped to ORM
@Table(name="Payments_ORM") // used to tell the table name which is related with ORM
public class Payments_ORM {
	
	@Id  // to tell that this is used to identigy each record uniquly.mandatory else spring toll will not work
	@GeneratedValue // to specify that this is auto incremeted value and we are not handling this
	@Column(name="payment_id")
	Long payment_id;
	
	@Column(name="ben_name")
	String ben_name;
	
	@Column(name="ben_account")
	String ben_account;
	
	@Column(name="amount")
	float amount;

}
