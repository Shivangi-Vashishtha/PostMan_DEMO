package com.example.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Payments.GetPaymentDtls;

@RestController
@RequestMapping("/api/student/")


public class Controller_class {
	
	@Value("${app.name}")//can use  @value--> app.name is define in application.properties with value
	//@Value("${app.name:HI SHIVANGI}")	//can use --> can give value to app.name in @value itself
	String appName;
	
	@GetMapping("/get")
	/*public String getDetails()
	{
		//return "Hello WORLD--SHIVANGI IS HERE"; // example of simple print
		return appName;
	}*/
	
	public GetPaymentDtls getDetails()
	{
		GetPaymentDtls paymentDtls=new GetPaymentDtls(2300,"1500025","Shivangi");
		return paymentDtls;
	}

}
