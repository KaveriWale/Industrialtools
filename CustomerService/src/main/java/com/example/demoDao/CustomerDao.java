package com.example.demoDao;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import com.example.demo.Model.Customer;
import com.example.demo.Repo.CustomerRepo;
import com.example.demo.Service.CustomerService;

@Service
public class CustomerDao implements CustomerService 
{
	
	@Autowired
	CustomerRepo cp;
	
	@Override
	public Customer register(Customer c1) {
		
		return cp.save(c1);
	}

}
