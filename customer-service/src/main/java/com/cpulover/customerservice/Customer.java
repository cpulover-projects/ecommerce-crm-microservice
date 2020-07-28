package com.cpulover.customerservice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.RestController;

@Data
@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	private String streetName;
	
	@OneToOne
	private Address address;
}

//@Data
//@Entity
//class Address {
//	@Id
//	private long id;
//	private int streetNumber;
//	private String streetName;
//	private String city;
//	private String country;
//}
