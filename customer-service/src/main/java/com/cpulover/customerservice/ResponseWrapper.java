package com.cpulover.customerservice;

import org.springframework.core.env.Environment;

import lombok.Data;

@Data
// to wrap the app port along with address(es) in the response
public class ResponseWrapper<T> {
	private int port;
	private T data;
}
