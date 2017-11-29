package com.matic.people;

public class Client {
	
	public static void main(String[] args) {
		
		CXFWeb cxfWebPort = new CXFWebService().getCXFWebPort();
		People people = new People();
		people.setName("devil add");
		boolean b = cxfWebPort.addPeople(people);
		if (b) {
			System.out.println("添加成功!");
		}else{
			System.out.println("添加失败!");
		}
	}
}
