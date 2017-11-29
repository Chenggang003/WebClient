
package com.matic.people;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.matic.people package. 
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

    private final static QName _AddPeopleResponse_QNAME = new QName("http://web.matic.com/", "addPeopleResponse");
    private final static QName _People_QNAME = new QName("http://web.matic.com/", "People");
    private final static QName _AddPeople_QNAME = new QName("http://web.matic.com/", "addPeople");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.matic.people
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link People }
     * 
     */
    public People createPeople() {
        return new People();
    }

    /**
     * Create an instance of {@link AddPeople }
     * 
     */
    public AddPeople createAddPeople() {
        return new AddPeople();
    }

    /**
     * Create an instance of {@link AddPeopleResponse }
     * 
     */
    public AddPeopleResponse createAddPeopleResponse() {
        return new AddPeopleResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddPeopleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web.matic.com/", name = "addPeopleResponse")
    public JAXBElement<AddPeopleResponse> createAddPeopleResponse(AddPeopleResponse value) {
        return new JAXBElement<AddPeopleResponse>(_AddPeopleResponse_QNAME, AddPeopleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link People }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web.matic.com/", name = "People")
    public JAXBElement<People> createPeople(People value) {
        return new JAXBElement<People>(_People_QNAME, People.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddPeople }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web.matic.com/", name = "addPeople")
    public JAXBElement<AddPeople> createAddPeople(AddPeople value) {
        return new JAXBElement<AddPeople>(_AddPeople_QNAME, AddPeople.class, null, value);
    }

}
