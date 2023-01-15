
package proxy;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the proxy package. 
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

    private final static QName _GetReleve_QNAME = new QName("http://prince.baba/", "getReleve");
    private final static QName _GetReleveResponse_QNAME = new QName("http://prince.baba/", "getReleveResponse");
    private final static QName _ListReleve_QNAME = new QName("http://prince.baba/", "listReleve");
    private final static QName _ListReleveResponse_QNAME = new QName("http://prince.baba/", "listReleveResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: proxy
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetReleve }
     * 
     * @return
     *     the new instance of {@link GetReleve }
     */
    public GetReleve createGetReleve() {
        return new GetReleve();
    }

    /**
     * Create an instance of {@link GetReleveResponse }
     * 
     * @return
     *     the new instance of {@link GetReleveResponse }
     */
    public GetReleveResponse createGetReleveResponse() {
        return new GetReleveResponse();
    }

    /**
     * Create an instance of {@link ListReleve }
     * 
     * @return
     *     the new instance of {@link ListReleve }
     */
    public ListReleve createListReleve() {
        return new ListReleve();
    }

    /**
     * Create an instance of {@link ListReleveResponse }
     * 
     * @return
     *     the new instance of {@link ListReleveResponse }
     */
    public ListReleveResponse createListReleveResponse() {
        return new ListReleveResponse();
    }

    /**
     * Create an instance of {@link Releve }
     * 
     * @return
     *     the new instance of {@link Releve }
     */
    public Releve createReleve() {
        return new Releve();
    }

    /**
     * Create an instance of {@link Operation }
     * 
     * @return
     *     the new instance of {@link Operation }
     */
    public Operation createOperation() {
        return new Operation();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetReleve }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetReleve }{@code >}
     */
    @XmlElementDecl(namespace = "http://prince.baba/", name = "getReleve")
    public JAXBElement<GetReleve> createGetReleve(GetReleve value) {
        return new JAXBElement<>(_GetReleve_QNAME, GetReleve.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetReleveResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetReleveResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://prince.baba/", name = "getReleveResponse")
    public JAXBElement<GetReleveResponse> createGetReleveResponse(GetReleveResponse value) {
        return new JAXBElement<>(_GetReleveResponse_QNAME, GetReleveResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListReleve }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListReleve }{@code >}
     */
    @XmlElementDecl(namespace = "http://prince.baba/", name = "listReleve")
    public JAXBElement<ListReleve> createListReleve(ListReleve value) {
        return new JAXBElement<>(_ListReleve_QNAME, ListReleve.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListReleveResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListReleveResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://prince.baba/", name = "listReleveResponse")
    public JAXBElement<ListReleveResponse> createListReleveResponse(ListReleveResponse value) {
        return new JAXBElement<>(_ListReleveResponse_QNAME, ListReleveResponse.class, null, value);
    }

}
