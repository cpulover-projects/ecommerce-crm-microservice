package com.cpulover.customerservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.cpulover.customerservice.Customer;

@FeignClient(name = "address-service")
public interface AddressServiceProxy {

	@GetMapping("addresses/customerId/{id}")
	public Address getAddressByCustomerId(@PathVariable long id);
}
