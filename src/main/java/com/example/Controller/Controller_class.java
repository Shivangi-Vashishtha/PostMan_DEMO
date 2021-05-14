package com.example.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.example.ORM.Payments_ORM;
import com.example.Payments.GetPaymentDtls;
import com.example.Response.Payments_response;
import com.example.repository.Payments_ORM_Repository;
import com.example.request_POST.CreatePaymentDetails;
import com.example.service.Payments_Service;

@RestController
@RequestMapping("/api/student/")


public class Controller_class {
	
	//@Value("${app.name:SHIVANGI}")//can use  @value--> app.name is define in application.properties with value
	//@Value("${app.name:HI SHIVANGI}")	//can use --> can give value to app.name in @value itself
	//String appName;
	
	//@GetMapping("/get")
	/*public String getDetails()
	{
		//return "Hello WORLD--SHIVANGI IS HERE"; // example of simple print
		return appName;
	}*/
	@GetMapping("/get")
	public GetPaymentDtls getDetails()
	{
		GetPaymentDtls paymentDtls=new GetPaymentDtls(2300,"1500025","Shivangi");
		return paymentDtls;
	}
	
	@Autowired
	Payments_ORM_Repository paymentRepository;
	@GetMapping("/getPaymentDetails")
	public List<Payments_ORM> getPayments()
	{
		return paymentRepository.findAll();
	}
	
	@Autowired
	Payments_Service payments_services;
	
	@PostMapping("CreatePayment")
	public  Payments_response createPayment(@RequestBody CreatePaymentDetails createPaymentDetails)
	{
		//@RequestBody is used to convert JSON input which is coming to as class attributes for mapping
		Payments_ORM po=payments_services.createPayment(createPaymentDetails);
		return new Payments_response(po);
		
	}

}
