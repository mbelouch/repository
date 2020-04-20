package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DemoRestController {
	
//	@Autowired
//	CustomerService customer;
	
	@GetMapping("/hello")
	public String sayHello(){
		return "Hello The world Again !!!";
	}
	
	@GetMapping("/test")
	public String test(){
		return "automatic restart";
	}

	
//	@GetMapping("/customers")
//	public List<Customer> getCustomers(){
//		return customer.getCustomers();
//	}
	


}
