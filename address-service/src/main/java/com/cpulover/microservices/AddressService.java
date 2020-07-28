package com.cpulover.microservices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/addresses")
public class AddressService {

	@Autowired
	AddressRepository addressRepository;

	@GetMapping
	public List<Address> getAddresses() {
		return addressRepository.findAll();
	}
	
	@GetMapping("/customerId/{id}")
	public Address getAddressByCustomerId(@PathVariable long id) {
		return addressRepository.findByCustomerId(id);
	}
}
