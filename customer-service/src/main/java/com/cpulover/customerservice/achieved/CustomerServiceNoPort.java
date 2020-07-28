package com.cpulover.customerservice.achieved;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cpulover.customerservice.AddressServiceProxy;
import com.cpulover.customerservice.Customer;
import com.cpulover.customerservice.CustomerRepository;


@RestController
@RequestMapping("/customers")
public class CustomerServiceNoPort {

	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private AddressServiceProxy addressServiceProxy;

	@GetMapping
	public List<Customer> getCustomers() {
		return customerRepository.findAll();
	}
	
	@GetMapping("{id}/address")
	public Address getAddressByCustomerId(@PathVariable long id) {
		return addressServiceProxy.getAddressByCustomerId(id);
	}
}
