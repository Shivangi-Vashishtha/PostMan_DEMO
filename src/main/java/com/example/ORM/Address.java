package com.example.ORM;

import lombok.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Setter
@Getter
@Entity
@Table(name = "address")
public class Address {
	
	@Id  // to tell that this is used to identify each record uniquly.mandatory else spring toll will not work
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	
	String city;
	String street;

}
