package com.cpulover.customerservice;

import java.util.List;

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
	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private AddressServiceProxy addressServiceProxy;
	
	@Autowired
	private OrderServiceProxy orderServiceProxy;

	@GetMapping
	public List<Customer> getCustomers() {
		return customerRepository.findAll();
	}
	
	
	@GetMapping("{id}/address")
	public AddressResponse getAddressWithPortByCustomerId(@PathVariable long id) {
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
