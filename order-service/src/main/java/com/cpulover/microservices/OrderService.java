package com.cpulover.microservices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderService {
	@Autowired
	OrderRepository orderRepository;
	
	

	@GetMapping
	public List<Order> getOrders(){
		return orderRepository.findAll();
	}
	
	@GetMapping("/customerId/{id}")
	public List<Order> getOrdersByCustomerId(@PathVariable long id){
		return orderRepository.findByCustomerId(id);
	}
}
