package com.example.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.ORM.Payments_ORM;
import com.example.repository.Payments_ORM_Repository;
import com.example.request_POST.CreatePaymentDetails;
import com.example.request_POST.UpdatePayment;



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
	
	public Payments_ORM updateStudent(UpdatePayment updatePayment)
	{
		
		Payments_ORM payments_ORM=paymentRepository.findById(updatePayment.getPayment_id()).get();
		
		if(updatePayment.getBenAccount() !=null && !updatePayment.getBenAccount().isEmpty())
		{
			payments_ORM.setBenAccount(updatePayment.getBenAccount());
		}
		
		if(updatePayment.getBenName() !=null && !updatePayment.getBenName().isEmpty())
		{
			payments_ORM.setBenName(updatePayment.getBenName());
		}
		
		if(updatePayment.getAmount() !=0)
		{
			payments_ORM.setAmount(updatePayment.getAmount());
		}
		payments_ORM=paymentRepository.save(payments_ORM);
		return payments_ORM;
	}
	
	
	public String deletePayment(Long payment_id)
	{
		paymentRepository.deleteById(payment_id);
		return "Payment deleted successfully";
	}
	
	public List<Payments_ORM> getAccount(String ben_account)
	{
		return paymentRepository.findByBenAccount(ben_account); 
	}
	
	public List<Payments_ORM> getAccountAndName(String ben_account,String ben_name)
	{
		return paymentRepository.findByBenAccountAndBenName(ben_account,ben_name); 
	}
	
	public List<Payments_ORM> getAccountORName(String ben_account,String ben_name)
	{
		return paymentRepository.findByBenAccountOrBenName(ben_account,ben_name); 
	}
	
	
	
	

}
