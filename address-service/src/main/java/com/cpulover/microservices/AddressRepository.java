package com.cpulover.microservices;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cpulover.microservices.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {
	Address findByCustomerId(long customerId);
}
