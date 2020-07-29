package com.cpulover.customerservice;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/customers")
public class CustomerService {
	  private static Logger log = LoggerFactory.getLogger(CustomerService.class);

	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private AddressServiceProxy addressServiceProxy;
	
	@Autowired
	private OrderServiceProxy orderServiceProxy;

	@GetMapping
	public List<Customer> getCustomers() {
		//logging id of the request
		log.info(">>> Retriving all customers...");
		
		return customerRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<Customer> getCustomerById(@PathVariable long id) {
		return customerRepository.findById(id);
	}
	
	
	@GetMapping("{id}/address")
	public AddressResponse getAddressWithPortByCustomerId(@PathVariable long id) {
		log.info(">>> Retriving address by customer id...");
		return addressServiceProxy.getAddressWithPortByCustomerId(id);
	}
	
	@GetMapping("{id}/orders")
	public List<Order> getOrdersByCustomerId(@PathVariable long id){
		return orderServiceProxy.getOrdersByCustomerId(id);
	}
	
	
	
	//????
	@Autowired
	private DiscoveryClient discoveryClient;

	@RequestMapping("/service-instances/{applicationName}")
	public List<ServiceInstance> serviceInstancesByApplicationName(
			@PathVariable String applicationName) {
		return this.discoveryClient.getInstances(applicationName);
	}
	
	
}
