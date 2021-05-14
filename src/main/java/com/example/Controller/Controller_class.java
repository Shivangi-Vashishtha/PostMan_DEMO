package com.example.Controller;

import java.util.List;


import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.ORM.Payments_ORM;
import com.example.Payments.GetPaymentDtls;
import com.example.Response.Payments_response;
import com.example.repository.Payments_ORM_Repository;
import com.example.request_POST.CreatePaymentDetails;
import com.example.request_POST.UpdatePayment;
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
	public  Payments_response createPayment(@Valid @RequestBody CreatePaymentDetails createPaymentDetails)
	{
		//@Vaild  --> annotation used to validate attributes passed in JSON(mandatory attributes)
		//@RequestBody is used to convert JSON input which is coming to as class attributes for mapping
		Payments_ORM po=payments_services.createPayment(createPaymentDetails);
		return new Payments_response(po);
		
	}
	
	
	
	@PutMapping("Update")
	public Payments_response updateStudent(@Valid @RequestBody UpdatePayment updatePayment)
	{
		Payments_ORM po=payments_services.updateStudent(updatePayment);
		return new Payments_response(po);
		
	}
	
	
	//http://localhost:8081/api/student/Delete?payment_id=4-->url then "?" then attribute name which identify record uniquely
	// @RequestParam --> annotation used to pass primary key in url itself.
	/*@DeleteMapping("Delete")
	public String deletePayment(@RequestParam Long payment_id)
	{
		return payments_services.deletePayment(payment_id);
	}*/	
	
	
	// http://localhost:8081/api/student/Delete/5  --> 5 is payment id after url
//	@pathVariable--> used when we give primary key after "/" itself.
   @DeleteMapping("Delete/{payment_id}")
   public String deletePayment(@PathVariable Long payment_id)
	{
		return payments_services.deletePayment(payment_id);
	}
}
