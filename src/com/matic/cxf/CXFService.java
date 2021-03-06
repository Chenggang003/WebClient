package com.matic.cxf;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.4.2
 * 2017-11-29T13:41:21.594+08:00
 * Generated source version: 2.4.2
 * 
 */
@WebService(targetNamespace = "http://service.matic.com/", name = "CXFService")
@XmlSeeAlso({ObjectFactory.class})
public interface CXFService {

    @WebMethod
    @RequestWrapper(localName = "hello", targetNamespace = "http://service.matic.com/", className = "com.matic.cxf.Hello")
    @ResponseWrapper(localName = "helloResponse", targetNamespace = "http://service.matic.com/", className = "com.matic.cxf.HelloResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.lang.String hello(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0
    );
}
