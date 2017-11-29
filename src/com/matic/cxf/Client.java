package com.matic.cxf;

public class Client {
	
	public static void main(String[] args) {
		/*CXFServicePortType cxfServicePort = new CXFService().getCXFServicePort();
		String string = cxfServicePort.hello("345");
		System.out.println(string);*/
		
		CXFService cxfServicePort = new CXFServiceService().getCXFServicePort();
		String string = cxfServicePort.hello("456");
		System.out.println(string);
		
	}
}
