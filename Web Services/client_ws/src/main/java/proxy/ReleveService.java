
package proxy;

import java.util.List;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.Action;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;


/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.0
 * Generated source version: 3.0
 * 
 */
@WebService(name = "ReleveService", targetNamespace = "http://prince.baba/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ReleveService {


    /**
     * 
     * @param rib
     * @return
     *     returns proxy.Releve
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getReleve", targetNamespace = "http://prince.baba/", className = "proxy.GetReleve")
    @ResponseWrapper(localName = "getReleveResponse", targetNamespace = "http://prince.baba/", className = "proxy.GetReleveResponse")
    @Action(input = "http://prince.baba/ReleveService/getReleveRequest", output = "http://prince.baba/ReleveService/getReleveResponse")
    public Releve getReleve(
        @WebParam(name = "rib", targetNamespace = "")
        long rib);

    /**
     * 
     * @return
     *     returns java.util.List<proxy.Releve>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listReleve", targetNamespace = "http://prince.baba/", className = "proxy.ListReleve")
    @ResponseWrapper(localName = "listReleveResponse", targetNamespace = "http://prince.baba/", className = "proxy.ListReleveResponse")
    @Action(input = "http://prince.baba/ReleveService/listReleveRequest", output = "http://prince.baba/ReleveService/listReleveResponse")
    public List<Releve> listReleve();

}