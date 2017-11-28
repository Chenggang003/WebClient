package com.matic.client;

public class Client {
	
	public static void main(String[] args) {
		Service service = new ServiceService().getServicePort();
		String hello = service.hello("123");
		System.out.println(hello);
	}
}
