package com.etoak.service;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.17
 * 2016-09-13T15:39:15.667+08:00
 * Generated source version: 2.7.17
 * 
 */
@WebServiceClient(name = "IHelloServiceService", 
                  wsdlLocation = "http://localhost:8080/cxf-server/ws/hello?wsdl",
                  targetNamespace = "http://service.etoak.com/") 
public class IHelloServiceService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://service.etoak.com/", "IHelloServiceService");
    public final static QName IHelloServicePort = new QName("http://service.etoak.com/", "IHelloServicePort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8080/cxf-server/ws/hello?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(IHelloServiceService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://localhost:8080/cxf-server/ws/hello?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public IHelloServiceService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public IHelloServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public IHelloServiceService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public IHelloServiceService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public IHelloServiceService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public IHelloServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns IHelloService
     */
    @WebEndpoint(name = "IHelloServicePort")
    public IHelloService getIHelloServicePort() {
        return super.getPort(IHelloServicePort, IHelloService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IHelloService
     */
    @WebEndpoint(name = "IHelloServicePort")
    public IHelloService getIHelloServicePort(WebServiceFeature... features) {
        return super.getPort(IHelloServicePort, IHelloService.class, features);
    }

}
