package com.example.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.ORM.Payments_ORM;
import com.example.repository.Payments_ORM_Repository;
import com.example.request_POST.CreatePaymentDetails;



@Service
public class Payments_Service {
	
	@Autowired
	Payments_ORM_Repository paymentRepository;
	
	public List<Payments_ORM> getPayments()
	{
		return paymentRepository.findAll();
	}
	
	public Payments_ORM createPayment(CreatePaymentDetails createPaymentDetails)
	{
		Payments_ORM payments_ORM=new Payments_ORM(createPaymentDetails);
		payments_ORM=paymentRepository.save(payments_ORM);
		return payments_ORM;
	}

}
