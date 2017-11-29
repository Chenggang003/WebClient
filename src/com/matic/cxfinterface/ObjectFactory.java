
package com.matic.cxfinterface;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.matic.cxfinterface package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Test1Response_QNAME = new QName("http://service.matic.com/", "test1Response");
    private final static QName _Test1_QNAME = new QName("http://service.matic.com/", "test1");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.matic.cxfinterface
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Test1Response }
     * 
     */
    public Test1Response createTest1Response() {
        return new Test1Response();
    }

    /**
     * Create an instance of {@link Test1 }
     * 
     */
    public Test1 createTest1() {
        return new Test1();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Test1Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.matic.com/", name = "test1Response")
    public JAXBElement<Test1Response> createTest1Response(Test1Response value) {
        return new JAXBElement<Test1Response>(_Test1Response_QNAME, Test1Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Test1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.matic.com/", name = "test1")
    public JAXBElement<Test1> createTest1(Test1 value) {
        return new JAXBElement<Test1>(_Test1_QNAME, Test1 .class, null, value);
    }

}
