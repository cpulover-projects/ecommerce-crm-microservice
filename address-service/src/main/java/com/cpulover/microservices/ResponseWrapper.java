package com.cpulover.microservices;

import org.springframework.core.env.Environment;

import lombok.Data;

@Data
// to wrap the app port along with address(es) in the response
public class ResponseWrapper<T> {
	private int port;
	private T address;

	public ResponseWrapper(Environment environment, T data) {
		this.port = Integer.parseInt(environment.getProperty("server.port"));
		this.address = data;
	}
}
