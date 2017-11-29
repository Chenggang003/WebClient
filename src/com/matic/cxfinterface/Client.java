package com.matic.cxfinterface;

public class Client {
	
	public static void main(String[] args) {
		CXFInterface cxfInterfacePort = new CXFInterfaceService().getCXFInterfacePort();
		String string = cxfInterfacePort.test1("test...");
		System.out.println(string);
	}
}
