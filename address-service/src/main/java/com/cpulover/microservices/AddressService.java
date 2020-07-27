package com.cpulover.microservices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressService {

	@Autowired
	AddressRepository addressRepository;

	@GetMapping("/addresses")
	public List<Address> getAddresses() {
		return addressRepository.findAll();
	}
}
