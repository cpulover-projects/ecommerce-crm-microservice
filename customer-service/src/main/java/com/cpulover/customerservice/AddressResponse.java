package com.cpulover.customerservice;

import lombok.Data;

@Data
public class AddressResponse {
private int port;
private Address address;

@Data class Address {
	
	private long id;
	private long customerId;
	private int streetNumber;
	private String streetName;
//	private String city;
//	private String country;
}
}


