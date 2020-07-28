package com.cpulover.customerservice.achieved;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import lombok.Data;

@Data
@Entity
public class Address {
	@Id
	private long id;
	private long customerId;
	private int streetNumber;
	private String streetName;
//	private String city;
//	private String country;
}
