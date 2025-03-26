package com.example.demo.Controller;

import java.util.UUID;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Customer;
import com.example.demo.Service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController
{
	@Autowired
	CustomerService cs;
	
	@PostMapping("/saveCustomer")
	public ResponseEntity<Customer> one(@RequestBody Customer cr)
	{
		cr.setCid(UUID.randomUUID().toString());
		Customer cm=cs.register(cr);
		return ResponseEntity.ok(cm);
	}

}
