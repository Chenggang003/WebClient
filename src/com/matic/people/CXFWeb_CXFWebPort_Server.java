
package com.matic.people;

import javax.xml.ws.Endpoint;

/**
 * This class was generated by Apache CXF 2.4.2
 * 2017-11-29T17:14:48.854+08:00
 * Generated source version: 2.4.2
 * 
 */
 
public class CXFWeb_CXFWebPort_Server{

    protected CXFWeb_CXFWebPort_Server() throws java.lang.Exception {
        System.out.println("Starting Server");
        Object implementor = new CXFWebImpl();
        String address = "http://10.83.33.106:8080/WebService/service/addPeople";
        Endpoint.publish(address, implementor);
    }
    
    public static void main(String args[]) throws java.lang.Exception { 
        new CXFWeb_CXFWebPort_Server();
        System.out.println("Server ready..."); 
        
        Thread.sleep(5 * 60 * 1000); 
        System.out.println("Server exiting");
        System.exit(0);
    }
}