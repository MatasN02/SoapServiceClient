package lt.eif.viko.m.nar.client.generated_classes;


import jakarta.xml.ws.*;

import jakarta.xml.ws.Service;
import jakarta.xml.ws.WebEndpoint;
import jakarta.xml.ws.WebServiceClient;
import jakarta.xml.ws.WebServiceException;
import jakarta.xml.ws.WebServiceFeature;
import javax.xml.namespace.QName;
import java.net.MalformedURLException;
import java.net.URL;

@WebServiceClient(
        name = "OrderPortService",
        targetNamespace = "http://www.springframework.org/schema/web-services",
        wsdlLocation = "http://localhost:8080/soapWs/orders.wsdl"
)
public class OrderPortService extends Service {

    private final static URL ORDERPORTSERVICE_WSDL_LOCATION;
    private final static WebServiceException ORDERPORTSERVICE_EXCEPTION;
    private final static QName ORDERPORTSERVICE_QNAME = new QName("http://www.springframework.org/schema/web-services", "OrderServiceService");

    static {
        URL url = null;
        WebServiceException e = null;
        try{
            url = new URL("http://localhost:8080/soapWs/orders.wsdl");
        }catch (MalformedURLException ex){
            e = new WebServiceException(ex);
        }
        ORDERPORTSERVICE_WSDL_LOCATION = url;
        ORDERPORTSERVICE_EXCEPTION = e;
    }

    public OrderPortService(){
        super(__getWsdlLocation(), ORDERPORTSERVICE_QNAME);
    }

    public OrderPortService(WebServiceFeature... features){
        super(__getWsdlLocation(), ORDERPORTSERVICE_QNAME, features);
    }

    public OrderPortService(URL wsdlLocation){
        super(wsdlLocation, ORDERPORTSERVICE_QNAME);
    }

    public OrderPortService(URL wsdlLocation, WebServiceFeature... features){
        super(wsdlLocation, ORDERPORTSERVICE_QNAME, features);
    }

    public OrderPortService(URL wsdlLocation, QName serviceName){
        super(wsdlLocation, serviceName);
    }

    public OrderPortService(URL wsdlLocation, QName serviceName, WebServiceFeature... features){
        super(wsdlLocation, serviceName, features);
    }

    @WebEndpoint(name = "OrderServiceSoap11")
    public OrderPort getOrderPortSoap11(){
        return super.getPort(new QName("http://www.springframework.org/schema/web-services", "OrderServiceSoap11"), OrderPort.class);
    }

    @WebEndpoint(name = "OrderServiceSoap11")
    public OrderPort getOrderPortSoap11(WebServiceFeature... features){
        return super.getPort(new QName("http://www.springframework.org/schema/web-services", "OrderServiceSoap11"), OrderPort.class, features);
    }

    private static URL __getWsdlLocation(){
        if(ORDERPORTSERVICE_EXCEPTION!= null){
            throw ORDERPORTSERVICE_EXCEPTION;
        }else {
            return ORDERPORTSERVICE_WSDL_LOCATION;
        }
    }
}
