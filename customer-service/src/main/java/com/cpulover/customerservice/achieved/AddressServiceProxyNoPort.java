package com.cpulover.customerservice.achieved;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.cpulover.customerservice.AddressResponse;

@FeignClient(name = "address-service")
public interface AddressServiceProxyNoPort {

//	@GetMapping("addresses/customerId/{id}")
//	public Address getAddressByCustomerId(@PathVariable long id);
	
	
}
