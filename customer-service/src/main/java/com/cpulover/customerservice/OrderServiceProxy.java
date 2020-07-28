package com.cpulover.customerservice;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="order-service")
public interface OrderServiceProxy {

	@GetMapping("/orders/customerId/{id}")
	public List<Order> getOrdersByCustomerId(@PathVariable long id);
}
