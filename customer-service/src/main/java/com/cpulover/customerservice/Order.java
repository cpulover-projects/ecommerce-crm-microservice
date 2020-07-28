package com.cpulover.customerservice;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Data
public class Order {
	//private long id;
	private long customerId;
	private Date date;
	private BigDecimal totalPrice;
	private int totalQuantity;
}
