package com.cpulover.customerservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	@GetMapping("/customers")
	public List<Customer> getCustomers() {
		return customerRepository.findAll();
	}
}
