package com.matic.cxfhello;

import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

public class Client {
	
	public static void main(String[] args) {
		
		/*HelloService helloServicePort = new HelloServiceService().getHelloServicePort();
		String string = helloServicePort.sayHello("kiss me!");
		System.out.println(string);*/
		
		JaxWsProxyFactoryBean jaxWsProxyFactoryBean = new JaxWsProxyFactoryBean();
		jaxWsProxyFactoryBean.setAddress("http://10.83.33.106:8080/WebService/service/helloService");
		jaxWsProxyFactoryBean.setServiceClass(HelloService.class);
		jaxWsProxyFactoryBean.getInInterceptors().add(new LoggingInInterceptor());
		jaxWsProxyFactoryBean.getInInterceptors().add(new LoggingOutInterceptor());
		HelloService helloService =  (HelloService) jaxWsProxyFactoryBean.create();
		String string = helloService.sayHello("kiss me!");
		System.out.println(string);
	}
}
