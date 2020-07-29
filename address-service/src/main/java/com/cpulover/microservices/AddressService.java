package com.cpulover.microservices;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/addresses")
public class AddressService {
	private static Logger log = LoggerFactory.getLogger(AddressService.class);

	@Autowired
	private AddressRepository addressRepository;

	@Autowired
	private Environment environment;

	@GetMapping
	public List<Address> getAddresses() {
		return addressRepository.findAll();
	}

	@GetMapping("/port")
	public ResponseWrapper<List<Address>> getAddressesWithPort() {
		List<Address> list = addressRepository.findAll();
		return new ResponseWrapper<List<Address>>(environment, list);

	}

	@GetMapping("/customerId/{id}")
	public Address getAddressByCustomerId(@PathVariable long id) {
		return addressRepository.findByCustomerId(id);
	}

	@GetMapping("/customerId/{id}/port")
	public ResponseWrapper<Address> getAddressWithPortByCustomerId(@PathVariable long id) {
		// log request id in the console when API is invoked
		log.info(">>> Retriving address by customer id...");
		
		Address theAddress = addressRepository.findByCustomerId(id);
		return new ResponseWrapper<Address>(environment, theAddress);
	}
}
